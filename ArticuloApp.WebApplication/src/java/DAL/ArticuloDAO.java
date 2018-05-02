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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Articulo> ObtenerArticulosPorEstado(Enumeraciones.EstadosArticulo estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
