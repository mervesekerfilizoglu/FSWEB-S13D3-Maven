package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    String education;
    String status;
    int experiencesYears;
    public Person (String firstname, String lastname,int age ) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;


    }
    public Person (String firstname, String lastname, int age, String education, String status,int experiencesYears ) {
        this(firstname, lastname, age);
        this.education=education;
        this.status=status;
        this.experiencesYears=experiencesYears;

    }
    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public String getEducation(){
        return education;
    }
    public String getStatus() {
        return status;
    }
    public int getExperiencesYears() {
        return experiencesYears;
    }

    public boolean isTeen(){
        if(age<=19 && age>=13) {
            return true;
        }
        else {
            return false;
        }
    }
}
