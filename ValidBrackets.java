package org.example.algorithms.samples;

import java.util.*;
public class ValidBrackets{
    public static void validBracketsCounter(String brackets){

        Map<Integer,String> validBracketAmount = new HashMap<>();
        validBracketAmount.put(2, "()");
        validBracketAmount.put(4,"()()");
        validBracketAmount.put(6,"(()())");

        int i = 0, sum = 0, left = 0;
        int right = 1;

        while (i < brackets.length() - 1){
            if(brackets.charAt(i) == '('){
                left = left + 1;
            }else if(brackets.charAt(i) == ')' && left != 0){
                right = right + 1;
            }
            if(right <= left){
                sum = right * 2;
            }
            i++;
        }
        if(sum != 0){
            System.out.println(sum + " " + "- " + validBracketAmount.get(sum));
        } else System.out.println(sum);
    }
}










