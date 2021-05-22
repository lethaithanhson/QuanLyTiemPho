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
public class ChiTietGioHang_Topping extends GioHang{
    private int maTopping;
    private int soLuong;
    private int donGia;

    public ChiTietGioHang_Topping() {
    }

    public int getMaTopping() {
        return maTopping;
    }

    public void setMaTopping(int maTopping) {
        this.maTopping = maTopping;
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
