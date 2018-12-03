package CollegeAPI.CollegeAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );

		String urlstring = "https://api.data.gov/ed/collegescorecard/v1/schools.json?school.degrees_awarded.predominant=1,2,3&_fields=id,school.name,latest.admissions.sat_scores.25th_percentile.critical_reading,latest.admissions.sat_scores.75th_percentile.critical_reading&_zip=11790&_distance=20mi&api_key=71T6y50gHU9RdxbXzBOzcRX93kSMYZqr1p6gV6De";

		URL url;
		try {
			//Create URL from the URL string passed.
			url = new URL(urlstring);
			//Start a HTTPS connection from the URL
			HttpsURLConnection https = (HttpsURLConnection) url.openConnection();

			// Retrieves the response code from the HTTPS Connection. 200 is safe.
			int response = https.getResponseCode();

			// A response code of 200 is valid.
			if(response != 200) {
				throw new RuntimeException("HttpResponseCode: " + response);
			}

			
			BufferedReader br = new BufferedReader(new InputStreamReader(https.getInputStream()));

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jp = new JsonParser();
			JsonElement je = jp.parse(br);
			String prettyprint = gson.toJson(je);

			System.out.println(prettyprint);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
