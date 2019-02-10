using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ArticuloApp.Web
{
    public partial class Sesion : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnAutenticar_Click(object sender, EventArgs e)
        {
            string strUsuario = txtUsuario.Value;
            string strClave = txtPassword.Value;
        }
    }
}