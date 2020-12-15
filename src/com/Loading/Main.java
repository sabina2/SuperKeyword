package com.Loading;
class A{
    int a=10;
}
public class Main extends A {
    int a=20;
    void show(int a){
        System.out.println(a);              //30
        System.out.println(this.a);         //20
        System.out.println(super.a);        //10

    }

    public static void main(String[] args) {
	Main m1=new Main();
        m1.show(30);
    }
}
