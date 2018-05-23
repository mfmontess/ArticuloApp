
package webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tiposRespuestaWS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tiposRespuestaWS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fallida"/>
 *     &lt;enumeration value="Exitosa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tiposRespuestaWS")
@XmlEnum
public enum TiposRespuestaWS {

    @XmlEnumValue("Fallida")
    FALLIDA("Fallida"),
    @XmlEnumValue("Exitosa")
    EXITOSA("Exitosa");
    private final String value;

    TiposRespuestaWS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiposRespuestaWS fromValue(String v) {
        for (TiposRespuestaWS c: TiposRespuestaWS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
