
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

    private final static QName _RegistrarCliente_QNAME = new QName("http://WebServices/", "RegistrarCliente");
    private final static QName _ActualizarClienteResponse_QNAME = new QName("http://WebServices/", "ActualizarClienteResponse");
    private final static QName _RegistrarClienteResponse_QNAME = new QName("http://WebServices/", "RegistrarClienteResponse");
    private final static QName _ObtenerClientePorUsuarioIdResponse_QNAME = new QName("http://WebServices/", "ObtenerClientePorUsuarioIdResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://WebServices/", "helloResponse");
    private final static QName _ObtenerClientePorUsuarioId_QNAME = new QName("http://WebServices/", "ObtenerClientePorUsuarioId");
    private final static QName _Hello_QNAME = new QName("http://WebServices/", "hello");
    private final static QName _ActualizarCliente_QNAME = new QName("http://WebServices/", "ActualizarCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarClienteResponse }
     * 
     */
    public ActualizarClienteResponse createActualizarClienteResponse() {
        return new ActualizarClienteResponse();
    }

    /**
     * Create an instance of {@link RegistrarCliente }
     * 
     */
    public RegistrarCliente createRegistrarCliente() {
        return new RegistrarCliente();
    }

    /**
     * Create an instance of {@link ObtenerClientePorUsuarioIdResponse }
     * 
     */
    public ObtenerClientePorUsuarioIdResponse createObtenerClientePorUsuarioIdResponse() {
        return new ObtenerClientePorUsuarioIdResponse();
    }

    /**
     * Create an instance of {@link RegistrarClienteResponse }
     * 
     */
    public RegistrarClienteResponse createRegistrarClienteResponse() {
        return new RegistrarClienteResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ObtenerClientePorUsuarioId }
     * 
     */
    public ObtenerClientePorUsuarioId createObtenerClientePorUsuarioId() {
        return new ObtenerClientePorUsuarioId();
    }

    /**
     * Create an instance of {@link ActualizarCliente }
     * 
     */
    public ActualizarCliente createActualizarCliente() {
        return new ActualizarCliente();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link RespuestaWS }
     * 
     */
    public RespuestaWS createRespuestaWS() {
        return new RespuestaWS();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "RegistrarCliente")
    public JAXBElement<RegistrarCliente> createRegistrarCliente(RegistrarCliente value) {
        return new JAXBElement<RegistrarCliente>(_RegistrarCliente_QNAME, RegistrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ActualizarClienteResponse")
    public JAXBElement<ActualizarClienteResponse> createActualizarClienteResponse(ActualizarClienteResponse value) {
        return new JAXBElement<ActualizarClienteResponse>(_ActualizarClienteResponse_QNAME, ActualizarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "RegistrarClienteResponse")
    public JAXBElement<RegistrarClienteResponse> createRegistrarClienteResponse(RegistrarClienteResponse value) {
        return new JAXBElement<RegistrarClienteResponse>(_RegistrarClienteResponse_QNAME, RegistrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClientePorUsuarioIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ObtenerClientePorUsuarioIdResponse")
    public JAXBElement<ObtenerClientePorUsuarioIdResponse> createObtenerClientePorUsuarioIdResponse(ObtenerClientePorUsuarioIdResponse value) {
        return new JAXBElement<ObtenerClientePorUsuarioIdResponse>(_ObtenerClientePorUsuarioIdResponse_QNAME, ObtenerClientePorUsuarioIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClientePorUsuarioId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ObtenerClientePorUsuarioId")
    public JAXBElement<ObtenerClientePorUsuarioId> createObtenerClientePorUsuarioId(ObtenerClientePorUsuarioId value) {
        return new JAXBElement<ObtenerClientePorUsuarioId>(_ObtenerClientePorUsuarioId_QNAME, ObtenerClientePorUsuarioId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ActualizarCliente")
    public JAXBElement<ActualizarCliente> createActualizarCliente(ActualizarCliente value) {
        return new JAXBElement<ActualizarCliente>(_ActualizarCliente_QNAME, ActualizarCliente.class, null, value);
    }

}
