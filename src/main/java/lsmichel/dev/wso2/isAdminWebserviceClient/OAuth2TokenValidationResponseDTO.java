
package lsmichel.dev.wso2.isAdminWebserviceClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OAuth2TokenValidationResponseDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OAuth2TokenValidationResponseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizationContextToken" type="{http://dto.oauth2.identity.carbon.wso2.org/xsd}OAuth2TokenValidationResponseDTO_AuthorizationContextToken" minOccurs="0"/>
 *         &lt;element name="authorizedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAuth2TokenValidationResponseDTO", propOrder = {
    "authorizationContextToken",
    "authorizedUser",
    "errorMsg",
    "expiryTime",
    "scope",
    "valid"
})
public class OAuth2TokenValidationResponseDTO {

    @XmlElementRef(name = "authorizationContextToken", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OAuth2TokenValidationResponseDTOAuthorizationContextToken> authorizationContextToken;
    @XmlElementRef(name = "authorizedUser", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizedUser;
    @XmlElementRef(name = "errorMsg", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMsg;
    protected Long expiryTime;
    @XmlElement(nillable = true)
    protected List<String> scope;
    protected Boolean valid;

    /**
     * Obtient la valeur de la propriété authorizationContextToken.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTOAuthorizationContextToken }{@code >}
     *     
     */
    public JAXBElement<OAuth2TokenValidationResponseDTOAuthorizationContextToken> getAuthorizationContextToken() {
        return authorizationContextToken;
    }

    /**
     * Définit la valeur de la propriété authorizationContextToken.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTOAuthorizationContextToken }{@code >}
     *     
     */
    public void setAuthorizationContextToken(JAXBElement<OAuth2TokenValidationResponseDTOAuthorizationContextToken> value) {
        this.authorizationContextToken = value;
    }

    /**
     * Obtient la valeur de la propriété authorizedUser.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizedUser() {
        return authorizedUser;
    }

    /**
     * Définit la valeur de la propriété authorizedUser.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizedUser(JAXBElement<String> value) {
        this.authorizedUser = value;
    }

    /**
     * Obtient la valeur de la propriété errorMsg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * Définit la valeur de la propriété errorMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = value;
    }

    /**
     * Obtient la valeur de la propriété expiryTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpiryTime() {
        return expiryTime;
    }

    /**
     * Définit la valeur de la propriété expiryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpiryTime(Long value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<String>();
        }
        return this.scope;
    }

    /**
     * Obtient la valeur de la propriété valid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Définit la valeur de la propriété valid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

}
