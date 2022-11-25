package com.java.class30;

import java.util.Scanner;

public class BrowserMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.next();

        if (browser.equalsIgnoreCase("Chrome")){
            Chrome c = new Chrome();
            c.openIncognitoWindow();
        }else {
            FireFox f = new FireFox();
            f.openIncognitoWindow();
        }
    }
}
