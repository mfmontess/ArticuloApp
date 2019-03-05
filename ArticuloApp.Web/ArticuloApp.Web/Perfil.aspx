<%@ Page Language="C#" Title="Mi Perfil" MasterPageFile="~/Dashboard.Master" AutoEventWireup="true" CodeBehind="Perfil.aspx.cs" Inherits="ArticuloApp.Web.Perfil" %>

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
            <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnActualizar" Text="Actualizar" OnClick="btnActualizar_Click"/>
            <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnEliminar" Text="Eliminar cuenta" OnClick="btnEliminar_Click"/>
        </p>
    </div>
</asp:Content>
