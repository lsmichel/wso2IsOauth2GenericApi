
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
 *         &lt;element name="validationReqDTO" type="{http://dto.oauth2.identity.carbon.wso2.org/xsd}OAuth2TokenValidationRequestDTO" minOccurs="0"/>
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
    "validationReqDTO"
})
@XmlRootElement(name = "validate", namespace = "http://org.apache.axis2/xsd")
public class Validate {

    @XmlElementRef(name = "validationReqDTO", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OAuth2TokenValidationRequestDTO> validationReqDTO;

    /**
     * Obtient la valeur de la propriété validationReqDTO.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTO }{@code >}
     *     
     */
    public JAXBElement<OAuth2TokenValidationRequestDTO> getValidationReqDTO() {
        return validationReqDTO;
    }

    /**
     * Définit la valeur de la propriété validationReqDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTO }{@code >}
     *     
     */
    public void setValidationReqDTO(JAXBElement<OAuth2TokenValidationRequestDTO> value) {
        this.validationReqDTO = value;
    }

}
