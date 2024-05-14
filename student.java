public class student {
    public String name;
    public String usn;
    public String sem;
    public String pgm;
    public String course[] ={"Machine learning","python","software","Java"};
    public float marks[] = {40,23,35,76};

    //constructor
    public student(String name,String usn, String sem, String pgm){
        this.name= name;
        this.usn= usn;
        this.sem= sem;
        this.pgm= pgm;
        this.course= course;
        this.marks = marks;
    }
     void get_name()
     {
        System.out.println("Student Name:" +name);
     }
    
     void get_usn()
     {
        System.out.println("Student Usn:" +usn);
     }

     void get_sem()
     {
        System.out.println("Student sem:" +sem);
     }

     void get_pgm()
     {
        System.out.println("Student Program:" +pgm);
     }

     void get_course()
     {
        System.out.println("Courses Registered");
        for(int i=0;i<course.length;i++)
        {
            System.out.println(course[i]);
        }
     }
    
     void get_marks()
     {
        //System.out.println("Subject having marks less than 40");
        for(int i=0;i<course.length;i++)
        {
            
            if(marks[i]<40){
               // System.out.println("Subject having marks less than 40");
            System.out.println(course[i]+ "" +marks[i]);
            }
        }
                   
     }
     public static void main(String[]args){
        student stud = new student("soumya","sou","fifth","BCA");
        stud.get_name();
        stud.get_usn();
        stud.get_sem();
        stud.get_pgm();
        stud.get_course();
        System.out.println("Subject having marks less than 40");
        stud.get_marks();
     }
}
