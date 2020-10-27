package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GroupService {
    private List<Student> students;
    private List<Student> oldStudents;
    private boolean hasNewStudent;

    public GroupService() {
        students = new ArrayList<>();
        hasNewStudent = false;
        initialization();
        oldStudents = new ArrayList<>(students);
    }

    private void initialization() {
        Student student1 = new Student(1, "成吉思汗");
        Student student2 = new Student(2, "鲁班七号");
        Student student3 = new Student(3, "太乙真人");
        Student student4 = new Student(4, "钟无艳");
        Student student5 = new Student(5, "花木兰");
        Student student6 = new Student(6, "雅典娜");
        Student student7 = new Student(7, "芈月");
        Student student8 = new Student(8, "白起");
        Student student9 = new Student(9, "刘禅");
        Student student10 = new Student(10, "庄周");
        Student student11 = new Student(11, "马超");
        Student student12 = new Student(12, "刘备");
        Student student13 = new Student(13, "哪吒");
        Student student14 = new Student(14, "大乔");
        Student student15 = new Student(15, "蔡文姬");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
    }

    public List<Student> getAllStudents() {
        return this.oldStudents;
    }

    public List<Student> groupStudents() {
        Collections.shuffle(oldStudents);
        return oldStudents;
    }

    public void add(Student student) {
        if (!hasNewStudent) {
            hasNewStudent = true;
        }
        student.setId(students.size() + 1);
        students.add(student);
    }

}
