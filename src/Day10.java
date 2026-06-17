/*import java.util.ArrayList;

public class Day10 {
   /* static void main() {
        String[] Studentname = {"Aarav", "Bhavana", "Chaithra", "Prashik", "Vaishu"};
        System.out.println(Studentname.length);

        ArrayList<String> studentList = new ArrayList();
        studentList.add("Aarav");
        studentList.add("Bhavana");
        studentList.add("Chaithra");
        studentList.add("Prashik");
        studentList.add("Vaishu");
        for(String v:studentList) {
            System.out.println(v);
        }
        studentList.remove("Chaithra");
        System.out.println();
        for(String v:studentList) {

 */
            System.out.println(v);
        }
    }
}*/

import java.util.LinkedList;
public class Day10 {
    static void process(LinkedList<String> queue) {
        System.out.println("Removed:" + queue.removeFirst());
    }

    static void main() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("App");
        queue.add("Bat");
        queue.add("Cap");
        queue.add("Done");
        queue.add("Eat");
        queue.add("Flop");
        while (queue.size() > 1) {
            process(queue);
        }
    }
}



