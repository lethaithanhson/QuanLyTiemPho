/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class BanLonDao extends MyConnect{

    public BanLonDao() {
        super();
    }
    public boolean checkBanCoKhack(String maban) {
        try {
            String sql = "SELECT * FROM banlon WHERE maBan = ? AND tinhTrang = 1";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, maban);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean BanDaCoKhack(String maban){
        boolean flag = false ;
        try {
            String sql = "UPDATE banlon SET tinhTrang=1 WHERE maBan = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, maban);
            if(pre.executeUpdate()>0){
                flag=true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    public boolean updateTinhTrangBan(){
        boolean flag = false;
        try {
            String sql = "UPDATE banlon, giohang SET banlon.tinhTrang = 0 WHERE banlon.maBan = giohang.maBan AND giohang.tinhTrang = 0";
            Statement st = connect.createStatement();
            if(st.executeUpdate(sql)>0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
