/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.GioHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class GioHangDAO extends MyConnect{

    public GioHangDAO() {
        super();
    }
    
    public boolean taoGioHang(String maban){
        boolean flag = false;
        try {
            String sql = "INSERT INTO giohang(maBan,tinhTrang) VALUES (?,1)";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, maban);
            if(pre.executeUpdate() >0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public int getMaGioHangbangMaBan(String maban){
        try {
            String sql ="SELECT maGioHang FROM giohang WHERE maBan = ? AND tinhTrang = 1";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, maban);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean updateTinhTrangGioHang(int magh){
        boolean flag = false;
        try {
            String sql = "UPDATE giohang SET tinhTrang = 0 WHERE maGioHang = "+magh;
            Statement st = connect.createStatement();
            if(st.executeUpdate(sql) >0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    public boolean checkThanhToan(int magh){
        boolean flag = false;
        try {
            String sql ="SELECT * FROM `giohang` WHERE `maGioHang` = ? AND `tinhTrang` = 0";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, magh);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
