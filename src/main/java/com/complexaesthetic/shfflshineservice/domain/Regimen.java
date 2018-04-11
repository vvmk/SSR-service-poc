package com.complexaesthetic.shfflshineservice.domain;

import javax.persistence.*;

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

    @OneToMany
    @JoinColumn(name = "regimen_id")
    private Iterable<Drill> drills;

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

    public Iterable<Drill> getDrills() {
        return drills;
    }

    public void setDrills(Iterable<Drill> drills) {
        this.drills = drills;
    }
}
