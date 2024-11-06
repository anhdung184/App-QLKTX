/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.Ketnoi;
import Model.DangnhapModel;
import DAO.DangnhapDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author phamd
 */
public class DangnhapDAO {
        public List<DangnhapModel> Select(String id){
        String sql="SELECT * FROM  dangnhap";
        return select(id);
    }
    public List<DangnhapModel> findByTendangnhap (String Tendangnhap){
        String sql="SELECT * FROM  dangnhap WHERE Tendangnhap='"+ Tendangnhap +"'";
        return select(sql);
    }
    private List<DangnhapModel> select( String sql, Object...args){
        List<DangnhapModel> list= new ArrayList<>();
           System.err.print(sql);
        try {
            ResultSet rs=null;
            try {
                rs= Ketnoi.executeQuery(sql, args);
                while (rs.next()) {
                    DangnhapModel model = readFromResultSet(rs);
                    list.add(model);
                }
            } catch (Exception e) {
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
        }
        return list;
    }
     private DangnhapModel readFromResultSet(ResultSet rs) throws SQLException {
        DangnhapModel model = new DangnhapModel();
        model.setId(rs.getString("Id"));
        model.setTendangnhap(rs.getString("Tendangnhap"));
        model.setMatkhau(rs.getString("Matkhau"));
       
        return model;
    }
//    private DangnhapModel readFromResultSet(ResultSet rs) throws SQLException {
//        DangnhapModel model = new DangnhapModel();
//        model.setId(rs.getString("Id"));
//        model.setManv(rs.getString("Manv"));
//        model.setTendangnhap(rs.getString("Tendangnhap"));
//        model.setMatkhau(rs.getString("Matkhau"));
//        model.setIsAdmin(rs.getBoolean("IsAdmin"));
//        return model;
//    }
}
