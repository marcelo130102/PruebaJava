package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Http {
    private HttpClient httpClient;
    private HttpGet get;
    private HttpResponse response;
    private String resource;
    private Logger logger = Logger.getLogger(Http.class.getName());
    
    public Http(){
        this.httpClient = HttpClients.createDefault();
        this.get = null;
        this.resource = null;
    }

    public String get(String url){
        this.get = new HttpGet(url);
        try {
            this.response = this.httpClient.execute(this.get);
            this.resource = EntityUtils.toString(this.response.getEntity());
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        return this.resource;
    }
}
