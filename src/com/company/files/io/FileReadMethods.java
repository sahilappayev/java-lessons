package com.company.files.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class FileReadMethods {

    public static byte[] readFileAsBytes(String fileName) throws IOException {
        try (InputStream inputStream = new FileInputStream(fileName)) {
            return inputStream.readAllBytes();
        }
    }

    public static String readFileAsString(String fileName) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready())
                result.append(reader.readLine()).append("\n");
        }
        return result.toString();
    }

    public static Object readObject(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return inputStream.readObject();
        }
    }

}
