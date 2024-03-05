package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.IColorService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/colors")
public class ColorRestController extends ORestController<IColorService> {
    @Autowired
    IColorService colorService;
    @Override
    public IColorService getService() {
        return colorService;
    }
}
