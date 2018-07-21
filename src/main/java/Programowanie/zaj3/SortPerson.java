package Programowanie.zaj3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortPerson {
    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();
        persons.add(new Person(3L,"abd@super.pl"));
        persons.add(new Person(2L,"ww@super.pl"));
        persons.add(new Person(1L,"bueno@super.pl"));
        persons.add(new Person(9L,"aaaa@saaa.pl"));
        Collections.sort(persons);
        System.out.println(persons);
    }
}
