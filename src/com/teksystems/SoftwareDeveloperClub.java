package com.teksystems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {
    public SoftwareDeveloperClub() {
        readFile();
    }

    ArrayList<ClubMember> members = new ArrayList<>();
    public void readFile(){
        File myObj = new File("members.txt");
        try(Scanner myReader = new Scanner(myObj);){
            String dudLine = myReader.nextLine();
            while(myReader.hasNextLine()){
                String line = myReader.nextLine();
                String[] arr = line.split("[*]+");
                members.add(new ClubMember(arr[0], (arr[1] + ", " + arr[2]), arr[3]));
            }
        } catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public void displayMembers(){
        members.forEach(m -> {
            System.out.printf("Member Name: %s\n Location: %s\n Favorite Language: %s\n", m.getName(), m.getLocation(), m.getFavoriteLanguage());
        });
    }

    public void removeMember(Scanner input){
        System.out.println("Which member would you like to remove? Enter number:");
        for(int i = 0; i < members.size(); i++){
            System.out.printf("%d. %s\n", i+1, members.get(i).getName());
        }
        members.remove(input.nextInt() - 1);
    }

    public void addMember(Scanner input){
        System.out.println("What is the member's name?");
        input.nextLine();
        String newName = input.nextLine();

        System.out.println("What is the member's location? City, State");
        String newLocation = input.nextLine();


        System.out.println("What is the member's favorite programming language?");
        String newLanguage = input.nextLine();

        members.add(new ClubMember(newName, newLocation, newLanguage));
    }
}
