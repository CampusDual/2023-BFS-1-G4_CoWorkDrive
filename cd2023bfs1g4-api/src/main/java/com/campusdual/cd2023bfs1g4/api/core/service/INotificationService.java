package com.campusdual.cd2023bfs1g4.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface INotificationService {

    EntityResult notificationQuery(Map<String, Object> keyMap, List<String> attrList);

    EntityResult notificationInsert(Map<String, Object> attrMap);

    EntityResult notificationDeleteInsert(Map<String, Object> attrMap);
}
