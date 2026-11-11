package com.devconnect.DevConnectB.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
//It tells that this class is a controller class
@RestController
public class HealthController {

    //URL GET /health
    @GetMapping("/health")
    public String getHealth(){
        return "SpringBoot Application running HEALTHY";
    }

    //URL /api/v1/status
    @GetMapping("/api/v1/status")
    public Map<String,Object> getStatus(){
        Map<String,Object>map = new HashMap<>();
        map.put("status","OK");
        map.put("service","devconnectB");
        map.put("version","1.0.0");
        map.put("timestamp", LocalDateTime.now().toString());

        return map;
    }

    //JACKSON -> converts JAVA Objects to HTTP request compatible formats


}
