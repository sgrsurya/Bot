package Auto_World.Auto_Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Second_Test {
	
	public static void getPost() throws Throwable {
		
		URL url = new URL("https://reqres.in/api/users");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept","application/json");
		con.setDoOutput(true);
		
		String jsonInputString ="{\"name\": \"SGR\", \"job\": \"Programmer\"}";

		try(OutputStream os = con.getOutputStream()) {
		    byte[] input = jsonInputString.getBytes("utf-8");
		    os.write(input, 0, input.length);			
		}
		
		try(BufferedReader br = new BufferedReader(
				  new InputStreamReader(con.getInputStream(), "utf-8"))) {
				    StringBuilder response = new StringBuilder();
				    String responseLine = null;
				    while ((responseLine = br.readLine()) != null) {
				        response.append(responseLine.trim());
				    }
				    System.out.println(response.toString());
		
		
	}
	

}

	public static void main(String[] args) throws Throwable {
		getPost();
	}
	
	
}
