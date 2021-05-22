/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.TaiKhoanDAO;
import DTO.TaiKhoan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TaiKhoanBUS {
    TaiKhoanDAO taikhoanDAO = new TaiKhoanDAO();
    
    public ArrayList<TaiKhoan> getlistTaiKhoan(){
        return taikhoanDAO.getlistTaiKhoan();
    }
    
    public boolean themTaiKhoan(String ma , String taikhoan, String matkhau){
        int maNv = Integer.parseInt(ma.trim());
        taikhoan = taikhoan.trim();
        matkhau = matkhau.trim();
        int quyen = 1;
        if(taikhoan.equals("")){
            JOptionPane.showMessageDialog(null, "Tên đăng nhập không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(matkhau.equals("")){
            JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        TaiKhoan tk = new TaiKhoan();
        tk.setMaNhanVien(maNv);
        tk.setTenDangNhap(taikhoan);
        tk.setMatKhau(matkhau);
        tk.setQuyen(quyen);
        boolean check = taikhoanDAO.themTaiKhoan(tk);
        if(check){
            JOptionPane.showMessageDialog(null, "Thêm thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Thêm thất bại !","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public boolean checkTaiKhoan(String ma){
        int maNv = Integer.parseInt(ma.trim());
        if(taikhoanDAO.checkTaiKhoan(maNv)){
            JOptionPane.showMessageDialog(null, "Nhân viên đã có tài khoản !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    public boolean checkTaiKhoanDaXoa(String ma){
        int maNv = Integer.parseInt(ma.trim());
        if(taikhoanDAO.checkTaiKhoanDaXoa(maNv)){
            return true;
        }
        return false;
    }
    
    public boolean suaTaiKhoan(String ma,String tendn , String matkhau){
        int maTK = Integer.parseInt(ma.trim());
        tendn = tendn.trim();
        matkhau = matkhau.trim();
        if(tendn.equals("")){
            JOptionPane.showMessageDialog(null, "Tên đăng nhập không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(matkhau.equals("")){
            JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        TaiKhoan tk = new TaiKhoan();
        tk.setMaNhanVien(maTK);
        tk.setTenDangNhap(tendn);
        tk.setMatKhau(matkhau);
        boolean check = taikhoanDAO.suaTaiKhoan(tk);
        if(check){
            JOptionPane.showMessageDialog(null, "Sửa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sửa thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public boolean xoaTaiKhoan(String ma){
        int maTK = Integer.parseInt(ma.trim());
        boolean check = taikhoanDAO.xoaTaiKhoan(maTK);
        if(check){
            JOptionPane.showMessageDialog(null, "Xoá tài khoản thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Xoá tài khoản thất bại !","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public boolean khoiphucTaiKhoanDaXoa (String ma, String taikhoan, String matkhau){
        int maNv = Integer.parseInt(ma.trim());
        taikhoan = taikhoan.trim();
        matkhau = matkhau.trim();
        if(taikhoan.equals("")){
            JOptionPane.showMessageDialog(null, "Tên đăng nhập không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(matkhau.equals("")){
            JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        TaiKhoan tk = new TaiKhoan();
        tk.setMaNhanVien(maNv);
        tk.setTenDangNhap(taikhoan);
        tk.setMatKhau(matkhau);
        boolean check = taikhoanDAO.khoiphucTaiKhoanDaXoa(tk);
        if(check){
            JOptionPane.showMessageDialog(null, "Thêm thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Thêm thất bại !","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public boolean checkTenBiTrung(String ten){
        ten = ten.trim();
        if(taikhoanDAO.checkTenBiTrung(ten)){
            JOptionPane.showMessageDialog(null, "Tên tài khoản đã có người sử dụng !","Thông báo",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
}
