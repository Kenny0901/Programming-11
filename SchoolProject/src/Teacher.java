public class Teacher {
    private String fname;          //String first name
    private String lname;          //String last name
    private String subject;         //string subject

    Teacher(String fname,String lname,String subject){      //Input: first name, last name, subject
        this.fname = fname;                                 //object in this method
        this.lname = lname;
        this.subject = subject;

    }
    public String getFname() {                          //getters and setters
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
