/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhtung
 */
public class HocPhi {
     private int idSV;
     private  int KhoaHoc;
     private String NamHoc;
     private int TienDaNop;
     private int TienPhaiNop;
     private int status;
     public HocPhi(){
          
     }
     public HocPhi(int idSV, int KhoaHoc, String NamHoc, int TienDaNop, int TienPhaiNop, int status) {
          this.idSV = idSV;
          this.KhoaHoc = KhoaHoc;
          this.NamHoc = NamHoc;
          this.TienDaNop = TienDaNop;
          this.TienPhaiNop = TienPhaiNop;
          this.status = status;
     }

     public int getIdSV() {
          return idSV;
     }

     public void setIdSV(int idSV) {
          this.idSV = idSV;
     }

     public int getKhoaHoc() {
          return KhoaHoc;
     }

     public void setKhoaHoc(int KhoaHoc) {
          this.KhoaHoc = KhoaHoc;
     }

     public String getNamHoc() {
          return NamHoc;
     }

     public void setNamHoc(String NamHoc) {
          this.NamHoc = NamHoc;
     }

     public int getTienDaNop() {
          return TienDaNop;
     }

     public void setTienDaNop(int TienDaNop) {
          this.TienDaNop = TienDaNop;
     }

     public int getTienPhaiNop() {
          return TienPhaiNop;
     }

     public void setTienPhaiNop(int TienPhaiNop) {
          this.TienPhaiNop = TienPhaiNop;
     }

     public int getStatus() {
          return status;
     }

     public void setStatus(int status) {
          this.status = status;
     }
     
}
