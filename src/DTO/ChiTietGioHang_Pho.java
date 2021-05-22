/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author admin
 */
public class ChiTietGioHang_Pho extends GioHang{
    
    private int maTo;
    private String loaiThit;
    private int soLuong;
    private int donGia;

    public ChiTietGioHang_Pho() {
    }

    public int getMaTo() {
        return maTo;
    }

    public void setMaTo(int maTo) {
        this.maTo = maTo;
    }

    public String getLoaiThit() {
        return loaiThit;
    }

    public void setLoaiThit(String loaiThit) {
        this.loaiThit = loaiThit;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

}
