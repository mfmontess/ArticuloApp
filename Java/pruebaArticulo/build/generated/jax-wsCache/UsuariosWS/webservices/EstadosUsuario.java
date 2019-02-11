
package webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estadosUsuario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="estadosUsuario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Activo"/>
 *     &lt;enumeration value="Inactivo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estadosUsuario")
@XmlEnum
public enum EstadosUsuario {

    @XmlEnumValue("Activo")
    ACTIVO("Activo"),
    @XmlEnumValue("Inactivo")
    INACTIVO("Inactivo");
    private final String value;

    EstadosUsuario(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadosUsuario fromValue(String v) {
        for (EstadosUsuario c: EstadosUsuario.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
