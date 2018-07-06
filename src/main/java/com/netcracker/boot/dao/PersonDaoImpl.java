package com.netcracker.boot.dao;

import com.netcracker.boot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PersonDaoImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String SELECT_PERSON_SQL = "select id, name from person where id=?";

    public Person findPersonById(int id) {
        return (Person) jdbcTemplate.queryForObject(SELECT_PERSON_SQL, new Object[]{id}, new RowMapper<Person>(){
            @Override
            public Person mapRow(ResultSet rs, int rwNumber) throws SQLException {
                Person cust = new Person();
                cust.setId(rs.getInt("id"));
                cust.setName(rs.getString("name"));
                return cust;
            }
        });
    }

}
