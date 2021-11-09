package com.company;

import java.util.Scanner;

public class Main {
public static int houses = 0;

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("how many houses ?");
    houses = input.nextInt();
    matchsticks();
    }

    public static int  matchsticks(){
    int match = 6 + ((houses - 1)*5);
    System.out.println(match);
    return match ;
    }
}
