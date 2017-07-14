package pl.mateuszsliwka.baza;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UsersDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager em = emf.createEntityManager();
    
    public List<Users> allusers()
    {
    Query zapytanie = em.createQuery("SELECT user FROM Users user ORDER by user.ID DESC");
    List wynik = zapytanie.getResultList();
    return wynik;
   }
    
    public void register(String login, String password, String mail)
    {
        em.persist(new Users(login,password,mail));
        em.getTransaction().begin();
        em.getTransaction().commit();
    }
    public Users login(String login, String password)
    {
        List result = em.createQuery("SELECT ID FROM  Users where login = :value1").setParameter("value1", login).getResultList();
       try
       {int ID = (int) result.get(0);
          Users user =  em.getReference(Users.class,ID);
        if(password.equals(user.getPassword()))
            return user;
        else
            return null;
      
        
       }
       catch(IndexOutOfBoundsException e)
       {
           return null;
       }
     
    }
    public void update(Users user, String login, String password,String mail)
    {
    try{
        user.setLogin(login);
        user.setPassword(password);
        user.setMail(mail);
     em.merge(user);   
       em.getTransaction().begin();
        em.getTransaction().commit();
    }
    catch (NullPointerException e)
    {
        System.out.println("User '"+login+"' doesn't exist");
    }
    }
    public List showadds(int ID)
    {
        
        List result = em.createQuery("SELECT add FROM Adds add where OwnerID = :value1").setParameter("value1", ID).getResultList();
        return result;
       
    }
    public void close()
    {
        em.close();
        emf.close();
    }
    
}
