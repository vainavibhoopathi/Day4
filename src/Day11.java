import java.util.HashSet;
import java.util.Set;
public class Day11{
    static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Puppy1");
        set.add("Puppy2");
        set.add("Puppy3");
        set.add("Puppy1");
        set.add("Puppy4");
        System.out.println("Set:");
        for(String v:set){
            System.out.println(v);
        }
    }
}
