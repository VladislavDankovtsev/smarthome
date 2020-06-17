package ru.dankovtsev.smarthome.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.dankovtsev.smarthome.model.SmartHomeClimateControl;
import ru.dankovtsev.smarthome.model.SmartHomeElevator;
import ru.dankovtsev.smarthome.model.SmartHomeLighting;
import ru.dankovtsev.smarthome.model.SmartHomeSecurity;
import ru.dankovtsev.smarthome.uuid.UUIDRandom;

import java.time.LocalDateTime;

import static ru.dankovtsev.smarthome.other.UrlSmartCityModule.*;

@Service
public class SmartHomeClientForArduino {
    @Autowired
    private UUIDRandom uuidRandom;

    public SmartHomeClimateControl onlineClimateControl(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SmartHomeClimateControl> responseEntity = restTemplate.getForEntity(URL_CLIMAT_CONTROL_ONLINE,
                SmartHomeClimateControl.class);
        responseEntity.getBody().setId(uuidRandom.randomkey());
        responseEntity.getBody().setTime(LocalDateTime.now());
        return responseEntity.getBody();
    }

    public SmartHomeLighting onlineLighting(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SmartHomeLighting> responseEntity = restTemplate.getForEntity(URL_LIGHTING_ONLINE,
                SmartHomeLighting.class);
        responseEntity.getBody().setId(uuidRandom.randomkey());
        responseEntity.getBody().setTime(LocalDateTime.now());
        return responseEntity.getBody();
    }

    public SmartHomeElevator onlineElevator(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SmartHomeElevator> responseEntity = restTemplate.getForEntity(URL_ELEVATOR_ONLINE,
                SmartHomeElevator.class);
        responseEntity.getBody().setId(uuidRandom.randomkey());
        responseEntity.getBody().setTime(LocalDateTime.now());
        return responseEntity.getBody();
    }

    public SmartHomeSecurity onlineSecurity(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SmartHomeSecurity> responseEntity = restTemplate.getForEntity(URL_SECURITY_ONLINE,
                SmartHomeSecurity.class);
        responseEntity.getBody().setId(uuidRandom.randomkey());
        responseEntity.getBody().setTime(LocalDateTime.now());
        return responseEntity.getBody();
    }

}
