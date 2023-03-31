package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.User;

public class Userdao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");


EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

public void save(User user)
{
et.begin();
em.persist(user);
et.commit();
}

public User find(String email)
{
	return em.find(User.class,email);
}

public List<User> fetchAll()
{
	return em.createQuery("select x from User x").getResultList();
}
public void delet(User user)
{
	et.begin();
	em.remove(user);
	et.commit();
}
}