import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();            //Create arraylist for teachers

    ArrayList<Student> students = new ArrayList<>();            //create arraylist for students

    public void addTeacher(Teacher teacher) {                   //add a teacher's name and subject from Teacher class
        teachers.add(teacher);
    }

    public void addStudent(Student student){                    //add a student's name, grade and student number from Student class
        students.add(student);
    }

    public void deleteTeacher(Teacher teacher){                 //remove a teacher from Teacher class
        teachers.remove(teacher);
    }

    public void deleteStudent(Student student){                 //remove a student from Student class
        students.remove(student);
    }

    public void showTeachers(){
        for (Teacher teacher : teachers){                       // for # of teachers in arraylist:
            System.out.println("Name: " + teacher.getFname() + " " + teacher.getLname()+ " Subject: " + teacher.getSubject());      //print information of teachers in format
        }
    }

    public void showStudents(){
        for(Student student : students){                        // for # of students in arraylist:
            System.out.println("Name: "+student.getFname() + " " + student.getLname()+ " Grade: " + student.getGrade() + " StudentNumber:  " + student.getId());    //print information of students in format
        }
    }


}
