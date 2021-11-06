package com.app.runnable;

import com.app.utility.Util;

import java.io.BufferedReader;
import java.io.FileReader;

import static com.app.contants.Constants.filePath;

public class AppThread extends Thread {
    public String fileName;


    @Override
    public void run() {
        Util.readFile(fileName);

    }


}
