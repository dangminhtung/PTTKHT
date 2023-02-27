/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhtung
 */
public class account {
     private int idAccount;
     private String username;
     private String password;
     private int role;

     public account(int idAccount, String username, String password, int role) {
          this.idAccount = idAccount;
          this.username = username;
          this.password = password;
          this.role = role;
     }

     public account() {
     }

     public int getIdAccount() {
          return idAccount;
     }

     public void setIdAccount(int idAccount) {
          this.idAccount = idAccount;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public int getRole() {
          return role;
     }

     public void setRole(int role) {
          this.role = role;
     }
     
}
