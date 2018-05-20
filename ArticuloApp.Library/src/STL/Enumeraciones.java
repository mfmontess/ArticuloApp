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
public class Enumeraciones {
    public enum TiposSolicitud{
        Intercambio,
        Donacion
    }
    
    public enum EstadosSolicitud{
    }
    
    public enum TiposArticulo{
        Libro,
        VideoJuego,
        JuegoDeMesa
    }
    
    public enum EstadosArticulo{
        Activo,
        Solicitado,
        EnIntercambio,
        Donado,
        Intercambiado
    }
    
    public enum EstadosUsuario{
        Activo,
        Inactivo        
    }
    
    public enum EstadosNotificacion{
    }
}
