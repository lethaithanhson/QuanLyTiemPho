/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChiTietGioHangDAO;
import DAO.LoaiToDAO;
import DAO.ToppingDAO;
import DTO.ChiTietGioHang;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ChiTietGioHangBUS {
    
    ChiTietGioHangDAO ctghDAO = new ChiTietGioHangDAO();
    
    public boolean themPho(int magiohang,boolean pho, int maloaito, String loaithit, String soluong){
        LoaiToDAO loaitoDAO = new LoaiToDAO();
//        int maGH = Integer.parseInt(magiohang);
//        int malt = Integer.parseInt(maloaito);
        
        loaithit = loaithit.trim();
        loaithit = loaithit.substring(0, loaithit.length() -2);
        String tenmon = "Phở "+loaitoDAO.timTenTheoMa(maloaito)+ " - "+loaithit;
        
        int mamon;
        if(pho){
            mamon = 1;
        } else {
            return false;
        }
        
        int sl = Integer.parseInt(soluong);
        int gia;
        if(loaitoDAO.timGiaTheoMa(maloaito) == -1){
            return false;
        } else{
            gia = loaitoDAO.timGiaTheoMa(maloaito);
        }
        int tien =sl*gia;
        
        
        ChiTietGioHang ctgh = new ChiTietGioHang();
        ctgh.setMaGioHang(magiohang);
        ctgh.setMaLoaiMon(mamon);
        ctgh.setTenMon(tenmon);
        ctgh.setSoLuong(sl);
        ctgh.setDonGia(gia);
        ctgh.setThanhTien(tien);
        boolean check = ctghDAO.themMonAn(ctgh);
        if(check){
            return true;
        }
        return false;
    }
    
    
    public ArrayList<ChiTietGioHang> getlistChiTietGH(int magh){
        return ctghDAO.getlistChiTietGH(magh);
    }
    
    public boolean themTopping(int magh, boolean pho, int matopping, String tenloaitopping, String soluong){
        ToppingDAO tpDAO = new ToppingDAO();
        int mamon;
        if(pho){
            return false;
        } else {
            mamon = 2;
        }
        int sl = Integer.parseInt(soluong);
        tenloaitopping = tenloaitopping.trim();
        
        int gia;
        if(tpDAO.getGiaTheoMa(matopping) == -1){
            return false;
        } else{
            gia = tpDAO.getGiaTheoMa(matopping);
        }
        int tien =sl*gia;
        ChiTietGioHang ctgh = new ChiTietGioHang();
        ctgh.setMaGioHang(magh);
        ctgh.setMaLoaiMon(mamon);
        ctgh.setTenMon(tenloaitopping);
        ctgh.setSoLuong(sl);
        ctgh.setDonGia(gia);
        ctgh.setThanhTien(tien);
        boolean check = ctghDAO.themMonAn(ctgh);
        if(check){
            return true;
        }
        return false;
    }
    
    public boolean xoaMonAn(String macthd){
        int ma = Integer.parseInt(macthd);
        return ctghDAO.xoaMonAn(ma);
    }
}
