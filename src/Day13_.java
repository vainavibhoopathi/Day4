import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class Day13_ {
    static void main() {
        Path path = Path.of("Files", "student.csv");
        try{
        List<String> student = Files.readAllLines(path);

        for (String v : student) {
            String[] row = v.split(",");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] +"|");
            }
            System.out.println();

        }
          /*  List<String> m = new ArrayList<>();
            m.add("Puppy1");
            m.add("Puppy2");
            m.add("Puppy3");


            m.add("Puppy4");
            m.add("Puppy5");

            Files.write(path, m);*/

        }
        catch(IOException io){
         io.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        }
}