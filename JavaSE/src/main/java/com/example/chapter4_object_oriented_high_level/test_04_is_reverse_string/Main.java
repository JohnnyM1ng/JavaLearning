package com.example.chapter4_object_oriented_high_level.test_04_is_reverse_string;

public class Main {
    public static void main(String[] args) {
        String str = "abaaeaaba";
        System.out.println(isReverseString(str));

    }

    public static boolean isReverseString(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
