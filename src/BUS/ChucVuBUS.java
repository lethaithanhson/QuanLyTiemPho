/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChucVuDAO;
import DTO.ChucVu;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ChucVuBUS {
    
    private ChucVuDAO chucvuDAO = new ChucVuDAO();
    
    public ArrayList<ChucVu> getlistChucVu(){
        return chucvuDAO.getlistChucVu();
    }
    
    public String getChucVuTheoMa(int maCV){
        return chucvuDAO.getChucVuTheoMa(maCV);
    }
}
