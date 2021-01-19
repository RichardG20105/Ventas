package com.appv.Ventas.Respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.appv.Ventas.DAO.pedidoVenta;

@Repository
public interface PedidoVentaRepository extends MongoRepository<pedidoVenta, String>{

}
