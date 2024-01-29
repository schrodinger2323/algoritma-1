package week3;

import java.util.Scanner;
//*
//**
//***
//****
//*****
//******
//*******
//********
//*********
//**********
//*********
//********
//*******
//******
//*****
//****
//***
//**
//*

public class desen {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sembol = 1;
        int sembol2 = 9;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < sembol; j++) {
                System.out.print("*");
            }
            System.out.println("");
            sembol++;

        }
        for (int l = 0; l <= 10; l++) {
            for (int q = 0; q < sembol2; q++) {
                System.out.print("*");
            }
            System.out.println("");
            sembol2--;

        }
    }

}
