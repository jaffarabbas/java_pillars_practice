package com.pillar;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        if(number.length()== 10){
            if(number.charAt(0) == '7'|| number.charAt(0) == '8'|| number.charAt(0) == '9'){
                System.out.println("Valid");
            }
        }else if(number.length()== 11){
            if(number.charAt(0) == '0'){
                if(number.charAt(1) == '7'|| number.charAt(1) == '8'|| number.charAt(0) == '9'){
                    System.out.println("Valid");
                }
            }
        }else if(number.length()== 12) {
            if (number.charAt(0) == '9' && number.charAt(1) == '1') {
                if (number.charAt(2) == '7' || number.charAt(2) == '8' || number.charAt(2) == '9') {
                    System.out.println("Valid");
                }
            }
        }else{
                System.out.println("Invalid");
        }
        scn.close();
    }
}