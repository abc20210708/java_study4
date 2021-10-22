package day18.generic;

import day10.modi.pac1.B;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        PeachBasket pb = new PeachBasket();
        pb.setPeach(new Peach());

        System.out.println("===============");

        ///객체 생성 당시에 타입을 지정 <Apple>
        ///Basket<Apple> apb = new Basket<Apple>();
        Basket<Apple> apb = new Basket<>(); ///생략가능
        apb.setF(new Apple());
        Apple f = apb.getF();

        Basket<Peach> pcb = new Basket<Peach>();
        pcb.setF(new Peach());
        Peach peach = pcb.getF();

       // Basket<Water> waterBasket = new Basket<>();


    }//end main
}//end class
