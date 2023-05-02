package co.edu.uco.compuconnect.dto;


import java.util.Date;
import java.util.UUID;

public abstract class ContenidoDTO {

	protected UUID identificador;
	protected UsuarioDTO autor;
	protected String descripcion;
	protected Date horaCreacion;
	
	
	
	
	protected abstract UUID getIdentificador();
		
		
	protected abstract ContenidoDTO setIdentificador(UUID identificador);
	
	protected abstract UsuarioDTO getAutor();
	
	
	protected abstract ContenidoDTO setAutor(UsuarioDTO autor);
	
	
	protected abstract String getDescripcion();
	
	
	protected abstract ContenidoDTO setDescripcion(String descripcion);
	
	
	protected abstract Date getHoraCreacion();
	
	
	protected abstract ContenidoDTO setHoraCreacion(Date horaCreacion);
	
	
	
}
