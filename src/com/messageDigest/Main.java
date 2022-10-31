package com.messageDigest;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String msg = new Scanner(System.in).nextLine();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(msg.getBytes(),0,msg.length());
            System.out.println(new BigInteger(1,md.digest()).toString(16));
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
    }
}
