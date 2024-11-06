/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class HoadondichvuModel {
    private String Mahd;
   
    private String Maphong;
   
    private Date Ngaylap;
    private int Sodien;
    private int Sonuoc;
    private int Mang;
    private double Tiengiam;
    private double Thanhtien;
    private double Conno;
                    
    private String Tinhtranghd;
    
    public HoadondichvuModel(){
    
    }
    public HoadondichvuModel(String Mahd,String Maphong,Date Ngaylap,int Sodien,int Sonuoc,int Mang,double Tiengiam,double Thanhtien,double Conno, String Tinhtranghd){
        this.Mahd = Mahd;
       
        this.Maphong = Maphong;
        
        this.Ngaylap = Ngaylap;
        this.Sodien = Sodien;
        this.Sonuoc = Sonuoc;
        this.Mang = Mang;
        this.Tiengiam=Tiengiam;
        this.Thanhtien=Thanhtien;
        this.Conno=Conno;
        this.Tinhtranghd = Tinhtranghd;
    }

    public String getMahd() {
        return Mahd;
    }

    public void setMahd(String Mahd) {
        this.Mahd = Mahd;
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    

    public Date getNgaylap() {
        return Ngaylap;
    }

    public void setNgaylap(Date Ngaylap) {
        this.Ngaylap = Ngaylap;
    }

    public int getSodien() {
        return Sodien;
    }

    public void setSodien(int Sodien) {
        this.Sodien = Sodien;
    }

    public int getSonuoc() {
        return Sonuoc;
    }

    public void setSonuoc(int Sonuoc) {
        this.Sonuoc = Sonuoc;
    }

    public int getMang() {
        return Mang;
    }

    public void setMang(int Mang) {
        this.Mang = Mang;
    }

    public String getTinhtranghd() {
        return Tinhtranghd;
    }

    public void setTinhtranghd(String Tinhtranghd) {
        this.Tinhtranghd = Tinhtranghd;
    }

    public double getTiengiam() {
        return Tiengiam;
    }

    public void setTiengiam(double Tiengiam) {
        this.Tiengiam = Tiengiam;
    }

    public double getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(double Thanhtien) {
        this.Thanhtien = Thanhtien;
    }

    public double getConno() {
        return Conno;
    }

    public void setConno(double Conno) {
        this.Conno = Conno;
    }
    
}
