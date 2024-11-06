/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.NhanvienModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phamd
 */
public class NhanvienDAO {
     public ArrayList<NhanvienModel> getListNhanvien(){
        ArrayList<NhanvienModel> list=new ArrayList<>();
        String sql="SELECT * FROM quanly";
        try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    NhanvienModel s = new NhanvienModel();
                    s.setManv(rs.getString("Manv"));
                    s.setHoten(rs.getString("Hoten"));
                    s.setNgaysinh(rs.getDate("Ngaysinh"));
                    s.setGioitinh(rs.getString("Gioitinh"));
                    s.setSdt(rs.getString("Sdt"));
                    s.setQuequan(rs.getString("Quequan"));
                    s.setChucvu(rs.getString("Chucvu"));
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
    
     public void ThemNhanvien(NhanvienModel s){
        String sql="INSERT INTO `quanly`(`Manv`, `Hoten`, `Ngaysinh`, `Gioitinh`, `Sdt`, `Quequan`,`Chucvu` ) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, s.getManv());
                rs.setString(2, s.getHoten());
                rs.setDate(3, new Date(s.getNgaysinh().getTime()));
                rs.setString(4, s.getGioitinh());
                rs.setString(5, s.getSdt());
                rs.setString(6, s.getQuequan());
                 rs.setString(7, s.getChucvu());
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    
    
    public void XoaNhanvien(String manv){
        String sql="DELETE FROM `quanly` WHERE Manv=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,manv);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
    
    public void SuaNhanvien(NhanvienModel s){
        String sql="UPDATE `quanly` SET `Hoten`=?,`Ngaysinh`=?,"
                + "`Gioitinh`=?,`Sdt`=?,`Quequan`=?,`Chucvu`=? WHERE `Manv`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                
                rs= Ketnoi.preparedStatement(sql);
             
                rs.setString(1, s.getHoten());
                rs.setDate(2, new Date(s.getNgaysinh().getTime()));
                rs.setString(3, s.getGioitinh());
               
                rs.setString(4, s.getSdt());
                rs.setString(5, s.getQuequan());
                 rs.setString(6, s.getChucvu());
                rs.setString(7, s.getManv());
                
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    public ArrayList<NhanvienModel> Timkiem(String timkiem){
        ArrayList<NhanvienModel> list= new ArrayList<>();
        String sql= "Select * from quanly where Manv like ? or Hoten like ? or Quequan like ? or Chucvu like ? ";
        String tksv;
            tksv="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tksv);
                 rs.setString(2, tksv);
                 rs.setString(3, tksv);
                 rs.setString(4, tksv);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    NhanvienModel s = new NhanvienModel();
                    s.setManv(tk.getString("Manv"));
                    s.setHoten(tk.getString("Hoten"));
                    s.setNgaysinh(tk.getDate("Ngaysinh"));
                    s.setGioitinh(tk.getString("Gioitinh"));
                    s.setSdt(tk.getString("Sdt"));
                    s.setQuequan(tk.getString("Quequan"));
                     s.setChucvu(tk.getString("Chucvu"));
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
    
     public ArrayList<NhanvienModel> CheckManv(String manv){
        ArrayList<NhanvienModel> list= new ArrayList<>();
        String sql= "Select * from quanly where Manv = ? ";
       
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, manv);
                 ResultSet check=rs.executeQuery();
                  System.out.println(sql);
                 while (check.next()) {
                    NhanvienModel s = new NhanvienModel();
                    s.setManv(check.getString("Manv"));
                    s.setHoten(check.getString("Hoten"));
                    s.setNgaysinh(check.getDate("Ngaysinh"));
                    s.setGioitinh(check.getString("Gioitinh"));
                    s.setSdt(check.getString("Sdt"));
                    s.setQuequan(check.getString("Quequan"));
                     s.setChucvu(check.getString("Chucvu"));
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
