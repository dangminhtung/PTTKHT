/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SinhVien;
import java.sql.Connection;
import model.HocPhi;
import model.account;

/**
 *
 * @author minhtung
 */
public class controller {

     Connection con = null;

     public ArrayList<SinhVien> setdata() throws SQLException {
          con = DBConnect.DBConnect.getConnection();
          ArrayList<SinhVien> list = new ArrayList<>();

          try {
               String sql = "select * from SinhVien";
               PreparedStatement ps = con.prepareCall(sql);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                    SinhVien sv = new SinhVien();
                    sv.setIdSV(rs.getInt("idSV"));
                    sv.setIdAccount(rs.getInt("idAccount"));
                    sv.setName(rs.getString("name"));
                    sv.setChuyenNganh(rs.getString("ChuyenNganh"));
                    sv.setLopHoc(rs.getString("LopHoc"));
                    sv.setKhoaHoc(rs.getInt("KhoaHoc"));
                    sv.setStatus(rs.getInt("status"));
                    list.add(sv);
               }
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return list;

     }

     public ArrayList<account> setdataAC() throws SQLException {
          con = DBConnect.DBConnect.getConnection();
          ArrayList<account> list = new ArrayList<>();
          try {
               String sql = "select * from account";
               PreparedStatement ps = con.prepareCall(sql);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                    account ac = new account();
                    ac.setIdAccount(rs.getInt("idAccount"));
                    ac.setUsername(rs.getString("username"));
                    ac.setPassword(rs.getString("password"));
                    ac.setRole(rs.getInt("role"));
                    list.add(ac);
               }
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return list;
     }

     public ArrayList<HocPhi> setdataHP() throws SQLException {
          con = DBConnect.DBConnect.getConnection();
          ArrayList<HocPhi> list = new ArrayList<>();
          try {
               String sql = "select * from NopHocPhi";
               PreparedStatement ps = con.prepareCall(sql);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                    HocPhi hp = new HocPhi();
                    hp.setIdSV(rs.getInt("idSV"));
                    hp.setKhoaHoc(rs.getInt("khoa"));
                    hp.setNamHoc(rs.getString("NamHoc"));
                    hp.setTienPhaiNop(rs.getInt("TienPhaiNop"));
                    hp.setTienDaNop(rs.getInt("TienDaNop"));
                    hp.setStatus(rs.getInt("status"));
                    list.add(hp);
               }
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return list;
     }

     public ArrayList<HocPhi> SetdataPrivate(int id) throws SQLException {
          con = DBConnect.DBConnect.getConnection();
          ArrayList<HocPhi> list = new ArrayList<>();
          try {
               String sql = "select * from NopHocPhi where idSV='" + id + "' and status='"+0+"' ";
               PreparedStatement ps = con.prepareCall(sql);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                    HocPhi hp = new HocPhi();
                    hp.setIdSV(rs.getInt("idSV"));
                    hp.setKhoaHoc(rs.getInt("khoa"));
                    hp.setNamHoc(rs.getString("NamHoc"));
                    hp.setTienPhaiNop(rs.getInt("TienPhaiNop"));
                    hp.setTienDaNop(rs.getInt("TienDaNop"));
                    hp.setStatus(rs.getInt("status"));
                    list.add(hp);
               }
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return list;

     }
}
