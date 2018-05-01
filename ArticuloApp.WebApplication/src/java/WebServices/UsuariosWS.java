/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import DAL.UsuarioDAO;
import STL.Usuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
    public void RegistrarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        UsuarioDAO obj = new UsuarioDAO();
        obj.Registrar(usuario);
    }
    
    /**
     * Metodo validar el cual obtiene un usuario deacuerdo al nombre y contraseña enviados, en caso de no encontrar alguno, retorna null
     * @param nombre Nombre del usuario a validar
     * @param contraseña Contraseña del usuario a validar
     * @return Retorna objeto usuario con el nombre y contraseña enviados
     */
    @WebMethod(operationName = "ObtenerUsuario")
    public Usuario ObtenerUsuario(@WebParam(name = "nombre") String nombre,@WebParam(name = "contraseña") String contraseña) {
        UsuarioDAO db = new UsuarioDAO();
        Usuario usuario = db.ObtenerUsuario(nombre, contraseña);
        
        return usuario;
    }
}
