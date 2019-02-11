using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArticuloApp.Entidades
{
    public class Enumeraciones
    {
        public enum TiposSolicitud
        {
            Intercambio,
            Donacion
        }

        public enum EstadosSolicitud
        {
        }

        public enum TiposArticulo
        {
            Libro,
            VideoJuego,
            JuegoDeMesa
        }

        public enum EstadosArticulo
        {
            Activo,
            Solicitado,
            EnIntercambio,
            Donado,
            Intercambiado
        }

        public enum EstadosUsuario
        {
            Activo,
            Inactivo
        }

        public enum EstadosNotificacion
        {
        }

        public enum TiposRespuestaWS
        {
            Fallida,
            Exitosa
        }
    }
}
