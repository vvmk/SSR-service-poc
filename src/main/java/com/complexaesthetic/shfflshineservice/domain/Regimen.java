package com.complexaesthetic.shfflshineservice.domain;

import javax.persistence.*;
import java.util.List;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.domain
 * author: https://github.com/vvmk
 * date: 4/10/18
 */

@Entity
public class Regimen {

    @Id
    @GeneratedValue
    private Long regimenId;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "regimen_id")
    private List<Drill> drills;

    public Long getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(Long regimenId) {
        this.regimenId = regimenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drill> getDrills() {
        return drills;
    }

    public void setDrills(List<Drill> drills) {
        this.drills = drills;
    }
}
