package day19.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {

    public static void main(String[] args) {

        //Set :  중복 저장 해용 x, 순서없이 저장, 탐색, 저장속도 빠름
        Set<String> set = new HashSet<>();

        //set에 객체 추가: add(obj)
        set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        boolean b1 = set.add("김밥");
        boolean b2 = set.add("김말이");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        int size = set.size();
        System.out.println("size = " + size);
        System.out.println(set);

        ///개별 탐색은 불가능 인덱스,키 없음
        
        //set의 반복문
        for (String s : set) {
            System.out.println("s = " + s);
        }

        //set의 객체 삭제: remove(obj)
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set);

    }//end main
}//end class
