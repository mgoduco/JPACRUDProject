package com.skilldistillery.computer.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.computer.entities.GraphicsCard;

@Service
@Transactional
public class GraphicsCardDAOJpaImpl implements GraphicsCardDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public GraphicsCard findById(int gpuId) {
		return em.find(GraphicsCard.class, gpuId);
	}
	
	@Override
	public List<GraphicsCard> findAll() {
		String jpql = "SELECT g FROM GraphicsCard g";
		return em.createQuery(jpql, GraphicsCard.class).getResultList();
	}

	@Override
	public GraphicsCard create(GraphicsCard gpu) {
		// start the transaction
		em.getTransaction().begin();
		System.out.println("Before the persist: " + gpu);
		// write the GraphicsCard to the database
		em.persist(gpu);
		System.out.println("After the persist: " + gpu);
		// update the "local" GraphicsCard object
		em.flush();
		// commit the changes (actually perform the operation)
		em.getTransaction().commit();
		return gpu;
	}

	@Override
	public GraphicsCard updateGpu(int id, GraphicsCard updatedGpu) {
		// open a transaction
		// retrieve a "managed" GraphicsCard entity
		GraphicsCard managedGpu = em.find(GraphicsCard.class, id);
		if (managedGpu != null) {
			em.getTransaction().begin();
			managedGpu.setName(updatedGpu.getName());
			// TODO FINISH SETS
			em.getTransaction().commit();
			// actually make changes
		}
		return managedGpu;
	}

	@Override
	public boolean destroy(int id) {
		boolean destroyed = false;
		GraphicsCard gpu = em.find(GraphicsCard.class, id);
		if (gpu != null) {
			em.getTransaction().begin();
			em.remove(gpu); // performs the delete on the managed entity
			destroyed = !em.contains(gpu);
			em.getTransaction().commit();
			System.out.println("GraphicsCard at: " + id + " DESTROYED");
		}
		return destroyed;
	}
}
