package com.company.files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioFilesMethods {

    public static void createDir(String direction) throws IOException {
        Path path = Paths.get(direction);
        Files.createDirectories(path);
    }

    public static void createFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.createFile(path);
    }

    public static void writeString(String fileName, String content) throws IOException {
        Path path = Paths.get(fileName);
        Files.writeString(path, content);
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, bytes, StandardOpenOption.APPEND);
    }

    public static void copyFile(String source, String destination) throws IOException {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);
        Files.copy(sourcePath, destPath);
    }

    public static void moveFile(String source, String destination) throws IOException {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);
        Files.move(sourcePath, destPath);
    }

    public static String readFileAsString(String source) throws IOException {
        Path sourcePath = Paths.get(source);
        return Files.readString(sourcePath);
    }

    public static byte[] readFileAsBytes(String source) throws IOException {
        Path sourcePath = Paths.get(source);
        return Files.readAllBytes(sourcePath);
    }

}
