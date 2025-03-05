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
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person1.getLastName());

        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        Person person2 = new Person("Merve", "Seker", 29, "master degree", "software engineer", 0);

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Education: " + person2.getEducation());
        System.out.println("Status: " + person2.getStatus());
        System.out.println("Experiences Years: " + person2.getExperiencesYears());
        System.out.println("Is Teen: " + person2.isTeen());

    }
}
