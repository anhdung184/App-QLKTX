/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.HopdongModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author phamd
 */
public class HopDongDAO {
     public ArrayList<HopdongModel> getListHopdong(){
        ArrayList<HopdongModel> list=new ArrayList<>();
        String sql="SELECT * FROM hopdong";
        try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    HopdongModel hd = new HopdongModel();
                    hd.setMahd(rs.getString("Mahd"));
                    hd.setManv(rs.getString("Manv"));
                    hd.setMap(rs.getString("Maphong"));
                    hd.setMasv(rs.getString("Masv"));
                    hd.setNgaylap(rs.getDate("Ngaylap"));
                    hd.setNgayden(rs.getDate("Ngayden"));
                    hd.setNgaytra(rs.getDate("Ngayhethan"));
                    hd.setTienphong(rs.getDouble("Tienphong"));
                    hd.setTiencoc(rs.getDouble("Tiencoc"));
                    hd.setTinhtrang(rs.getString("Tinhtrang"));
                    list.add(hd);
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
     // $sql="SELECT Mahd FROM `hopdong` WHERE Mahd=(SELECT MAX(Mahd) FROM `hopdong`);";
   
     public static String loaima;
     
     
     public static String Taoma(String tenbang, String key) {
          
                String sql="SELECT "+ key +" FROM " + tenbang +" WHERE "+ key +"=(SELECT MAX("+ key +") FROM " + tenbang +")";
           try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    HopdongModel hd = new HopdongModel();
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
     
     
      public void ThemHopdong(HopdongModel hd){
        String sql="INSERT INTO `hopdong`(`Mahd`, `Manv`, `Maphong`, `Masv`, `Ngaylap`, `Ngayden`, `Ngayhethan`, `Tienphong`, `Tiencoc`, `Tinhtrang`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, hd.getMahd());
                rs.setString(2, hd.getManv());
                rs.setString(3, hd.getMap());
                rs.setString(4, hd.getMasv());
                rs.setDate(5,new Date(hd.getNgaylap().getTime()));
                rs.setDate(6,new Date(hd.getNgayden().getTime()));
                rs.setDate(7,new Date(hd.getNgaytra().getTime()));
                rs.setDouble(8, hd.getTienphong());
                rs.setDouble(9, hd.getTiencoc());
                rs.setString(10, hd.getTinhtrang());
                
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
      
      
    public void XoaHopdong(String mahd){
        String sql="DELETE FROM `hopdong` WHERE Mahd=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,mahd);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
    
     public void SuaphongkhixoaHD(HopdongModel mahd){
        String sql="UPDATE `hopdong` SET `Tinhtrang`='Đã kết thúc' WHERE `Mahd`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, mahd.getMahd());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    
}
