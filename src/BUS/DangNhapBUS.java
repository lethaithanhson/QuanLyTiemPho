/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.dangnhapdao;
import DTO.TaiKhoan;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class DangNhapBUS {
    public static TaiKhoan taikhoanlogin = null;
    
    public TaiKhoan checkDangNhapBUS(String user, String password){
        if(user.trim().equals(""))return null;
        if(password.trim().equals(""))return null;
        dangnhapdao dangnhap = new dangnhapdao();
        TaiKhoan tk = new TaiKhoan();
        tk.setTenDangNhap(user);
        tk.setMatKhau(password);
        taikhoanlogin = dangnhap.checkDangNhapDAO(tk);
        if(taikhoanlogin == null){
            JOptionPane.showMessageDialog(null,"Sai thông tin đăng nhập");
        }
        return taikhoanlogin;
    }
}
