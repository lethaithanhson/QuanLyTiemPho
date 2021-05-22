/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ChucVu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ChucVuDAO extends MyConnect{

    public ChucVuDAO() {
        super();
    }
    
    public ArrayList<ChucVu> getlistChucVu(){
        ArrayList<ChucVu> dschucvu = new ArrayList<>();
        try {
            String sql = "SELECT * FROM chucvu WHERE maChucVu != 0";
            Statement st = connect.createStatement();
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                ChucVu cv = new ChucVu();
                cv.setMaChucVu(result.getInt(1));
                cv.setTenChucVu(result.getString(2));
                dschucvu.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dschucvu;
    }
    
    public String getChucVuTheoMa(int ma){
        try {
            String sql = "SELECT tenChucVu FROM chucvu WHERE maChucVu ="+ma;
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
