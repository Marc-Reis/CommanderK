import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by MarcR on 02.11.2016.
 */
public class CommanderK {

    private static String version = "0.1";
    private static String welcomeText = "Welcome to Commander K!";

    private ArrayList<GameObjects> alleObjecte;



    public static void main(String[] args) {

        System.out.println(welcomeText + " " + version);

        CommanderK myGame = new CommanderK();

    }

    public CommanderK() {

        Scanner myScanner = new Scanner(System.in);
        boolean noNumber = true;
        int numberOfObject = 0;

        while (noNumber) {
            System.out.println("How Many Objects should we generate?");
            try {

                numberOfObject = myScanner.nextInt();
                noNumber = false;

            } catch (Exception e) {
                System.out.println("How about you try a real number, ey?");
            }
        }

        createAliensAndRocks(numberOfObject);

        System.out.println("Get Ready, press A do Catch an Alien and R do dodge a Rock");

        int hitCount=0;
        for (GameObjects go : alleObjecte) {
            String str="";

            System.out.println(go);
            // String x= "" + myScanner.next();
            int x = 2; // abfrage alle 2 Sekunden (2 * 1000 miliSek)

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            long startTime = System.currentTimeMillis();
            try {
                while ((System.currentTimeMillis() - startTime) < x * 1000
                        && !in.ready()) {
                }

                if (in.ready()) {
                    str = in.readLine();
                } else {
                    System.out.println("to late!");
                }
            } catch (Exception e) {
            }


            if ((go instanceof Aliens && str.contains("a"))
                    || (go instanceof Rocks && str.contains("r"))) {
                hitCount++;
            }

        }

        System.out.println(" You got " + hitCount + " of " + alleObjecte.size());


    }

    private void createAliensAndRocks(int number) {
        alleObjecte = new ArrayList<GameObjects>();

        for (int i = 0; i < number; i++) {
            int min = 0;
            int max = 1;

            // ThreadLocalRandom.current().nextInt(min, max + 1);

            if (Math.random() > 0.5) {
                alleObjecte.add(new Rocks("Basalt", 10, 10, 5, 5));
            } else {
                alleObjecte.add(new Aliens("MugMack der " + i + "te", 100, 5, 5, 3, 3));
            }

        }
    }


}
