package lsmichel.dev.wso2.oAuth2Generique.rest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import okhttp3.Credentials;
import okhttp3.FormBody;
import okhttp3.FormBody.Builder;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import lsmichel.dev.wso2.oAuth2Generique.dto.GrantParameters;
import lsmichel.dev.wso2.oAuth2Generique.dto.GrantParameters.Parameters.Parameter;

@CrossOrigin({ "*" })
@RestController
@RequestMapping({ "/user" })
public class generateTokenController {
	@Value("${wso2IsApplicationKey}")
	private String wso2IsApplicationKey;

	@Value("${wso2IsApplicationSecreate}")
	private String wso2IsApplicationSecreate;

	@Value("${oauth2TokenUrl}")
	private String oauth2TokenUrl;
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	@PostMapping("/generateToken")
	public HashMap<String, Object> AuthenticateUser(@Valid @RequestBody GrantParameters grantParameters) {
		HashMap<String, Object> _res = new HashMap<String, Object>();
		_res.put("hasError", true);
		_res.put("errorMessage", "");
		_res.put("tokenRequestResponse", null);
		_res.put("roles", null);
		if(grantParameters==null || 
				                   grantParameters.getGrantTypeValue()==null
				                 ||grantParameters.getGrantTypeValue().isEmpty()) {
		  _res.put("errorMessage", "invalid request");
		}	
		OkHttpClient client = new OkHttpClient();
		Gson gson = new Gson();
		String credentials = Credentials.basic(wso2IsApplicationKey, wso2IsApplicationSecreate);
		FormBody formBody=null ;
		Builder formBodyBuilder = new FormBody.Builder().add("grant_type", grantParameters.getGrantTypeValue());
		for(Parameter param:grantParameters.getParameters().getParameter())	{
			formBodyBuilder.add(param.getName(), param.getValue());
		}
		formBody = formBodyBuilder.build();
		Request request1 = new Request.Builder().url(oauth2TokenUrl).addHeader("Authorization", credentials)
				.post(formBody).build();
		Response response = null;
		try {
			response = client.newCall(request1).execute();
		
		} catch (IOException e) {
		
			e.printStackTrace();
			_res.put("errorMessage", e.getMessage());
			return _res;
		}
		if (!response.isSuccessful()) {
			_res.put("errorMessage", "could not authenticate user");
		}
		try {

			Type type1 = new TypeToken<HashMap<String, String>>() {
			}.getType();
			HashMap<String, Object> _responseMap = gson.fromJson(response.body().string(), type1);
			if (_responseMap.keySet().contains("error")) {
				_res.put("errorMessage", "could not authenticate user");
				return _res;
			}
			_res.put("tokenRequestResponse", _responseMap);

		} catch (IOException e) {
			e.printStackTrace();
			_res.put("errorMessage", e.getMessage());

		}

		return _res;
	}
}
