package com.CnC.CommandAndConquer.service;

import com.CnC.CommandAndConquer.entiry.CnCEntity;
import com.CnC.CommandAndConquer.repo.CncRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CnCService {

    @Autowired
    CncRepositiry CncRepositiry;
    public List<CnCEntity> getValueFromTable() {
        return CncRepositiry.findByName("Moscow");
    }

    public void saveEntity() {
        var entity = new CnCEntity();
        entity.setId(1L);
        entity.setName("Moscow");

        CncRepositiry.save(entity);
    }
}
