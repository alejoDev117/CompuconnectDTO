package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class EstadoEquipoComputoDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public EstadoEquipoComputoDTO(UUID identificador, String nombre, String descripcion) {
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public EstadoEquipoComputoDTO() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	public static final EstadoEquipoComputoDTO create() {
		return new EstadoEquipoComputoDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final EstadoEquipoComputoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final EstadoEquipoComputoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final EstadoEquipoComputoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	

}
