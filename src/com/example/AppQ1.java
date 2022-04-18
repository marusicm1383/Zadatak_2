package com.example;

import java.util.Random;

public class AppQ1 {
    public static void main(String[] args) {
        String [] arr1={"Abkre", "Btert", "Cffds", "Dagd", "Efgt", "Fhtz", "Gdse", "Hutk","Ihju", "Jdre", "Kpcd", "Lsde", "Meds", "Nfzr", "Opse"};
        String [] arr2={"eqweqwe", "fsdf", "ghg", "adfhuij", "plkj", "tzr", "dsewrtz", "plka","mvh", "wscghop", "cvhi", "des", "Mplacjuf", "rzfg", "pse"};
        String [] arr3={"fseqwe", "rrr", "qwe", "cgtewq", "fgt", "axc", "wetuik", "pyx","rmi", "webm", "ppo", "asg", "bmsozl", "kff", "rzp"};

        Random rand = new Random();
        int randomNum = rand.nextInt(15) + 1;

        System.out.println("Random number is:" + randomNum);
        System.out.println("Custom text: " + arr1[randomNum-1]);
        System.out.println("Custom text 2: " + arr2[randomNum-1]);
        System.out.println("Custom text 3: " + arr3[randomNum-1]);

    }
}
