package com.company;

public class Main {
    public static void main(String [] args)
    {
Main main=new Main();
main.method(625);
    }
    void method(int n)
    {

       int  a=n%10;
        if(a!=0) {
            System.out.println(a);

            method(n / 10);
        }

        

    }
}
