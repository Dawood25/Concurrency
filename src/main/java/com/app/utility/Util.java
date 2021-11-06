package com.app.utility;

import java.io.BufferedReader;
import java.io.FileReader;

import static com.app.contants.Constants.filePath;

public class Util {
    public static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {
            String line = "";
            while ((line = br.readLine()) != null) {

                System.out.println(Thread.currentThread().getName() + " this thread is reading line " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
