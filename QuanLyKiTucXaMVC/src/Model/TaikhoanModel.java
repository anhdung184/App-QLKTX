/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phamd
 */
public class TaikhoanModel {
    private String id;
    private String manv;
    private String tendangnhap;
    private String matkhau;

    public TaikhoanModel() {
    }

    public TaikhoanModel(String id, String manv, String tendangnhap, String matkhau) {
        this.id = id;
        this.manv = manv;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    
}
