package com.beginer.excaptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcDemo {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public  static  void  readFile() throws FileNotFoundException {
        File file = new File("text2");
        Scanner scanner = new Scanner(file);
    }

}
