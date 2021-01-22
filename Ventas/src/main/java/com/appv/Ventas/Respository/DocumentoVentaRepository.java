package com.appv.Ventas.Respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appv.Ventas.Entidad.documentoVenta;

@Repository
public interface DocumentoVentaRepository extends MongoRepository<documentoVenta,String> {
	
}
