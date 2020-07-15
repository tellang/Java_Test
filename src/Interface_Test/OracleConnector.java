package Interface_Test;

public class OracleConnector implements Connector {
    @Override
    public void connect() {
        System.out.println("Oracle Connected!");
    }
}
