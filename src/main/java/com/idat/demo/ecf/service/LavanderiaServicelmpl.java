package com.idat.demo.ecf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.demo.ecf.client.OpenFeignLavanderia;
import com.idat.demo.ecf.modelo.Lavanderia;

public class LavanderiaServicelmpl implements LavanderiaService {
	
	
	@Autowired
	private OpenFeignLavanderia cliente;
	@Override
	public List<Lavanderia> asignarClientePorLavanderia() {
		List<Lavanderia>listarlavanderia = new ArrayList<>();
		Lavanderia lavan = new Lavanderia();
		
		lavan.setNombre("Los lucas");
		lavan.setIdLavanderia(1);
		lavan.setListarCliente(cliente.listarClientes());
		listarlavanderia.add(lavan);
		return listarlavanderia;
	}

}
