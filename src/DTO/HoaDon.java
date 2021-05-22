/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author admin
 */
public class HoaDon {
    private int maHoaDon;
    private int maGiohang;
    private String maBan;
    private int maNvQuay;
    private int maNvYeuCau;
    private int maNvThanhToan;
    private Date ngayLap;
    private int tongTien;

    public HoaDon() {
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaBan() {
        return maBan;
    }

    public int getMaGiohang() {
        return maGiohang;
    }

    public void setMaGiohang(int maGiohang) {
        this.maGiohang = maGiohang;
    }
    
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }


    public int getMaNvQuay() {
        return maNvQuay;
    }

    public void setMaNvQuay(int maNvQuay) {
        this.maNvQuay = maNvQuay;
    }

    public int getMaNvYeuCau() {
        return maNvYeuCau;
    }

    public void setMaNvYeuCau(int maNvYeuCau) {
        this.maNvYeuCau = maNvYeuCau;
    }

    public int getMaNvThanhToan() {
        return maNvThanhToan;
    }

    public void setMaNvThanhToan(int maNvThanhToan) {
        this.maNvThanhToan = maNvThanhToan;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
