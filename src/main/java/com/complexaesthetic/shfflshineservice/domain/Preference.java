package com.complexaesthetic.shfflshineservice.domain;

import javax.persistence.Entity;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.domain
 * author: https://github.com/vvmk
 * date: 4/10/18
 */

@Entity
public class Preference<T> {
    private String name;
    private T data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
