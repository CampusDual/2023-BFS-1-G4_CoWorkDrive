package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.ITripService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/trips")
public class TripRestController extends ORestController<ITripService> {
    @Autowired
    ITripService tripService;

    @Override
    public ITripService getService() {
        return tripService;
    }

}
