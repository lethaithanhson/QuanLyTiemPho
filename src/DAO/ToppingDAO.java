/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Topping;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ToppingDAO extends MyConnect{

    public ToppingDAO() {
        super();
    }
    
    public ArrayList<Topping> gettlistLoaiTopping(){
        ArrayList<Topping> dsLoaiTopping = new ArrayList<>();
        try {
            String sql = "SELECT * FROM loaitopping";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Topping tp = new Topping();
                tp.setMaTopping(rs.getInt(1));
                tp.setTenTopping(rs.getString(2));
                tp.setGia(rs.getInt(3));
                dsLoaiTopping.add(tp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsLoaiTopping;
    }
    
    public int getGiaTheoMa(int ma){
        try {
            String sql = "SELECT gia FROM loaitopping WHERE maloai = "+ma;
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
