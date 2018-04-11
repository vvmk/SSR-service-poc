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
}
