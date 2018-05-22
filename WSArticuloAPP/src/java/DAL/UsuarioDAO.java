/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import STL.Enumeraciones;
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
            PreparedStatement ps = accessBD.prepareCall("select usuario_id, nombre, contraseña, estado, foto from usuarios where nombre=? and contraseña=?");
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3), Enumeraciones.EstadosUsuario.values()[rs.getInt(4) -1 ],rs.getString(5));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return usuario;
    }

    public void Registrar(Usuario usuario, int clienteId) {
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("INSERT INTO usuarios (nombre,contraseña,cliente_id) VALUES (?,?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.setInt(3, clienteId);
            ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    Usuario ObtenerUsuario(int id) {
        Usuario usuario = null;
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("select usuario_id, nombre, contraseña, estado, foto from usuarios where usuario_id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3), Enumeraciones.EstadosUsuario.values()[rs.getInt(4) -1 ],rs.getString(5));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return usuario;
    }
}