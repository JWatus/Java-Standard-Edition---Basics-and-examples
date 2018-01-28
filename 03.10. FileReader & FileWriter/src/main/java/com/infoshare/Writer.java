package com.infoshare;

import java.io.*;

public class Writer {

    public static void main(String[] args) throws InterruptedException {

        String filePath = "T:\\iSA\\jjdd3-materialy-podstawy_JSE-master\\testJava.txt";

        try {
//            readFile(filePath);
            writeFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(500);
        System.out.println("INSTRUKCJA PO WYJĄTKU - PROGRAM NIE PRZERWANY");
    }

    private static void writeFile(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("a");
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void readFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String nextLine = bufferedReader.readLine();
        do {
            System.out.println(nextLine);
            nextLine = bufferedReader.readLine();
        } while (nextLine != null);

        bufferedReader.close();
    }

}
