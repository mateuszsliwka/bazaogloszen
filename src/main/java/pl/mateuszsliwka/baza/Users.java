/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mateuszsliwka.baza;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mateusz
 */
@Entity
@Table(name="baza_users")
public class Users implements Serializable {

  @GeneratedValue @Id
    private int ID;

    private String login;
    private String password;
    private String mail;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Users(String login, String password, String mail) {
        this.login = login;
        this.password = password;
        this.mail = mail;
    }

    public Users() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return  ID  + login +  password + mail + ' ';
    }

}
