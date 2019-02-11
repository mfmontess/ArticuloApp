<%@ Page Title="Registrarse" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Registro.aspx.cs" Inherits="ArticuloApp.Web.Registro" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    
    <div class="jumbotron">
        <h2><%: Title %></h2>
        <p>
            <input type="text" runat="server" placeholder="Usuario" id="txtUsuario" required />
        </p>
        <p>
            <input type="password" runat="server" placeholder="Contraseña" id="txtPassword" required />
        </p>
        <p>
            <input type="password" runat="server" placeholder="Confirmar Contraseña" id="txtPasswordC" required />
            <asp:CompareValidator runat="server" ID="comPassword" ErrorMessage="El valor del campo de confirmar contraseña no correspone" ControlToCompare="txtPassword" ControlToValidate="txtPasswordC">
                *
            </asp:CompareValidator>
        </p>
        <p>
            <input type="text" runat="server" placeholder="Correo" id="txtCorreo" required />
            <asp:RegularExpressionValidator ID="revCorreo" runat="server" Display="Dynamic" ErrorMessage = "El campo Correo electrónico no es válido" ValidationExpression = "^(?=^(\w(\w|\-)*([.](\w|\-)+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*)$)(?:.{5,60})$"  ControlToValidate = "txtCorreo" >*
				</asp:RegularExpressionValidator>
        </p>
        <p>
            <input type="text" runat="server" placeholder="Dirección" id="txtDireccion" />
        </p>
        <p>
            <input type="text" runat="server" placeholder="Telefono" id="txtTelefono" />
            <asp:RegularExpressionValidator ID="revTelefono" runat="server" Display="Dynamic" ErrorMessage = "El campo Celular no es válido" ValidationExpression = "[0-9]{7}$"  ControlToValidate = "txtTelefono" >*
				</asp:RegularExpressionValidator>
        </p>
        <p>
            <input type="checkbox" runat="server" id="chkAceptaTerminos" required />
            <a>Terminos y condiciones</a>
        </p>
        <p>
            <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnRegistrar" Text="Registrarse" OnClick="btnRegistrar_Click"/>
        </p>
        <p>            
            <asp:ValidationSummary ID="ValidationSummary1"   ShowMessageBox ="false" runat="server"  /> 
        </p>
    </div>
</asp:Content>