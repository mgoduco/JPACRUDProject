package com.skilldistillery.computer.entities;

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
	private String releaseDate;

	private String memory;

	@Column(name = "gpu_clock")
	private Integer gpuClock;

	@Column(name = "memory_clock")
	private Integer memoryClock;

	private Double price;

	@Column(name = "average_fps")
	private Double averageFps;

	// Methods
	public GraphicsCard() {
	}

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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
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
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAverageFps() {
		return averageFps;
	}

	public void setAverageFps(Double averageFps) {
		this.averageFps = averageFps;
	}

	@Override
	public String toString() {
		return "GraphicsCard [id=" + id + ", name=" + name + ", releaseDate=" + releaseDate + ", memory=" + memory
				+ ", gpuClock=" + gpuClock + ", memoryClock=" + memoryClock + ", price=" + price + ", averageFps="
				+ averageFps + "]";
	}
	
}