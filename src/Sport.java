import java.util.Scanner;
import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.constraints.*;
public class Sport {

    String sport="";

    public String getSport() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter type of sport");
        this.sport = in.nextLine();

        return sport;
    }
}