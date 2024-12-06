package nivel_1.ejercicio_3.modulo;

import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StartProgram {

    private static final String COUNTRIES_FILE_PATH = "src/nivel_1/ejercicio_3/recurso/countries.txt";
    private static final String SCOREBOARD_FILE_PATH = "src/nivel_1/ejercicio_3/recurso/scoreboard.txt";

    public static void startGame() {

        HashMap<String, String> countriesCapitals = new HashMap<String, String>();
        readCountriesCapitals(countriesCapitals);

        String player = startPlayer();

        int points = playGame(player, countriesCapitals);

        saveResultFile(player, points);

    }

    public static String startPlayer() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String player = sc.nextLine();

        return player;
    }

    public static int playGame(String playerName, HashMap<String, String> countriesCapitals) {

        Scanner sc = new Scanner(System.in);

        String[] keysCountry = countriesCapitals.keySet().toArray(new String[0]);
        Random randomNumber = new Random();
        int points = 0;

        System.out.println("Let’s start the challenge " + playerName + "!");

        for (int i = 1; i <= 10; i++) {

            int index = randomNumber.nextInt(keysCountry.length);
            String randomCountry = keysCountry[index];

            System.out.println("\nWhat is the capital of " + randomCountry + "?");
            String playerCapital = sc.nextLine();

            if (playerCapital.equalsIgnoreCase(countriesCapitals.get(randomCountry))) {
                System.out.println(playerCapital + " is the capital of " + randomCountry + ". Correct answer!");
                points++;
            } else {
                System.out.println(playerCapital + " is not the capital of " + randomCountry + ". Incorrect answer!");
            }
        }

        System.out.println("\nThe opportunities are over. Your score will be saved in the corresponding file.");

        return points;

    }

    public static void readCountriesCapitals(HashMap<String, String> countriesCapitals) {

        try (BufferedReader reading = new BufferedReader(new FileReader(COUNTRIES_FILE_PATH))) {

            String line;
            while ((line = reading.readLine()) != null) {

                String[] text = line.split(" ");

                if (text.length == 2) {
                    String country = text[0].replace("_", " ");
                    String capital = text[1].replace("_", " ");
                    countriesCapitals.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: reading file: " + e.getMessage());
        }
    }

    public static void saveResultFile(String playerName, int points) {

        String pointsString = Integer.toString(points);

        try (BufferedWriter writing = new BufferedWriter(new FileWriter(SCOREBOARD_FILE_PATH, true))) {

            writing.write("Name: " + playerName + " / Points: " + pointsString);
            writing.newLine();
            System.out.println("Score written to file!");

        } catch (IOException e) {
            System.out.println("Error: writing file: " + e.getMessage());
        }

    }

}
