/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.PhongModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phamd
 */
public class PhongDAO {
     public ArrayList<PhongModel> getListPhong(){
        ArrayList<PhongModel> list=new ArrayList<>();
        String sql="SELECT * FROM phong";
        try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    PhongModel s = new PhongModel();
                    s.setMap(rs.getString("MaPhong"));
                    s.setLoaiphong(rs.getString("Loaiphong"));
                    s.setGiaphong(rs.getDouble("Giaphong"));
                    s.setTinhtrang(rs.getString("Tinhtrang"));
                    s.setSonguoio(rs.getInt("Songuoio"));
                    s.setSoluongtd(rs.getInt("Soluongtd"));
                    s.setMota(rs.getString("Mota"));
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
    
     public void ThemPhong(PhongModel p){
        String sql="INSERT INTO `phong`(`Maphong`, `Loaiphong`, `Giaphong`, `Tinhtrang`, `Songuoio`, `Soluongtd`, `Mota`) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, p.getMap());
                rs.setString(2, p.getLoaiphong());
                rs.setDouble(3, p.getGiaphong());
                rs.setString(4, p.getTinhtrang());
                rs.setInt(5, p.getSonguoio());
                rs.setInt(6, p.getSoluongtd());
                rs.setString(7, p.getMota());
                
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    
    
    public void XoaPhong(String map){
        String sql="DELETE FROM `phong` WHERE Maphong=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,map);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
    
    public void SuaPhong(PhongModel p){
        String sql="UPDATE `phong` SET `Loaiphong`=? ,`Giaphong`=? ,"
                + "`Tinhtrang`=? ,`Songuoio`=? ,`Soluongtd`=? ,`Mota`=?  WHERE `Maphong`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
             
               
                rs.setString(1, p.getLoaiphong());
                rs.setDouble(2, p.getGiaphong());
                rs.setString(3, p.getTinhtrang());
                rs.setInt(4, p.getSonguoio());
                rs.setInt(5, p.getSoluongtd());
                rs.setString(6, p.getMota());
                 rs.setString(7, p.getMap());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
        
 
   public void SuaphongkhithemHD(PhongModel p){
        String sql="UPDATE `phong` SET `Songuoio`= Songuoio+1 WHERE `Maphong`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, p.getMap());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
   
   public void SuaphongkhixoaHD(PhongModel p){
        String sql="UPDATE `phong` SET `Songuoio`= Songuoio-1 WHERE `Maphong`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, p.getMap());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
   
   
    public ArrayList<PhongModel> Timkiem(String timkiem){
        ArrayList<PhongModel> list= new ArrayList<>();
        String sql= "Select * from phong where Maphong like ? or Loaiphong like ? or Mota like ? ";
        String tkp;
            tkp="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tkp);
                  rs.setString(2, tkp);
                   rs.setString(3, tkp);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    PhongModel p = new PhongModel();
                    p.setMap(tk.getString("Maphong"));
                    p.setLoaiphong(tk.getString("Loaiphong"));
                    p.setGiaphong(tk.getDouble("Giaphong"));
                    p.setTinhtrang(tk.getString("Tinhtrang"));
                    p.setSonguoio(tk.getInt("Songuoio"));
                    p.setSoluongtd(tk.getInt("Soluongtd"));
                    p.setMota(tk.getString("Mota"));
                    list.add(p);
                   
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
    public ArrayList<PhongModel> TimkiemPhong(String timkiem){
        ArrayList<PhongModel> list= new ArrayList<>();
        String sql= "Select * from phong where (Maphong like ? or Loaiphong like ? or Mota like ?) AND Songuoio<Soluongtd ";
        String tkp;
            tkp="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tkp);
                  rs.setString(2, tkp);
                   rs.setString(3, tkp);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    PhongModel p = new PhongModel();
                    p.setMap(tk.getString("Maphong"));
                    p.setLoaiphong(tk.getString("Loaiphong"));
                    p.setGiaphong(tk.getDouble("Giaphong"));
                    p.setTinhtrang(tk.getString("Tinhtrang"));
                    p.setSonguoio(tk.getInt("Songuoio"));
                    p.setSoluongtd(tk.getInt("Soluongtd"));
                    p.setMota(tk.getString("Mota"));
                    list.add(p);
                   
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
    
     public ArrayList<PhongModel> CheckMap(String map){
        ArrayList<PhongModel> list= new ArrayList<>();
        String sql= "Select * from phong where Maphong = ? ";
       
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, map);
                 ResultSet check=rs.executeQuery();
                  System.out.println(sql);
                 while (check.next()) {
                    PhongModel p = new PhongModel();
                    p.setMap(check.getString("Maphong"));
                    p.setLoaiphong(check.getString("Loaiphong"));
                    p.setGiaphong(check.getDouble("Giaphong"));
                    p.setTinhtrang(check.getString("Tinhtrang"));
                    p.setSonguoio(check.getInt("Songuoio"));
                    p.setSoluongtd(check.getInt("Soluongtd"));
                    p.setMota(check.getString("Mota"));
                    list.add(p);
                   
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
