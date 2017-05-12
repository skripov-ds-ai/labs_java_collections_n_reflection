package app.collections.humans;

import app.collections.humans.name.Name;

public class Human {
    private Name name;
    /*private String  firstName,
                    secondName,
                    lastName;*/
    //StringBuilder fullName;
    private int age;

    public Human(String firstName, String secondName, String lastName, int age) {
        name = new Name(firstName, secondName, lastName);
        //this.firstName = firstName;
        //this.secondName = secondName;
        //this.lastName = lastName;
        this.age = age;
        /*this.fullName = new StringBuilder(firstName +
                (secondName.equals(null) ? "" : secondName) + lastName);*/
    }

    public Human(String firstName, String lastName, int age) {
        name = new Name(firstName, lastName);
        //this.firstName = firstName;
        //this.lastName = lastName;
        this.age = age;
        /*this.fullName = new StringBuilder(firstName +
                (secondName.equals(null) ? "" : secondName) + lastName);*/
    }

    public String getFirstName() {
        return name.getFirstName();
    }

    public void setFirstName(String firstName) {
        name.setFirstName(firstName);
    }

    public String getSecondName() {
        return name.getSecondName();
    }

    public void setSecondName(String secondName) {
        name.setSecondName(secondName);
    }

    public String getLastName() {
        return name.getLastName();
    }

    public void setLastName(String lastName) {
        name.setLastName(lastName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public StringBuilder getFullName() {
        return fullName;
    }*/

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "name = " + name + "; age = " + age;
        /*return "Human{" +
                "name=" + name +
                ", age=" + age +
                '}';*/
    }
}