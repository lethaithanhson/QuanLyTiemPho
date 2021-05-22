/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.BanNhoDAO;

/**
 *
 * @author admin
 */
public class BanNhoBUS {
    
    private BanNhoDAO bnDAO = new BanNhoDAO();
    
    public boolean checkBanCoKhach(String maban){
        maban = maban.trim();
        return bnDAO.checkBanCoKhack(maban);
    }
    
    public boolean BanDaCoKhack(String maban){
        maban= maban.trim();
        return bnDAO.BanDaCoKhack(maban);
    }
   
    public boolean updateTinhTrangBan(){
        return bnDAO.updateTinhTrangBan();
    }
}
