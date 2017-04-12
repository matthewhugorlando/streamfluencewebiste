package com.streamfluence.api;

import com.streamfluence.dto.TwitchStreamerDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by matthewhug on 4/11/17.
 */
public class TwitchHelper {

//    https://api.twitch.tv/kraken/oauth2/authorize?response_type=code&client_id=uo6dggojyb8d6soh92zknwmi5ej1q2&redirect_uri=http://localhost&scope=viewing_activity_read&state=c3ab8aa609ea11e793ae92361f002671

    public TwitchStreamerDTO findTwitchStreamer(String oAuthToken){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");
        headers.add("Client-ID","q1xf84du1sgbb7a5ryqn3un7epxzw5");
        headers.add("Authorization", "OAuth " + oAuthToken);

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://api.twitch.tv/kraken/user", HttpMethod.GET, entity, TwitchStreamerDTO.class);
        TwitchStreamerDTO tsDTO = (TwitchStreamerDTO) response.getBody();

        return tsDTO;
    }
}
