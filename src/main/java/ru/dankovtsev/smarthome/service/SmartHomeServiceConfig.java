package ru.dankovtsev.smarthome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import ru.dankovtsev.smarthome.model.*;
import ru.dankovtsev.smarthome.repository.*;

@Configuration
@EnableScheduling
public class SmartHomeServiceConfig {
    public static SmartHome smartHome;

    @Autowired
    private SmartHomeService smartHomeService;
    @Autowired
    private SmartHomeRepository smartHomeRepository;
    @Autowired
    private SmartHomeClimatControlRepository smartHomeClimatControlRepository;
    @Autowired
    private SmartHomeSecurityRepository smartHomeSecurityRepository;
    @Autowired
    private SmartHomeLightingRepository smartHomeLightingRepository;
    @Autowired
    private SmartHomeElevatorRepoitory smartHomeElevatorRepoitory;

    @Scheduled(fixedDelay = 10000)
    public void scheduleFixInformationBD() {
        try {
            smartHome = smartHomeService.onlineSystem();
            SmartHomeLighting smartHomeLighting = smartHome.getLighting();
            SmartHomeElevator smartHomeElevator = smartHome.getElevator();
            SmartHomeSecurity smartHomeSecurity = smartHome.getSecurity();
            SmartHomeClimatControl smartHomeClimatControl = smartHome.getClimateControl();
            if(smartHomeLighting!=null) smartHomeLightingRepository.save(smartHomeLighting);
            if(smartHomeElevator!=null) smartHomeElevatorRepoitory.save(smartHomeElevator);
            if(smartHomeClimatControl!=null) smartHomeClimatControlRepository.save(smartHomeClimatControl);
            if(smartHomeSecurity!=null) smartHomeSecurityRepository.save(smartHomeSecurity);
            if (smartHome!=null) smartHomeRepository.save(smartHome);
            System.out.println("Save");
        } catch (Exception e) {
            System.out.println("нет соединения с контроллерами");
        }
    }

    public SmartHome getSmartHome() {return smartHome;}
}
