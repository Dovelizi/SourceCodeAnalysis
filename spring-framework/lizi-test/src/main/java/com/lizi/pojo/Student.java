package com.lizi.pojo;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/19 15:21
 **/
public class Student {
	public Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int studentId;
	public String studentName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
