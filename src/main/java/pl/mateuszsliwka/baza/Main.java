/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mateuszsliwka.baza;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mateusz
 */
public class Main {
    public static void main(String[] args) {
        UsersDAO users = new UsersDAO();
        Users current = users.login("Tester1", "tester");
        System.out.println(current);
        users.update(current, "Tester", "tester", "tester@tester.pl");
        System.out.println(current);
        users.close();
    }
    
}
