using System;

namespace ArticuloApp.Entidades
{
    public class Articulo
    {
        public Articulo()
        {
            this.id = default(int);
            this.nombre = string.Empty;
            this.tipo = default(Enumeraciones.TiposArticulo);
            this.fechaPublicacion = default(DateTime);
            this.estado = Enumeraciones.EstadosArticulo.Activo;
            this.foto = string.Empty;
            this.propietario = new Cliente();
        }

        public Articulo(string nombre, Enumeraciones.TiposArticulo tipo, DateTime fechaPublicacion, string foto, Cliente propietario)
        {
            this.id = default(int);
            this.nombre = nombre;
            this.tipo = tipo;
            this.fechaPublicacion = fechaPublicacion;
            this.estado = Enumeraciones.EstadosArticulo.Activo;
            this.foto = foto;
            this.propietario = propietario;
        }

        public int id { get; set; }
        public string nombre { get; set; }
        public Enumeraciones.TiposArticulo tipo { get; set; }
        public DateTime fechaPublicacion { get; set; }
        public Enumeraciones.EstadosArticulo estado { get; set; }
        public string foto { get; set; }
        public Cliente propietario { get; set; }
    }
}
