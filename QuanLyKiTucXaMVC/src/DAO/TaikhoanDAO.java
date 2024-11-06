/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.SinhvienModel;
import Model.TaikhoanModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phamd
 */
public class TaikhoanDAO {
    
     public ArrayList<TaikhoanModel> getListTaikhoan(){
        ArrayList<TaikhoanModel> list=new ArrayList<>();
        String sql="SELECT * FROM dangnhap ";
        try {
            ResultSet rs=null;
         
            try {
                rs= Ketnoi.executeQuery(sql);
                System.err.println(rs);
                while (rs.next()) {
                    TaikhoanModel s = new TaikhoanModel();
                    s.setId(rs.getString("Id"));
                    s.setManv(rs.getString("Manv"));
                    s.setTendangnhap(rs.getString("Tendangnhap"));
                    s.setMatkhau(rs.getString("Matkhau"));
                  
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
    
      public void ThemTaikhoan(TaikhoanModel tk){
        String sql="INSERT INTO `dangnhap`(`Id`, `Manv`, `Tendangnhap`, `Matkhau`) VALUES "
                + "(?, ?, ?, ?);";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1, tk.getId());
                rs.setString(2, tk.getManv());
                rs.setString(3, tk.getTendangnhap());
                rs.setString(4, tk.getMatkhau());

                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
    
      public void XoaTaikhoan(String id){
        String sql="DELETE FROM `dangnhap` WHERE Id=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                rs.setString(1,id);
                 rs.executeUpdate();
              
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
      
       public void SuaTaikhoan(TaikhoanModel tk){
        String sql="UPDATE `dangnhap` SET `Tendangnhap`=?,`Matkhau`=? WHERE `Id`=?";
        try {
            PreparedStatement rs = null;
            try {
                rs= Ketnoi.preparedStatement(sql);
                
                rs= Ketnoi.preparedStatement(sql);
             
                rs.setString(1, tk.getTendangnhap());
                rs.setString(2, tk.getMatkhau());
                rs.setString(3, tk.getId());
                 rs.executeUpdate();
             
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               // rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
       
    }
       
       
      
      public ArrayList<TaikhoanModel> Timkiem(String timkiem){
        ArrayList<TaikhoanModel> list= new ArrayList<>();
        String sql= "Select * from dangnhap where Manv like ? or Tendangnhap like ? or Matkhau like ? ";
        String tknv;
            tknv="%"+timkiem+"%";
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, tknv);
                 rs.setString(2, tknv);
                 rs.setString(3, tknv);
                 ResultSet tk=rs.executeQuery();
                  System.out.println(sql);
                 while (tk.next()) {
                    TaikhoanModel s = new TaikhoanModel();
                    s.setId(tk.getString("Id"));
                    s.setManv(tk.getString("Manv"));
                    s.setTendangnhap(tk.getString("Tendangnhap"));
                    s.setMatkhau(tk.getString("Matkhau"));
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
    
      
       public ArrayList<TaikhoanModel> CheckManv(String manv){
        ArrayList<TaikhoanModel> list= new ArrayList<>();
        String sql= "Select Id from dangnhap where Manv = ? ";
       
        try {
            PreparedStatement rs = null;
            try {
                 rs= Ketnoi.preparedStatement(sql);
                 rs.setString(1, manv);
                 ResultSet check=rs.executeQuery();
                  System.out.println(sql);
                 while (check.next()) {
                    TaikhoanModel tk = new TaikhoanModel();
                    tk.setId(check.getString("Id"));
                  
                    list.add(tk);
                   
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
