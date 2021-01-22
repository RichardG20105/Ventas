package com.appv.Ventas.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Producto")
public class Producto {
	private String nombre;
	private float valorUnitario;
	private int cantidad;
	public Producto() {
		super();
	}
	public Producto(String nombre, float valorUnitario, int cantidad) {
		super();
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
