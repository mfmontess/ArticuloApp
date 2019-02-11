
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetoRespuesta" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://WebServices/}tiposRespuestaWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaWS", propOrder = {
    "mensaje",
    "objetoRespuesta",
    "tipo"
})
public class RespuestaWS {

    protected String mensaje;
    protected Object objetoRespuesta;
    protected TiposRespuestaWS tipo;

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the objetoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObjetoRespuesta() {
        return objetoRespuesta;
    }

    /**
     * Sets the value of the objetoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObjetoRespuesta(Object value) {
        this.objetoRespuesta = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TiposRespuestaWS }
     *     
     */
    public TiposRespuestaWS getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposRespuestaWS }
     *     
     */
    public void setTipo(TiposRespuestaWS value) {
        this.tipo = value;
    }

}
