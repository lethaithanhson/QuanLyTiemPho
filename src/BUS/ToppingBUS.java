/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ToppingDAO;
import DTO.Topping;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ToppingBUS {
    
    ToppingDAO tpDAO = new ToppingDAO();
    
    public ArrayList<Topping> getlistLoaiTopping (){
        return tpDAO.gettlistLoaiTopping();
    }
}
