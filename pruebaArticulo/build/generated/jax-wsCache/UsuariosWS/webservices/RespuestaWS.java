
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad mensaje.
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
     * Define el valor de la propiedad mensaje.
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
     * Obtiene el valor de la propiedad objetoRespuesta.
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
     * Define el valor de la propiedad objetoRespuesta.
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
     * Obtiene el valor de la propiedad tipo.
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
     * Define el valor de la propiedad tipo.
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
