
package lsmichel.dev.wso2.isAdminWebserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OAuth2TokenValidationResponseDTO_AuthorizationContextToken complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OAuth2TokenValidationResponseDTO_AuthorizationContextToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAuth2TokenValidationResponseDTO_AuthorizationContextToken", propOrder = {
    "tokenString",
    "tokenType"
})
public class OAuth2TokenValidationResponseDTOAuthorizationContextToken {

    @XmlElementRef(name = "tokenString", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenString;
    @XmlElementRef(name = "tokenType", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenType;

    /**
     * Obtient la valeur de la propriété tokenString.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenString() {
        return tokenString;
    }

    /**
     * Définit la valeur de la propriété tokenString.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenString(JAXBElement<String> value) {
        this.tokenString = value;
    }

    /**
     * Obtient la valeur de la propriété tokenType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenType() {
        return tokenType;
    }

    /**
     * Définit la valeur de la propriété tokenType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenType(JAXBElement<String> value) {
        this.tokenType = value;
    }

}
