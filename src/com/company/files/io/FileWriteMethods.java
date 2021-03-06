package com.company.files.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class FileWriteMethods {


    // bytes base
    public static void writeFileAsString(String fileName, String text, boolean append) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(fileName, append)) {
            if (append) {
                outputStream.write('\n');
            }
            for (char c : text.toCharArray()) {
                outputStream.write(c);
            }
        }
    }

    public static void writeFileAsBytes(String fileName, byte[] bytes, boolean append) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(fileName, append)) {
            if (append) {
                outputStream.write('\n');
            }
            outputStream.write(bytes);
        }
    }

    public static void writeObject(String fileName, Object object) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(object);
        }
    }

}
