package Project;

import java.util.Arrays;
import java.util.Scanner;

public class pro {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String[] enoList= {};
        String[] nameList = {};
        String[] ageList = {};
        String[] dNameList = {};

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
                String eno = sc.next();
                sc.nextLine();
                System.out.print("- 이름: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("- 나이: ");
                String age = sc.nextLine();
                System.out.print("- 부서: ");
                String dName = sc.nextLine();
                System.out.println(name + "님의 정보가 정상 등록 되었습니다.");

                //사번 push====
                //사번들을 저장할 배열
                String[] temp = new String[enoList.length+1];
                //기존 저장된 사번들을 모두 신규 배열로 복사
                for (int i = 0; i < enoList.length; i++) {
                    temp[i] = enoList[i];
                }
                //신규 데이터를 마지막 인덱스에 추가
                temp[temp.length-1] = eno;
                enoList = temp; temp = null;

                //이름 push====
                //이름들을 저장할 배열
                String[] tempA = new String[nameList.length+1];
                //기존 저장된 이름들을 모두 신규 배열로 복사
                for (int i = 0; i < nameList.length; i++) {
                    tempA[i] = nameList[i];
                }
                //신규 데이터를 마지막 인덱스에 추가
                tempA[tempA.length-1] = name;
                nameList = tempA; tempA = null;

                //나이 push====
                //나이들을 저장할 배열
                String[] tempB = new String[ageList.length+1];
                //기존 저장된 나이들을 모두 신규 배열로 복사
                for (int i = 0; i < ageList.length; i++) {
                    tempB[i] = ageList[i];
                }
                //신규 데이터를 마지막 인덱스에 추가
                tempB[tempB.length-1] = age;
                ageList = tempB; tempB = null;

                //부서 push====
                //부서들을 저장할 배열
                String[] tempC = new String[dNameList.length+1];
                //기존 저장된 부서들을 모두 신규 배열로 복사
                for (int i = 0; i < dNameList.length; i++) {
                    tempC[i] = dNameList[i];
                }
                //신규 데이터를 마지막 인덱스에 추가
                tempC[tempC.length-1] = dName;
                dNameList = tempC; tempC = null;




            } else if(menu == 2) {
                System.out.println("======= 전체 사원 정보 =======");
                System.out.println("사번\t 이름\t 나이\t 부서");
                System.out.println("============================");
                for (int i = 0; i < ageList.length; i++) {
                    System.out.print(enoList[i] + "\t\t");
                    System.out.print(nameList[i]+ "\t\t");
                    System.out.print((ageList[i])+ "\t\t");
                    System.out.println((dNameList[i])+ "\t\t");
                }//end for


            } else if(menu == 3) {
                //탐색 알고리즘
                System.out.println("# 조회하실 사원의 번호를 입력하세요.");
                System.out.print(">>");
                String target = sc.next();
                sc.nextLine();

                int index = -1; //찾은 인덱스
                for (int i = 0; i < enoList.length; i++) {
                    if(target.equals(enoList[i])){
                        index = i;
                        System.out.println("======= 조회된 사원 정보 =======");
                        System.out.println("사번\t 이름\t 나이\t 부서");
                        System.out.println("============================");
                        System.out.print(enoList[i] + "\t\t");
                        System.out.print(nameList[i]+ "\t\t");
                        System.out.print((ageList[i])+ "\t\t");
                        System.out.println((dNameList[i])+ "\t\t");
                        System.out.println("============================");
                        break;
                    }//end if
                }//end for

            } else if(menu == 4) {
                System.out.println("# 수정하실 사원의 번호를 입력하세요.");
                System.out.print(">>");
                String edit = sc.next();
                sc.nextLine();

                int index = -1; //찾은 인덱스
                for (int i = 0; i < enoList.length; i++) {
                    if(edit.equals(enoList[i])){
                        index = i;
                        System.out.println("#" +nameList[i]+ "님의 정보를 수정합니다.");
                        System.out.println("[1. 나이 변경 | 2. 부서 변경 | 3. 취소]");
                        System.out.print(">>");
                        String modify = sc.next();
                        if(modify.equals("1")) {
                            System.out.println("- 변경하실 나이를 입력하세요");
                            System.out.print(">>");
                            String changeAge = sc.next();
                            sc.nextLine();
                            ageList[i] = changeAge;
                            System.out.println("나이가" +ageList[i]+"에서" + changeAge+"로 변경되었습니다.");
                        }

                        break;
                    }//end if
                }//end for


            }





        }//end while


    }//end main

}//end class
