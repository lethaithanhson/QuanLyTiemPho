/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiTo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class LoaiToDAO extends MyConnect{

    public LoaiToDAO() {
        super();
    }
    
    public ArrayList<LoaiTo> getlistLoaiTo(){
        ArrayList<LoaiTo> dsLoaiTo = new ArrayList<>();
        try {
            String sql = "SELECT * FROM loaito";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                LoaiTo lt = new LoaiTo();
                lt.setMaLoaiTo(rs.getInt(1));
                lt.setTenLoaiTo(rs.getString(2));
                lt.setGia(rs.getInt(3));
                dsLoaiTo.add(lt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsLoaiTo;
    }
    public int timGiaTheoMa(int ma){
        try {
            String sql = "SELECT gia FROM loaito WHERE maLoaiTo = ?";
            PreparedStatement pre  = connect.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public String timTenTheoMa(int ma){
        try {
            String sql = "SELECT tenLoaito FROM loaito WHERE maLoaiTo = ?";
            PreparedStatement pre  = connect.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) return rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
