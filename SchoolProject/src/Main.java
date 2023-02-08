import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School();                                              //Calling the School class
        Student s1 = new Student("James", "Taylor", 8);         //Assign names and grade of students to Student class
        school.addStudent(s1);                                                    //Calling School class addStudent method to add students into arraylist "students"
        Student s2 = new Student("Daniel", "Chan", 11);
        school.addStudent(s2);
        Student s3 = new Student("Thomas", "Harris", 10);
        school.addStudent(s3);
        Student s4 = new Student("David", "Scott", 12);
        school.addStudent(s4);
        Student s5 = new Student("Frank", "Wong", 9);
        school.addStudent(s5);
        Student s6 = new Student("Jack", "Allen", 8);
        school.addStudent(s6);
        Student s7 = new Student("Jacob", "Moore", 10);
        school.addStudent(s7);
        Student s8 = new Student("Mary", "Lee", 9);
        school.addStudent(s8);
        Student s9 = new Student("Samuel", "Wilson", 12);
        school.addStudent(s9);
        Student s10 = new Student("Alex", "Adams", 11);
        school.addStudent(s10);

        Teacher t1 = new Teacher("John", "Williams", "Math");      //Assign names and grade of teachers to Teacher class
        school.addTeacher(t1);                                                        // Calling School class addTeacher method to add teachers into arraylist "teachers"
        Teacher t2 = new Teacher("Michael", "Wang", "English");
        school.addTeacher(t2);
        Teacher t3 = new Teacher("Joseph", "Brown", "Chemistry");
        school.addTeacher(t3);

        System.out.println("\nTeachers: ");
        school.showTeachers();                          // Run showTeachers in School class
        System.out.println("\nStudents: ");
        school.showStudents();                          // Run showStudents in School class

        school.deleteTeacher(t1);                       //remove teacher t1
        school.deleteStudent(s5);                       //remove student s5
        school.deleteStudent(s8);                       //remove student s8

        System.out.println("\nTeachers: ");
        school.showTeachers();
        System.out.println("\nStudents: ");
        school.showStudents();




    }

}
