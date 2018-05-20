/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import STL.Articulo;
import STL.Cliente;
import STL.Enumeraciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mmontes
 */
public class ArticuloDAO {

    public void RegistrarArticulo(Articulo articulo) {
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("INSERT INTO articulos (nombre,estado,tipo,propietario) VALUES (?,?,?,?)");
            ps.setString(1, articulo.getNombre());
            ps.setInt(2, articulo.getEstado().ordinal() + 1);
            ps.setInt(3, articulo.getTipo().ordinal() + 1);
            ps.setInt(4, articulo.getPropietario().getId());
            ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void ActualizarArticulo(Articulo articulo) {
        Connection accessBD = Conexion.getConexion();
        try{
            PreparedStatement ps = accessBD.prepareCall("UPDATE FROM articulos SET nombre =?, estado =?, tipo=?, propietario=? WHERE articulo_id =?");
            ps.setString(1, articulo.getNombre());
            ps.setInt(2, articulo.getEstado().ordinal() + 1);
            ps.setInt(3, articulo.getTipo().ordinal() + 1);
            ps.setInt(4, articulo.getPropietario().getId());
            ps.setInt(5, articulo.getId());
            ps.executeUpdate();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Articulo> ObtenerArticulosPorCliente(Cliente cliente) {
        ArrayList<Articulo> lstArticulos = new ArrayList<>();
        try{
            Connection accessBD = Conexion.getConexion();
            PreparedStatement ps = accessBD.prepareCall("select articulo_cliente_id, nombre, tipo, fecha_publicacion, ac.estado, foto\n" +
                    "from articulos a\n" +
                    "inner join articulos_clientes ac\n" +
                    "on a.articulo_id = ac.articulo_id "+
                    "where cliente_id=?");
            ps.setInt(1, cliente.getId());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){                
                Articulo articulo = new Articulo(
                        rs.getInt(1),
                        rs.getString(2),
                        Enumeraciones.TiposArticulo.values()[rs.getInt(3)-1],
                        rs.getDate(4),
                        Enumeraciones.EstadosArticulo.values()[rs.getInt(5)-1],
                        rs.getString(6),
                        cliente
                );
                lstArticulos.add(articulo);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return lstArticulos;
    }

    public List<Articulo> ObtenerArticulosPorEstado(Enumeraciones.EstadosArticulo estado) {
        ArrayList<Articulo> lstArticulos = new ArrayList<>();        
        ClienteDAO clienteDAO = new ClienteDAO();
        try{
            Connection accessBD = Conexion.getConexion();
            PreparedStatement ps = accessBD.prepareCall("select articulo_cliente_id, nombre, tipo, fecha_publicacion, ac.estado, foto, cliente_id\n" +
                    "from articulos a\n" +
                    "inner join articulos_clientes ac\n" +
                    "on a.articulo_id = ac.articulo_id "+
                    "where ac.estado=?");
            ps.setInt(1, estado.ordinal() + 1 );
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Articulo articulo = new Articulo(
                        rs.getInt(1),
                        rs.getString(2),
                        Enumeraciones.TiposArticulo.values()[rs.getInt(3)-1],
                        rs.getDate(4),
                        estado,
                        rs.getString(6),
                        clienteDAO.ObtenerCliente(rs.getInt(7))
                );
                lstArticulos.add(articulo);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return lstArticulos;
    }    
}
