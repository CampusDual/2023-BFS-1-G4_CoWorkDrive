package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.ITripHistoricalService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/tripshistoricals")
public class TripHistoricalRestController extends ORestController<ITripHistoricalService> {
    @Autowired
    ITripHistoricalService tripHistoricalService;

    @Override
    public ITripHistoricalService getService() {
        return tripHistoricalService;
    }

}
