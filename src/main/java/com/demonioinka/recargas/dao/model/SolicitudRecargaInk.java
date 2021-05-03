package com.demonioinka.recargas.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SolicitudRecargaInk {

	@Column
	public String c_tip_mensaje;
	
	@Column
	public String cMonto_in;
	
	@Column
	public String cProveedorRecargas;
	
	@Column
	public String cTelefono_in;
	
	@Column
	public String c_usu_crea;
	
	@Column
	public String c_cod_local;
	
	@Column
	public String c_num_ped_vta;
	
	@Column
	public String cTipo_Rcd_in;
	
	@Column
	public String cCodTipoProd_in;

	public String getC_tip_mensaje() {
		return c_tip_mensaje;
	}

	public void setC_tip_mensaje(String c_tip_mensaje) {
		this.c_tip_mensaje = c_tip_mensaje;
	}

	public String getcMonto_in() {
		return cMonto_in;
	}

	public void setcMonto_in(String cMonto_in) {
		this.cMonto_in = cMonto_in;
	}

	public String getcProveedorRecargas() {
		return cProveedorRecargas;
	}

	public void setcProveedorRecargas(String cProveedorRecargas) {
		this.cProveedorRecargas = cProveedorRecargas;
	}

	public String getcTelefono_in() {
		return cTelefono_in;
	}

	public void setcTelefono_in(String cTelefono_in) {
		this.cTelefono_in = cTelefono_in;
	}

	public String getC_usu_crea() {
		return c_usu_crea;
	}

	public void setC_usu_crea(String c_usu_crea) {
		this.c_usu_crea = c_usu_crea;
	}

	public String getC_cod_local() {
		return c_cod_local;
	}

	public void setC_cod_local(String c_cod_local) {
		this.c_cod_local = c_cod_local;
	}

	public String getC_num_ped_vta() {
		return c_num_ped_vta;
	}

	public void setC_num_ped_vta(String c_num_ped_vta) {
		this.c_num_ped_vta = c_num_ped_vta;
	}

	public String getcTipo_Rcd_in() {
		return cTipo_Rcd_in;
	}

	public void setcTipo_Rcd_in(String cTipo_Rcd_in) {
		this.cTipo_Rcd_in = cTipo_Rcd_in;
	}

	public String getcCodTipoProd_in() {
		return cCodTipoProd_in;
	}

	public void setcCodTipoProd_in(String cCodTipoProd_in) {
		this.cCodTipoProd_in = cCodTipoProd_in;
	}
	
	
}
