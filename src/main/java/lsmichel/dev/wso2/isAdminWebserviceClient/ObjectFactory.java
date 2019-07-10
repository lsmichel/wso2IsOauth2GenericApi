
package lsmichel.dev.wso2.isAdminWebserviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sn.atos.projet.tigo.cms package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindOAuthConsumerIfTokenIsValidResponseReturn_QNAME = new QName("http://org.apache.axis2/xsd", "return");
    private final static QName _FindOAuthConsumerIfTokenIsValidValidationReqDTO_QNAME = new QName("http://org.apache.axis2/xsd", "validationReqDTO");
    private final static QName _BuildIntrospectionResponseValidationReq_QNAME = new QName("http://org.apache.axis2/xsd", "validationReq");
    private final static QName _OAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenType_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "tokenType");
    private final static QName _OAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenString_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "tokenString");
    private final static QName _OAuth2TokenValidationRequestDTOAccessToken_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "accessToken");
    private final static QName _OAuth2ClientApplicationDTOConsumerKey_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "consumerKey");
    private final static QName _OAuth2ClientApplicationDTOAccessTokenValidationResponse_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "accessTokenValidationResponse");
    private final static QName _OAuth2TokenValidationRequestDTOOAuth2AccessTokenIdentifier_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "identifier");
    private final static QName _OAuth2TokenValidationRequestDTOOAuth2AccessTokenIssuer_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "issuer");
    private final static QName _OAuth2TokenValidationRequestDTOTokenValidationContextParamValue_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "value");
    private final static QName _OAuth2TokenValidationRequestDTOTokenValidationContextParamKey_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "key");
    private final static QName _OAuth2IntrospectionResponseDTOScope_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "scope");
    private final static QName _OAuth2IntrospectionResponseDTOAud_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "aud");
    private final static QName _OAuth2IntrospectionResponseDTOSub_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "sub");
    private final static QName _OAuth2IntrospectionResponseDTOClientId_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "clientId");
    private final static QName _OAuth2IntrospectionResponseDTOError_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "error");
    private final static QName _OAuth2IntrospectionResponseDTOUserContext_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "userContext");
    private final static QName _OAuth2IntrospectionResponseDTOJti_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "jti");
    private final static QName _OAuth2IntrospectionResponseDTOUsername_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "username");
    private final static QName _OAuth2IntrospectionResponseDTOIss_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "iss");
    private final static QName _OAuth2TokenValidationResponseDTOAuthorizedUser_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "authorizedUser");
    private final static QName _OAuth2TokenValidationResponseDTOErrorMsg_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "errorMsg");
    private final static QName _OAuth2TokenValidationResponseDTOAuthorizationContextToken_QNAME = new QName("http://dto.oauth2.identity.carbon.wso2.org/xsd", "authorizationContextToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sn.atos.projet.tigo.cms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuildIntrospectionResponseResponse }
     * 
     */
    public BuildIntrospectionResponseResponse createBuildIntrospectionResponseResponse() {
        return new BuildIntrospectionResponseResponse();
    }

    /**
     * Create an instance of {@link OAuth2IntrospectionResponseDTO }
     * 
     */
    public OAuth2IntrospectionResponseDTO createOAuth2IntrospectionResponseDTO() {
        return new OAuth2IntrospectionResponseDTO();
    }

    /**
     * Create an instance of {@link ValidateResponse }
     * 
     */
    public ValidateResponse createValidateResponse() {
        return new ValidateResponse();
    }

    /**
     * Create an instance of {@link OAuth2TokenValidationResponseDTO }
     * 
     */
    public OAuth2TokenValidationResponseDTO createOAuth2TokenValidationResponseDTO() {
        return new OAuth2TokenValidationResponseDTO();
    }

    /**
     * Create an instance of {@link FindOAuthConsumerIfTokenIsValidResponse }
     * 
     */
    public FindOAuthConsumerIfTokenIsValidResponse createFindOAuthConsumerIfTokenIsValidResponse() {
        return new FindOAuthConsumerIfTokenIsValidResponse();
    }

    /**
     * Create an instance of {@link OAuth2ClientApplicationDTO }
     * 
     */
    public OAuth2ClientApplicationDTO createOAuth2ClientApplicationDTO() {
        return new OAuth2ClientApplicationDTO();
    }

    /**
     * Create an instance of {@link BuildIntrospectionResponse }
     * 
     */
    public BuildIntrospectionResponse createBuildIntrospectionResponse() {
        return new BuildIntrospectionResponse();
    }

    /**
     * Create an instance of {@link OAuth2TokenValidationRequestDTO }
     * 
     */
    public OAuth2TokenValidationRequestDTO createOAuth2TokenValidationRequestDTO() {
        return new OAuth2TokenValidationRequestDTO();
    }

    /**
     * Create an instance of {@link FindOAuthConsumerIfTokenIsValid }
     * 
     */
    public FindOAuthConsumerIfTokenIsValid createFindOAuthConsumerIfTokenIsValid() {
        return new FindOAuthConsumerIfTokenIsValid();
    }

    /**
     * Create an instance of {@link Validate }
     * 
     */
    public Validate createValidate() {
        return new Validate();
    }

    /**
     * Create an instance of {@link OAuth2TokenValidationRequestDTOOAuth2AccessToken }
     * 
     */
    public OAuth2TokenValidationRequestDTOOAuth2AccessToken createOAuth2TokenValidationRequestDTOOAuth2AccessToken() {
        return new OAuth2TokenValidationRequestDTOOAuth2AccessToken();
    }

    /**
     * Create an instance of {@link OAuth2TokenValidationResponseDTOAuthorizationContextToken }
     * 
     */
    public OAuth2TokenValidationResponseDTOAuthorizationContextToken createOAuth2TokenValidationResponseDTOAuthorizationContextToken() {
        return new OAuth2TokenValidationResponseDTOAuthorizationContextToken();
    }

    /**
     * Create an instance of {@link OAuth2TokenValidationRequestDTOTokenValidationContextParam }
     * 
     */
    public OAuth2TokenValidationRequestDTOTokenValidationContextParam createOAuth2TokenValidationRequestDTOTokenValidationContextParam() {
        return new OAuth2TokenValidationRequestDTOTokenValidationContextParam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2ClientApplicationDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = FindOAuthConsumerIfTokenIsValidResponse.class)
    public JAXBElement<OAuth2ClientApplicationDTO> createFindOAuthConsumerIfTokenIsValidResponseReturn(OAuth2ClientApplicationDTO value) {
        return new JAXBElement<OAuth2ClientApplicationDTO>(_FindOAuthConsumerIfTokenIsValidResponseReturn_QNAME, OAuth2ClientApplicationDTO.class, FindOAuthConsumerIfTokenIsValidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "validationReqDTO", scope = FindOAuthConsumerIfTokenIsValid.class)
    public JAXBElement<OAuth2TokenValidationRequestDTO> createFindOAuthConsumerIfTokenIsValidValidationReqDTO(OAuth2TokenValidationRequestDTO value) {
        return new JAXBElement<OAuth2TokenValidationRequestDTO>(_FindOAuthConsumerIfTokenIsValidValidationReqDTO_QNAME, OAuth2TokenValidationRequestDTO.class, FindOAuthConsumerIfTokenIsValid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "validationReq", scope = BuildIntrospectionResponse.class)
    public JAXBElement<OAuth2TokenValidationRequestDTO> createBuildIntrospectionResponseValidationReq(OAuth2TokenValidationRequestDTO value) {
        return new JAXBElement<OAuth2TokenValidationRequestDTO>(_BuildIntrospectionResponseValidationReq_QNAME, OAuth2TokenValidationRequestDTO.class, BuildIntrospectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = ValidateResponse.class)
    public JAXBElement<OAuth2TokenValidationResponseDTO> createValidateResponseReturn(OAuth2TokenValidationResponseDTO value) {
        return new JAXBElement<OAuth2TokenValidationResponseDTO>(_FindOAuthConsumerIfTokenIsValidResponseReturn_QNAME, OAuth2TokenValidationResponseDTO.class, ValidateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "validationReqDTO", scope = Validate.class)
    public JAXBElement<OAuth2TokenValidationRequestDTO> createValidateValidationReqDTO(OAuth2TokenValidationRequestDTO value) {
        return new JAXBElement<OAuth2TokenValidationRequestDTO>(_FindOAuthConsumerIfTokenIsValidValidationReqDTO_QNAME, OAuth2TokenValidationRequestDTO.class, Validate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "tokenType", scope = OAuth2TokenValidationResponseDTOAuthorizationContextToken.class)
    public JAXBElement<String> createOAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenType(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenType_QNAME, String.class, OAuth2TokenValidationResponseDTOAuthorizationContextToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "tokenString", scope = OAuth2TokenValidationResponseDTOAuthorizationContextToken.class)
    public JAXBElement<String> createOAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenString(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenString_QNAME, String.class, OAuth2TokenValidationResponseDTOAuthorizationContextToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationRequestDTOOAuth2AccessToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "accessToken", scope = OAuth2TokenValidationRequestDTO.class)
    public JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken> createOAuth2TokenValidationRequestDTOAccessToken(OAuth2TokenValidationRequestDTOOAuth2AccessToken value) {
        return new JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken>(_OAuth2TokenValidationRequestDTOAccessToken_QNAME, OAuth2TokenValidationRequestDTOOAuth2AccessToken.class, OAuth2TokenValidationRequestDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "consumerKey", scope = OAuth2ClientApplicationDTO.class)
    public JAXBElement<String> createOAuth2ClientApplicationDTOConsumerKey(String value) {
        return new JAXBElement<String>(_OAuth2ClientApplicationDTOConsumerKey_QNAME, String.class, OAuth2ClientApplicationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "accessTokenValidationResponse", scope = OAuth2ClientApplicationDTO.class)
    public JAXBElement<OAuth2TokenValidationResponseDTO> createOAuth2ClientApplicationDTOAccessTokenValidationResponse(OAuth2TokenValidationResponseDTO value) {
        return new JAXBElement<OAuth2TokenValidationResponseDTO>(_OAuth2ClientApplicationDTOAccessTokenValidationResponse_QNAME, OAuth2TokenValidationResponseDTO.class, OAuth2ClientApplicationDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "identifier", scope = OAuth2TokenValidationRequestDTOOAuth2AccessToken.class)
    public JAXBElement<String> createOAuth2TokenValidationRequestDTOOAuth2AccessTokenIdentifier(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationRequestDTOOAuth2AccessTokenIdentifier_QNAME, String.class, OAuth2TokenValidationRequestDTOOAuth2AccessToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "tokenType", scope = OAuth2TokenValidationRequestDTOOAuth2AccessToken.class)
    public JAXBElement<String> createOAuth2TokenValidationRequestDTOOAuth2AccessTokenTokenType(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenType_QNAME, String.class, OAuth2TokenValidationRequestDTOOAuth2AccessToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "issuer", scope = OAuth2TokenValidationRequestDTOOAuth2AccessToken.class)
    public JAXBElement<String> createOAuth2TokenValidationRequestDTOOAuth2AccessTokenIssuer(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationRequestDTOOAuth2AccessTokenIssuer_QNAME, String.class, OAuth2TokenValidationRequestDTOOAuth2AccessToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2IntrospectionResponseDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = BuildIntrospectionResponseResponse.class)
    public JAXBElement<OAuth2IntrospectionResponseDTO> createBuildIntrospectionResponseResponseReturn(OAuth2IntrospectionResponseDTO value) {
        return new JAXBElement<OAuth2IntrospectionResponseDTO>(_FindOAuthConsumerIfTokenIsValidResponseReturn_QNAME, OAuth2IntrospectionResponseDTO.class, BuildIntrospectionResponseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "value", scope = OAuth2TokenValidationRequestDTOTokenValidationContextParam.class)
    public JAXBElement<String> createOAuth2TokenValidationRequestDTOTokenValidationContextParamValue(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationRequestDTOTokenValidationContextParamValue_QNAME, String.class, OAuth2TokenValidationRequestDTOTokenValidationContextParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "key", scope = OAuth2TokenValidationRequestDTOTokenValidationContextParam.class)
    public JAXBElement<String> createOAuth2TokenValidationRequestDTOTokenValidationContextParamKey(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationRequestDTOTokenValidationContextParamKey_QNAME, String.class, OAuth2TokenValidationRequestDTOTokenValidationContextParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "scope", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOScope(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOScope_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "aud", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOAud(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOAud_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "sub", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOSub(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOSub_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "clientId", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOClientId(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOClientId_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "error", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOError(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOError_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "tokenType", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOTokenType(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationResponseDTOAuthorizationContextTokenTokenType_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "userContext", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOUserContext(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOUserContext_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "jti", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOJti(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOJti_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "username", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOUsername(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOUsername_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "iss", scope = OAuth2IntrospectionResponseDTO.class)
    public JAXBElement<String> createOAuth2IntrospectionResponseDTOIss(String value) {
        return new JAXBElement<String>(_OAuth2IntrospectionResponseDTOIss_QNAME, String.class, OAuth2IntrospectionResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "authorizedUser", scope = OAuth2TokenValidationResponseDTO.class)
    public JAXBElement<String> createOAuth2TokenValidationResponseDTOAuthorizedUser(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationResponseDTOAuthorizedUser_QNAME, String.class, OAuth2TokenValidationResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "errorMsg", scope = OAuth2TokenValidationResponseDTO.class)
    public JAXBElement<String> createOAuth2TokenValidationResponseDTOErrorMsg(String value) {
        return new JAXBElement<String>(_OAuth2TokenValidationResponseDTOErrorMsg_QNAME, String.class, OAuth2TokenValidationResponseDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OAuth2TokenValidationResponseDTOAuthorizationContextToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.oauth2.identity.carbon.wso2.org/xsd", name = "authorizationContextToken", scope = OAuth2TokenValidationResponseDTO.class)
    public JAXBElement<OAuth2TokenValidationResponseDTOAuthorizationContextToken> createOAuth2TokenValidationResponseDTOAuthorizationContextToken(OAuth2TokenValidationResponseDTOAuthorizationContextToken value) {
        return new JAXBElement<OAuth2TokenValidationResponseDTOAuthorizationContextToken>(_OAuth2TokenValidationResponseDTOAuthorizationContextToken_QNAME, OAuth2TokenValidationResponseDTOAuthorizationContextToken.class, OAuth2TokenValidationResponseDTO.class, value);
    }

}
