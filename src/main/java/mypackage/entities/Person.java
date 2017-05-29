package mypackage.entities;

/**
 * Created by f on 28.05.17.
 */
public class Person {

    private long id;
    private String name;
    private short age;

    public Person() {
    }

    public Person(long id, String name, short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%d']", id, name, age);
    }
}
