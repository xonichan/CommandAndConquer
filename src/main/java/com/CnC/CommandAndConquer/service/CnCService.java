package com.CnC.CommandAndConquer.service;

import com.CnC.CommandAndConquer.entiry.CnCEntity;
import com.CnC.CommandAndConquer.repo.CncRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CnCService {

    @Autowired
    CncRepositiry CncRepositiry;
    public List<CnCEntity> findByNameCity(String cityName) {
        return CncRepositiry.findByName(cityName);
    }

    public void saveEntity(String cityName) {
        UUID uuid = UUID.randomUUID();
        var entity = new CnCEntity();
        entity.setId(uuid.toString());
        entity.setName(cityName);
        CncRepositiry.save(entity);
    }

    public List<CnCEntity> getById(String ID) {
        return CncRepositiry.findByName(ID);
    }

}