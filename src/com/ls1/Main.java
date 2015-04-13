package com.ls1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Parameters for Main class:");
        for(int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("Number of parameters:" + args.length);
    }
}
