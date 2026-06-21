package dev.aman.Builder;

public class Client {
    public static void main(String[] args) {
        //Creating helper object first
        Student studentObject = Student.builder()
                //This will have studentHelper object
                .setFirstName("John")
                //This will return studentHelper object with FirstName as assigned value
                .setLastName("Smith")
                .setEmail("JohnSmith@abc.com")
                .setBatch("Academy July 2024")
                .build();

        System.out.println(studentObject);

        /*
            1. Here we are forcing Student class to use helper to create its own object
            2. We also have abstraction i.e for User they are only creating Student object
         */
    }
}
