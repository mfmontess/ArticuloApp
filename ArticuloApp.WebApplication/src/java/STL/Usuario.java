package STL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private Enumeraciones.EstadosUsuario estado;
    private String foto;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String contraseña, Enumeraciones.EstadosUsuario estado, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.estado = estado;
        this.foto = foto;
    }

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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Enumeraciones.EstadosUsuario getEstado() {
        return estado;
    }

    public void setEstado(Enumeraciones.EstadosUsuario estado) {
        this.estado = estado;
    }
}
