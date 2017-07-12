package pl.mateuszsliwka.baza;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddsDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager em = emf.createEntityManager();

    public List<Users> alladds() {
        Query zapytanie = em.createQuery("SELECT add FROM Adds add ORDER by add.ID DESC");
        List wynik = zapytanie.getResultList();
        return wynik;
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
