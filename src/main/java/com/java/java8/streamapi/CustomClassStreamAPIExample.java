package com.java.java8.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomClassStreamAPIExample {
    public static void main(String[] args) {
          List<Person> personList=new ArrayList<>();
        personList.add(new Person("aaa", 19, "M", List.of(new Address("India", "Kar"), new Address("US", "CA")), "Asian"));
        personList.add(new Person("bbb", 21, "F", List.of(new Address("India", "KL"), new Address("US", "CH")), "American"));
        personList.add(new Person("ccc", 55, "M", List.of(new Address("India", "AP"), new Address("US", "Atlanta")), "African"));
        personList.add(new Person("eee", 44, "F", List.of(new Address("India", "UP"), new Address("US", "NYC")), "europe"));
        personList.add(new Person("fff", 33, "F", List.of(new Address("India", "DL"), new Address("US", "Fl")), "Latino"));
        personList.add(new Person("Ppp",38,"F",List.of(new Address("India","Andhra Pradesh"),new Address("USA","Marietta")),"Asian"));

        List<Integer> personAgeList=personList.stream().map(p->p.getAge()).collect(Collectors.toList());
        System.out.println(personAgeList);

        List<Integer> filteredAgeList=personList.stream().map(p->p.getAge()).filter(p->p>30).collect(Collectors.toList());
        System.out.println(filteredAgeList);

        Map<String, Long> genderCountMap = personList.stream().collect(Collectors.groupingBy(p -> p.getGender(), Collectors.counting()));
        System.out.println(genderCountMap);

        List<List<Address>> addressList = personList.stream().filter(p -> p.getName().equalsIgnoreCase("ppp"))
                .map(p -> p.getAddressLst())
                .collect(Collectors.toList());
        System.out.println(addressList);

        //Grouping by Age
        Map<String,Integer> ageGroup=new HashMap<>();
        personList.stream().forEach(person->{
            if(person.getAge()>30&&person.getAge()<60)
                ageGroup.put("Middle",ageGroup.getOrDefault("Middle",0)+1);
            else if(person.getAge()>60)
                ageGroup.put("Old",ageGroup.getOrDefault("Old",0)+1);
            else if(person.getAge()<30)
                ageGroup.put("Young",ageGroup.getOrDefault("Young",0)+1);
        });
        System.out.println(ageGroup);

    }
}
class Person
{
    private String name;
    private int age;
    private String gender;
    private List<Address> addressLst;
    private String race;

    public Person(String name, int age, String gender, List<Address> addressLst, String race) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addressLst = addressLst;
        this.race = race;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public List<Address> getAddressLst() {
        return addressLst;
    }
    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", addressLst=" + addressLst +
                ", race='" + race + '\'' +
                '}';
    }
}
class Address
{
    private String country;
    private String state;

    public Address(String country, String state) {
        this.country = country;
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}