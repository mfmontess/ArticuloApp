/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import DAL.UsuarioDAO;
import STL.Enumeraciones;
import STL.RespuestaWS;
import STL.Usuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "UsuariosWS")
public class UsuariosWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Método en el caul se registra un usuario a base de datos
     * @param usuario objeto a registrar
     * @return 
     */
    @WebMethod(operationName = "RegistrarUsuario")
    public RespuestaWS RegistrarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        RespuestaWS respuesta = new RespuestaWS();        
        try{
            respuesta.setObjetoRespuesta(ToJson(usuario));
            new UsuarioDAO().Registrar(usuario);
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        
        return respuesta;
    }

    private String ToJson(Object object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(object);
        return json;
    }
    
    /**
     * Metodo validar el cual obtiene un usuario deacuerdo al nombre y contraseña enviados, en caso de no encontrar alguno, retorna null
     * @param nombre Nombre del usuario a validar
     * @param contraseña Contraseña del usuario a validar
     * @return Retorna objeto usuario con el nombre y contraseña enviados
     */
    @WebMethod(operationName = "ObtenerUsuario")
    public RespuestaWS ObtenerUsuario(@WebParam(name = "nombre") String nombre,@WebParam(name = "contraseña") String contraseña) {
        RespuestaWS respuesta = new RespuestaWS();        
        try{
            Usuario usuario = new UsuarioDAO().ObtenerUsuario(nombre, contraseña);
            
            if(usuario == null)
                throw new Exception("Combinación de nombre y contraseña invalida para el usuario");
            
            respuesta.setObjetoRespuesta(ToJson(usuario));
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        return respuesta;
    }
}
