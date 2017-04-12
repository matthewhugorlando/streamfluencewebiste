package com.streamfluence.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by matthewhug on 4/11/17.
 */
public class TwitchHelper {

//    https://api.twitch.tv/kraken/oauth2/authorize?response_type=code&client_id=uo6dggojyb8d6soh92zknwmi5ej1q2&redirect_uri=http://localhost&scope=viewing_activity_read&state=c3ab8aa609ea11e793ae92361f002671

    public Object zipCode(String zip){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://maps.googleapis.com/maps/api/geocode/json?address="+zip+"&key=AIzaSyDFznK9qI_tvZFddLIRmVj-P5ryrer05Mc", HttpMethod.GET, entity, Object.class);
        Object o = (Object) response.getBody();

        return o;
    }
}
