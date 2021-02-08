package com.beginer.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text2");
        PrintWriter pw = new PrintWriter(file);

        List<Object> list = new ArrayList<>();

        for(int i = 0 ; i<10; i++) {
            if( i == 5) {
                list.add("five");
                continue;
            }

            if (i == 8) {
                list.add('g');
                continue;
            }
            list.add(i);
        }

        for(Object integer: list){
            pw.println(integer);
        }
        pw.close();
    }
}
