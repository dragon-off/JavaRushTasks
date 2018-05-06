package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    FileInputStream com;
    public TxtInputStream(String fileName) throws UnsupportedFileNameException,IOException{
        //if(FileInputStream.getFileExtension(fileName)!=".txt"){
        super(fileName);
        if (!fileName.endsWith(".txt"))
        {
            super.close();
            throw new UnsupportedFileNameException();

        }
        else
            this.com = new FileInputStream(fileName);
    }
    public static void main(String[] args) {
    }
}

