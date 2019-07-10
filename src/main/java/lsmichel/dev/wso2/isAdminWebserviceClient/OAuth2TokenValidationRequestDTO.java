
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
 * <p>Classe Java pour OAuth2TokenValidationRequestDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OAuth2TokenValidationRequestDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessToken" type="{http://dto.oauth2.identity.carbon.wso2.org/xsd}OAuth2TokenValidationRequestDTO_OAuth2AccessToken" minOccurs="0"/>
 *         &lt;element name="context" type="{http://dto.oauth2.identity.carbon.wso2.org/xsd}OAuth2TokenValidationRequestDTO_TokenValidationContextParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requiredClaimURIs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAuth2TokenValidationRequestDTO", propOrder = {
    "accessToken",
    "context",
    "requiredClaimURIs"
})
public class OAuth2TokenValidationRequestDTO {

    @XmlElementRef(name = "accessToken", namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken> accessToken;
    @XmlElement(nillable = true)
    protected List<OAuth2TokenValidationRequestDTOTokenValidationContextParam> context;
    @XmlElement(nillable = true)
    protected List<String> requiredClaimURIs;

    /**
     * Obtient la valeur de la propriété accessToken.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTOOAuth2AccessToken }{@code >}
     *     
     */
    public JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken> getAccessToken() {
        return accessToken;
    }

    /**
     * Définit la valeur de la propriété accessToken.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTOOAuth2AccessToken }{@code >}
     *     
     */
    public void setAccessToken(JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken> value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the context property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OAuth2TokenValidationRequestDTOTokenValidationContextParam }
     * 
     * 
     */
    public List<OAuth2TokenValidationRequestDTOTokenValidationContextParam> getContext() {
        if (context == null) {
            context = new ArrayList<OAuth2TokenValidationRequestDTOTokenValidationContextParam>();
        }
        return this.context;
    }

    /**
     * Gets the value of the requiredClaimURIs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredClaimURIs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredClaimURIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequiredClaimURIs() {
        if (requiredClaimURIs == null) {
            requiredClaimURIs = new ArrayList<String>();
        }
        return this.requiredClaimURIs;
    }

}
