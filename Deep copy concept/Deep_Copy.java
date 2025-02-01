class Course{

    private String name;
    private String code;



     Course(Course c){

      this.name = c.getName();
      this.code = c.getCode();

      }




    public void setName(String name){
         this.name = name;

    }

    public void setCode(String code){
         this.code = code;

    }

    public String getName(){
         return name;

    }

    public String getCode(){
         return code;

    }

    Course(){

        name = "No course is registered";
        code = "Null";
     }

     Course(String name, String code){
       
       this.name = name;
       this.code = code;

     }





}




class Student{

    private String studentName;
    private String section;

    private Course cc;




     Student(Student s){

      this.studentName = s.getStudent();
      this.section = s.getSection();

      //   this.cc = s.getCourse();   //shallow copy
  
        this.cc = new Course(s.getCourse());  // deep copy

      }



     Student(String studentName, String section, Course cc){

          this.studentName = studentName;
          this.section = section;
          this.cc = cc;
     }




    public void setStudent(String studentName){
         this.studentName = studentName;

    }

    public void setSection(String section){
         this.section = section;

    }

    public String getStudent(){
         return studentName;

    }

    public String getSection(){
         return section;

    }
    public void setCourse(Course cc){
        this.cc = cc;
    }

    public Course getCourse(){
        return cc;
    }


    Student(){

        studentName = "No name";
        section = "Null";
     }

     Student(String studentName, String section){
       
       this.studentName = studentName;
       this.section = section;

     }

     public void display(){

          System.out.println("Student Name: " + studentName);
          System.out.println("Section: " + section);
          System.out.println("Course Name: " + cc.getName());
          System.out.println("Course Code: " + cc.getCode());

     }



}



public class Deep_Copy{

      public static void main(String[]args){



          System.out.println("");
          System.out.println("Original Code");
          System.out.println("");

          Student s1 = new Student("Sami Ur Rehman", "SP24-BSE-B", new Course("OOP", "CSC241"));
          s1.display();


          System.out.println("");
          System.out.println("Copy Code");
          System.out.println("");


          Student s2 = new Student(s1); // copy

          s2.display();





          System.out.println("");
          System.out.println("Copy Code with changes");
          System.out.println("");


          s2.setSection("SP24-BSE-C");
          //s2.getSection();
	  s2.setStudent("Ahmad Ali");
          s2.getCourse().setName("Discrete Structure");
          s2.getCourse().setCode("CSC102");

          s2.display();


          System.out.println("_");
          System.out.println("Original Code after making changes in copy code");
          System.out.println("_");


          s1.display();




          System.out.println("_");
          System.out.println("Address of Outer Object, Student");
          System.out.println("_");

          System.out.println(s1);
          System.out.println(s2);

       

         // address of course will be diffrent because, it is a deep copy
         // address of outer object will be differen
	 // and address of inner object 'course' will be different too

          System.out.println("");
          System.out.println("Address of copy and original course object");
          System.out.println("");

          System.out.println(s2.getCourse());
          System.out.println(s1.getCourse());

          System.out.println("Address is different, because its a deep copy");



      }




}