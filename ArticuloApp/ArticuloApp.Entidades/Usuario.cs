using System;

namespace ArticuloApp.Entidades
{
    [Serializable]
    public class Usuario
    {
        public Usuario() { }
        public Usuario(string prmstrUsuario, string prmstrClave, string prmstrCorreo, Cliente prmobjCliente)
        {
            this.nombre = prmstrUsuario;
            this.contraseña = prmstrClave;
            this.correo = prmstrCorreo;
            this.estado = Enumeraciones.EstadosUsuario.Inactivo;
            this.cliente = prmobjCliente;
        }

        public int id { get; set; }
        public string nombre { get; set; }
        public string contraseña { get; set; }
        public string correo { get; set; }
        public Enumeraciones.EstadosUsuario estado { get; set; }
        public Cliente cliente { get; set; }
    }
}
