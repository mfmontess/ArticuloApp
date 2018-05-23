/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import DAL.ClienteDAO;
import STL.Cliente;
import STL.Enumeraciones;
import STL.RespuestaWS;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mmontes
 */
@WebService(serviceName = "ClientesWS")
public class ClientesWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Metodo en el cual se realizará el registro de un cliente
     * @param cliente Objeto Cliente a registrar
     * @return Objeto respuesta
     */
    @WebMethod(operationName = "RegistrarCliente")
    public RespuestaWS RegistrarCliente(@WebParam(name = "cliente") Cliente cliente) {
        RespuestaWS respuesta = new RespuestaWS();        
        try{
            respuesta.setObjetoRespuesta(cliente);
            new ClienteDAO().Registrar(cliente);
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        
        return respuesta;
    }
    
    /**
     * Metodo en el cual se realizará la actualizacion de un cliente
     * @param cliente Objeto Cliente a registrar
     * @return Objeto respuesta
     */
    @WebMethod(operationName = "ActualizarCliente")
    public RespuestaWS ActualizarCliente(@WebParam(name = "cliente") Cliente cliente) {
        RespuestaWS respuesta = new RespuestaWS();
        try{
            respuesta.setObjetoRespuesta(cliente);
            new ClienteDAO().Actualizar(cliente);
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        
        return respuesta;
    }
    
    /**
     * Metodo en el cual se obtiene cliente por su id
     * @param cliente Objeto Cliente a registrar
     * @return Objeto respuesta
     */
    @WebMethod(operationName = "ObtenerClientePorUsuarioId")
    public RespuestaWS ObtenerClientePorUsuarioId(@WebParam(name = "usuarioId") int usuarioId) {
        RespuestaWS respuesta = new RespuestaWS();
        try{
            Cliente cliente = new ClienteDAO().ObtenerClientePorUsuarioId(usuarioId);
            if(cliente == null)
                throw new Exception("Cliente no obtenido para el usuario");
            respuesta.setObjetoRespuesta(cliente);
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        
        return respuesta;
    }
}