package com.luisburgos.studentsapp.domain;

import android.text.TextUtils;

/**
 * Created by luisburgos on 2/02/16.
 */
public class Student {

    private String id;
    private String name;
    private String bachelorsDegree;
    private String lastName;

    public Student() {
    }

    public Student(String id, String name, String bachelorsDegree) {
        this.id = id;
        this.name = name;
        this.bachelorsDegree = bachelorsDegree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBachelorsDegree() {
        return bachelorsDegree;
    }

    public void setBachelorsDegree(String bachelorsDegree) {
        this.bachelorsDegree = bachelorsDegree;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentID='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public boolean isEmpty() {
        boolean isEnrollmentIDEmpty = TextUtils.isEmpty(id);
        boolean isNameEmpty = TextUtils.isEmpty(name);
        boolean isLastNameEmpty = TextUtils.isEmpty(lastName);

        return (isEnrollmentIDEmpty) && (isNameEmpty) && (isLastNameEmpty);
    }
}