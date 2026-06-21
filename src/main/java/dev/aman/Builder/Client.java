package dev.aman.Builder;

public class Client {
    public static void main(String[] args) {
        //Creating helper object first
        StudentHelper studentHelper = new StudentHelper();
        studentHelper.setFirstName("John");
        studentHelper.setLastName("Smith");
        studentHelper.setEmail("john.smith@gmail.com");
        studentHelper.setBatch("Academy August 2025");

        //Creating student object using helper
        Student student = new Student(studentHelper);

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getEmail());
        System.out.println(student.getBatch());
    }
}
