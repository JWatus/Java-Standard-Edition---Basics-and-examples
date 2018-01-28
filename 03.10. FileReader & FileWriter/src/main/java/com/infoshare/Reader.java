package com.infoshare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws InterruptedException {

        String filePath = "F:\\java\\projects\\javase\\readerFileExample.tt";

        try {
            readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(500);
        System.out.println("INSTRUKCJA PO WYJĄTKU - PROGRAM NIE PRZERWANY");
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


