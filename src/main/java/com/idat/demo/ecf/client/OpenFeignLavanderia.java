package com.idat.demo.ecf.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.demo.ecf.modelo.Cliente;
import com.idat.demo.ecf.modelo.Lavadora;
import com.idat.demo.ecf.modelo.Ropa;

@FeignClient(name="ec-final", url = "localhost:8080")
public interface OpenFeignLavanderia {
	
	@GetMapping("/cliente/v1/listar")
	public List<Cliente> listarClientes();
	
	@GetMapping("/lavadora/v1/listar")
	public List<Lavadora> listarLavadoras();
	
	@GetMapping("/ropa/v1/listar")
	public List<Ropa> listarRopas();
	
}
