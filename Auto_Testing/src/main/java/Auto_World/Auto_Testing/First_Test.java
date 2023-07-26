package Auto_World.Auto_Testing;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class First_Test {
	
	
	
	public static void getRequest() throws Throwable {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);
		
		
		
		String responseMessage = connection.getResponseMessage();
		System.out.println(responseMessage);
		

		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader buffReader = new BufferedReader(inputstreamreader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		While((line = buffReader.readLine()) !=null);{
			buffer.append(line);
		}
		
		System.out.println(line);
		
		
				
		
	}

	public static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String [] args) throws Throwable {
		getRequest();
	}
	
}
