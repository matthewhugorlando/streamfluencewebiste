package com.streamfluence.controllers;

import com.streamfluence.api.TwitchHelper;
import com.streamfluence.data.SFStreamer;
import com.streamfluence.dto.TwitchStreamerDTO;
import com.streamfluence.repo.SFStreamerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by matthewhug on 4/11/17.
 */
@RestController
@RequestMapping(path = "/rest/streamer")
public class SFStreamerController {

    @Autowired
    SFStreamerRepo sfStreamerRepo;

    @RequestMapping(path = "/info", method = RequestMethod.GET)
    public SFStreamer findStreamer(@RequestParam String oat){
        TwitchHelper th = new TwitchHelper();
        TwitchStreamerDTO tsDTO = th.findTwitchStreamer(oat);
        SFStreamer sfs = new SFStreamer(tsDTO.get_id(), tsDTO.getBio(), tsDTO.getCreated_at(), tsDTO.getDisplay_name(), tsDTO.getEmail(), tsDTO.isEmail_verified(), tsDTO.getLogo(), tsDTO.getName(), tsDTO.getNotifications().isEmail(), tsDTO.getNotifications().isPush(), tsDTO.isPartnered(), tsDTO.isTwitter_connected(), tsDTO.getType(), tsDTO.getUpdated_at());
        return sfs;
    }
}
