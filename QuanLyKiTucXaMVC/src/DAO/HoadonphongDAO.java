/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.HoadonphongModel;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class HoadonphongDAO {
    public ArrayList<HoadonphongModel> getListHoadonphong(){
        ArrayList<HoadonphongModel> list = new ArrayList<>();
        String sql="SELECT * FROM hoadonphong INNER JOIN hopdong ON hoadonphong.mahd = hopdong.mahd ";
        try {
             ResultSet rs=null;
            
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    HoadonphongModel s = new HoadonphongModel();
                    s.setMahdp(rs.getString("Mahdp"));
                    s.setMahd(rs.getString("Mahd"));
                   
                    s.setNgaylaphdp(rs.getDate("Ngaylaphdp"));
                    s.setDatra(rs.getDouble("Datra"));
                    
                    s.setMasv(rs.getString("Masv"));
                    s.setTienphong(rs.getDouble("TienPhong"));
                    s.setConno(rs.getDouble("Conno"));
                    s.setConno(s.getTienphong()-s.getDatra());
                    list.add(s);
                     System.err.println(list);
                }
            } catch (Exception e) {
                 e.printStackTrace();
            }finally{
                // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void Themhoadonphong(HoadonphongModel s){
        String sql="INSERT INTO `hoadonphong`(`Mahdp`,`Mahd`,`Ngaylaphdp`,`Datra`,`Conno`)"+ "VALUES (?,?, ?, ?,? );";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, s.getMahdp());
                rs.setString(2, s.getMahd());
                rs.setDate(3, new Date(s.getNgaylaphdp().getTime()));
                rs.setDouble(4, s.getDatra());
                rs.setDouble(5, s.getConno());
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
                    HoadonphongModel hd = new HoadonphongModel();
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
    
    
    public void Xoahoadonphong(String mahdp){
        String sql="DELETE FROM `hoadonphong` WHERE Mahdp=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,mahdp);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
    
    public void Thanhtoan(HoadonphongModel s){
        String sql="UPDATE `hoadonphong` SET `Datra`=?,`Conno`=? WHERE `Mahdp`=?";
        try {
            PreparedStatement rs = null ;
            
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setDouble(1, s.getDatra());
                rs.setDouble(2, s.getConno());
                rs.setString(3, s.getMahdp());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    
    public ArrayList<HoadonphongModel> Timkiem(String timkiem){
        ArrayList<HoadonphongModel> list= new ArrayList<>();
        String sql= "Select * from hoadonphong inner join hopdong on hoadonphong.mahd = hopdong.mahd where Mahdp like ?";
        String tkhdp;
            tkhdp="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tkhdp);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    HoadonphongModel s = new HoadonphongModel();
                    s.setMahdp(tk.getString("Mahdp"));
                    s.setMahd(tk.getString("Mahd"));
                    
                    s.setNgaylaphdp(tk.getDate("Ngaylaphdp"));
                    s.setDatra(tk.getDouble("Datra"));
                    s.setConno(tk.getDouble("Conno"));
                    s.setMasv(tk.getString("Masv"));
                    s.setTienphong(tk.getDouble("Tienphong"));
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
    
     public ArrayList<HoadonphongModel> CheckMahdp(String mahdp){
        ArrayList<HoadonphongModel> list= new ArrayList<>();
        String sql= "Select * from hoadonphong where Mahdp = ? ";
       
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, mahdp);
                 ResultSet check=rs.executeQuery();
                  System.out.println(sql);
                 while (check.next()) {
                    HoadonphongModel s = new HoadonphongModel();
                    s.setMahdp(check.getString("Mahdp"));
                    s.setMahd(check.getString("Mahd"));
                    s.setNgaylaphdp(check.getDate("Ngaylaphdp"));
                    s.setDatra(check.getDouble("Datra"));
                    s.setConno(check.getDouble("Conno"));
                    s.setMasv(check.getString("Masv"));
                    s.setTienphong(check.getDouble("TienPhong"));
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
