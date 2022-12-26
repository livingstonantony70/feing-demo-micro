package com.example.feingdemomicro;

import com.example.feingdemomicro.model.Teacher;

import java.util.List;

public class TeacherParent {
    private List<Teacher> list;

    public TeacherParent() {
    }

    public TeacherParent(List<Teacher> list) {
        this.list = list;
    }

    public List<Teacher> getList() {
        return list;
    }

    public void setList(List<Teacher> list) {
        this.list = list;
    }
}



