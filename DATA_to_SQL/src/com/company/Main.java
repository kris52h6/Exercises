package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        fh.loadData();
        ArrayList<String> data = fh.loadData();
        fh.writeToFile(data);
        fh.insertIntoDML();
    }
}
