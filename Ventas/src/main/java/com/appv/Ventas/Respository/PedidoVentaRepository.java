package com.appv.Ventas.Respository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.appv.Ventas.Entidad.pedidoVenta;

@Repository
public interface PedidoVentaRepository extends MongoRepository<pedidoVenta, String>{
	@Query(value = "{'productos.nombre': ?0}")
	Optional<pedidoVenta> findByNombreProducto(String nombre);
	
	List<pedidoVenta> findByFechaVenta(Date fechaVenta);
}
