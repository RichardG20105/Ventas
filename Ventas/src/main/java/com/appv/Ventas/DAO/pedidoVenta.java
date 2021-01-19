package com.appv.Ventas.DAO;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class pedidoVenta {
	@Id
	private Id id;
	private Date fechVenta;
	private double totalProductos;
	private Date fechaEntrega;
	private String Descripcion;
	public pedidoVenta() {
		super();
	}
	public pedidoVenta(Id id, Date fechVenta, double totalProductos, Date fechaEntrega, String descripcion) {
		super();
		this.id = id;
		this.fechVenta = fechVenta;
		this.totalProductos = totalProductos;
		this.fechaEntrega = fechaEntrega;
		Descripcion = descripcion;
	}
	public Id getId() {
		return id;
	}
	public Date getFechVenta() {
		return fechVenta;
	}
	public void setFechVenta(Date fechVenta) {
		this.fechVenta = fechVenta;
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
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
}
