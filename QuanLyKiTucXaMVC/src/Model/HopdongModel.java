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
public class HopdongModel {
    private String mahd;
    private String manv;
    private String map;
    private String masv;
    private Date ngaylap;
     private Date ngayden;
    private Date ngaytra;
    private double tienphong;
    private double tiencoc;
    private String tinhtrang;

    public HopdongModel() {
    }

    public HopdongModel(String mahd, String manv, String map, String masv, Date ngaylap, Date ngayden, Date ngaytra, double tienphong, double tiencoc, String tinhtrang) {
        this.mahd = mahd;
        this.manv = manv;
        this.map = map;
        this.masv = masv;
        this.ngaylap = ngaylap;
        this.ngayden = ngayden;
        this.ngaytra = ngaytra;
        this.tienphong = tienphong;
        this.tiencoc = tiencoc;
        this.tinhtrang = tinhtrang;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    public Date getNgayden() {
        return ngayden;
    }

    public void setNgayden(Date ngayden) {
        this.ngayden = ngayden;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public double getTienphong() {
        return tienphong;
    }

    public void setTienphong(double tienphong) {
        this.tienphong = tienphong;
    }

    public double getTiencoc() {
        return tiencoc;
    }

    public void setTiencoc(double tiencoc) {
        this.tiencoc = tiencoc;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
  
}
