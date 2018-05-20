package STL;


import STL.Enumeraciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Notificacion {
    private Cliente remitente;
    private Cliente destinatario;
    private String mensaje;
    private Enumeraciones.EstadosNotificacion estado;

    public Cliente getRemitente() {
        return remitente;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Enumeraciones.EstadosNotificacion getEstado() {
        return estado;
    }

    public void setEstado(Enumeraciones.EstadosNotificacion estado) {
        this.estado = estado;
    }
}
