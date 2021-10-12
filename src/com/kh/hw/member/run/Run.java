package com.kh.hw.member.run;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        MemberController mc = new MemberController();
        
//        boolean flag = mc.checkId("aaaab");
//        System.out.println("flag = " + flag);
//
//        Member member = mc.searchId("aaaaa");
//        System.out.println(member.inform());

//       Member[] members =  mc.searchName("칼국수");
//        for (Member member : members) {
//                String inform = member.inform();
//            System.out.println(inform);
//        }

        mc.delete();//전체삭제
        mc.delete();

        Member[] members = mc.printAll();
        for (Member member : members) {
            System.out.println(member.inform());
        }



    }//end main
}//end main
