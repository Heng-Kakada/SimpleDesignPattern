package creational.builder;

public class ClientDemo {

    public static void main(String[] args) {


        Student eStu = new Director(new EngineerStudentBuilder()).createStudent();

        System.out.println(eStu);

        Student mbaStu = new Director(new MBAStudentBuilder()).createStudent();

        System.out.println(mbaStu);



    }


}
