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
            PreparedStatement ps = accessBD.prepareCall("select usuario_id, nombre, contrasena, estado, foto from usuarios where nombre=? and contrasena=?");
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
            PreparedStatement ps = accessBD.prepareStatement("INSERT INTO usuarios (nombre,contrasena,estado,cliente_id) VALUES (?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.setInt(2, usuario.getEstado().ordinal() +1);
            ps.setInt(3, clienteId);
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next())
                usuario.setId(rs.getInt(1));
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    Usuario ObtenerUsuario(int id) {
        Usuario usuario = null;
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("select usuario_id, nombre, contrasena, estado, foto from usuarios where usuario_id=?");
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

    void Actualizar(Usuario usuario, int clienteId) {
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("UPDATE usuarios SET nombre=?, contrasena=?, foto=?, estado=? WHERE cliente_id=?");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getFoto());
            ps.setInt(4, usuario.getEstado().ordinal()+1);
            ps.setInt(5, clienteId);
            ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}