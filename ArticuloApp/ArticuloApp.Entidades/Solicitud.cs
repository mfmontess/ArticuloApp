using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArticuloApp.Entidades
{
    public class Solicitud
    {
        public int id { get; set; }
        public Enumeraciones.TiposSolicitud tipo { get; set; }
        public Articulo articuloEmisor { get; set; }
        public Articulo articuloReceptor { get; set; }
        public Enumeraciones.EstadosSolicitud estado { get; set; }

        public Solicitud(Enumeraciones.TiposSolicitud tipo, Articulo articuloEmisor, Articulo articuloReceptor, Enumeraciones.EstadosSolicitud estado)
        {
            this.id = default(int);
            this.tipo = tipo;
            this.articuloEmisor = articuloEmisor;
            this.articuloReceptor = articuloReceptor;
            this.estado = estado;
        }

        public Solicitud()
        {
            this.id = default(int);
            this.tipo = Enumeraciones.TiposSolicitud.Intercambio;
            this.articuloEmisor = new Articulo();
            this.articuloReceptor = new Articulo();
            this.estado = Enumeraciones.EstadosSolicitud.PorResponder;
        }
    }
}
