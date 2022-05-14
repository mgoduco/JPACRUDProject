package com.skilldistillery.computer.data;

import java.util.List;

import com.skilldistillery.computer.entities.GraphicsCard;

public interface GraphicsCardDAO {

		public GraphicsCard findById(int id);
		
		public List<GraphicsCard> findAll(); 

		public GraphicsCard create(GraphicsCard graphicscard);
		
		public GraphicsCard updateGpu(int id, GraphicsCard updatedGpu);
		
		public boolean destroy(int id);
}