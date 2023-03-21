package com.ssafy.h_fileio.io.process.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProcessingTextReadTest {
    public static void main(String[] args) {
        File src = new File("01-javaLive\\.project");
        try (BufferedReader br = new BufferedReader(new FileReader(src));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
