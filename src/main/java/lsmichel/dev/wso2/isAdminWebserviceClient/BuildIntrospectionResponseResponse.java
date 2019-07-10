
package lsmichel.dev.wso2.isAdminWebserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://dto.oauth2.identity.carbon.wso2.org/xsd}OAuth2IntrospectionResponseDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "buildIntrospectionResponseResponse", namespace = "http://org.apache.axis2/xsd")
public class BuildIntrospectionResponseResponse {

    @XmlElementRef(name = "return", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OAuth2IntrospectionResponseDTO> _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OAuth2IntrospectionResponseDTO }{@code >}
     *     
     */
    public JAXBElement<OAuth2IntrospectionResponseDTO> getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OAuth2IntrospectionResponseDTO }{@code >}
     *     
     */
    public void setReturn(JAXBElement<OAuth2IntrospectionResponseDTO> value) {
        this._return = value;
    }

}
