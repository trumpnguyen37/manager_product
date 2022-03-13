/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author win
 */
    public class ProductService {
    private String idName,passWords,idProduct,tenSP,hoTen,sDT;
    private int soLuong;
    private double giatien;

    public ProductService() {
    }

    public ProductService(String idName, String passWords, String idProduct, String tenSP, String hoTen, String sDT, int soLuong, double giatien) {
        this.idName = idName;
        this.passWords = passWords;
        this.idProduct = idProduct;
        this.tenSP = tenSP;
        this.hoTen = hoTen;
        this.sDT = sDT;
        this.soLuong = soLuong;
        this.giatien = giatien;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }
    
}

