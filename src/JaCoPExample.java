import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.*;
import org.jacop.search.*;

public class JaCoPExample {

    public void jacopExample() {
        Store store = new Store(); // define FD store
        int size = 4;
// define finite domain variables
        IntVar[] v = new IntVar[size];
        for (int i = 0; i < size; i++)


            v[i] = new IntVar(store, "v" + i, 1, size);

// define constraints
            PrimitiveConstraint c = new XeqY(v[0], v[1]);
            c.impose(store);
            PrimitiveConstraint d = new XeqY(v[0], v[2]);
            d.impose(store);
            PrimitiveConstraint e = new XeqY(v[1], v[2]);
            e.impose(store);
            PrimitiveConstraint f = new XeqY(v[1], v[3]);
            f.impose(store);
            PrimitiveConstraint g = new XeqY(v[2], v[3]);
            g.impose(store);


// search for a solution and print results
            Search<IntVar> search = new DepthFirstSearch<IntVar>();
            SelectChoicePoint<IntVar> select =
                    new InputOrderSelect<IntVar>(store, v,
                            new IndomainMin<IntVar>());
            boolean result = search.labeling(store, select);

            if (result)
                System.out.println("Solution: " + v[0] + ", " + v[1] + ", " + v[2] + ", " + v[3]);


            else
                System.out.println("*** No");
        }
    }
