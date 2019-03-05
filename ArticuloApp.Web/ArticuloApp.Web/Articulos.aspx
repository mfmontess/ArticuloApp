<%@ Page Language="C#" Title="Mis Artículos" MasterPageFile="~/Dashboard.Master" AutoEventWireup="true" CodeBehind="Articulos.aspx.cs" Inherits="ArticuloApp.Web.Articulos" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    <h2><%: Title %></h2>
    <div class="jumbotron">
        <div class="row">
            <div class="col-md-2">
                <asp:LinkButton runat="server" ID="btnImagen" CssClass="menu-page-option nolink">
                <div class="menu-page-option__icon">
                    <img src="https://img.icons8.com/android/64/000000/picture.png">
                    <!--encontrado en https://iconos8.es/icon/3177/picture-->
                </div>
                <span class="menu-page-option__label">Foto del artículo</span>
                </asp:LinkButton>
            </div>
            <div class="col-md-5">
                <p>
                    <asp:Label runat="server" ID="txtDescripcionArticulo">Descripción del artículo</asp:Label>
                </p>
                <p>
                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnDonar" Text="Donar" />
                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnIntercambiar" Text="Intercambiar" />
                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnEditar" Text="Editar" />
                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnEliminar" Text="Eliminar" />
                </p>
            </div>
        </div>
    </div>
</asp:Content>