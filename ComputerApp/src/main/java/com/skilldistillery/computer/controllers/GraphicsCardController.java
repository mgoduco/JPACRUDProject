package com.skilldistillery.computer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.computer.data.GraphicsCardDAO;
import com.skilldistillery.computer.entities.GraphicsCard;

@Controller
public class GraphicsCardController {

	@Autowired
	private GraphicsCardDAO gpuDao;

	@RequestMapping(path = { "/", "index.do" })
	public String index(Model model) {
		model.addAttribute("gpu", gpuDao.findAll());
		return "index"; // using a ViewResolver.
	}
	@RequestMapping(path = "createGpuPage.do" )
	public String createPage() {
		return "gpu/createGpu";
	}

	@RequestMapping(path = "createGpu.do", method = RequestMethod.POST)
	public String createGpu(GraphicsCard gpu, RedirectAttributes redir) {
		GraphicsCard newGpu = gpuDao.createGpu(gpu);
		redir.addFlashAttribute("gpu", newGpu);
		return "redirect:getNewGpu.do";
	}
	@RequestMapping(path = "getGpu.do")
	public String showGpu(@RequestParam int gpuId, Model model) {
		GraphicsCard gpu = gpuDao.findById(gpuId);
		model.addAttribute("gpu", gpu);
		return "gpu/show";
	}
	@RequestMapping(path = "getNewGpu.do")
	public String showNewGpu() {
		return "gpu/show";
	}
	
}

	
