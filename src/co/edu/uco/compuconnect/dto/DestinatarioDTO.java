package co.edu.uco.compuconnect.dto;

import java.util.UUID;

public abstract class DestinatarioDTO {
	
	protected  UUID identificador;
	protected String correoInstitucional;
	protected String identificacion;
	protected TipoIdentificacionDTO tipoIdentificacion;
	protected String nombre;
	
	
	
	protected abstract UUID getIdentificador();
	
	
	public abstract DestinatarioDTO setIdentificador(UUID identificador);
	
	protected abstract String getCorreoInstitucional();
	
	
	protected abstract DestinatarioDTO setCorreoInstitucional(String correoInstitucional);
	
	
	protected abstract String getIdentificacion();
	
	
	protected abstract  DestinatarioDTO setIdentificacion(String identificacion);
	
	
	protected abstract TipoIdentificacionDTO getTipoIdentificacion();
	
	
	protected abstract DestinatarioDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion);
	
	
	protected abstract String getNombre();
	
	
	protected abstract DestinatarioDTO setNombre(String nombre);
	
	
	
	

}
