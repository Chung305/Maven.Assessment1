package com.zipcodewilmington.assessment1.part1;

import java.lang.reflect.Array;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String upCase = str.substring(0,1).toUpperCase() + str.substring(1);

        return upCase;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] reverse = str.split(" ");
        String tempReverse;
        String reversed = "";

        for(int i = 0; i < reverse.length; i++){
            tempReverse = "";
            for(int j = reverse[i].length()-1; j >= 0; j--){
                tempReverse += reverse[i].charAt(j);
            }
            reverse[i] = tempReverse;
        }
        reversed += reverse[reverse.length - 1];
        for(int i = reverse.length - 2; i >= 0; i-- ){
            reversed += " " + reverse[i];
        }

        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = reverse(str);
        result = camelCase(result);
        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String newStr = str.substring(1);

        return newStr.substring(0, newStr.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] invert = str.split("");
        String invertedString = "";
        for(int i = 0; i < invert.length; i++){

            if(invert[i].equals(invert[i].toUpperCase())){
                invert[i] = invert[i].toLowerCase();
            }else{
                invert[i] = invert[i].toUpperCase();
            }
        }
        for(int i = 0; i < invert.length; i++){
            invertedString += invert[i];
        }
        return invertedString;
    }
}
