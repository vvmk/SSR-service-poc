package com.complexaesthetic.shfflshineservice.domain;

import javax.persistence.*;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.domain
 * author: https://github.com/vvmk
 * date: 4/10/18
 */

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Iterable<Regimen> regimens;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Iterable<Regimen> getRegimens() {
        return regimens;
    }

    public void setRegimens(Iterable<Regimen> regimens) {
        this.regimens = regimens;
    }
}
