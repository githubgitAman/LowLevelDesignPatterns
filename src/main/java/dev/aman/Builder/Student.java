package dev.aman.Builder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String batch;

    //Using helper class to initialize
    //Making constructor private to use Helper class for object creation
    private Student(StudentHelper studentHelper) {
        this.firstName = studentHelper.getFirstName();
        this.lastName = studentHelper.getLastName();
        this.email = studentHelper.getEmail();
        this.batch = studentHelper.getBatch();
    }

    //Creating method to create helper object
    public static StudentHelper builder(){
        return new StudentHelper();
    }
    /*--------------------------------------------------------------------------------------------------------------- */
    //Making the class static
    public static class StudentHelper {
        private String firstName;
        private String lastName;
        private String email;
        private String batch;

        //Creating method to get Student object
        public Student build(){
            //Passing current StudentHelper object ot Student object
            return new Student(this);
        }

        public String getFirstName() {
            return firstName;
        }
        //Changing return type to StudentHelper to help with method channing
        public StudentHelper setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public StudentHelper setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentHelper setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentHelper setBatch(String batch) {
            this.batch = batch;
            return this;
        }
    }
}
