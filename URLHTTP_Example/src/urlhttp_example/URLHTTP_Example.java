/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlhttp_example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Bryce Blauser
 */
public class URLHTTP_Example {

    private final String USER_AGENT = "Mozilla/5.0";
    
    public static void main(String[] args) throws Exception {
        
        URLHTTP_Example example = new URLHTTP_Example();
        URL exampleURL;
        String getURL = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";
        String postURL = "https://postman-echo.com/post/";
        
        System.out.println("\n-= Sending HTTP Get Request to " + getURL + " =-");
        exampleURL = new URL(getURL);
        example.httpGet(exampleURL);
        
        System.out.println("\n-= Sending HTTP Post Request to " + postURL + " =-");
        exampleURL = new URL(postURL);
        example.httpPost(exampleURL);
        
        // Send bad URL request and handle
        getURL = "https://postmanbad-echo.com/get?foo1=bar1&foo2=bar2";
        postURL = "https://postmanbad-echo.com/post/";
        
        System.out.println("\n-= Sending BAD HTTP Get Request to " + getURL + " =-");
        exampleURL = new URL(getURL);
        example.httpGet(exampleURL);
        
        System.out.println("\n-= Sending BAD HTTP Post Request to " + postURL + " =-");
        exampleURL = new URL(postURL);
        example.httpPost(exampleURL);
        
    }
    
    private void httpGet(URL url) throws Exception {
        
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        
        connect.setRequestProperty("User-Agent", USER_AGENT);
        
        System.out.println("Attempting GET request to: " + url.toString());
            
        try {
            int respCode = connect.getResponseCode();
            System.out.println("Response Code: " + respCode);
        } catch (Exception e) {
            System.out.println("Unable to connect to " + url.toString());
           // System.out.println("Response: " + response.toString());
            System.out.println("Exception: " + e.toString());
            return;
        }
        
        StringBuffer response = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println("Unable to connect to " + url.toString());
            System.out.println("Response: " + response.toString());
            System.out.println("Exception: " + e.toString());
        }
    }
    
    private void httpPost(URL url) throws Exception {
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        
        connect.setRequestMethod("POST");
        connect.setRequestProperty("USER_AGENT", USER_AGENT);
        connect.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        
        String parameters = "foo1=bar1&foo2=bar2";
        
        connect.setDoOutput(true);
        try (DataOutputStream wr = new DataOutputStream(connect.getOutputStream())) {
            wr.writeBytes(parameters);
            wr.flush();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }

        try {
            int respCode = connect.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Parameters: " + parameters);
            System.out.println("Response Code: " + respCode);
        } catch (Exception e) {
            System.out.println("Unable to connect to " + url.toString());
           // System.out.println("Response: " + response.toString());
            System.out.println("Exception: " + e.toString());
            return;
        }
        
        StringBuffer response = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println("Unable to connect to " + url.toString());
            System.out.println("Response: " + response.toString());
            System.out.println("Exception: " + e.toString());
        }

    }
    
}
