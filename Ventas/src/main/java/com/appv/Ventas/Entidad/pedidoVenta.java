package com.appv.Ventas.Entidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PedidoVenta")
public class pedidoVenta {
	@Id
	private String id;
	private Date fechaVenta;
	private double totalProductos;
	private List<Producto> productos;
	private Date fechaEntrega;
	private String descripcion;
	
	protected pedidoVenta() {
		this.productos = new ArrayList<>();
	}
	
	public pedidoVenta(Date fechaVenta, double totalProductos, List<Producto> productos, Date fechaEntrega,
			String descripcion) {
		super();
		this.fechaVenta = fechaVenta;
		this.totalProductos = totalProductos;
		this.productos = productos;
		this.fechaEntrega = fechaEntrega;
		this.descripcion = descripcion;
	}
	
	public String getId() {
		return id;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public double getTotalProductos() {
		return totalProductos;
	}
	public void setTotalProductos(double totalProductos) {
		this.totalProductos = totalProductos;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Producto> getProductos() {
		return productos;
	}
}
