package com.kh.practice.point.view;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {

   private Scanner sc = new Scanner(System.in);
   private CircleController cc = new CircleController();
   private RectangleController rc = new RectangleController();

   public void mainMenu() {

       System.out.println("===== 메뉴 =====");
       System.out.println("1. 원");
       System.out.println("2. 사각형");
       System.out.println("9. 끝내기");
       System.out.print("- 메뉴 번호 : ");
       int menu = sc.nextInt();

       switch (menu) {
           case 1:
               circleMenu();
               break;
           case 2:
               rectangleMenu();
               break;
           case 9:
               System.exit(0);
               break;


       }

   }

    public void circleMenu() {
        System.out.println("===== 원 메뉴 =====");
        System.out.println("1. 원 둘레");
        System.out.println("2. 원 넓이");
        System.out.println("9. 메인으로");
        System.out.print("- 메뉴 번호 : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                calcCircum();
                break;
            case 2:
                calcCircleArea();
                break;
            case 9:
                break;

        }



    }

    public void rectangleMenu() {

    }

    // 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
    public void calcCircum() {
        System.out.printf("x좌표 : " );
        System.out.printf("y좌표 : ");
        System.out.printf("반지름 : ");


    }

    public void calcCircleArea() {

    }

    public void calcPerimeter() {

    }

    public void calcRectArea() {

    }



}//end class
