package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

    //필드
    //초기화 중복 없는 숫자 1~45까지
    private int[] lotto = new int[6];



    /*
    1. 해당 범위의 랜덤 정수를 하나를 생성
    */
    /*
    int successCount = 0; //로또 번호를 잘 저장했을 때 증가
    int rn = (int) (Math.random() * 45 + 1);
    /*
    2. lotto 배열을 탐색하여 1번에서 생성한 숫자와
        같은 숫자가 발견되는지 확인*/
    /*
    boolean flag = false;//중복을 판단하는 변수
    for(int i = 0; i < successCount; i++) {
        if(rn == lotto[i]) {
            flag = true;
            break;
        }//end if
    }//end for
    if(!flag) {
        lotto[successCount++] = rn;
    }
*/
    /*
    3-1. 발견되었다면 배열에 담지 말고 새로운 랜덤 정수
        생성 후 2 번 반복
    3-2. 중복이 발견되지 않았다면 빈 자리에 해당 숫자 추가
    4.  배열이 가득찰 때까지 무한히 1~3번 반복
    * */



    //생성자
    public Lotto() {
        lotto = new int[6];



    }

    //메소드
    public void information() {
        System.out.println("로또번호:" + Arrays.toString(lotto));
    }

}//end class
