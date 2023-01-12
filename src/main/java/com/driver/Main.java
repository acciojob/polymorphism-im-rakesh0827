package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(23, 4);
        int result2 = p.product(1, 5, 2);
        double result3 = p.product(3.5, 2.5);

        System.out.println(result1+"\n"+result2+"\n"+result3);
    }
}

class Product{

    public int product(int x, int y){
        return x+y;
    }

    public int product(int x, int y, int z){
        return x+y+z;
    }

    public double product(double x, double y){
        return x+y;
    }
}

