/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDon;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class HoaDonBUS {

    HoaDonDAO hoadonDAO = new HoaDonDAO();

    public boolean taoHoaDon(int nvyeucau, int nvthanhtoan, String maban, int maGT) {
        maban = maban.trim();
        if (nvyeucau == -1 || nvyeucau == 0) {
            JOptionPane.showMessageDialog(null, "Chọn nhân viên nhận yêu cầu gọi món của khách.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (nvthanhtoan == -1 || nvthanhtoan == 0) {
            JOptionPane.showMessageDialog(null, "Chọn nhân viên thanh toán cho khách.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        boolean check = hoadonDAO.taoHoaDon(nvyeucau, nvthanhtoan, maban, maGT);
        if (check) {
            return true;
        }
        return false;
    }

    public int getmaHoaDonTheoMaGH(int magh) {
        return hoadonDAO.getmaHoaDonTheoMaGH(magh);
    }

    public ArrayList<HoaDon> getlistHoaDonTheomaGH(int magh) {
        return hoadonDAO.getlistHoaDonTheomaGH(magh);
    }

    public boolean updateHoaDon(int magh, Date ngaylap, int maNVquay, int tongtien) {
        
        HoaDon hd = new HoaDon();
        hd.setMaGiohang(magh);
        hd.setNgayLap(ngaylap);
        hd.setMaNvQuay(maNVquay);
        hd.setTongTien(tongtien);
        boolean check = hoadonDAO.updateHoaDon(hd);
        if (check) {
            JOptionPane.showMessageDialog(null, "Thanh toán thành công.", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Thanh toán thất bại.", "", JOptionPane.ERROR_MESSAGE);
        }
        return check;
    }
    
    public ArrayList<HoaDon> getlistHoaDon(){
        return hoadonDAO.getlistHoaDon();
    }
    
    public String formatSo(int x){
        DecimalFormat dmf = new DecimalFormat("#,###");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
        dfs.setGroupingSeparator(',');
        dmf.setDecimalFormatSymbols(dfs);
        return dmf.format(x);
    }
    
    public String formatNgay(Date ngay){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(ngay);
    }
    
    public HoaDon getHoaDonTheoma(int ma){
        return hoadonDAO.getHoaDonTheoma(ma);
    }
    
    public ArrayList<HoaDon> locTheoDate(Date date){
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
       String ngay = sdf.format(date);
       return hoadonDAO.locTheoDate(ngay);
    }
    public ArrayList<HoaDon> locTheoThangNam( int month, int year){
        month += 1;
        return hoadonDAO.locTheoThangNam(month, year);
    }
    public ArrayList<HoaDon> locTheoNam(int year){
        return hoadonDAO.locTheoNam(year);
    }
}
