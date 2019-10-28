package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {

        String a;
        int count = input.length();
        for(int i = 0; i < input.length(); i++)
        {
            for(int j = i+2;j <= input.length(); j++)
            {
                a = input.substring(i,j);
                count += isPalindome(a);
            }
        }
        return count;

    }
    public int isPalindome(String input){

        for (int j = 0; j < input.length() / 2; j++){
            if(input.charAt(j) != input.charAt(input.length() - 1 ));
                return 0;
        }
        return 1;
    }
}
