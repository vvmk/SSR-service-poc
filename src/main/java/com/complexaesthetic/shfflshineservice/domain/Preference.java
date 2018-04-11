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
public class Preference {

    @Id
    @GeneratedValue
    private Long preferenceId;

    private String name;
    private String data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
