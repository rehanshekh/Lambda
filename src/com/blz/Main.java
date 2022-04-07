package com.blz;
@FunctionalInterface
interface MathApp{
    int calculate(int x , int y);
    static void printResult(int a, int b, String function, MathApp obj){
        System.out.println("The result of the "+function+" is "+obj.calculate(a,b));
    }
}
public class Main {
    public static void main(String[] args) {
	MathApp add = Integer::sum;
    MathApp multiply = (x,y)->x*y;
    MathApp divide = (int a, int b)->a/b;
        System.out.println(add.calculate(6,3));
        System.out.println(multiply.calculate(6,3));
        System.out.println(divide.calculate(6,3));
        MathApp.printResult(6,3,"sum",add);
        MathApp.printResult(6,3,"multiplication",multiply);
        MathApp.printResult(6,3,"division",divide);
    }
}
