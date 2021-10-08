package com.kh.practice.student.run;

import com.kh.practice.student.controller.StudentController;

public class Run {

    public static void main(String[] args) {
        StudentController ss = new StudentController();

        System.out.println(ss.sArr[3].inform());

    }//end main
}//end class
