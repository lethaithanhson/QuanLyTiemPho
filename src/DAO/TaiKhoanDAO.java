/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TaiKhoanDAO extends MyConnect{
    
    public ArrayList<TaiKhoan> getlistTaiKhoan(){
        ArrayList<TaiKhoan> dstk = new ArrayList<>();
        try {
            String sql = "SELECT * FROM taikhoan WHERE quyen !=0 AND trangThai = 1";
            Statement st= connect.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                TaiKhoan tk = new TaiKhoan();
                tk.setMaNhanVien(rs.getInt(1));
                tk.setTenDangNhap(rs.getString(2));
                tk.setMatKhau(rs.getString(3));
                tk.setQuyen(rs.getInt(4));
                dstk.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dstk;
    }
    
    public boolean themTaiKhoan(TaiKhoan tk){
        boolean flag = false;
        try {
            String sql = "INSERT INTO taikhoan (maTaiKhoan, tenDangNhap,matKhau,quyen) VALUES (?,?,?,?)";
            PreparedStatement pre  = connect.prepareStatement(sql);
            pre.setInt(1, tk.getMaNhanVien());
            pre.setString(2, tk.getTenDangNhap());
            pre.setString(3, tk.getMatKhau());
            pre.setInt(4, tk.getQuyen());
            if(pre.executeUpdate() > 0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean checkTaiKhoan(int ma){
        try {
            String sql = "SELECT * FROM taikhoan WHERE maTaiKhoan ="+ma +" AND trangThai = 1";
            Statement st = connect.createStatement();
            ResultSet result = st.executeQuery(sql);
            return result.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean checkTaiKhoanDaXoa(int ma){
        try {
            String sql = "SELECT * FROM taikhoan WHERE maTaiKhoan ="+ma+ " AND trangThai = 0";
            Statement st = connect.createStatement();
            ResultSet result = st.executeQuery(sql);
            return result.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean suaTaiKhoan(TaiKhoan tk){
        boolean flag = false;
        try {
            String sql ="UPDATE taikhoan SET tenDangNhap = ?, matKhau = ? WHERE maTaiKhoan = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, tk.getTenDangNhap());
            pre.setString(2, tk.getMatKhau());
            pre.setInt(3, tk.getMaNhanVien());
            if(pre.executeUpdate() > 0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean xoaTaiKhoan(int ma){
        boolean flag = false;
        try {
            String sql = "UPDATE taikhoan SET trangThai = 0 WHERE maTaiKhoan = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setInt(1, ma);
            if(pre.executeUpdate() > 0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean  khoiphucTaiKhoanDaXoa(TaiKhoan tk){
        boolean flag= false;
        try {
            String sql = "UPDATE taikhoan SET tenDangNhap = ?, matKhau = ?, trangThai = 1 WHERE maTaiKhoan = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, tk.getTenDangNhap());
            pre.setString(2, tk.getMatKhau());
            pre.setInt(3, tk.getMaNhanVien());
            if (pre.executeUpdate() > 0){
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public boolean checkTenBiTrung(String ten){
        try {
            String sql = "SELECT * FROM taikhoan WHERE tenDangNhap = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, ten);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
