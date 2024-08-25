package creational.builder;

public class Director {

    private StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof MBAStudentBuilder){
            return new MBAStudentBuilder().name("piko").age(20).subject().build();
        }else if (studentBuilder instanceof EngineerStudentBuilder){
            return new EngineerStudentBuilder().name("kakada").age(21).build();
        }

        return null;
    }

}
