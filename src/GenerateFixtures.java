
import java.io.*;
import java.util.*;
import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.constraints.*;
public class GenerateFixtures {


    public static  void GenerateTable() throws IOException {






        int numberOfTeams, totalNumberOfRounds, numberOfMatchesPerRound;
        int homeTeamNumber, awayTeamNumber, even, odd, roundNumber, matchNumber;


        String[][] fixtures;
        String[][] revisedFixtures;
        String[] elementsOfFixture;
        String fixtureAsText;



        //Checking how many teams are in the file.
        PrintWriter out = (new PrintWriter(new BufferedWriter(new FileWriter("./src/table.txt"))));

        BufferedReader br = new BufferedReader(new FileReader("./src/testing.txt"));
        String line;
        int count = 0;
        List<String> temps = new ArrayList<String>();
        while ((line = br.readLine()) != null) {

            temps.add(line);


            count++;
        }
        br.close();
        //System.out.println("Number of Teams: " + count);






        for (int index = 0; index < count; index++) {
            System.out.println(temps.get(index));
        }



        //Algorithm to get fixtures
        numberOfTeams = count;
        totalNumberOfRounds = numberOfTeams - 1;
        numberOfMatchesPerRound = numberOfTeams / 2;


        fixtures = new String[totalNumberOfRounds][numberOfMatchesPerRound];

        for (roundNumber = 0; roundNumber < totalNumberOfRounds; roundNumber++) {
            for (matchNumber = 0; matchNumber < numberOfMatchesPerRound; matchNumber++) {

                homeTeamNumber = (roundNumber + matchNumber) % (numberOfTeams - 1);
                awayTeamNumber = (numberOfTeams - 1 - matchNumber + roundNumber) % (numberOfTeams - 1);
                if (matchNumber == 0)
                    awayTeamNumber = numberOfTeams - 1;

                fixtures[roundNumber][matchNumber] = (homeTeamNumber + 1) + " v " + (awayTeamNumber + 1);


                //names from file instead of numbers

                for (int index = 0; index < count; index++) {
                    //System.out.println(temps.get(index));


                    fixtures[roundNumber][matchNumber] = (temps.get(homeTeamNumber)) + " v " + (temps.get(awayTeamNumber)+ ";");

                }


            }
        }

        revisedFixtures = new String[totalNumberOfRounds][numberOfMatchesPerRound];
        even = 0;
        odd = numberOfTeams / 2;
        for (int i = 0; i < fixtures.length; i++) {
            if (i % 2 == 0)
                revisedFixtures[i] = fixtures[even++];
            else
                revisedFixtures[i] = fixtures[odd++];
        }
        fixtures = revisedFixtures;

        for (roundNumber = 0; roundNumber < fixtures.length; roundNumber++) {
            if (roundNumber % 2 == 1) {
                fixtureAsText = fixtures[roundNumber][0];
                elementsOfFixture = fixtureAsText.split(" v ");
                fixtures[roundNumber][0] = elementsOfFixture[1] + " v " + elementsOfFixture[0];
            }
        }

        for (roundNumber = 0; roundNumber < totalNumberOfRounds; roundNumber++) {

           // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./src/main/java/table.txt", true)));


            out.println("Round " + (roundNumber + 1) + "\t\t");
            System.out.println("Round " + (roundNumber + 1) + "\t\t");
            for (matchNumber = 0; matchNumber < numberOfMatchesPerRound; matchNumber++) {

                out.println("\tMatch " + (matchNumber + 1) + ": "
                        + fixtures[roundNumber][matchNumber] + "\t");
                System.out.println("\tMatch " + (matchNumber + 1) + ": "
                        + fixtures[roundNumber][matchNumber] + "\t");
                System.out.println();
                out.println();

            }

        }
        out.close();
    }
}



