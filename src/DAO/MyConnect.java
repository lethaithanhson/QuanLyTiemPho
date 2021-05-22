/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MyConnect {

    protected Connection connect = null;
    private String hostname = "localhost";
    private String user = "root";
    private String password = "";
    private String database = "dbtiempho";

    public MyConnect() {
        try {
            String str = "jdbc:mysql://" + hostname + "/" + database + "?useUnicode=true&charracterEncoding=utf-8";
            Properties pro = new Properties();
            pro.put("user", user);
            pro.put("[password", password);
            
            Driver driver = new Driver();
            connect = driver.connect(str, pro);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không kết nối được tới CSDL", "Thông báo", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }

}
