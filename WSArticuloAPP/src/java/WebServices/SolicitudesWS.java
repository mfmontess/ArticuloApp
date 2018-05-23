/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import STL.Cliente;
import STL.Enumeraciones;
import STL.RespuestaWS;
import STL.Solicitud;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MICHAEL
 */
@WebService(serviceName = "SolicitudesWS")
public class SolicitudesWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Metodo en el cual se realiza el registro de una solicitud
     * @param solicitud Objeto solicitud a registrar
     * @return Respuesta obtenida
     */
    @WebMethod(operationName = "RealizarSolicitud")
    public RespuestaWS RealizarSolicitud(@WebParam(name = "solicitud") Solicitud solicitud) {
        
        RespuestaWS respuesta = new RespuestaWS();        
        try{
            respuesta.setObjetoRespuesta(solicitud);
            new DAL.SolicitudDAO().Registrar(solicitud);
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        
        return respuesta;
    }
    
    /**
     * Metodo en el cual se obtienen las solicitudes de un cliente
     * @param estado Estado en el que se encuentran las solicitudes
     * @param cliente Objeto cliente al cual estan asociadas las solicitudes
     * @return Respuesta obtenida
     */
    @WebMethod(operationName = "ObtenerSolicitudesPorEstadoCliente")
    public RespuestaWS ObtenerSolicitudesPorEstadoCliente(@WebParam(name = "estado") Enumeraciones.EstadosSolicitud estado, @WebParam(name = "cliente") Cliente cliente) {
        RespuestaWS respuesta = new RespuestaWS();        
        try{
            List<Solicitud> solicitudes = new DAL.SolicitudDAO().ObtenerSolicitudesPorEstadoCliente(estado, cliente);
            respuesta.setObjetoRespuesta(solicitudes);
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Exitosa);
        } catch(Exception e){
            respuesta.setMensaje(e.getMessage());
            respuesta.setTipo(Enumeraciones.TiposRespuestaWS.Fallida);
        }
        
        return respuesta;
    }
}
