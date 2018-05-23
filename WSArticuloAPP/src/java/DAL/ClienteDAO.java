/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import STL.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MICHAEL
 */
public class ClienteDAO {
    public Cliente ObtenerClientePorUsuarioId(int usuarioId){
        Cliente cliente = null;
        Connection accessBD = Conexion.getConexion();
        UsuarioDAO objDAO = new UsuarioDAO();
        try{
            String sql = "select c.cliente_id, c.nombre, c.direccion, c.telefono, c.correo, u.usuario_id from articuloapp_bd.clientes c inner join articuloapp_bd.usuarios u on c.cliente_id = u.cliente_id where u.usuario_id=?";
            PreparedStatement ps = accessBD.prepareCall(sql);
            ps.setInt(1, usuarioId);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cliente = new Cliente(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), objDAO.ObtenerUsuario(rs.getInt(6)));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cliente;
    }
    public Cliente ObtenerCliente(int id){
        Cliente cliente = null;
        Connection accessBD = Conexion.getConexion();
        UsuarioDAO objDAO = new UsuarioDAO();
        try{
            PreparedStatement ps = accessBD.prepareCall("select cliente_id, nombre, direccion, telefono, correo, usuario_id from articuloapp_bd.clientes where cliente_id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cliente = new Cliente(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), objDAO.ObtenerUsuario(rs.getInt(6)));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cliente;
    }

    public void Registrar(Cliente cliente) throws Exception {
        Connection accessBD = Conexion.getConexion();
        try{
            String sql = "INSERT INTO articuloapp_bd.clientes (nombre,telefono,correo,direccion) VALUES (?,?,?,?)";
            PreparedStatement ps = accessBD.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getDireccion());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next())
                cliente.setId(rs.getInt(1));
            
            ps.close();
            new UsuarioDAO().Registrar(cliente.getUsuario(), cliente.getId());
        } catch(SQLException e){
            throw new Exception(e.getMessage());
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Actualizar(Cliente cliente) {
        Connection accessBD = Conexion.getConexion();
        try{
            String sql = "UPDATE articuloapp_bd.clientes SET nombre=?, telefono=?, correo=?, direccion=? WHERE cliente_id=?";
            PreparedStatement ps = accessBD.prepareCall(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(4, cliente.getId());
            ps.executeUpdate();
            
            ps.close();            
            
            new UsuarioDAO().Actualizar(cliente.getUsuario(), cliente.getId());
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public Cliente ObtenerUsuarioCliente(String nombre, String contraseña) {
        Cliente cliente = null;
        Connection accessBD = Conexion.getConexion();
        UsuarioDAO objDAO = new UsuarioDAO();
        try{
            String sql = "select c.cliente_id, c.nombre, c.direccion, c.telefono, c.correo, u.usuario_id from articuloapp_bd.clientes c inner join articuloapp_bd.usuarios u on c.cliente_id = u.cliente_id where u.nombre=? and u.contrasena=?";
            PreparedStatement ps = accessBD.prepareCall(sql);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cliente = new Cliente(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), objDAO.ObtenerUsuario(rs.getInt(6)));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cliente;
    }
}
