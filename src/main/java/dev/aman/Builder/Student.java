package dev.aman.Builder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String batch;

    //Using helper class to initialize
    public Student(StudentHelper studentHelper) {
        this.firstName = studentHelper.getFirstName();
        this.lastName = studentHelper.getLastName();
        this.email = studentHelper.getEmail();
        this.batch = studentHelper.getBatch();
    }

    //Creating method to create helper object
    public static StudentHelper builder(){
        return new StudentHelper();
    }
}
