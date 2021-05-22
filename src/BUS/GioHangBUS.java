/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.GioHangDAO;
import DTO.GioHang;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class GioHangBUS {
    
    private GioHangDAO ghDAO = new GioHangDAO();
    
    public boolean taoGioHang(String maban){
        maban = maban.trim();
        if(ghDAO.taoGioHang(maban)){
            return true;
        }
        return false;
    }
    
    public int getMaGioHangbangMaBan(String maban){
        maban = maban.trim();
        return ghDAO.getMaGioHangbangMaBan(maban);
    }
    public boolean updateTinhTrangGioHang(int magh){
        return ghDAO.updateTinhTrangGioHang(magh);
    }
    
    public boolean checkThanhToan(int magh){
//        int ma = Integer.parseInt(magh);
        return ghDAO.checkThanhToan(magh);
    }
}
