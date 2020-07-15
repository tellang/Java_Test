package Interface_Test;

public class SQLConnector implements Connector {
    @Override
    public void connect() {
        System.out.println("SQL Connected");
    }
}
