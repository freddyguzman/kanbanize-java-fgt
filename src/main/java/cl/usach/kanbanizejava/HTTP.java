/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author FGT
 */
public class HTTP {
    
    String url;
    String apikey;

    /**
     * Constructor de la clase
     */
    public HTTP() {
    }
    
    /**
     * Constructor de la clase
     * @param url URL de la conexión
     */
    public HTTP(String url){
        this.url = url;
    }

    public HTTP(String url, String apikey) {
        this.url = url;
        this.apikey = apikey;
    }    

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }   
    
    /**
     *
     * @return
     */
    public String getResult(){
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        String result;
        try{            
            httpPost.setHeader("apikey", this.apikey);
            HttpResponse response = httpClient.execute(httpPost);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            result = rd.readLine();
            System.out.println(result); 
        }catch(Exception e){
            return "Error: No se pudo conectar a URL";
        }
        return result;
    }
}
