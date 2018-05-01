/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import STL.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author MICHAEL
 */
public class UsuarioDAO {
    public Usuario ObtenerUsuario(String nombre, String contraseña){
        Usuario usuario = null;
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("select * from usuarios where nombre=? and contraseña=?");
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
                usuario = new Usuario();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return usuario;
    }

    public void Registrar(Usuario usuario) {
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("INSERT INTO usuarios (nombre,contraseña) VALUES (?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
