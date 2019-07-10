package lsmichel.dev.wso2.oAuth2Generique.rest;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lsmichel.dev.wso2.isAdminWebserviceClient.OAuth2TokenValidationRequestDTO;
import lsmichel.dev.wso2.isAdminWebserviceClient.OAuth2TokenValidationRequestDTOOAuth2AccessToken;
import lsmichel.dev.wso2.isAdminWebserviceClient.OAuth2TokenValidationResponseDTO;
import lsmichel.dev.wso2.isAdminWebserviceClient.OAuth2TokenValidationService;
import lsmichel.dev.wso2.isAdminWebserviceClient.OAuth2TokenValidationServicePortType;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/user")
public class ValidateTokenResource {
	@PostMapping("token/validate/{token}")
	public OAuth2TokenValidationResponseDTO IsValidToken(@PathVariable("token") String token ) {
		   
		TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }
    };

    // Install the all-trusting trust manager
    SSLContext sc = null;
	try {
		sc = SSLContext.getInstance("TLS");
	} catch (NoSuchAlgorithmException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    try {
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
	} catch (KeyManagementException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    
    HostnameVerifier allHostsValid = new HostnameVerifier() {
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    };

    // Install the all-trusting host verifier
    HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		    OAuth2TokenValidationRequestDTOOAuth2AccessToken
	        accessToken = new OAuth2TokenValidationRequestDTOOAuth2AccessToken();
	        accessToken.setTokenType(new JAXBElement<String>(new QName("tokenType"), String.class, "bearer"));
	        accessToken.setIdentifier(new JAXBElement<String>(new QName("identifier"), String.class, token));
	        JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken> accessTokenjax = new JAXBElement<OAuth2TokenValidationRequestDTOOAuth2AccessToken>(new QName("accessToken") , OAuth2TokenValidationRequestDTOOAuth2AccessToken.class , accessToken);
	        OAuth2TokenValidationRequestDTO autelement = new OAuth2TokenValidationRequestDTO();
	        autelement.setAccessToken(accessTokenjax);
	        OAuth2TokenValidationService service = new OAuth2TokenValidationService();
	        OAuth2TokenValidationServicePortType servicePort = service.getOAuth2TokenValidationServiceHttpsSoap11Endpoint();
	        Map<String, Object> reqContext = ((BindingProvider) servicePort).getRequestContext();
	        reqContext.put(BindingProvider.USERNAME_PROPERTY, "admin");
	        reqContext.put(BindingProvider.PASSWORD_PROPERTY, "admin");
	        OAuth2TokenValidationResponseDTO rest = servicePort.validate(autelement);
	        return rest;
	}
}
