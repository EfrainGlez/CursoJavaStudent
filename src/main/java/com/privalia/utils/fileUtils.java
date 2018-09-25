package com.privalia.utils;

import java.io.FileWriter;
import java.io.IOException;

public class fileUtils {

    static FileWriter openFile(String fileName) throws IOException {

        FileWriter fileWriter = new FileWriter(fileName, true);

        return fileWriter;
    }
}
