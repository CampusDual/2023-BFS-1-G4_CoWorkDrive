package com.campusdual.cd2023bfs1g4.ws.core.rest;

import com.campusdual.cd2023bfs1g4.api.core.service.IBookingService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/bookings")
public class BookingRestController extends ORestController<IBookingService> {
    @Autowired
    IBookingService bookingService;

    @Override
    public IBookingService getService() {
        return bookingService;
    }
}