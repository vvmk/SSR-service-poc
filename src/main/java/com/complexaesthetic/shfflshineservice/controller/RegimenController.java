package com.complexaesthetic.shfflshineservice.controller;

import com.complexaesthetic.shfflshineservice.domain.Regimen;
import com.complexaesthetic.shfflshineservice.service.interfaces.RegimenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.controller
 * author: https://github.com/vvmk
 * date: 4/10/18
 */

@RestController
public class RegimenController {

    private RegimenService regimenService;

    @Autowired
    public RegimenController(RegimenService regimenService) {
        this.regimenService = regimenService;
    }

    @RequestMapping(value = "/users/{userId}/regimens", method = GET)
    public ResponseEntity<Iterable<Regimen>> getRegimensByUserId(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/regimens/{regimenId}", method = GET)
    public ResponseEntity<Regimen> getRegimenById(@PathVariable Long regimenId) {
        return null;
    }

    @RequestMapping(value = "users/{userId}/regimens", method = POST)
    public ResponseEntity<Regimen> createRegimen(@RequestBody Regimen regimen) {
        return null;
    }

    @RequestMapping(value = "/regimens/{regimenId}", method = PUT)
    public ResponseEntity<Regimen> updateRegimen(@RequestBody Regimen regimen, @PathVariable Long regimenId) {
        return null;
    }

    @RequestMapping(value = "/regimens/{regimenId}", method = DELETE)
    public ResponseEntity deleteRegimenById(@PathVariable Long regimenId) {
        return null;
    }
}
