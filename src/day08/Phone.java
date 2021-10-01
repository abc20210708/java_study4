package day08;

//설계도 클래스는 main 메서드를 만들지 않습니다.

public class Phone {

    //속상: 객체의 데이터
    //field

    //고유 속성
    ///거의 변하지 않는 것///(예)galaxy s21
    String model; //모델명
    String color; //색상
    int price; //가격

    //상태 속성
    ///자주 바뀌는
    int messageCount; //문자메세지 수
    boolean on; //전원이 켜진 여부

    //부품 속성(포함 관계: Composition)
    Battery ionBattery;

    //기능: 객체의 행위
    //method : static 붙이지 말 것!

    //전원을 켜는 기능
    void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    //전원을 끄는 기능
    void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    //핸드폰의 정보를 보여주는 기능
    void showSpec() {
        if(!on){
            System.out.println("전원을 먼저 켜세요!");
            return;
        }

        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price + "원");

    }

    //생성자
    ////무조건 void라서 void생략 return 할 수 없음.
    Phone() {
        System.out.println("핸드폰 1번 생성자 호출!");
        model = "애니콜";
        color = "쥐색";
        price = 300000;
    }

    //생성자는 여러 개 선언할 수 있음 (오버로딩)
    Phone(String modelName) {
        System.out.println("핸드폰 2번 생성자 호출!");
        model = modelName;
        color = "스노우 화이트";
        price = 1000000;
    }

    Phone(String modelName, String colorName) {
        System.out.println("핸드폰 3번 생성자 호출!");
        model = modelName;
        color = colorName;
        price = 1200000;
    }
}
