package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.INotificationService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/notifications")
public class NotificationRestController extends ORestController<INotificationService> {
    @Autowired
    INotificationService notificationService;
    @Override
    public INotificationService getService() {
        return notificationService;
    }
}
