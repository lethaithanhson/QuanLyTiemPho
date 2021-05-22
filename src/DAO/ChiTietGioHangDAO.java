/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietGioHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ChiTietGioHangDAO extends MyConnect{

    public ChiTietGioHangDAO() {
        super();
    }
    
    public boolean themMonAn(ChiTietGioHang ctgh){
        boolean flag =false;
        try {
            String sql = "INSERT INTO chitietgiohang(maGioHang, maLoaiMon, tenMon, soLuong, donGia, thanhTien) "
                    + "VALUES(?,?,?,?,?,?)";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, ctgh.getMaGioHang());
            pre.setInt(2, ctgh.getMaLoaiMon());
            pre.setString(3, ctgh.getTenMon());
            pre.setInt(4, ctgh.getSoLuong());
            pre.setInt(5, ctgh.getDonGia());
            pre.setInt(6, ctgh.getThanhTien());
            if(pre.executeUpdate() >0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public ArrayList<ChiTietGioHang> getlistChiTietGH(int magh){
        ArrayList<ChiTietGioHang> dsctgh = new ArrayList<>();
        try {
             String sql = "SELECT * FROM chitietgiohang WHERE maGioHang = "+magh;
             Statement st =connect.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 ChiTietGioHang ctgh = new ChiTietGioHang();
                 ctgh.setMaCTGH(rs.getInt(1));
                 ctgh.setMaGioHang(rs.getInt(2));
                 ctgh.setMaLoaiMon(rs.getInt(3));
                 ctgh.setTenMon(rs.getString(4));
                 ctgh.setSoLuong(rs.getInt(5));
                 ctgh.setDonGia(rs.getInt(6));
                 ctgh.setThanhTien(rs.getInt(7));
                 dsctgh.add(ctgh);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return dsctgh;
    }
    
    public boolean xoaMonAn(int macthd){
        boolean flag = false;
        try {
            String sql ="DELETE FROM chitietgiohang WHERE maCTGH = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, macthd);
            if(pre.executeUpdate() > 0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
