/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.BanLonDao;

/**
 *
 * @author admin
 */
public class BanLonBUS {
    
    private BanLonDao blDAO = new BanLonDao();
    
    public boolean checkBanCoKhach(String maban){
        maban = maban.trim();
        return blDAO.checkBanCoKhack(maban);
    }
    
    public boolean BanDaCoKhack(String maban){
        maban= maban.trim();
        return blDAO.BanDaCoKhack(maban);
    }
    public boolean updateTinhTrangBan(){
        return blDAO.updateTinhTrangBan();
    }
}
