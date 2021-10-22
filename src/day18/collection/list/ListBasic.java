package day18.collection.list;

import java.util.*; ///꿀팁

public class ListBasic {

    public static void main(String[] args) {

        // String[] strs = new String[10];
        //Car - Avante, Tucson
        List<String> sList = new ArrayList<>();

        String s1 = "멍멍이";
        String s2 = "야옹이";

        //list에 객체 추가하기: add(obj)
        sList.add(s1); ///자바스크립트에서 push 같은
        sList.add(s2);
        System.out.println(sList);

        sList.add("짹짹이");
        sList.add("개굴이");
        sList.add("어흥이");
        sList.add("야옹이"); //중복데이터 저장 가능
        System.out.println(sList);
        
        //리스트에 저장된 객체 수 얻기: size()
        int size = sList.size(); ///length 처럼
        System.out.println("size = " + size);

        //리스트에 중간 삽입: add(index, obj)
        sList.add(2,"두껍이");
        System.out.println(sList);

        //리스트 객체 수정: set(index, obj)
        ///몇 번 인덱스에 뭘로 수정할지
        sList.set(3, "꾺꾺이");
        System.out.println(sList);

        //리스트 객체 삭제: remove(index), remove(obj)
        sList.remove(6);
        sList.remove("개굴이");
        System.out.println(sList);

        //리스트 객체 참조: get(index)
        String s = sList.get(2);
        System.out.println("s = " + s);
        
        //리스트에 저장된 객체의 인덱스 얻기: indexOf(obj)
        int index = sList.indexOf("어흥이"); ///못찾으면 -1
        System.out.println("index = " + index);
        
        //리스트에 저장된 데이터 유무 확인: contains(obj)
        boolean b = sList.contains("콩벌레");
        //boolean b = !sList.contains("콩벌레");///if문에서 쓰면 콩벌레가 없으면
        System.out.println("b = " + b);

        //리스트의 반복문 처리
        System.out.println("============");
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }///인덱스 제어

        System.out.println("============");
        for (String pet : sList) {
            System.out.println(pet);
        }///전체를 할 때 주로 사용


        System.out.println("================");
        //list 내부 객체 전체삭제: clear()
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());//비어있으면 true


    }//end main
}//end class
