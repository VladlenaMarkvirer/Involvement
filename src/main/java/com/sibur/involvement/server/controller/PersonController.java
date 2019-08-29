package com.sibur.involvement.server.controller;

import com.sibur.involvement.server.entity.Person;
import com.sibur.involvement.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Возврат простой строки, а не объекта
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getPerson() {
        return "Test getPerson()";
    }
}*/

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getAllPersons() {
        return personService.getAll();
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person getPerson(@PathVariable("id") long personID) {
        return personService.getByID(personID);
    }

    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    @ResponseBody
    public Person savePerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePerson(@PathVariable("id") long personID) {
        personService.remove(personID);
    }

    /*private Person createMockPerson() {
        Person person = new Person();
        person.setId(1);
        person.setName("test");
        person.setSurname("test");
        person.setEmail("test@sibur.ru");
        person.setPassword("test");
        return person;
    }*/

}