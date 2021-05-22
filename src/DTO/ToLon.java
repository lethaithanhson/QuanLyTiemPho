/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ToLon extends LoaiTo{
    private int maTo;
    private int maLoaiTo;
    private ArrayList<LoaiThit> dsthit;

    public ToLon() {
        super();
        dsthit = new  ArrayList<>();
    }

    public ToLon(int maTo, int maLoaiTo, ArrayList<LoaiThit> dsthit) {
        super();
        this.maTo = maTo;
        this.maLoaiTo = maLoaiTo;
        this.dsthit = dsthit;
    }

    public int getMaTo() {
        return maTo;
    }

    public void setMaTo(int maTo) {
        this.maTo = maTo;
    }

    public int getMaLoaiTo() {
        return maLoaiTo;
    }

    public void setMaLoaiTo(int maLoaiTo) {
        this.maLoaiTo = maLoaiTo;
    }

    public ArrayList<LoaiThit> getDsthit() {
        return dsthit;
    }

    public void setDsthit(ArrayList<LoaiThit> dsthit) {
        this.dsthit = dsthit;
    }

    
    
    
}
