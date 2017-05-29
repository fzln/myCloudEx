package mypackage.service;

import mypackage.entities.Person;

import java.util.List;

/**
 * Created by f on 28.05.17.
 */
public interface PersonService {
    public Person add(Person book);

    public void update(Person book);

    public void delete(Person book);
    //public void delete(long id);

    public void deleteAll();

    public Person findById(Long id);

    public Person findByName(String name);

    public List<Person> listAll();

    public long count();
}
