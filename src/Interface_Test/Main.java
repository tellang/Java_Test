package Interface_Test;

public class Main {
    public static void main(String[] args){
        Connector oracleConnector = ConnectorFactory.getConnector("oracle");
        oracleConnector.connect();

        Connector sqlConnector = ConnectorFactory.getConnector("sql");
        sqlConnector.connect();
    }
}
