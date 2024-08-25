package creational.singleton.eager;

public class DBConnection {
    private String datasource;

    private final static DBConnection instance = new DBConnection();

    private DBConnection(){}

    public static DBConnection getInstance(){
        return instance;
    }

    public void datasource(String datasourceName){
        this.datasource = datasourceName;
    }

    public String getDatasource(){
        return datasource;
    }
}
