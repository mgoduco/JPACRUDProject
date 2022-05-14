package com.skilldistillery.computer.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "graphics_card")
public class GraphicsCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name = "release_date")
	private LocalDate releaseDate;
	
	private String Memory;
	
	@Column(name = "gpu_clock")
	private Integer gpuClock;
	
	@Column(name = "memory_clock")
	private Integer memoryClock;

	private Double Price;
	
	@Column(name = "average_fps")
	private Double averageFps;
	
	//	Methods
	public GraphicsCard () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMemory() {
		return Memory;
	}

	public void setMemory(String memory) {
		Memory = memory;
	}

	public Integer getGpuClock() {
		return gpuClock;
	}

	public void setGpuClock(Integer gpuClock) {
		this.gpuClock = gpuClock;
	}

	public Integer getMemoryClock() {
		return memoryClock;
	}

	public void setMemoryClock(Integer memoryClock) {
		this.memoryClock = memoryClock;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getAverageFps() {
		return averageFps;
	}

	public void setAverageFps(Double averageFps) {
		this.averageFps = averageFps;
	}

	@Override
	public String toString() {
		return "GraphicsCard [id=" + id + ", name=" + name + ", releaseDate=" + releaseDate + ", Memory=" + Memory
				+ ", gpuClock=" + gpuClock + ", memoryClock=" + memoryClock + ", Price=" + Price + ", averageFps="
				+ averageFps + "]";
	}
	
}
