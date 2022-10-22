package com.CnC.CommandAndConquer.repo;

import com.CnC.CommandAndConquer.entiry.CnCEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CncRepositiry extends CrudRepository<CnCEntity, String> {

    public  List<CnCEntity> findByName(String name);

//    public  List<CnCEntity> findById(String id);

}
