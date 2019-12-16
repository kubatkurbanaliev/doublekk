package runner;

import utilities.Configuration;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {

    //Java DataBase Connectivity

    public static void main(String [] args) throws SQLException, IOException {
        //Connection
        //Statement
        //ResultSet
        Connection connection = DriverManager.getConnection(Configuration.getProperties("dbhostname"),
                Configuration.getProperties("dbusername"),Configuration.getProperties("dbpassword"));
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("Select * from employees");

        resultSet.next();
        resultSet.next();
        resultSet.next();
        String myFirstData = resultSet.getString("first_name");
        System.out.println(myFirstData);
        resultSet.next();
        System.out.println(resultSet.getObject("first_name"));
        resultSet.next();
        System.out.println(resultSet.getObject("employee_id"));
        System.out.println(resultSet.getRow());

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        System.out.println(resultSetMetaData.getColumnCount());
        System.out.println(resultSetMetaData.getColumnName(5));
        System.out.println(resultSetMetaData.getColumnType(5));

        List<Map<String,Object>> listOfMaps = new ArrayList<>();
        resultSet.next();
        while (resultSet.next()) {
            Map<String, Object> row = new HashMap<String, Object>();
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++){
                row.put(resultSetMetaData.getColumnName(i), resultSet.getObject(resultSetMetaData.getColumnName(i)));
        }
            listOfMaps.add(row);
        }
        for(int i=0;i<listOfMaps.size();i++){
            for (Object key:
                 listOfMaps.get(i).keySet()) {
                System.out.println(listOfMaps.get(i).get(key));
            }
        }



    }
}
