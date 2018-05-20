/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import DAL.ArticuloDAO;
import STL.*;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "ArticulosWS")
public class ArticulosWS {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Método por el cual se registra un Articulo
     * @param articulo Objeto Articulo a registrar
     */
    @WebMethod(operationName = "RegistrarArticulo")
    public void RegistrarArticulo(@WebParam(name = "articulo") Articulo articulo) {
        new ArticuloDAO().RegistrarArticulo(articulo);
    }
    
    /**
     * Método en el cual se actualiza la información de un articulo
     * @param articulo Objeto Articulo a actualizar
     */
    @WebMethod(operationName = "ActualizarArticulo")
    public void ActualizarArticulo(@WebParam(name = "articulo") Articulo articulo) {
        new ArticuloDAO().ActualizarArticulo(articulo);
    }
    
    /**
     * Método en el cual se obtienen los articulos de un cliente
     * @param cliente Objeto cliente del cual se consultaran sus articulos
     * @return Lista obtenida de objectos Articulo
     */
    @WebMethod(operationName = "ObtenerArticulosPorCliente")
    public List<Articulo> ObtenerArticulosPorCliente(@WebParam(name = "cliente") Cliente cliente) {
        return new ArticuloDAO().ObtenerArticulosPorCliente(cliente);
    }
    
    /**
     * Método en el cual se obtienen los articulos de un cliente
     * @param estado Estado de los articulos que se quieren consultar
     * @return Lista obtenida de objectos Articulo
     */
    @WebMethod(operationName = "ObtenerArticulosPorEstado")
    public List<Articulo> ObtenerArticulosPorEstado(@WebParam(name = "estado") Enumeraciones.EstadosArticulo estado) {
        return new ArticuloDAO().ObtenerArticulosPorEstado(estado);
    }
}
