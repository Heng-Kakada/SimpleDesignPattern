package creational.builder;


import java.util.List;

public abstract class StudentBuilder {

    private String name;
    private int age;
    List<String> subs;

    public StudentBuilder name(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder age(int age){
        this.age = age;
        return this;
    }

    public Student build(){
        return new Student(name, age, subs);
    }

    public abstract StudentBuilder subject();
}
