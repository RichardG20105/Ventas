package com.appv.Ventas.DAO;

import org.springframework.data.annotation.Id;

public class documentoElectronico {
	@Id
	private Id id;
	private int idDocumentoElectronico;
	private String XML;
	private String PDF;
	public documentoElectronico() {
		super();
	}
	public documentoElectronico(Id id, int idDocumentoElectronico, String xML, String pDF) {
		super();
		this.id = id;
		this.idDocumentoElectronico = idDocumentoElectronico;
		XML = xML;
		PDF = pDF;
	}
	public Id getId() {
		return id;
	}
	public int getIdDocumentoElectronico() {
		return idDocumentoElectronico;
	}
	public void setIdDocumentoElectronico(int idDocumentoElectronico) {
		this.idDocumentoElectronico = idDocumentoElectronico;
	}
	public String getXML() {
		return XML;
	}
	public void setXML(String xML) {
		XML = xML;
	}
	public String getPDF() {
		return PDF;
	}
	public void setPDF(String pDF) {
		PDF = pDF;
	}
	
}
