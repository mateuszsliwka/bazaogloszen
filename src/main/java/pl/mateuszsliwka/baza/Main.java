
package pl.mateuszsliwka.baza;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//       UsersDAO users = new UsersDAO();
//        System.out.println(Arrays.toString(users.showadds(0).toArray()));
//      Users current = users.login("Tester1", "tester");
//      System.out.println(current);
//      users.update(current, "Tester", "tester", "tester@tester.pl");
//      System.out.println(current);
//      users.close();

     AddsDAO adds = new AddsDAO();
     
//      System.out.println(Arrays.toString(adds.alladds().toArray()));
//      adds.insert("Honda", "CRV", "2200", "Petrol", "2010","220322" , "ABS,ESP, kontrola trakcji", "87600" , 0);
//      System.out.println(Arrays.toString(adds.alladds().toArray())+".");
        System.out.println(Arrays.toString(adds.addsbyprice(true).toArray())); 
     adds.close();
    }

}
