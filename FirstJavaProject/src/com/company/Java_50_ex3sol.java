package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number :");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.println("Yes u guessed it right, it was :"+number+"\nNo of guesses :"+ noOfGuesses);
            return true;
        } else if(inputNumber<number){
            System.out.println("Too low...");
        } else if(inputNumber>number){
            System.out.println("Too High...");
        }
        return false;
    }
}
public class Java_50_ex3sol {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
