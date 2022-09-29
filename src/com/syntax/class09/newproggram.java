package com.syntax.class09;

import java.util.Scanner;

public class newproggram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] countries = { "Canada","India","US","France","China" };
        String[] capitals = { "Ottawa","Delhi","Washington","Paris","Beijing"};
        String[] usersCountries = new String[5];

        for (int i = 0; i < usersCountries.length; i++) {
            System.out.println("Please enter a country name?");

            usersCountries[i] = sc.next();
            sc.nextLine();

        }

        for (int m = 0; m < usersCountries.length; m++) {
            for (int j = m; j < countries.length; j++) {
                if (usersCountries[m].equalsIgnoreCase(countries[j])) {
                        System.out.println("The capital of "+countries[j]+ " is "+ capitals[j]);
                        break;
                        
                    }else {
                        System.out.println("capital of"+usersCountries[m]+" is unknown");
                        break;
                    }
                }
            }

	}

}
