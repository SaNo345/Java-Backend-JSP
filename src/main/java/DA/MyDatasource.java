package DA;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Sano on 05.08.2017.
 */
public class MyDatasource {
    private String name = "";
    private InitialContext ic;
    private DataSource ds;
    private Connection connection;
    private Statement statement;

    public MyDatasource() {
        try {
            ic = new InitialContext();
            ds = (DataSource) ic.lookup("jdbc/Postgres");
            connection = ds.getConnection();
            statement = connection.createStatement();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
