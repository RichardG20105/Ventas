package com.appv.Ventas.Respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appv.Ventas.DAO.documentoVenta;

@Repository
public interface DocumentoVentaRepository extends MongoRepository<documentoVenta,String> {
	
}
