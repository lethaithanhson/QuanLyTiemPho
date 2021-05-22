/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class dangnhapdao extends MyConnect{
    
    public dangnhapdao(){
        super();
    }
    public TaiKhoan checkDangNhapDAO(TaiKhoan tk){
        try {
            String sql = "select * from taikhoan where tenDangNhap = ? and matKhau = ?";
            PreparedStatement pre = connect.prepareStatement(sql);
            pre.setString(1, tk.getTenDangNhap());
            pre.setString(2, tk.getMatKhau());
            ResultSet result = pre.executeQuery();
            while(result.next()){
                tk.setMaNhanVien(result.getInt(1));
                tk.setQuyen(result.getInt(4));
                return tk;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
