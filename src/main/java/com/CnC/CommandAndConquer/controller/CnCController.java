package com.CnC.CommandAndConquer.controller;
import com.CnC.CommandAndConquer.entiry.CnCEntity;
import com.CnC.CommandAndConquer.service.CnCService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class CnCController {

    @Autowired
    CnCService cnCService;

    @RequestMapping(value="GetAllCitys", method = RequestMethod.GET)
    public List<CnCEntity> getItem(@RequestParam("cityName") String cityName){
        return cnCService.findByNameCity(cityName);
    }

    @GetMapping("/Save")
    public String seveName() {
        cnCService.saveEntity("Moscow");
        return "ok\n";
    }

    @RequestMapping(value="SaveCityName", method = RequestMethod.GET)
    public String setСityName(@RequestParam("cityName") String cityName){
        cnCService.saveEntity(cityName);
    return "Add city "+cityName;
    }
}
