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
public class Topping {
    private int maTopping;
    private String tenTopping;
    private int gia;

    public Topping() {
    }

    public int getMaTopping() {
        return maTopping;
    }

    public void setMaTopping(int maTopping) {
        this.maTopping = maTopping;
    }

    public String getTenTopping() {
        return tenTopping;
    }

    public void setTenTopping(String tenTopping) {
        this.tenTopping = tenTopping;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return this.tenTopping;
    }
    
    
}
