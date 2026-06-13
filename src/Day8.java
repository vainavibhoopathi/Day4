public class Day8{
    record ValueAddedCourse(String name,String dept){

    }
    static void main(){
        ValueAddedCourse v=new ValueAddedCourse("Java","I-CT");
        System.out.println(v.name());
        System.out.println(v.dept());
    }
}