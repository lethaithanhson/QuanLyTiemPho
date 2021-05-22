/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiToDAO;
import DTO.LoaiTo;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class LoaiToBUS {
    
    private LoaiToDAO ltDAO = new LoaiToDAO();
    
    public ArrayList<LoaiTo> getlistLoaiTo(){
        return ltDAO.getlistLoaiTo();
    }
}
