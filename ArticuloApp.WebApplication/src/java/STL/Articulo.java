package STL;


import STL.Enumeraciones;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Articulo {
    private int id;
    private String nombre;
    private Enumeraciones.TiposArticulo tipo;
    private Date fechaPublicacion;
    private Enumeraciones.EstadosArticulo estado;
    private Cliente propietario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enumeraciones.TiposArticulo getTipo() {
        return tipo;
    }

    public void setTipo(Enumeraciones.TiposArticulo tipo) {
        this.tipo = tipo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Enumeraciones.EstadosArticulo getEstado() {
        return estado;
    }

    public void setEstado(Enumeraciones.EstadosArticulo estado) {
        this.estado = estado;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
}
