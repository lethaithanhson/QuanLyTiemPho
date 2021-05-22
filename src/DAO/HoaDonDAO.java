/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChiTietGioHang;
import DTO.GioHang;
import DTO.HoaDon;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class HoaDonDAO extends MyConnect{

    public HoaDonDAO() {
        super();
    }
    
    public boolean taoHoaDon(int nv1, int nv2 , String maban, int magiohang){
        boolean flag = false;
        try {
            String sql = "INSERT INTO hoadon(maGioHang, maBan, maNVNhanYeuCau, maNVThanhToan) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, magiohang);
            pre.setString(2, maban);
            pre.setInt(3, nv1);
            pre.setInt(4, nv2);
            if(pre.executeUpdate() >0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public int getmaHoaDonTheoMaGH(int magh){
        try {
            String sql ="SELECT maHoaDon FROM hoadon WHERE maGioHang = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, magh);
            ResultSet result = pre.executeQuery();
            if(result.next()){
                return result.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public ArrayList<HoaDon> getlistHoaDonTheomaGH(int magh){
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        try {
            String sql = "SELECT * FROM hoadon WHERE maGioHang =?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, magh);
            ResultSet rs= pre.executeQuery();
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaBan(rs.getString(3));
                hd.setMaNvYeuCau(rs.getInt(5));
                hd.setMaNvThanhToan(rs.getInt(6));
                dshoadon.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshoadon;
    }

    public boolean updateHoaDon(HoaDon hd){
        boolean flag = false;
        try {
            String sql = "UPDATE hoadon SET ngayLap = ?, maNVQuay = ?, tongTien = ? WHERE maGioHang = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setObject(1,hd.getNgayLap());
            pre.setInt(2, hd.getMaNvQuay());
            pre.setInt(3, hd.getTongTien());
            pre.setInt(4, hd.getMaGiohang());
            if(pre.executeUpdate() > 0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public ArrayList<HoaDon> getlistHoaDon(){
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        try {
            String sql = "SELECT * FROM hoadon WHERE ngayLap IS NOT null";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaGiohang(rs.getInt(2));
                hd.setMaBan(rs.getString(3));
                hd.setNgayLap(rs.getTimestamp(4));
                hd.setMaNvYeuCau(rs.getInt(5));
                hd.setMaNvThanhToan(rs.getInt(6));
                hd.setMaNvQuay(rs.getInt(7));
                hd.setTongTien(rs.getInt(8));
                dshoadon.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshoadon;
    }
    
    public HoaDon getHoaDonTheoma(int ma){
        HoaDon hd = new HoaDon();
        try {
            String sql = "SELECT * FROM hoadon WHERE maHoaDon = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                hd.setMaGiohang(rs.getInt(2));
                hd.setMaBan(rs.getString(3));
                hd.setNgayLap(rs.getTimestamp(4));
                hd.setMaNvYeuCau(rs.getInt(5));
                hd.setMaNvThanhToan(rs.getInt(6));
                hd.setMaNvQuay(rs.getInt(7));
                hd.setTongTien(rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }
    public ArrayList<HoaDon> locTheoDate(String date){
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        try {
            String sql = "SELECT * FROM hoadon WHERE DATE(ngayLap) = '" +date+"'";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaGiohang(rs.getInt(2));
                hd.setMaBan(rs.getString(3));
                hd.setNgayLap(rs.getTimestamp(4));
                hd.setMaNvYeuCau(rs.getInt(5));
                hd.setMaNvThanhToan(rs.getInt(6));
                hd.setMaNvQuay(rs.getInt(7));
                hd.setTongTien(rs.getInt(8));
                dshoadon.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshoadon;
    }
    public ArrayList<HoaDon> locTheoThangNam(int month, int year){
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `hoadon` WHERE month(`ngayLap`) = ? AND year(`ngayLap`) = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, month);
            pre.setInt(2, year);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaGiohang(rs.getInt(2));
                hd.setMaBan(rs.getString(3));
                hd.setNgayLap(rs.getTimestamp(4));
                hd.setMaNvYeuCau(rs.getInt(5));
                hd.setMaNvThanhToan(rs.getInt(6));
                hd.setMaNvQuay(rs.getInt(7));
                hd.setTongTien(rs.getInt(8));
                dshoadon.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshoadon;
    }
    
    public ArrayList<HoaDon> locTheoNam(int year){
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `hoadon` WHERE year(`ngayLap`) = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, year);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaGiohang(rs.getInt(2));
                hd.setMaBan(rs.getString(3));
                hd.setNgayLap(rs.getTimestamp(4));
                hd.setMaNvYeuCau(rs.getInt(5));
                hd.setMaNvThanhToan(rs.getInt(6));
                hd.setMaNvQuay(rs.getInt(7));
                hd.setTongTien(rs.getInt(8));
                dshoadon.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dshoadon;
    }
    
}
