package pl.mateuszsliwka.baza;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddsDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager em = emf.createEntityManager();

    public List<Adds> alladds() {
        Query zapytanie = em.createQuery("SELECT add FROM Adds add ORDER by add.ID DESC");
        List wynik = zapytanie.getResultList();
        return wynik;
    }
    
    public List addsbyprice(boolean how)
    {
        if(how==true)
        {
       List result = em.createQuery("SELECT add FROM Adds add ORDER by Price").getResultList();
       return result;
        }
       else
        {
        List result = em.createQuery("SELECT add FROM Adds add ORDER by Price DESC").getResultList();
       return result;
        }
       
    }

    public List showowner(int ID) {

        List result = em.createQuery("SELECT OwnerID FROM Adds where ID = :value1").setParameter("value1", ID).getResultList();
        int OwnerID = (int) result.get(0);
        List result2 = em.createQuery("SELECT user FROM Users user where ID = :value1").setParameter("value1", OwnerID).getResultList();
        return result2;

    }

    public void insert(String brand, String model, String capacity, String fuel, String vintage, String mileage, String info, String price, int OwnerID) {
        em.persist(new Adds(brand, model, capacity, fuel, vintage, mileage, info, price, OwnerID));
        em.getTransaction().begin();
        em.getTransaction().commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
