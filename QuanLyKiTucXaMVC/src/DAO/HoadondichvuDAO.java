/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.HoadondichvuModel;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class HoadondichvuDAO {
    public ArrayList<HoadondichvuModel> getListHoadon(){
        ArrayList<HoadondichvuModel> list=new ArrayList<>();
        String sql="SELECT * FROM hoadon";
        try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    HoadondichvuModel s = new HoadondichvuModel();
                    s.setMahd(rs.getString("Mahd"));
                    s.setMaphong(rs.getString("Maphong"));

                    s.setNgaylap(rs.getDate("Ngaylap"));
                    s.setSodien(rs.getInt("Sodien"));
                    s.setSonuoc(rs.getInt("Sonuoc"));
                    s.setMang(rs.getInt("Mang"));
                    s.setTiengiam(rs.getDouble("Tiengiam"));
                    s.setThanhtien(rs.getDouble("Thanhtien"));
                    s.setConno(rs.getDouble("Conno"));
                    s.setTinhtranghd(rs.getString("Tinhtranghd"));
                    
                    list.add(s);
                     System.err.println(list);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
        return list;
}

public void ThemHoadon(HoadondichvuModel s){
        String sql="INSERT INTO `hoadon`(`Mahd`, `Maphong`, `Ngaylap`, `Sodien`, `Sonuoc`,`Mang` ,`Tiengiam` ,`Thanhtien` ,`Conno` ,`Tinhtranghd` ) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?,?,?,?);";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, s.getMahd());
                rs.setString(2, s.getMaphong());
               
                rs.setDate(3, new Date(s.getNgaylap().getTime()));
                rs.setInt(4, s.getSodien());
                rs.setInt(5, s.getSonuoc());
                rs.setInt(6, s.getMang());
                rs.setDouble(7, s.getTiengiam());
                rs.setDouble(8, s.getThanhtien());
                rs.setDouble(9, s.getConno());
                rs.setString(10, s.getTinhtranghd());
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
public static String loaima;
public static String Taoma(String tenbang, String key) {
          
                String sql="SELECT "+ key +" FROM " + tenbang +" WHERE "+ key +"=(SELECT MAX("+ key +") FROM " + tenbang +")";
           try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    HoadondichvuModel hd = new HoadondichvuModel();
                    loaima = rs.getString(key);
                    
                 
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
           System.err.println(loaima);
           return loaima;
    }

public void XoaHoadon(String Mahd){
        String sql="DELETE FROM `hoadon` WHERE Mahd=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,Mahd);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }

public ArrayList<HoadondichvuModel> Timkiem(String timkiem){
        ArrayList<HoadondichvuModel> list= new ArrayList<>();
        String sql= "Select * from hoadon where Mahd like ? or Maphong like ?";
        String tkhd;
            tkhd="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tkhd);
                  rs.setString(2, tkhd);
          
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    HoadondichvuModel s = new HoadondichvuModel();
                    s.setMahd(tk.getString("Mahd"));
                    s.setMaphong(tk.getString("Maphong"));
                   
                    s.setNgaylap(tk.getDate("Ngaylap"));
                    s.setSodien(tk.getInt("Sodien"));
                    s.setSonuoc(tk.getInt("Sonuoc"));
                    s.setMang(tk.getInt("Mang"));
                    s.setTiengiam(tk.getDouble("Tiengiam"));
                    s.setThanhtien(tk.getDouble("Thanhtien"));
                    s.setConno(tk.getDouble("Conno"));
                    
                    s.setTinhtranghd(tk.getString("Tinhtranghd"));
                   
                    list.add(s);
                   
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
    
       
        return list;
    }
public ArrayList<HoadondichvuModel> CheckMahd(String Mahd){
        ArrayList<HoadondichvuModel> list= new ArrayList<>();
        String sql= "Select * from hoadon where Mahd = ? ";
       
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, Mahd);
                 ResultSet check=rs.executeQuery();
                  System.out.println(sql);
                 while (check.next()) {
                    HoadondichvuModel s = new HoadondichvuModel();
                    s.setMahd(check.getString("Mahd"));
                    s.setMaphong(check.getString("Maphong"));
                  
                    s.setNgaylap(check.getDate("Ngaylap"));
                    s.setSodien(check.getInt("Sodien"));
                    s.setSonuoc(check.getInt("Sonuoc"));
                    s.setMang(check.getInt("Mang"));
                     s.setTiengiam(check.getDouble("Tiengiam"));
                    s.setThanhtien(check.getDouble("Thanhtien"));
                    s.setConno(check.getDouble("Conno"));
                    s.setTinhtranghd(check.getString("Tinhtranghd"));
                   
                    list.add(s);
                   
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
        return list;
    }
}