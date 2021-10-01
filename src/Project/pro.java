package Project;

import java.util.Scanner;

public class pro {

    void add(int... age) {

    }


    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.println("=====사원관리 프로그램=====");
            System.out.println("1. 사원정보 신규등록");
            System.out.println("2.모든 사원정보 보기");
            System.out.println("3.사원정보 검색");
            System.out.println("4. 사원정보 수정");
            System.out.println("5. 사원정보 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("=======================");
            System.out.print("메뉴 입력: ");
            int menu = sc.nextInt();

            //종료 조건
            if(menu == 6) { break; }

            else if(menu == 1) {
                System.out.println("# 사원정보 등록을 시작합니다.");
                System.out.print("- 사번: ");
                int eno = sc.nextInt();
                System.out.print("- 이름: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("- 나이: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("- 부서: ");
                String dName = sc.next();
                sc.nextLine();
                //사원이름들을 저장할 배열


            } else if(menu == 2) {
                System.out.println("======= 전체 사원 정보 =======");

            }





        }//end while


    }//end main

}//end class
