import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new FileReader("input.txt"));
        int most = 0;
        int sum = 0;
        String line;
        ArrayList<Integer> collat = new ArrayList<>();
        while((line = scan.readLine()) != null){
            if(!line.equals("")) {
                int value = Integer.parseInt(line);
                sum = sum + value;
            }
            else{
                collat.add(sum);
                sum = 0;
            }
        }
        System.out.println(Collections.max(collat));

        System.out.println();
      
        System.out.println(Collections.max(collat));
        collat.remove(Collections.max(collat));
        System.out.println(Collections.max(collat));
        collat.remove(Collections.max(collat));
        System.out.println(Collections.max(collat));
        collat.remove(Collections.max(collat));
    }
}