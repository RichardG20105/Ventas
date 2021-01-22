package com.appv.Ventas.Entidad;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class documentoVenta {
	@Id
	private String id;
	private String idFactura;
	private Date fechaVencimiento;
	private double IVA;
	private String tipoFactura;
	
	public documentoVenta() {
		super();
	}
	
	public documentoVenta(String id, String idFactura, Date fechaVencimiento, double iVA, String tipoFactura) {
		super();
		this.id = id;
		this.idFactura = idFactura;
		this.fechaVencimiento = fechaVencimiento;
		this.IVA = iVA;
		this.tipoFactura = tipoFactura;
	}
	
	public String getId() {
		return id;
	}
	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Double getIVA() {
		return IVA;
	}
	public void setIVA(double iVA) {
		this.IVA = iVA;
	}

	public String getTipoFactura() {
		return tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	@Override
	public String toString() {
		return "documentoVenta [id=" + id + ", idFactura=" + idFactura + ", fechaVencimiento=" + fechaVencimiento
				+ ", IVA=" + IVA + ", tipoFactura=" + tipoFactura + "]";
	}
}
