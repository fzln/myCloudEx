package mypackage.service.impl;

import mypackage.service.PersonService;
import mypackage.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by f on 28.05.17.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PersonServiceImpl() {
    }

    @Override
    public Person add(Person person) {
        return null;
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    @Transactional(readOnly = true)
    public Person findById(Long id) {

        log.info("Querying for person records where id = " + id);
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT id, name, age FROM persons WHERE id = ?",
                    new Object[]{id},
                    (rs, rowNum) -> new Person(rs.getLong("id"), rs.getString("name"), rs.getShort("age")));
        } catch (Exception e) {
            log.error("Error querying for person records where id = " + id);
            return null;
        }
    }

    @Override
    public Person findByName(String name) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> listAll() {
        log.info("Querying for persons");

        try {
            return jdbcTemplate.query(
                    "SELECT id, name, age FROM persons",
                    (rs, rowNum) -> new Person(rs.getLong("id"), rs.getString("name"), rs.getShort("age")));
        } catch (Exception e) {
            log.error("Error querying for persons");
            return null;
        }
    }

    @Override
    public long count() {
        return 0;
    }
}
