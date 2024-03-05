package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.ICarService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/cars")
public class CarRestController extends ORestController<ICarService> {
    @Autowired
    ICarService carService;

    @Override
    public ICarService getService() {
        return carService;
    }
}