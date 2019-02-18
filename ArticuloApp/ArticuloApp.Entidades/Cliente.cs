using System;

namespace ArticuloApp.Entidades
{
    [Serializable]
    public class Cliente
    {
        public Cliente()
        {
            this.id = default(int);
            this.direccion = string.Empty;
            this.telefono = string.Empty;
            this.nombre = string.Empty;
        }

        public Cliente(string prmstrNombre, string prmstrDireccion, string prmstrTelefono)
        {
            this.direccion = prmstrDireccion;
            this.telefono = prmstrTelefono;
            this.nombre = prmstrNombre;
        }

        public int id { get; set; }
        public string nombre { get; set; }
        public string direccion { get; set; }
        public string telefono { get; set; }
    }
}
