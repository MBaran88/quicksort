package com.quicksort;

/**
 * Created by RENT on 2017-05-22.
 */
public class Person {
    public Person (int age, String surname){
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
    }




}

}