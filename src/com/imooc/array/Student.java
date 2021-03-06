package com.imooc.array;

public class Student {
    private String name;
    private int score;

    public Student(String studentName, int studentScore) {
        this.name = studentName;
        this.score = studentScore;
    }

    @Override
    public String toString() {
        return String.format("com.imooc.array.Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 66));
        arr.addLast(new Student("Charlie", 88));
        System.out.println(arr);
    }
}
