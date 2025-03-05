package org.example;


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
