package com.learnjava.practice;

import java.util.Objects;
import java.util.Scanner;

public class NumberToDigit {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter phone number");
        String ph=sc.nextLine();
        int len=ph.length();
        char ch;
        String[]arr=new String[len];
        for(int i=0;i<len;i++){
            ch=ph.charAt(i);
            arr[i]= String.valueOf(ch);
        }
        //String[]arr2=new String[len];

        for(int i=0;i<len;i++){
            if((i+1< len && Objects.equals(arr[i], arr[i + 1])) && (i+2<len && !Objects.equals(arr[i], arr[i + 2]))){
                System.out.print(" double "+NumberToDigit.convert(arr[i])+" ");
                i=i+1;
            } else if((i+1< len && Objects.equals(arr[i], arr[i + 1])) && (i+2<len && Objects.equals(arr[i], arr[i + 2]))){
                System.out.print(" triple "+NumberToDigit.convert(arr[i])+ " ");
                i=i+2;
            }else System.out.print(" "+NumberToDigit.convert(arr[i])+" ");
        }

        //**Second logic**/

        String firstEle = arr[1];
        String finalResult = getFinalResult(arr);
        System.out.println("\nVALUE : "+finalResult);








    }
    //52544545545455555   && !finalResult.substring(finalResult.length() - 8, finalResult.length() - 2).equals("Triple")
    private static String getFinalResult(String[] arr) {
        StringBuilder finalResult = new StringBuilder();
        String previousVal = arr[0];
        boolean isDouble = Boolean.FALSE;
        boolean isTriple = Boolean.FALSE;
        for (String str: arr) {
            if(finalResult.toString().isBlank()){
                finalResult.append(NumberToDigit.convert(str));
            }else{
                if(isDouble && previousVal.equals(str)){
                    finalResult = new StringBuilder(finalResult.substring(0, finalResult.length() -9)).append(" Triple ").append(NumberToDigit.convert(str));
                    isDouble=Boolean.FALSE;
                    isTriple=Boolean.TRUE;
                }else{
                    if(previousVal.equals(str) && !isTriple){
                        finalResult = new StringBuilder(finalResult.substring(0, finalResult.length() - 2)).append(" Double ").append(NumberToDigit.convert(str));
                        isDouble =Boolean.TRUE;
                        isTriple=Boolean.FALSE;
                    }else{
                        finalResult.append(" ").append(NumberToDigit.convert(str));
                        isDouble =Boolean.FALSE;
                        isTriple=Boolean.FALSE;
                    }
                }
            }
            previousVal = str;

        }
        return finalResult.toString();
    }

    public static String convert(String s){
        if(s.equals("0")){
            s="zero";
        } else if (s.equals("1")) {
            s="one";
        }else if (s.equals("2")) {
            s = "two";
        }else if (s.equals("3")) {
            s = "three";
        }else if (s.equals("4")) {
            s = "four";
        }else if (s.equals("5")) {
            s = "five";
        }else if (s.equals("6")) {
            s = "six";
        }else if (s.equals("7")) {
            s = "seven";
        }else if (s.equals("8")) {
            s = "eight";
        }else if (s.equals("9")) {
            s = "nine";
        }
        return s;
    }

    public String check(){
        return check();
    }
}

