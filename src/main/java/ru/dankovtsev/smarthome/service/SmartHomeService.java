package ru.dankovtsev.smarthome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dankovtsev.smarthome.client.SmartHomeClientForArduino;
import ru.dankovtsev.smarthome.model.*;
import ru.dankovtsev.smarthome.uuid.UUIDRandom;

import java.time.LocalDateTime;

@Service
public class SmartHomeService {

    @Autowired
    UUIDRandom uuidRandom;
    @Autowired
    SmartHomeClientForArduino smartHomeClientForArduino;

    public SmartHome onlineSystem(){
        SmartHome smartHome = new SmartHome();
        smartHome.setId(uuidRandom.randomkey());
        smartHome.setTime(LocalDateTime.now());
        SmartHomeClimatControl smartHomeClimatControl = smartHomeClientForArduino.onlineClimateControl();
        SmartHomeLighting smartHomeLighting = smartHomeClientForArduino.onlineLighting();
        SmartHomeElevator smartHomeElevator = smartHomeClientForArduino.onlineElevator();
        SmartHomeSecurity smartHomeSecurity = smartHomeClientForArduino.onlineSecurity();
        smartHome.setClimateControl(smartHomeClimatControl);
        smartHome.setElevator(smartHomeElevator);
        smartHome.setLighting(smartHomeLighting);
        smartHome.setSecurity(smartHomeSecurity);
        return smartHome;
    }
}
