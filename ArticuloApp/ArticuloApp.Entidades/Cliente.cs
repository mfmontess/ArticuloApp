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
            this.ciudad = string.Empty;
        }

        public Cliente(string prmstrNombre, string prmstrDireccion, string prmstrTelefono, string prmstrCiudad)
        {
            this.direccion = prmstrDireccion;
            this.telefono = prmstrTelefono;
            this.nombre = prmstrNombre;
            this.ciudad = prmstrCiudad;
        }

        public int id { get; set; }
        public string nombre { get; set; }
        public string direccion { get; set; }
        public string telefono { get; set; }
        public string ciudad { get; set; }
    }
}
