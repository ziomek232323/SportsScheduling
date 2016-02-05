import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.constraints.*;
public class Constraints {

    public void readConstraints() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("./src/constraints.txt"));
        String line;
        int count = 0;
        List<String> temps = new ArrayList<String>();
        while ((line = br.readLine()) != null) {

            temps.add(line);


            count++;
        }
        br.close();


        for (int index = 0; index < count; index++) {
            System.out.println(temps.get(index));
        }


    }


}
