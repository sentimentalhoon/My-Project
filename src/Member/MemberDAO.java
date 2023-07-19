package Member;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class MemberDAO {
    private static MemberDAO _instance = null;

    private static String _driver;
    private static String _url;
    private static String _user;
    private static String _password;
    /** DB접속 정보를 집계한 것? */
    private HikariDataSource hikariDataSource;

    public static MemberDAO getInstance() throws SQLException {
        if (_instance == null) {
            synchronized (MemberDAO.class) {
                if (_instance == null) {
                    _instance = new MemberDAO();
                }
            }
        }
        return _instance;
    }    
                
    private MemberDAO() throws SQLException {
        try {
            setDatabaseSettings("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","service","Tkfkdgo12#$");
            hikariDataSource = new HikariDataSource();
            hikariDataSource.setDriverClassName(_driver);
            hikariDataSource.setJdbcUrl(_url);
            hikariDataSource.setUsername(_user);
            hikariDataSource.setPassword(_password);

            hikariDataSource.getConnection().close();// 데이터베이스 연결
            System.out.println("[Database 연결 성공]");
        } catch (SQLException e) {
            System.out.println("[SQL Error : " + e.getMessage() + "]");
        } catch (Exception e) {
            throw new SQLException("could not init DB connection:" + e);
        }
    }

    /**
     * DB에의 액세스에 필요한 정보 설정
     * 
     * @param driver
     *                 DB접속 드라이버
     * @param url
     *                 DB서버 URL
     * @param user
     *                 DB서버에 접속하는 유저명
     * @param password
     *                 DB서버에 접속하는 패스워드
     */
    public static void setDatabaseSettings(final String driver,
            final String url, final String user, final String password) {
        _driver = driver;
        _url = url;
        _user = user;
        _password = password;
    }

    /**
     * DB접속을 해, connection 오브젝트를 돌려준다.
     * 
     * @return Connection connection 오브젝트
     * @throws SQLException
     */
    public Connection getConnection() {
        Connection connection = null;

        while (connection == null) {
            try {
                connection = hikariDataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
