package com.appv.Ventas.Respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appv.Ventas.DAO.documentoElectronico;

@Repository
public interface DocumentoElectronicoRepository extends MongoRepository<documentoElectronico, String>{
	
}
