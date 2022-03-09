package com.teksystems;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File myObj = new File("members.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String line = myReader.nextLine();
                String[] arr = line.split("[*]+");
                System.out.println(Arrays.toString(arr));
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
