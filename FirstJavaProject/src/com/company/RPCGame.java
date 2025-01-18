package com.company;

import java.util.Scanner;
import java.util.Random;

public class RPCGame {
    public static void main(String[] args) {
        //0 for Rock
        //1 for Paper
        //2 for Scissor
        Scanner sc=new Scanner(System.in);
        System.out.print(" 0 for Rock,1 for Paper,2 for Scissor.\nEnter your Choice:");
            int userInput=sc.nextInt();
        if(userInput == 0)
            System.out.println("User Choice : Rock");
        if(userInput == 1)
            System.out.println("User Choice : Paper");
        if(userInput == 2)
            System.out.println("User Choice : Scissor");

        Random random=new Random();
        int computerInput=random.nextInt(3);
        System.out.println("Computer Choice : "+computerInput);
        if(computerInput == 0)
            System.out.println("Computer Choice : Rock");
        if(computerInput == 1)
            System.out.println("Computer Choice : Paper");
        if(computerInput == 2)
            System.out.println("Computer Choice : Scissor");

        if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("YouWin!");
        } else {
            System.out.println("ComputerWin!");
        }
    }
}
