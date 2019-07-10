package lsmichel.dev.wso2.oAuth2Generique.rest;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import okhttp3.Credentials;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


@CrossOrigin({"*"})
@RestController
@RequestMapping("/user")
public class RefreshTokenResource {
	@Value("${wso2IsApplicationKey}")
	private String wso2IsApplicationKey;
	
	@Value("${wso2IsApplicationSecreate}")
	private String wso2IsApplicationSecreate;
	
	@Value("${oauth2TokenUrl}")
	private String oauth2TokenUrl;
	
	public static final MediaType JSON  = MediaType.parse("application/json; charset=utf-8");
	@PostMapping("token/refreshToken/{token}")
	public HashMap<String , Object> RefreshToken(@PathVariable("token") String token ){
		HashMap<String , Object> _res = new HashMap<String , Object> ();
		_res.put("hasError", true);
		_res.put("errorMessage", "");
		OkHttpClient client = new OkHttpClient(); 
		Gson gson = new Gson();
		String credentials = Credentials.basic(wso2IsApplicationKey, wso2IsApplicationSecreate);
		FormBody formBody = new FormBody.Builder()
				                             .add("grant_type", "refresh_token")
				                             .add("refresh_token", token)
				                             .build(); 
		      Request request = new Request
		    		                     .Builder()
		    		                     .url(oauth2TokenUrl)
		    		                     .addHeader("Authorization", credentials)
		    		                     .post(formBody)
		    		                     .build(); 
		    Response response = null;
			try {
				response = client.newCall(request).execute();
			} catch (IOException e) {
				e.printStackTrace();
				_res.put("errorMessage", e.getMessage());
			}
		    if (!response.isSuccessful()){
					_res.put("errorMessage", "could not refresh the token");
				} 
		    try {
				
				Type type = new TypeToken<HashMap<String, String>>(){}.getType();
				HashMap<String, Object> _responseMap = gson.fromJson(response.body().string(), type);
				_res.put("RefreshToken", _responseMap);
				_res.put("hasError", false);
				
			} catch (IOException e) {
				System.out.println("ici l'erreur err3");
				e.printStackTrace();
				_res.put("errorMessage", e.getMessage());
			
			} 
	
		 return _res;
	}
}
