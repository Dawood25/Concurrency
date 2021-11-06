package com.app.main;

import com.app.runnable.AppThread;
import com.app.utility.Util;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainMethod {
    public static void main(String[] args) {

        System.out.println("This is the main Thread " + Thread.currentThread().getName());
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            Util.readFile("sample.txt");
        });


    }
}
