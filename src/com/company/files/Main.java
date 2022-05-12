package com.company.files;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // io - in-put/output
        // byte stream vs characters
        // InputStream - data daxil etmek uchundur
        // OutputStream - daxtani harasa yazmaq uchundur

//        System.out.println("Enter text: ");
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();


//        byte[] bytes = FileReadMethods.readFileAsBytes("C:\\Users\\AppayevS\\Desktop\\my-camunda-project.zip");
//
//        FileWriteMethods.writeFileAsBytes("C:\\Users\\AppayevS\\Desktop\\new_project.zip", bytes, false);

//        String s = FileReadMethods.readFileAsString("C:\\Users\\AppayevS\\Desktop\\tasks.txt");
//        System.out.println(s);
//
//        FileWriteMethods.writeFileAsBytes("C:\\Users\\AppayevS\\Desktop\\tasks.less",s.getBytes(), false);

        // serialization -> object to bytes vs deserialization -> bytes to object
        User user = new User();
        user.setName("Sahil");
        user.setSurname("Appayev");
        user.setAge(26);
        user.setPassword("Pass12345");
        System.out.println(user.getName() + " " + user.getSurname() + " " + user.getAge() + " " + user.getPassword());


        byte [] bytes = null;

        // serialization
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(user);
            bytes = byteArrayOutputStream.toByteArray();
        }

        User user1 = null;

        // deserialization
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes)){
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            user1 = (User) objectInputStream.readObject();
        }

//        FileWriteMethods.writeFileAsBytes("C:\\Users\\AppayevS\\Desktop\\tasks.less", bytes, false);

//        FileWriteMethods.writeObject("C:\\Users\\AppayevS\\Desktop\\tasks.less", user);
//        User user1 = (User) FileReadMethods.readObject("C:\\Users\\AppayevS\\Desktop\\tasks.less");
//
        System.out.println(user1.getName() + " " + user1.getSurname() + " " + user1.getAge() + " " + user1.getPassword());

    }

}
