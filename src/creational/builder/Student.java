package creational.builder;

import java.util.List;

public class Student {

    private String name;
    private int age;
    List<String> subs;

    public Student(String name, int age, List<String> subs) {
        this.name = name;
        this.age = age;
        this.subs = subs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subs=" + subs +
                '}';
    }
}
