public class Day8 {
    /*record ValueAddedCourse(String name,String dept){

    }
    static void main(){
        ValueAddedCourse v=new ValueAddedCourse("Java","I-CT");
        System.out.println(v.name());
        System.out.println(v.dept());
    }*/
    enum LANGUAGE {
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");
        String description;

        LANGUAGE(String description) {
            this.description = description;
        }
    }
         void main() {
            System.out.println(LANGUAGE.EN.description);
            System.out.println(LANGUAGE.GR.description);
            System.out.println(LANGUAGE.JP.description);
            System.out.println(LANGUAGE.TA.description);
        }
    }


