package com.poc.springboothello.springboothello.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
  
    @Column(name = "FIRST_NAME", nullable = false, length = 80)
    private String firstName;

    @Column(name = "SECOND_NAME", nullable = true, length = 80)
    private String secondName;

    @Column(name = "THIRD_NAME", nullable = true, length = 80)
    private String thirdName;

    @Column(name = "LAST_NAME_1", nullable = false, length = 80)
    private String lastName1;

    @Column(name = "LAST_NAME_2", nullable = true, length = 80)
    private String lastName2;

    @Column(name = "SALUTATION", nullable = true, length = 50)
    private String salutation;

    @Column(name = "BIRTH_DATE", nullable = true)
    private Date birthDate;

    @Column(name = "GENDER", nullable = true)
    private Integer gender;
  
    public Person(String firstName, String lastName1) {
        this.firstName = firstName;
        this.lastName1 = lastName1;
    }

    protected Person() {
        
    }
    //constructor, setters and getters omitted for brevity

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setFirstName(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}