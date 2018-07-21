package Programowanie.zaj3;

public class Person implements Comparable<Person> {
    private long id;
    private String email;

    public Person(long id, String email) {
        this.id = id;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //jeśli p1 < p2 to ma zwrócić wartość < 0
    //jeśli p1 == p2 to .....
    //jeśli p1 > p2 .....

    @Override
    public int compareTo(Person p2) {
        return (int)id - (int)p2.getId();
    }
}
