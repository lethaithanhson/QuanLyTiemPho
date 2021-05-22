/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class NhanVienDAO extends MyConnect{

    public NhanVienDAO() {
        super();
    }
    
    public ArrayList<NhanVien> getlistNhanvien(){
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        try {
            String sql = "SELECT * FROM nhanvien WHERE maNhanVien != 0";
            PreparedStatement pre = connect.prepareStatement(sql);
            ResultSet resul = pre.executeQuery();
            while(resul.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(resul.getInt(1));
                nv.setTenNhanVien(resul.getString(2));
                nv.setSoDienThoai(resul.getString(3));
                nv.setDiaChi(resul.getString(4));
                nv.setMaChucVu(resul.getInt(5));
                nv.setGioTinh(resul.getString(6));
                dsnv.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsnv;
    }
    
    public ArrayList<NhanVien> getlistNhanvienPhucvu(){
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        try {
            String sql = "SELECT * FROM nhanvien WHERE maChucVu = 3";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setSoDienThoai(rs.getString(3));
                nv.setDiaChi(rs.getString(4));
                nv.setMaChucVu(rs.getInt(5));
                nv.setGioTinh(rs.getString(6));
                dsnv.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsnv;
    }
    public String getTenNVTheoMa (int maNV){
        try {
            String sql = "SELECT tenNhanVien FROM nhanvien WHERE maNhanVien = ?";
            PreparedStatement pre =connect.prepareStatement(sql);
            pre.setInt(1, maNV);
            ResultSet resul = pre.executeQuery();
            while(resul.next()){
                return resul.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public boolean themNhanVien(NhanVien nv){
        boolean flag = false;
        try {
            String sql = "INSERT INTO nhanvien(tenNhanVien,sdtNhanVien,diaChi,maChucVu,gioiTinh)"
                    + " VALUES (?,?,?,?,?) ";
            PreparedStatement pre =connect.prepareStatement(sql);
            pre.setString(1, nv.getTenNhanVien());
            pre.setString(2, nv.getSoDienThoai());
            pre.setString(3, nv.getDiaChi());
            pre.setInt(4, nv.getMaChucVu());
            pre.setString(5, nv.getGioTinh());
            if(pre.executeUpdate()>0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean suaNhanVien(NhanVien nv){
        boolean flag = false;
        try {
            String sql = "UPDATE nhanvien SET tenNhanVien = ?,"
                    + "sdtNhanVien= ? ,diaChi= ? ,maChucVu= ? ,gioiTinh= ? WHERE maNhanVien = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, nv.getTenNhanVien());
            pre.setString(2, nv.getSoDienThoai());
            pre.setString(3, nv.getDiaChi());
            pre.setInt(4, nv.getMaChucVu());
            pre.setString(5, nv.getGioTinh());
            pre.setInt(6, nv.getMaNhanVien());
            if(pre.executeUpdate()>0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean xoaNhanVien(int ma){
        boolean flag = false;
        try {
            String sql = "DELETE FROM nhanvien WHERE maNhanVien = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, ma);
            if(pre.executeUpdate()>0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
     public int timChucVuTheoMaNV(int ma){
         try {
             String sql = "SELECT maChucVu FROM nhanvien WHERE maNhanVien ="+ ma;
             Statement st = connect.createStatement();
             ResultSet re = st.executeQuery(sql);
             if(re.next()){
                return re.getInt(1);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return -1;
     }
    
}
