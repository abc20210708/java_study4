package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

   private Rectangle r  = new Rectangle();


   public String calcArea(int x, int y , int height, int width) {
       return String.format("( %d, %d ,%d, %d)", r.getX(), r.getY(), r.getHeight(), r.getWidth());
   }

    public String calcPerimeter(int x, int y , int height, int width) {
        return String.format("( %d, %d ,%d, %d)", r.getX(), r.getY(), r.getHeight(), r.getWidth());
    }

}//end class