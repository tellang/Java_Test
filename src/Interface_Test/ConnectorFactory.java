package Interface_Test;

public class ConnectorFactory {
    public static Connector getConnector (String dbmsName){
        Connector connector = null;

        if(dbmsName.contentEquals("oracle")){
            connector = new OracleConnector();
        }
        else if (dbmsName.contentEquals("sql")){
            connector = new SQLConnector();
        }
        return connector;
    }
}
