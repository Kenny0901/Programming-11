public class Student {
    private String fname;                 //String first name
    private String lname;                 //String last name
    private int grade;                    //Integer grade
    static int sn = 1;                    //Unique number (cannot be repeated)
    private int id;                       //individual Student number



    Student(String fname, String lname, int grade){         //Input: first name, last name, grade
        this.fname = fname;                //object in this method
        this.lname = lname;
        this.grade = grade;
        this.id=sn;
        sn++;
    }

    public String getFname() {                      //getters and setters
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
