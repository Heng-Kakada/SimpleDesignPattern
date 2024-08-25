package creational.prototype;

public class ClientDemo {

    public static void main(String[] args) {

        Student obj = new Student("piko", 21);

        Student cloneObj = (Student) obj.clone();

        cloneObj.setName("kiko");

        System.out.println(obj);
        System.out.println(cloneObj);

    }


}
