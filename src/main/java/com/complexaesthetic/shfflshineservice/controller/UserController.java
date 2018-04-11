package com.complexaesthetic.shfflshineservice.controller;

import com.complexaesthetic.shfflshineservice.domain.Preference;
import com.complexaesthetic.shfflshineservice.domain.User;
import com.complexaesthetic.shfflshineservice.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * project: shffl-shine-service
 * package: com.complexaesthetic.shfflshineservice.controller
 * author: https://github.com/vvmk
 * date: 4/10/18
 */

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = GET)
    public ResponseEntity<Iterable<User>> getAllUsers() {
        return null;
    }

    @RequestMapping(value = "/users/{userId}", method = GET)
    public ResponseEntity<User> getUser(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/users/{userId}/preferences", method = GET)
    public ResponseEntity<Set<Preference>> getUserPreferences(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/users", method = POST)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return null;
    }

    @RequestMapping(value = "/users/{userId}/preferences", method = POST)
    public ResponseEntity<Preference> createPreference(@RequestBody Preference preference, @PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/users/{userId}", method = PUT)
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/users/{userId}/preferences", method = PUT)
    public ResponseEntity<Preference> updatePreference(@RequestBody Preference preference, @PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/users/{userId}", method = DELETE)
    public ResponseEntity deleteUserById(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/users/{userId}/preferences/{preferenceId}", method = DELETE)
    public ResponseEntity deleteUserPreferenceById(@PathVariable Long userId, @PathVariable Long preferenceId) {
        return null;
    }
}
