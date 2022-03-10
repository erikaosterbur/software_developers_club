package com.teksystems;

import java.util.Scanner;

public class ClubMemberApp {
    public static void main(String[] args){
        SoftwareDeveloperClub club = new SoftwareDeveloperClub();
        Scanner input = new Scanner(System.in);
        loop:
        while(true){
            System.out.print("What would you like to do?\n 1. Display Members\n 2. Remove Member \n 3. Add Member\n 4. Quit\n");
            switch(input.nextInt()){
                case 1:
                    club.displayMembers();
                    break;
                case 2:
                    club.removeMember(input);
                    break;
                case 3:
                    club.addMember(input);
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Hey, that was not a valid option. Please try again.");
            }
        }
    }
}
