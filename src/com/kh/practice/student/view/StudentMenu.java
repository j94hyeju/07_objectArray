package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	StudentController ssm = new StudentController();
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] student = ssm.printStudent();
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].inform());
		}
		System.out.println("========== 학생 성적 출력 ==========");
		double[] grade = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+(int)grade[0]);
		System.out.println("학생 점수 평균 : "+grade[1]);
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i = 0; i < student.length; i++) {
			if(student[i].getScore()<ssm.CUT_LINE) {
				System.out.println(student[i].getName()+"학생은 재시험 대상입니다.");
			} else {
				System.out.println(student[i].getName()+"학생은 통과입니다.");
			}
		}
	}
}
