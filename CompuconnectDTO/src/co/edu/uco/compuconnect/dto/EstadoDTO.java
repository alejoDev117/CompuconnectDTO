package co.edu.uco.compuconnect.dto;

import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;

import java.util.UUID;

public final class EstadoDTO {
	
	private UUID identificador;
	private String nombre;
	
	
	
	public EstadoDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
	
	}
	
	
	public EstadoDTO(UUID identificador, String nombre) {
		super();
		setIdentificador(identificador);
		setNombre(nombre) ;
	}
	
	public static EstadoDTO create() {
		return new EstadoDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}


	public final EstadoDTO setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		
		return this;
	}


	public final String getNombre() {
		return nombre;
	}


	public final EstadoDTO setNombre(final String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
		
		return this;
	}
	
	
	
	

}
