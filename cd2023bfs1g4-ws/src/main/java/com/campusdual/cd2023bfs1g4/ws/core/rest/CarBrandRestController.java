package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.ICarBrandService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/carbrands")
public class CarBrandRestController extends ORestController<ICarBrandService> {
    @Autowired
    ICarBrandService carBrandService;

    @Override
    public ICarBrandService getService() {
        return carBrandService;
    }
}
