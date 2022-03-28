package com.example.simplecaculator;

public class Caculator {


    public long add(long a, long b) {
        return a + b;
    }

    public long sub(long a, long b) {
        return a - b;
    }

    public long div(long a, long b) {
        return a / b;
    }

    public long mul(long a, long b) {
        return a * b;
    }

    public double pow(long a, long b) {
        return (double) Math.pow(a, b);
    }

    public double log(int a, int b) {
        // a là cơ số, b là giá trị
        double result = (double) (Math.log(b) / Math.log(a));
        return result;
    }

    public long fac(long a) {
        long giai_thua = 1;
        if(a<0){
            return 0 ;
        }else if (a == 0 || a == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= a; i++) {
                giai_thua *= i;
            }
            return giai_thua;

        }
    }



}
