package ru.dankovtsev.smarthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.dankovtsev.smarthome.model.SmartHome;
import ru.dankovtsev.smarthome.service.SmartHomeService;
import ru.dankovtsev.smarthome.service.SmartHomeServiceConfig;

@RestController
@RequestMapping("/smarthome")
public class SmartHomeController {

    @Autowired
    private SmartHomeServiceConfig smartHomeServiceConfig;

    @RequestMapping(path = "/online", method = RequestMethod.GET)
    public SmartHome getSmartHome(){
        return smartHomeServiceConfig.getSmartHome();
    }
}