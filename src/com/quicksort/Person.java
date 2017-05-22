package com.quicksort;

/**
 * Created by RENT on 2017-05-22.
 */
public class Person implements Comparable<Person> {
    private int age;
    private String surname;
    private String name;

    public Person(int age, String surname, String name) {
        this.age = new age;
        this.surname = new surname;
        this.name = new name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSurname() {
        return this.surname;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Person SecondPerson) {
        if (this.getAge() > SecondPerson.getAge()) {
            return 1;
        } else if (this.getAge() < SecondPerson.getAge()) {
            return -1;
        } else {
            return this.getSurname().compareTo(SecondPerson.getSurname());
        }
    }
    /*public Person (int age, String surname){
        this.age = setAge();
        this.surname = setSurname();
    }

    private int setAge() {return age;
    }

    private String setSurname() {return surname;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

    public Person() {
    }*/


}
