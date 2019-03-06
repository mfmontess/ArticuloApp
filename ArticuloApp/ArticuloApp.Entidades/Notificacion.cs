namespace ArticuloApp.Entidades
{
    public class Notificacion
    {
        public  int id { get; set; }
        public Cliente remitente { get; set; }
        public Cliente destinatario { get; set; }
        public string asunto { get; set; }
        public string mensaje { get; set; }
        public Enumeraciones.EstadosNotificacion estado { get; set; }

        public Notificacion(Cliente remitente, Cliente destinatario, string asunto, string mensaje, Enumeraciones.EstadosNotificacion estado)
        {
            this.id = default(int);
            this.remitente = remitente;
            this.destinatario = destinatario;
            this.asunto = asunto;
            this.mensaje = mensaje;
            this.estado = estado;
        }

        public Notificacion()
        {
            this.id = default(int);
            this.remitente = new Cliente();
            this.destinatario = new Cliente();
            this.asunto = string.Empty;
            this.mensaje = string.Empty;
            this.estado = Enumeraciones.EstadosNotificacion.PorEnviar;
        }
    }
}
