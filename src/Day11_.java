import java.util.HashMap;
import java.util.Map;
public class Day11_{
    static void main(){
        Map <String,Integer> m = new HashMap<>();
        m.put("Ram",89);
        m.put("John",86);
        m.put("Aruna",86);
        m.put("Pravinza",98);
        m.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}