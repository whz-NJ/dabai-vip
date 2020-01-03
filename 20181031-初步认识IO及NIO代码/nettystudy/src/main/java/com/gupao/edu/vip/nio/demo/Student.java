package com.gupao.edu.vip.nio.demo;

public class Student extends User {

    public Student(int id, String name, String classNumber) {
        super(id, name);
        this.classNumber = classNumber;
    }

    private int[] scores;

    private String classNumber;

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
}