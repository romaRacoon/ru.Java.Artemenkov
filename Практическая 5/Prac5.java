package com.company;

import java.util.Scanner;

public class Prac5 {
    private  static void  Ex1(int n,int k){
        if(k<=n){
            for (int i=0;i<k;i++){
                System.out.println(k);
            }
            k++;
            Ex1(n,k);
        }
    }

    private  static  void  Ex2(int n,int k){
        if(k<n){
            System.out.println(k);
            k++;
            Ex2(n,k);
        }
    }

    private  static void Ex3(int a,int b){
        if(a<b){
            System.out.println(a);
            a++;
            if(a+1>b){
                System.out.println(a);
            }
            else{
                Ex3(a,b);
            }
        }
        if(a>b){
            System.out.println(a);
            a--;
            if(a-1<b){
                System.out.println(a);
            }
            else{
                Ex3(a,b);
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int k=1;
        Ex1(num,k);
        System.out.println("Введите число");
        num=in.nextInt();
        Ex2(num,k);
        System.out.println("Введите два числа");
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        Ex3(a,b);
    }
}
