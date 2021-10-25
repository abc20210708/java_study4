package day19.collection.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}//end class


public class MapBasic {

    public static void main(String[] args) {

        //Map : key, value의 쌍으로 데이터를 집합관리
        //  key는 중복불가능, value는 중복가능
        ///고길동 홍길동 둘 다 까치는 불가능
        ///자바 스크립트의 객체와 같은 개념
        Map<String, Member> memberMap = new HashMap<>();

        //map에 객체 추가 : put(key, value)
        memberMap.put("멍멍이",new Member("김철수",30));
        memberMap.put("야옹이",new Member("고길동",45));
        memberMap.put("짹짹이",new Member("박영희",35));
        ///key, value -->엔트리 ///key랑 value를 한 쌍으로

        System.out.println(memberMap);

        System.out.println(memberMap.size());

        //중복된 key를 설정하면 value가 수정됨
        memberMap.put("야옹이",new Member("둘리",10));
        System.out.println(memberMap);

        //map에 저장된 객체 참조: get(key)
        Member member = memberMap.get("짹짹이");
        System.out.println("member = " + member);
        ////결과{name='박영희', age=35}
        
        //map 데이터 삭제 : remove(key)
        memberMap.remove("야옹이");
        System.out.println(memberMap);

        //map에 저장된 key 존재 유무 확인 : containsKey(obj)
        ///저장된 key인가 아닌가
        ///확인해보고 수정과 삽입
        System.out.println(memberMap.containsKey("야옹이"));
        System.out.println(memberMap.containsKey("짹짹이"));

        System.out.println("==============");
        
        //map의 반복문 처리
        Set<String> keys = memberMap.keySet();
        System.out.println("keys = " + keys);
        for (String key : keys) {
            System.out.println(memberMap.get(key));
        }
        


    }//end main
}//end class
