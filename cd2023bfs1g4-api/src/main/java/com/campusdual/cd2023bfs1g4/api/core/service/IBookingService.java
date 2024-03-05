package com.campusdual.cd2023bfs1g4.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface IBookingService {
    EntityResult bookingQuery(Map<String, Object> keyMap, List<String> attrList);

    EntityResult myBookingsQuery(Map<String, Object> keyMap, List<String> attrList);


    EntityResult myBookingsDoneQuery(Map<String, Object> keyMap, List<String> attrList);

    EntityResult bookingInsert(Map<String, Object> attrMap);

    EntityResult bookingDelete(Map<String, Object> keyMap);

    EntityResult myBookingsDelete(Map<String, Object> keyMap);

    EntityResult getSeatsQuery(Map<String, Object> keyMap, List<String> attrList);
    
    EntityResult userIsInBookingQuery(Map<String, Object> keyMap, List<String> attrList);
}
