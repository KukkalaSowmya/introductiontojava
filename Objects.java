public class Objects{
  public static void main(String args[]){
    int marks = 76;
    Student student1 = new student();
    //creating an object of the class by using new operator
    System.out.println("Marks of student: "+student1.marks);
    //Accessing the property "marks" of the class the help of an object.
    student1.setName("Ram");
    //Accessing the property "name" of the class with the help of an object
    System.out.println("Name of student: "+student1.getname);
      
  }
}