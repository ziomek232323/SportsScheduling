import java.io.IOException;
import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.constraints.*;


public class main{
    public static void main (String [] args)throws IOException{

        AssignDate date1 = new AssignDate();
        Constraints const1 = new Constraints();
        GenerateFixtures user1 = new GenerateFixtures();
        JaCoPExampleWithTeams jacop = new JaCoPExampleWithTeams();

        user1.GenerateTable();
        const1.readConstraints();
        date1.getDay();
        date1.setDate();
        jacop.test();
    }
}

