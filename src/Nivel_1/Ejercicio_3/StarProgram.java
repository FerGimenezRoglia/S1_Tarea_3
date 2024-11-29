package Nivel_1.Ejercicio_3;

import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StarProgram {

    public static void star() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> countriesCapitals = new HashMap<String, String>();
        readCountriesCapitals(countriesCapitals);

        System.out.println("Enter your name: ");
        String userName = sc.nextLine();

        String[] keysCountry = countriesCapitals.keySet().toArray(new String[0]);
        Random randomNamber = new Random();
        int points = 0;

        System.out.println("Let’s start the challenge " + userName + "!");

        for (int i = 0; i <= 9; i++) {

            int index = randomNamber.nextInt(keysCountry.length);
            String randomCountry = keysCountry[index];

            System.out.println("\nWhat is the capital of " + randomCountry + "?");
            String userCapital = sc.nextLine();

            if (userCapital.equalsIgnoreCase(countriesCapitals.get(randomCountry))) {
                System.out.println(userCapital + " is the capital of " + randomCountry + ". Correct answer!");
                points++;
            } else {
                System.out.println(userCapital + " is not the capital of " + randomCountry + ". Incorrect answer!");
            }
        }

        System.out.println("The opportunities are over. Your score will be saved in the corresponding file.");

        saveResultFile(userName, points);

    }

    public static void readCountriesCapitals(HashMap<String, String> countriesCapitals) {

        try (BufferedReader reading = new BufferedReader(new FileReader("src/Nivel_1/Ejercicio_3/countries.txt"))) {

            String line;
            while ((line = reading.readLine()) != null) {

                String[] text = line.split(" ");

                if (text.length == 2) {
                    String country = text[0];
                    String capital = text[1];
                    countriesCapitals.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: reading file: " + e.getMessage());
        }
    }

    public static void saveResultFile(String userName, int points) {

        String pointsString = Integer.toString(points);

        try (BufferedWriter writing = new BufferedWriter(new FileWriter("src/Nivel_1/Ejercicio_3/user_result.txt"))) {

            writing.write("Name: " + userName + " / Points: " + pointsString);
            writing.newLine();

        } catch (IOException E) {

        }

    }
}
