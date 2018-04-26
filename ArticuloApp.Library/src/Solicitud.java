/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Solicitud {
    private String codigo;
    private Enumeraciones.TiposSolicitud tipo;
    private Articulo articuloEmisor;
    private Articulo articuloReceptor;
    private Enumeraciones.EstadosSolicitud estado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Enumeraciones.TiposSolicitud getTipo() {
        return tipo;
    }

    public void setTipo(Enumeraciones.TiposSolicitud tipo) {
        this.tipo = tipo;
    }

    public Articulo getArticuloEmisor() {
        return articuloEmisor;
    }

    public void setArticuloEmisor(Articulo articuloEmisor) {
        this.articuloEmisor = articuloEmisor;
    }

    public Articulo getArticuloReceptor() {
        return articuloReceptor;
    }

    public void setArticuloReceptor(Articulo articuloReceptor) {
        this.articuloReceptor = articuloReceptor;
    }

    public Enumeraciones.EstadosSolicitud getEstado() {
        return estado;
    }

    public void setEstado(Enumeraciones.EstadosSolicitud estado) {
        this.estado = estado;
    }
}
