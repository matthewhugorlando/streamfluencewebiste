package com.streamfluence.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by matthewhug on 4/11/17.
 */
@RestController
@RequestMapping(path = "/rest/streamer")
public class StreamerController {

    @RequestMapping(path = "/info", method = RequestMethod.GET)
    public Object findStreamer(){
        return new Object();
    }
}
