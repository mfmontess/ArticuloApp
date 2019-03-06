namespace ArticuloApp.Entidades
{
    public class Enumeraciones
    {
        public enum EstadosUsuario
        {
            Activo=1,
            Inactivo=2
        }

        public enum TiposSolicitud
        {
            Intercambio,
            Donacion
        }

        public enum EstadosSolicitud
        {
            PorResponder,
            Aceptada,
            Rechazada
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

        public enum EstadosNotificacion
        {
            PorEnviar,
            Enviada,
            PorResponder,
            Respondida
        }

        public enum TiposRespuestaWS
        {
            Fallida,
            Exitosa
        }
    }
}
