package com.CnC.CommandAndConquer.entiry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CnCTable")
public class CnCEntity {

    private String id;

    private String name;

    @Id
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  setId(String id) {
        this.id = id;
    }
}
