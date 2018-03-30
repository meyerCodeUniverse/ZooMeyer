package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Animal;


public class AnimalHelper {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ZooMeyer");
		
		public void insert(Animal toAdd) {
			// TODO Auto-generated method stub
			
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			em.persist(toAdd);
			em.getTransaction().commit();
			em.close();
		}
		
		public List<Animal> showAllAnimals() {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			TypedQuery<Animal> allResults = em.createQuery("select li from Animal li", Animal.class);
			List<Animal> allItems = allResults.getResultList();
			em.close();
			return allItems;
			
		}
			
		public Animal searchForAnimalById(int idToEdit) {
			// TODO Auto-generated method stub
				
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			Animal foundItem = em.find(Animal.class, idToEdit);
			em.close();
			return foundItem;
			}
		
		public void deleteItem(Animal toDelete) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			Animal animaldelete = em.merge(toDelete);
			em.remove(animaldelete);
			em.getTransaction().commit();
			em.close();
		}
		
		public void updateAnimal(Animal toEdit) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			
			em.merge(toEdit);
			em.getTransaction().commit();
			em.close();
		}
		
		
}

