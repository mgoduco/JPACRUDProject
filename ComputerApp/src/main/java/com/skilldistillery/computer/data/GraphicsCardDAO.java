package com.skilldistillery.computer.data;

import java.util.List;

import com.skilldistillery.computer.entities.GraphicsCard;

public interface GraphicsCardDAO {

		public GraphicsCard findById(int id);
		
		public List<GraphicsCard> findAll(); 

		public GraphicsCard createGpu(GraphicsCard gpu);
		
		public GraphicsCard updateGpu(int id,GraphicsCard gpu);
		
		public boolean deleteGpu(int id);
}