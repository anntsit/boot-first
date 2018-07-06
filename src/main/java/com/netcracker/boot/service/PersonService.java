package com.netcracker.boot.service;

import com.netcracker.boot.dao.PersonDaoImpl;
import com.netcracker.boot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonDaoImpl personDao;

    public int findPersonById(Integer id) {
        Person person = personDao.findPersonById(id);
        return person.getId();
    }
}
