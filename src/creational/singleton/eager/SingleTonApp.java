package creational.singleton.eager;

public class SingleTonApp {

    public static void main(String[] args) {
        DBConnection connectionPoolOne = DBConnection.getInstance();

        connectionPoolOne.datasource("dbTest");

        System.out.println(connectionPoolOne.getDatasource());

        DBConnection connectionPoolTwo = DBConnection.getInstance();

        System.out.println(connectionPoolTwo.getDatasource());

    }

}
