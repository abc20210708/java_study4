package day12.inherit;

public class Warrior extends Player{


     public int rage;

     public Warrior() {
         // this("dd");
          //// super = Player 그래서 객체가 2개가 생성이 됨
          super();////생략되어 있음.////부모의 생성자 호출
          ///this()처럼
          System.out.println("Warrior 객체 생성됨!");
     }

     public Warrior(String name, int rage) {
          super(name);///부모의 생성자를 호출
          this.rage = 100;
     }

     ////오버라이딩
     @Override
     public void info() {
          super.info();////직속부모 super
          System.out.println("# 분노: " + rage);
     }

    public void fireSlash() {

     }


}//end class
