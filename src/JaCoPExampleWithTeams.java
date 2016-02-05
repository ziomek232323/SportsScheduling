import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.*;
import org.jacop.search.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JaCoPExampleWithTeams {

    public void test() throws IOException {
/*
        Store store = new Store();


        BufferedReader br = new BufferedReader(new FileReader("./src/testing.txt"));
        String line;
        int count = 0;
        List<String> temps = new ArrayList<String>();
        while ((line = br.readLine()) != null) {

            temps.add(line);


            count++;
        }
        br.close();


        IntVar[] v = new IntVar[count];
        for (int i = 0; i < count; i++) {
            v[i] = new IntVar(store, "v" + i, 1, count);

            System.out.println(v[i]);
        }

        store.impose( new (v[2],v[4]));








        Search<IntVar> search = new DepthFirstSearch<IntVar>();
        SelectChoicePoint<IntVar> select =
                new InputOrderSelect<IntVar>(store, v,
                        new IndomainMin<IntVar>());
        boolean result = search.labeling(store, select);

        if (result)
            System.out.println("Solution: " + v[0] + ", " + v[1] + ", " + v[2] + ", " + v[3]);


        else
            System.out.println("*** No");

*/
    }

}