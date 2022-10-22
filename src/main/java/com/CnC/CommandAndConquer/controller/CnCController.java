package com.CnC.CommandAndConquer.controller;
import com.CnC.CommandAndConquer.entiry.CnCEntity;
import com.CnC.CommandAndConquer.service.CnCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CnCController {

    @Autowired
    CnCService cnCService;


    @GetMapping("/Name")
    public List<CnCEntity> getName() {
        return cnCService.getValueFromTable();
    }

    @GetMapping("/Save")
    public String seveName() {
        cnCService.saveEntity("Moscow");
        return "ok\n";
    }

    @GetMapping("/Test")
    public String testName() {
        return "Test complete\n";
    }
}
