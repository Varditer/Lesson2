package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 12;
        int y = 30;
        int z = (x+y);
         System.out.println(z);

         int x1 = 73;
         int y1 = 82;
         int z1 = (x1*y1);
         System.out.println(z1);

         int x2 = 120;
         int y2 = 2;
         int z2 = (x2/y2);
         System.out.println(z2);

         int x3 = 873;
         int y3 = 342;
         int z3 = (x3 - y3);
         System.out.println(z3);

         int x4 = 10;
         int y4 = 90;
         int z4 = ++x4 + -- y4;
         int k = x4;
         int c = y4;
         System.out.println(z4);
        System.out.println(k);
        System.out.println(c);

        int v = 70;
        int j = 49;
        char l = '*';
        char h = '=';
        if( l=='*' && h=='=')
        {
            System.out.println(v*j);

        }
        else if(l=='-' && h=='=') {
            System.out.println(v - j);
        }
        else if (l=='+' && h=='='){
            System.out.println(v+j);
        }
        else if (l=='/'&& h=='=') {
            System.out.println(v / j);
        }
        if( l=='+'|| l=='-')
        {
            System.out.println( "increment, decrement" );
        }
           double[] doubleArray = {2.4,83.4,48.5};
        double[] doubleArray1 ={4.6,96.8,86.9,};
         doubleArray = new double[4];
         doubleArray[0] = 4.6;
        doubleArray[1] = 96.8;
        doubleArray[2] = 86.9;
    }
}
