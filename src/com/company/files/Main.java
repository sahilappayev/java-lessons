package com.company.files;

import com.company.files.io.FileWriteMethods;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // io - in-put/output
        // byte stream vs characters
        // InputStream - data daxil etmek uchundur
        // OutputStream - daxtani harasa yazmaq uchundur

//        System.out.println("Enter text: ");
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();


        byte[] bytes = FileWriteMethods.readFileAsBytes("C:\\Users\\AppayevS\\Desktop\\my-camunda-project.zip");

        FileWriteMethods.writeFileAsBytes("C:\\Users\\AppayevS\\Desktop\\new_project.zip", bytes, false);

    }

}
