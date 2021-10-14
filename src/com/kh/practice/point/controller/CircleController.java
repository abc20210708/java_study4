package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

   private Circle c = new Circle();


    public String calcArea(int x, int y , int radius) {
        //초기화한 정보와 면적을 변환
        //면적 : pi * 반지름 * 반지름
        //pi = 3.141592
        //pi* radius * radius
        return String.format("( %d, %d , %d)", c.getY(), c.getY(),c.getRadius());
    }



    public String calcCircum(int x, int y , int radius) {
        // 둘레 : PI * 반지름 * 2

        return String.format("( %d, %d , %d)", c.getX(), c.getY() ,c.getRadius());
    }

}//end class
