/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author phamd
 */
public class PhongModel {
    private String map;
    private String loaiphong;
    private double Giaphong;
    private String tinhtrang;
    private int songuoio;
    private int soluongtd;
    private String mota;

    public PhongModel() {
    }

    public PhongModel(String map, String loaiphong, double Giaphong, String tinhtrang, int songuoio, int soluongtd, String mota) {
        this.map = map;
        this.loaiphong = loaiphong;
        this.Giaphong = Giaphong;
        this.tinhtrang = tinhtrang;
        this.songuoio = songuoio;
        this.soluongtd = soluongtd;
        this.mota = mota;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public double getGiaphong() {
        return Giaphong;
    }

    public void setGiaphong(double Giaphong) {
        this.Giaphong = Giaphong;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getSonguoio() {
        return songuoio;
    }

    public void setSonguoio(int songuoio) {
        this.songuoio = songuoio;
    }

    public int getSoluongtd() {
        return soluongtd;
    }

    public void setSoluongtd(int soluongtd) {
        this.soluongtd = soluongtd;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
    
}
