package com.skilldistillery.computer.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.computer.entities.GraphicsCard;

@Service
@Transactional
public class GraphicsCardDAOJpaImpl implements GraphicsCardDAO {

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
	public GraphicsCard createGpu(GraphicsCard gpu) {
		System.out.println("Before the persist: " + gpu);
		em.persist(gpu);
		System.out.println("After the persist: " + gpu);
		em.flush();
		return gpu;
	}

	@Override
	public GraphicsCard updateGpu(int id,GraphicsCard gpu) {
		GraphicsCard managedGpu = em.find(GraphicsCard.class, id);
		if (managedGpu != null) {
			managedGpu.setName(gpu.getName());
			managedGpu.setReleaseDate(gpu.getReleaseDate());
			managedGpu.setMemory(gpu.getMemory());
			managedGpu.setGpuClock(gpu.getGpuClock());
			managedGpu.setMemoryClock(gpu.getMemoryClock());
			managedGpu.setPrice(gpu.getPrice());
			managedGpu.setAverageFps(gpu.getAverageFps());
			em.flush();
		}
		return managedGpu;
	}

	@Override
	public boolean deleteGpu(int id) {
		boolean deleted = false;
		GraphicsCard gpu = em.find(GraphicsCard.class, id);
		if (gpu != null) {
			em.remove(gpu);
			deleted = !em.contains(gpu);
			System.out.println("GraphicsCard at: " + id + " DESTROYED");
		}
		return deleted;
	}
}
