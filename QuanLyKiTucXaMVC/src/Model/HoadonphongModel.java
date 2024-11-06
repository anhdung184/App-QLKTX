/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
/**
 *
 * @author ADMIN
 */
public class HoadonphongModel {
    private String mahdp;
    private String mahd;
    private Date ngaylaphdp;
    private double datra;
    private double conno;
    private String masv;
    private double tienphong;
    private double thanhtoan;

    
    public HoadonphongModel() {
    }

    public HoadonphongModel(String mahdp, String mahd, Date ngaylaphdp, double datra, double conno, String masv, double tienphong) {
        this.mahdp = mahdp;
        this.mahd = mahd;
        this.ngaylaphdp = ngaylaphdp;
        this.datra = datra;
        this.conno = conno;
        this.masv = masv;
        this.tienphong = tienphong;
    }
    
    public HoadonphongModel(String mahdp, String mahd, Date ngaylaphdp, double datra, double conno){
        this.mahdp = mahdp;
        this.mahd = mahd;
        this.ngaylaphdp = ngaylaphdp;
        this.datra = datra;
        this.conno = conno;
    }
    public String getMahdp() {
        return mahdp;
    }

    public void setMahdp(String mahdp) {
        this.mahdp = mahdp;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public Date getNgaylaphdp() {
        return ngaylaphdp;
    }

    public void setNgaylaphdp(Date ngaylaphdp) {
        this.ngaylaphdp = ngaylaphdp;
    }

    public double getDatra() {
        return datra;
    }

    public void setDatra(double datra) {
        this.datra = datra;
    }

    public double getConno() {
        return conno;
    }

    public void setConno(double conno) {
        this.conno = conno;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getTienphong() {
        return tienphong;
    }

    public void setTienphong(double tienphong) {
        this.tienphong = tienphong;
    }


    
    

}


