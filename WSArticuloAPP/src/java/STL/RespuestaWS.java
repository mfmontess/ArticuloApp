/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STL;

/**
 *
 * @author MICHAEL
 */
public class RespuestaWS {
    private String objetoRespuesta;
    private Enumeraciones.TiposRespuestaWS tipo;
    private String mensaje;

    public RespuestaWS() {
    }

    public RespuestaWS(String objetoRespuesta, Enumeraciones.TiposRespuestaWS tipo, String mensaje) {
        this.objetoRespuesta = objetoRespuesta;
        this.tipo = tipo;
        this.mensaje = mensaje;
    }

    public String getObjetoRespuesta() {
        return objetoRespuesta;
    }

    public void setObjetoRespuesta(String objetoRespuesta) {
        this.objetoRespuesta = objetoRespuesta;
    }

    public Enumeraciones.TiposRespuestaWS getTipo() {
        return tipo;
    }

    public void setTipo(Enumeraciones.TiposRespuestaWS tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
