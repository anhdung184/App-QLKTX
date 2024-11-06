/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.SinhvienModel;
import Connection.Ketnoi;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phamd
 */
public class SinhvienDAO {
    public ArrayList<SinhvienModel> getListSinhvien(){
        ArrayList<SinhvienModel> list=new ArrayList<>();
        String sql="SELECT * FROM sinhvien";
        try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    SinhvienModel s = new SinhvienModel();
                    s.setMasv(rs.getString("Masv"));
                    s.setHoten(rs.getString("Hoten"));
                    s.setNgaysinh(rs.getDate("Ngaysinh"));
                    s.setGioitinh(rs.getString("Gioitinh"));
                    s.setLop(rs.getString("Lop"));
                    s.setSdt(rs.getString("Sdt"));
                    s.setQuequan(rs.getString("Quequan"));
                    list.add(s);
                     System.err.println(list);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
        return list;
    }
    
     public void ThemSinhvien(SinhvienModel s){
        String sql="INSERT INTO `sinhvien`(`Masv`, `Hoten`, `Ngaysinh`, `Gioitinh`, `Lop`, `Sdt`, `Quequan`) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, s.getMasv());
                rs.setString(2, s.getHoten());
                rs.setDate(3, new Date(s.getNgaysinh().getTime()));
                rs.setString(4, s.getGioitinh());
                rs.setString(5, s.getLop());
                rs.setString(6, s.getSdt());
                rs.setString(7, s.getQuequan());
                
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    
    
    public void XoaSinhvien(String masv){
        String sql="DELETE FROM `sinhvien` WHERE Masv=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,masv);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
    
    public void SuaSinhvien(SinhvienModel s){
        String sql="UPDATE `sinhvien` SET `Hoten`=?,`Ngaysinh`=?,"
                + "`Gioitinh`=?,`Lop`=?,`Sdt`=?,`Quequan`=? WHERE `Masv`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                
                rs= Ketnoi.preparedStatement(sql);
             
                rs.setString(1, s.getHoten());
                rs.setDate(2, new Date(s.getNgaysinh().getTime()));
                rs.setString(3, s.getGioitinh());
                rs.setString(4, s.getLop());
                rs.setString(5, s.getSdt());
                rs.setString(6, s.getQuequan());
                rs.setString(7, s.getMasv());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    public ArrayList<SinhvienModel> Timkiem(String timkiem){
        ArrayList<SinhvienModel> list= new ArrayList<>();
        String sql= "Select * from sinhvien where Masv like ? or Hoten like ? or Quequan like ? ";
        String tksv;
            tksv="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tksv);
                  rs.setString(2, tksv);
                   rs.setString(3, tksv);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    SinhvienModel s = new SinhvienModel();
                    s.setMasv(tk.getString("Masv"));
                    s.setHoten(tk.getString("Hoten"));
                    s.setNgaysinh(tk.getDate("Ngaysinh"));
                    s.setGioitinh(tk.getString("Gioitinh"));
                    s.setLop(tk.getString("Lop"));
                    s.setSdt(tk.getString("Sdt"));
                    s.setQuequan(tk.getString("Sdt"));
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
    
    public ArrayList<SinhvienModel> TimkiemSV(String timkiem){
        ArrayList<SinhvienModel> list= new ArrayList<>();
        String sql= "Select * from sinhvien where (Masv like ? or Hoten like ? or Quequan like ?) AND Masv NOT IN (SELECT Masv FROM `hopdong` WHERE 1)  ";
        String tksv;
            tksv="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tksv);
                  rs.setString(2, tksv);
                   rs.setString(3, tksv);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    SinhvienModel s = new SinhvienModel();
                    s.setMasv(tk.getString("Masv"));
                    s.setHoten(tk.getString("Hoten"));
                    s.setNgaysinh(tk.getDate("Ngaysinh"));
                    s.setGioitinh(tk.getString("Gioitinh"));
                    s.setLop(tk.getString("Lop"));
                    s.setSdt(tk.getString("Sdt"));
                    s.setQuequan(tk.getString("Sdt"));
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
    
     public ArrayList<SinhvienModel> CheckMasv(String masv){
        ArrayList<SinhvienModel> list= new ArrayList<>();
        String sql= "Select * from sinhvien where Masv = ? ";
       
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, masv);
                 ResultSet check=rs.executeQuery();
                  System.out.println(sql);
                 while (check.next()) {
                    SinhvienModel s = new SinhvienModel();
                    s.setMasv(check.getString("Masv"));
                    s.setHoten(check.getString("Hoten"));
                    s.setNgaysinh(check.getDate("Ngaysinh"));
                    s.setGioitinh(check.getString("Gioitinh"));
                    s.setLop(check.getString("Lop"));
                    s.setSdt(check.getString("Sdt"));
                    s.setQuequan(check.getString("Sdt"));
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
