package com.idat.demo.ecf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.demo.ecf.modelo.Lavanderia;
import com.idat.demo.ecf.service.LavanderiaService;

@Controller
@RequestMapping("/lavanderia/v1")
public class OpenFeignController {
	@Autowired
	private LavanderiaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Lavanderia> listarLavanderia(){
		return service.asignarClientePorLavanderia();
		
		
	}

}
