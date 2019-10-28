package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer occurrences = 0;
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] == objectToCount){
                occurrences++;
            }
        }

        return occurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> result = new ArrayList<>();


        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] != objectToRemove)
                result.add(objectArray[i]);
        }
        Integer[] arr = new Integer[result.size()];
        for (int i =0; i < result.size(); i++)
            arr[i] = (int)result.get(i);

        return arr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1;
        int tempCount;

        int mostCommon = (int)objectArray[0];
        int temp;

        for(int i = 0; i < objectArray.length; i++){
            temp = (int)objectArray[i];
            tempCount = 0;
            for(int j = 1; j < objectArray.length; j++){
                if(temp == (int)objectArray[j]){
                    tempCount++;
                }
                if(tempCount > count){
                    mostCommon = temp;
                    count = tempCount;
                }
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = 1;
        int tempCount;

        int leastCommon = (int)objectArray[0];
        int temp;

        for(int i = 0; i < objectArray.length; i++){
            temp = (int)objectArray[i];
            tempCount = 0;
            for(int j = 0; j < objectArray.length; j++){
                if(temp != (int)objectArray[j]){
                    leastCommon = temp;
                }



                }
            }

        return 2;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Integer[] merged = new Integer[objectArray.length + objectArrayToAdd.length];
        int count = 0;
        for(int i = 0; i < objectArray.length; i++){
            merged[count] = (int)objectArray[i];
            count++;
        }
        for(int i = 0; i < objectArrayToAdd.length; i++){
            merged[count] = (int)objectArrayToAdd[i];
            count++;
        }
        return merged;
    }
}
