package com.beginer.excaptions.exception2;

import java.io.IOException;
import java.util.Scanner;

public class Exc2Demo {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {

                throw new ScannerException("ввели не правельно");
            }
        }

    }
}

class ScannerException extends Exception {
    public ScannerException(String description) {
        super(description);
    }
}
