package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Animal;
import model.AnimalType;
import model.Diet;
import model.Gender;
import model.Skin;
import model.Zoo;

public class ZooHelper {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ZooMeyer");	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void insertZoo(Zoo toAdd) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	public void deleteZoo(Zoo toDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Zoo zoodelete = em.merge(toDelete);
		em.remove(zoodelete);
		em.getTransaction().commit();
		em.close();
	}

	public Zoo getZooByID(int zooToFind) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Zoo foundItem = em.find(Zoo.class, zooToFind);
		return foundItem;
	}

	public List<Zoo> showAllZoos() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Zoo> allResults = em.createQuery("select li from Zoo li", Zoo.class);
		List<Zoo> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}

	public List<Gender> showAllGenders() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Gender> allResults = em.createQuery("select li from Gender li", Gender.class);
		List<Gender> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}

	public List<Diet> showAllDiets() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Diet> allResults = em.createQuery("select li from Diet li", Diet.class);
		List<Diet> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}

	public List<Skin> showAllSkins() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Skin> allResults = em.createQuery("select li from Skin li", Skin.class);
		List<Skin> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}
	
	public List<Zoo> getAllZoos() {
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Zoo> allResults = em.createQuery("select li from Zoo li", Zoo.class);
		List<Zoo> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}

	public void updateZoo(Zoo toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	
}
