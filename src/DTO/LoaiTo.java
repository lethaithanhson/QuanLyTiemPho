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
public class LoaiTo {
    private int maLoaiTo;
    private String tenLoaiTo;
    private int gia;

    public LoaiTo() {
    }

    public LoaiTo(int maLoaiTo, String tenLoaiTo, int gia) {
        this.maLoaiTo = maLoaiTo;
        this.tenLoaiTo = tenLoaiTo;
        this.gia = gia;
    }

    public int getMaLoaiTo() {
        return maLoaiTo;
    }

    public void setMaLoaiTo(int maLoaiTo) {
        this.maLoaiTo = maLoaiTo;
    }

    public String getTenLoaiTo() {
        return tenLoaiTo;
    }

    public void setTenLoaiTo(String tenLoaiTo) {
        this.tenLoaiTo = tenLoaiTo;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return this.tenLoaiTo;
    }
    
}
