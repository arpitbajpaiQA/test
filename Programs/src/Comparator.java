
import java.util.*;

class Student implements Comparable{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        //super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getname() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int compareTo(Object o){
        Student s=(Student)o;
        if(cgpa==s.cgpa){
            if(name.equals(s.name)){
                return id-s.id;
            }else{
                return name.compareTo(s.name);
            }
        }else{
            if(s.cgpa-cgpa>0)
                return 1;
            else 
                return -1;
        }
    }

}

public class Comparator
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("enter total students");
      int testCases = in.nextInt();

      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
    	  System.out.println("enter id");
         int id = in.nextInt();
         System.out.println("enter name");
         String name = in.next();
         System.out.println("enter cgpa");
         double cgpa = in.nextDouble();

         Student st = new Student(id, name, cgpa);
         studentList.add(st);

         testCases--;
      }
      Collections.sort(studentList);
         for(Student st: studentList){
         System.out.println(st.getname());
      }
   }
}
