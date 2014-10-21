package com.charlires.symptoms.model;

import org.springframework.data.annotation.Id;

/**
 * Created by carlos_andonaegui on 10/20/14.
 */
public class Doctor {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
