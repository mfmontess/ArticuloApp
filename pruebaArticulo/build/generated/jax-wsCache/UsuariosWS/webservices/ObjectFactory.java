
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarUsuarioResponse_QNAME = new QName("http://WebServices/", "ActualizarUsuarioResponse");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://WebServices/", "ObtenerUsuario");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://WebServices/", "ObtenerUsuarioResponse");
    private final static QName _ActualizarUsuario_QNAME = new QName("http://WebServices/", "ActualizarUsuario");
    private final static QName _HelloResponse_QNAME = new QName("http://WebServices/", "helloResponse");
    private final static QName _RegistrarUsuario_QNAME = new QName("http://WebServices/", "RegistrarUsuario");
    private final static QName _Hello_QNAME = new QName("http://WebServices/", "hello");
    private final static QName _ObtenerUsuarioClienteResponse_QNAME = new QName("http://WebServices/", "ObtenerUsuarioClienteResponse");
    private final static QName _ObtenerUsuarioCliente_QNAME = new QName("http://WebServices/", "ObtenerUsuarioCliente");
    private final static QName _RegistrarUsuarioResponse_QNAME = new QName("http://WebServices/", "RegistrarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link ActualizarUsuarioResponse }
     * 
     */
    public ActualizarUsuarioResponse createActualizarUsuarioResponse() {
        return new ActualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ActualizarUsuario }
     * 
     */
    public ActualizarUsuario createActualizarUsuario() {
        return new ActualizarUsuario();
    }

    /**
     * Create an instance of {@link RegistrarUsuario }
     * 
     */
    public RegistrarUsuario createRegistrarUsuario() {
        return new RegistrarUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioClienteResponse }
     * 
     */
    public ObtenerUsuarioClienteResponse createObtenerUsuarioClienteResponse() {
        return new ObtenerUsuarioClienteResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioResponse }
     * 
     */
    public RegistrarUsuarioResponse createRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioCliente }
     * 
     */
    public ObtenerUsuarioCliente createObtenerUsuarioCliente() {
        return new ObtenerUsuarioCliente();
    }

    /**
     * Create an instance of {@link RespuestaWS }
     * 
     */
    public RespuestaWS createRespuestaWS() {
        return new RespuestaWS();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ActualizarUsuarioResponse")
    public JAXBElement<ActualizarUsuarioResponse> createActualizarUsuarioResponse(ActualizarUsuarioResponse value) {
        return new JAXBElement<ActualizarUsuarioResponse>(_ActualizarUsuarioResponse_QNAME, ActualizarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ObtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ObtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ActualizarUsuario")
    public JAXBElement<ActualizarUsuario> createActualizarUsuario(ActualizarUsuario value) {
        return new JAXBElement<ActualizarUsuario>(_ActualizarUsuario_QNAME, ActualizarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "RegistrarUsuario")
    public JAXBElement<RegistrarUsuario> createRegistrarUsuario(RegistrarUsuario value) {
        return new JAXBElement<RegistrarUsuario>(_RegistrarUsuario_QNAME, RegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ObtenerUsuarioClienteResponse")
    public JAXBElement<ObtenerUsuarioClienteResponse> createObtenerUsuarioClienteResponse(ObtenerUsuarioClienteResponse value) {
        return new JAXBElement<ObtenerUsuarioClienteResponse>(_ObtenerUsuarioClienteResponse_QNAME, ObtenerUsuarioClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ObtenerUsuarioCliente")
    public JAXBElement<ObtenerUsuarioCliente> createObtenerUsuarioCliente(ObtenerUsuarioCliente value) {
        return new JAXBElement<ObtenerUsuarioCliente>(_ObtenerUsuarioCliente_QNAME, ObtenerUsuarioCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "RegistrarUsuarioResponse")
    public JAXBElement<RegistrarUsuarioResponse> createRegistrarUsuarioResponse(RegistrarUsuarioResponse value) {
        return new JAXBElement<RegistrarUsuarioResponse>(_RegistrarUsuarioResponse_QNAME, RegistrarUsuarioResponse.class, null, value);
    }

}
