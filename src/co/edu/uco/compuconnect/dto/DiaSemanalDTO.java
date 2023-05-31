package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DiaSemanalDTO {
	
	private UUID identificador;
	private String nombre;
	
	
	public DiaSemanalDTO(UUID identificador, String nombre) {
		setIdentificador(identificador);
		setNombre(nombre);
	}
	
	public DiaSemanalDTO() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
	}
	
	public static final DiaSemanalDTO create() {
		return new DiaSemanalDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final DiaSemanalDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final DiaSemanalDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	}
	
}

