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
public class LoaiBan {
    private int maLoaiBan;
    private String tenLoaiBan;
    private int soLuong;

    public LoaiBan() {
    }

    public LoaiBan(int maLoaiBan, String tenLoaiBan, int soLuong) {
        this.maLoaiBan = maLoaiBan;
        this.tenLoaiBan = tenLoaiBan;
        this.soLuong = soLuong;
    }

    public int getMaLoaiBan() {
        return maLoaiBan;
    }

    public void setMaLoaiBan(int maLoaiBan) {
        this.maLoaiBan = maLoaiBan;
    }

    public String getTenLoaiBan() {
        return tenLoaiBan;
    }

    public void setTenLoaiBan(String tenLoaiBan) {
        this.tenLoaiBan = tenLoaiBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
