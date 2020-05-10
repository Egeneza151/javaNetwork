package jns;

import org.sqlite.SQLiteJDBCLoader;
import org.sqlite.SQLiteDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.text.StringEscapeUtils;

public class LoginHandler {

    private SQLiteDataSource src;

    public LoginHandler() throws Exception {
        boolean init = SQLiteJDBCLoader.initialize();
        src = new SQLiteDataSource();
        src.setUrl("jdbc:sqlite:./database.sqlite");
    }
    public boolean checkUser(String username, String password) throws SQLException {
        password = StringEscapeUtils.escapeJava(password);
        ResultSet query = src.getConnection().createStatement().executeQuery("SELECT * FROM users WHERE username = '" + username + "' AND password ='" + password + "'");
        if (query.next() == false) {
            return false;
        }
        return true;
    }
}
