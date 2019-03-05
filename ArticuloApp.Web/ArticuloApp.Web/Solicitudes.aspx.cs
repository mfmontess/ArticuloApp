using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ArticuloApp.Web
{
    public partial class Solicitudes : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ArrayList objects = new ArrayList();
            objects.Add(new { id = 1, foto = "", descripcion="Linda patineta", detalle = "Quiero cambiar contigo"});
            objects.Add(new { id = 2, foto = "", descripcion = "Linda moto", detalle = "Quiero cambiar contigo" });
            rptSolicitudes.DataSource = objects;
            rptSolicitudes.DataBind();
        }
    }
}