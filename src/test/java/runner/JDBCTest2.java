package runner;

import utilities.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTest2 {

    public static void main(String[] args) throws SQLException {

        try {
            JDBCUtils.establishConnection();
            List<Map<String,Object>> dbData = JDBCUtils.runSQLQuery("select first_name,last_name,salary from employees");
            System.out.println(dbData.get(0).get("FIRST_NAME"));
            System.out.println(dbData.get(0).get("SALARY"));
            System.out.println(JDBCUtils.countRows("select first_name,last_name,salary from employees"));
            JDBCUtils.closeConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConnection();
            System.out.println("Database connection is closed");
        }
    }
}
