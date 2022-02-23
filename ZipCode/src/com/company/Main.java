package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> cityHashMap = new HashMap();
	    File citiesData = new File("src/com/company/data/danske-postnumre-byer-ny.csv");

        try {
            Scanner sc = new Scanner(citiesData);
            sc.nextLine();

            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] lineSplit = line.split(";");
                if (!sc.nextLine().equals(";")) {
                    int zipCode = Integer.parseInt(lineSplit[0]);
                    String cityName = lineSplit[1];

                    cityHashMap.put(zipCode, cityName);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.print("Input zipcode: ");

        Scanner userInput = new Scanner((System.in));
        int cityUserInput = userInput.nextInt();
        System.out.println(cityHashMap.get(cityUserInput));

    }
}
