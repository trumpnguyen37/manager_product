/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author win
 */
import static Dao.Connect.JDBCConnection;
import Service.ProductService;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author asus
 */
public class ProductDao {

    /**
     * @param args the command line arguments
     */
    
     public boolean insertProduct (ProductService pro) throws Exception{
        String sql ="insert into Product (idName,idProduct,tenSP,soLuong,giatien) values(?,?,?,?,?)";
        try(
            Connection connect = JDBCConnection();
            PreparedStatement pstmt= connect.prepareStatement(sql);
            ){
        pstmt.setString(1,pro.getIdName());
        pstmt.setString(2,pro.getIdProduct());
        pstmt.setString(3,pro.getTenSP() );
        pstmt.setInt(4,pro.getSoLuong() );
        pstmt.setDouble(5,pro.getGiatien() );
        return pstmt.executeUpdate()>0;
        }

    }   
     public boolean insertaccount (ProductService pro) throws Exception{
        String sql ="insert into Account (idName,passWords,hoTen,sDT) values(?,?,?,?)";
        try(
            Connection connect = JDBCConnection();
            PreparedStatement pstmt= connect.prepareStatement(sql);
            ){
        pstmt.setString(1,pro.getIdName());
        pstmt.setString(2,pro.getPassWords() );
        pstmt.setString(3,pro.getHoTen() );
        pstmt.setString(4,pro.getsDT() );
        return pstmt.executeUpdate()>0;
        }

    }  
     
     public boolean update(ProductService pro )throws Exception{
        String sql ="update Product set tenSP = ?,soLuong = ?,giatien = ? where idProduct = ?  ";
        try(
            Connection connect = JDBCConnection();
            PreparedStatement pstmt1= connect.prepareStatement(sql);
            ){
                pstmt1.setString(4, pro.getIdProduct());
                pstmt1.setString(1, pro.getTenSP());
                pstmt1.setInt(2, pro.getSoLuong());
                pstmt1.setDouble(3, pro.getGiatien() );
                return pstmt1.executeUpdate()>0;
        }
    }
     
    
     public boolean delete (String idproduct) throws Exception{
        String sql ="delete from Product where idProduct = ? ";
        try(
            Connection connect = JDBCConnection();
            PreparedStatement pstmt= connect.prepareStatement(sql);
            ){
        pstmt.setString(1, idproduct );
        
    
        return pstmt.executeUpdate()>0;
        }
    }       
    
}
