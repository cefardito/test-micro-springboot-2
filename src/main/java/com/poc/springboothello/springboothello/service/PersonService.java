package com.poc.springboothello.springboothello.service;

import java.util.List;

import com.poc.springboothello.springboothello.dao.PersonDao;
import com.poc.springboothello.springboothello.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class PersonService {
     @Autowired
     PersonDao personDao;
 
     public List<Person> getAllPersons() {
         return this.personDao.findAll();
     }
 
     public Person addPerson(Person person) {
         return this.personDao.save(person);
     }
    
 }