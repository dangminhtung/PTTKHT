/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhtung
 */
public class SinhVien {
     private int idSV;
     private int idAccount;
     private String name;
     private  String ChuyenNganh;
     private String LopHoc;
     private int KhoaHoc;
     private int status ;

     public SinhVien() {
     }

     public SinhVien(int idSV, int idAccount, String name, String ChuyenNganh, String LopHoc, int KhoaHoc, int status) {
          this.idSV = idSV;
          this.idAccount = idAccount;
          this.name = name;
          this.ChuyenNganh = ChuyenNganh;
          this.LopHoc = LopHoc;
          this.KhoaHoc = KhoaHoc;
          this.status = status;
     }

     public int getIdSV() {
          return idSV;
     }

     public void setIdSV(int idSV) {
          this.idSV = idSV;
     }

     public int getIdAccount() {
          return idAccount;
     }

     public void setIdAccount(int idAccount) {
          this.idAccount = idAccount;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getChuyenNganh() {
          return ChuyenNganh;
     }

     public void setChuyenNganh(String ChuyenNganh) {
          this.ChuyenNganh = ChuyenNganh;
     }

     public String getLopHoc() {
          return LopHoc;
     }

     public void setLopHoc(String LopHoc) {
          this.LopHoc = LopHoc;
     }

     public int getKhoaHoc() {
          return KhoaHoc;
     }

     public void setKhoaHoc(int KhoaHoc) {
          this.KhoaHoc = KhoaHoc;
     }

     public int getStatus() {
          return status;
     }

     public void setStatus(int status) {
          this.status = status;
     }
     
}
