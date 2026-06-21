package dev.aman.Builder;

public class Client {
    public static void main(String[] args) {
        //Creating helper object first
        StudentHelper studentHelper = Student.builder();
        studentHelper.setFirstName("John");
        studentHelper.setLastName("Smith");
        studentHelper.setEmail("john.smith@gmail.com");
        studentHelper.setBatch("Academy August 2025");

        //Creating student object using helper
        Student studentObject = studentHelper.build();
        System.out.println(studentObject);
    }
}
