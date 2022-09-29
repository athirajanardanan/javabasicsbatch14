package com.syntax.class09;

import java.util.Scanner;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] countries = { "Egypt", "USA", "UAE" };
        String[] capitals = { "Cairo", "Washington", "Dubai" };
        String[] givenCountries = new String[3];

        for (int i = 0; i < givenCountries.length; i++) {
            System.out.println("what is your country");

            givenCountries[i] = sc.next();
            sc.nextLine();

        }

        for (int m = 0; m < givenCountries.length; m++) {
            for (int j = m; j < countries.length; j++) {
                if (givenCountries[m].equalsIgnoreCase(countries[j])) {
                        System.out.println("the capital of "+countries[j]+ " is "+ capitals[j]);
                        break;
                    }else {
                        System.out.println("capital is unknown");
                        break;
                    }
                }
            }

	}

}
