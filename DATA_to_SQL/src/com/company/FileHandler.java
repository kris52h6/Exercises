package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<String> loadData()  {
        ArrayList<String> tableNameList = new ArrayList<>();
        File file = new File("src/com/company/files/imdb-data.csv");


        try {
            Scanner sc = new Scanner(file);

            String[] listSplit = sc.next().split(";");
            for (String s : listSplit) {
                tableNameList.add(s);
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        return tableNameList;
    }

    public void writeToFile(ArrayList<String> columns) {
        File file = new File("ddl.txt");
        String myString = "CREATE TABLE imdb_data (" ;
        StringBuilder sb = new StringBuilder();

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, false));
            sb.append(myString).append("\n");
            for (int i = 0; i < columns.size(); i++) {
                if (i != columns.size() -1) {
                    sb.append(columns.get(i)).append(" ").append("varChar(255)").append(",").append("\n");
                } else {
                    sb.append(columns.get(i)).append(" ").append("varChar(255)").append("\n");
                }
            }

            sb.append(");");
            ps.println(sb);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public void insertIntoDML() {
        ArrayList<String> dataList = new ArrayList<>();
        File file = new File("src/com/company/files/imdb-data.csv");
        File dml = new File("dml.txt");
        String insertString = "INSERT INTO ";
        String tableName = "imdb_data";
        String nameOfColumns = "(Year, Length, Title, Subject, Popularity, Awards)";
        String valuesString = "\nVALUES (";
        String endBrackets = ");";

        try {
            Scanner sc = new Scanner(file);
            sc.nextLine();

            while (sc.hasNext()) {
               String[] listSplit = sc.nextLine().split(";");

               StringBuilder valueConcatenation = new StringBuilder();
               for (int i = 0; i < listSplit.length; i++) {
                   if (i != listSplit.length - 1) {
                        valueConcatenation.append(listSplit[i]);
                        valueConcatenation.append(", ");
                   } else {
                       valueConcatenation.append(listSplit[i]);
                   }
               }
               dataList.add(valueConcatenation.toString());

            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


        try {
            PrintStream ps = new PrintStream(new FileOutputStream(dml, false));
            for (String s : dataList) {
                ps.append(insertString);
                ps.append(tableName);
                ps.append(nameOfColumns);
                ps.append(valuesString).append(s);
                ps.append(endBrackets);
                ps.append("\n\n");
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

}
