package com.complexaesthetic.shfflshineservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.domain
 * author: https://github.com/vvmk
 * date: 4/10/18
 */

@Entity
public class Drill {

    @Id
    @GeneratedValue
    private Long drillId;

    private String title;
    private Double durationMillis;

    public Long getDrillId() {
        return drillId;
    }

    public void setDrillId(Long drillId) {
        this.drillId = drillId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDurationMillis() {
        return durationMillis;
    }

    public void setDurationMillis(Double durationMillis) {
        this.durationMillis = durationMillis;
    }
}
