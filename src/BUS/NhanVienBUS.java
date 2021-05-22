/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.ChucVu;
import DTO.NhanVien;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class NhanVienBUS {
    
    NhanVienDAO nhanvienDAO = new NhanVienDAO();
    
    public String getTenTheoma (int manv){
        return nhanvienDAO.getTenNVTheoMa(manv);
    }
    
    public ArrayList<NhanVien> getListNhanvien(){
       return nhanvienDAO.getlistNhanvien();
    }
    
    public ArrayList<NhanVien> getListNhanvienPhucvu(){
       return nhanvienDAO.getlistNhanvienPhucvu();
    }
    
    public boolean themNhanVien(String ten, String sdt, String diachi, ChucVu chucvu, boolean gioitinh){
        ten = ten.trim();
        sdt = sdt.trim();
        diachi = diachi.trim();
        String gt = checkGioiTinh(gioitinh);
        if(ten.equals("")){
            JOptionPane.showMessageDialog(null, "Tên không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(chucvu ==null){
            JOptionPane.showMessageDialog(null, "Chức vụ không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        NhanVien nv = new NhanVien();
        nv.setTenNhanVien(ten);
        nv.setSoDienThoai(sdt);
        nv.setDiaChi(diachi);
        nv.setMaChucVu(chucvu.getMaChucVu());
        nv.setGioTinh(gt);
        boolean check = nhanvienDAO.themNhanVien(nv);
        if(check){
            JOptionPane.showMessageDialog(null, "Thêm thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Thêm thất bại !","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public String checkGioiTinh(boolean gt){
        if(gt) return "Nam";
        return "Nữ";
    }
    
    public boolean suaNhanVien(String ma , String ten , String sdt, String diachi, ChucVu chucvu ,boolean giotinh){
        int maNv = Integer.parseInt(ma.trim());
        ten = ten.trim();
        sdt = sdt.trim();
        diachi = diachi.trim();
        String gt = checkGioiTinh(giotinh);
        if(ten.equals("")){
            JOptionPane.showMessageDialog(null, "Tên không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(chucvu == null){
            JOptionPane.showMessageDialog(null, "Chức vụ không được để trống !","Thông báo",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(maNv);
        nv.setTenNhanVien(ten);
        nv.setSoDienThoai(sdt);
        nv.setDiaChi(diachi);
        nv.setMaChucVu(chucvu.getMaChucVu());
        nv.setGioTinh(gt);
        boolean check = nhanvienDAO.suaNhanVien(nv);
        if(check){
            JOptionPane.showMessageDialog(null, "Sửa thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sửa thất bại !","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public boolean xoaNhanVien(String ma){
        int maNv = Integer.parseInt(ma);
        boolean check = nhanvienDAO.xoaNhanVien(maNv);
        if(check){
            JOptionPane.showMessageDialog(null, "Xoá nhân viên thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Xoá nhân viên thất bại !","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public boolean checkChucVuTheoMaNV(String ma){
        int maNv = Integer.parseInt(ma.trim());
        if(nhanvienDAO.timChucVuTheoMaNV(maNv) != 1){
            JOptionPane.showMessageDialog(null, "Chỉ nhân viên quầy mới được tạo tài khoản","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
}
