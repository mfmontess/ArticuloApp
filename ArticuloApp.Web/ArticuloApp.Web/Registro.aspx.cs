using System;
using System.Web.UI;

namespace ArticuloApp.Web
{
    public partial class Registro : System.Web.UI.Page
    {
        Integrador.BLL.Usuario usuario = new Integrador.BLL.Usuario();

        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnRegistrar_Click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                usuario.Registrar(txtUsuario.Value, txtPassword.Value, txtCorreo.Value, string.Empty, txtDireccion.Value, txtTelefono.Value, string.Empty);
            }
        }
    }
}