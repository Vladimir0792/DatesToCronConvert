package com.barkan.vladimir;

import com.digdes.school.DatesToCronConvertException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Scanner {

    public Scanner(File input) {

    }

    public static void main(String[] args) {
            RealiseConverterDates convert = new RealiseConverterDates();
            List<String> dates = new LinkedList<>();
            try {
                Scanner in = new Scanner(new File("input"));
                while (in.hasNext()) {
                    dates.add(in.nextLine().replaceAll("\"", ""));
                }
                convert.convert(dates);
            } catch (FileNotFoundException | DatesToCronConvertException e) {
                e.printStackTrace();
            }
        }

    private String nextLine() {
        return null;
    }

    private boolean hasNext() {
        return false;
    }
}

