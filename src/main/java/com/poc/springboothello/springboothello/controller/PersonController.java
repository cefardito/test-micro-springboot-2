package com.poc.springboothello.springboothello.controller;

import java.util.List;

import com.poc.springboothello.springboothello.entity.Person;
import com.poc.springboothello.springboothello.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
/*import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;*/

@RestController
 @RequestMapping("/person")
 public class PersonController {
     @Autowired
     PersonService personService;
 
     @RequestMapping(value = "/all", method = RequestMethod.GET)
     public List<Person> getAllPersons() {
         return personService.getAllPersons();
     }
 
     @RequestMapping(value = "/addperson", method = RequestMethod.POST,
             consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public Person addNewPerson(@RequestBody Person person) {
         return this.personService.addPerson(person);
     }

     /*@RequestMapping(value = "/addperson", method = RequestMethod.POST,
             consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public Person addNewPerson(@RequestBody String stringToParse) {
        JSONParser parser = new JSONParser();
        JSONObject json = null;
        try {
            json = (JSONObject) parser.parse(stringToParse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

         return this.personService.addPerson( (person) json);
     }*/
 
 }