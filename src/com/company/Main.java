package com.company;

public class Main {

    public static void main(String[] args) {
	    sumDigits(12333);
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        int x = number;
        while(x > 0){
            int y = x % 10;
            x = x / 10;
            sum = sum + y;
        }
        System.out.println(sum);
        return sum;
    }
}
