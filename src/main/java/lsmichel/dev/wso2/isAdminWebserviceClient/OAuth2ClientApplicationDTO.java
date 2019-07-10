
package lsmichel.dev.wso2.isAdminWebserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OAuth2ClientApplicationDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OAuth2ClientApplicationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessTokenValidationResponse" type="{http://dto.oauth2.identity.carbon.wso2.org/xsd}OAuth2TokenValidationResponseDTO" minOccurs="0"/>
 *         &lt;element name="consumerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAuth2ClientApplicationDTO", propOrder = {
    "accessTokenValidationResponse",
    "consumerKey"
})
public class OAuth2ClientApplicationDTO {

    @XmlElementRef(name = "accessTokenValidationResponse", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OAuth2TokenValidationResponseDTO> accessTokenValidationResponse;
    @XmlElementRef(name = "consumerKey", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerKey;

    /**
     * Obtient la valeur de la propriété accessTokenValidationResponse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTO }{@code >}
     *     
     */
    public JAXBElement<OAuth2TokenValidationResponseDTO> getAccessTokenValidationResponse() {
        return accessTokenValidationResponse;
    }

    /**
     * Définit la valeur de la propriété accessTokenValidationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTO }{@code >}
     *     
     */
    public void setAccessTokenValidationResponse(JAXBElement<OAuth2TokenValidationResponseDTO> value) {
        this.accessTokenValidationResponse = value;
    }

    /**
     * Obtient la valeur de la propriété consumerKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerKey() {
        return consumerKey;
    }

    /**
     * Définit la valeur de la propriété consumerKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerKey(JAXBElement<String> value) {
        this.consumerKey = value;
    }

}
