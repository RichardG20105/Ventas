package com.appv.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.appv.Ventas.DAO.documentoVenta;
import com.appv.Ventas.Respository.DocumentoVentaRepository;

@SpringBootApplication
public class VentasApplication implements CommandLineRunner {
	@Autowired
	private DocumentoVentaRepository documentoVentaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VentasApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		List<documentoVenta> factura = documentoVentaRepository.findAll();
		
		for(documentoVenta dv : factura) {
			System.out.println(dv.toString());
		}
	}

}
