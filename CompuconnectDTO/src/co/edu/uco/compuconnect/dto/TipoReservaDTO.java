package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class TipoReservaDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	public TipoReservaDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public TipoReservaDTO(UUID identificador, String nombre, String descripcion) { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
		setDescripcion(UtilText.getDefaultValue());
	}
	
	public static final TipoReservaDTO create() {
		return new TipoReservaDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoReservaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoReservaDTO setNombre(final String nombre) {
		this.nombre = UtilText.applyTrim(nombre) ;
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoReservaDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		return this;
	}
	
	

}
