package com.company.files.nio;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // non-blocking in-put/output

        NioFilesMethods.moveFile( "C:\\Users\\AppayevS\\Desktop\\nio_copy.txt", "C:\\Users\\AppayevS\\Desktop\\Nio\\nio_copy.txt");

    }

}
