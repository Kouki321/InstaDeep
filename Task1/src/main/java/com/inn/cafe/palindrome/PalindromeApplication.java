package com.inn.cafe.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
public boolean isPalindrome(String s) {
    int a= s.length();
    if(a%2==0){
        int left = a/2;
        int right = left+1;

        while(left>=0){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left--;
            right++;

        }
        return true;
    }
    else {
        int left = a/2 -1 ;
        int right = a/2 +1;
        while(left>=0){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left--;
            right++;

        }
        return true;
    }

}
@SpringBootApplication
public class PalindromeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalindromeApplication.class, args);
    }

}

