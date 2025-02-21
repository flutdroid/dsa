package com.project.dsagfg.mathematics;

public class DsaGfg {
    static int absoluteValue(int x){
        if (x< 0){
            x = -(x);
        }
        return x;
    }
    static double convertCtoF(int c){
        return (double) ((c * 1.8) + 32);
    }
    static void rootsOfQuadEq(int a, int b, int c){
        double d = (b*b) - 4*a*c;
        double x = (-b + Math.sqrt(d))/ 2*a;
        double y = (-b - Math.sqrt(d))/ 2*a;
        System.out.print(x + "roots" + y);
    }
    static long factorial(int x){
        long fact = 1;
        for(int i = 1; i <= x ; i++){
            fact = fact * i;
        }
        return fact;
    }

    static boolean isPrime(int x){
        for (int i = 2; i < x; i++) {
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       // System.out.print(absoluteValue(-32));
        //System.out.print(convertCtoF(32));
       // rootsOfQuadEq(1,-7,12);
       // System.out.print(factorial(13));
    }
}
