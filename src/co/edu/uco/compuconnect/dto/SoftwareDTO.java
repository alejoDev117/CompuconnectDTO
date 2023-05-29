package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SoftwareDTO {
	
	private UUID identificador;
	private String nombre;
	private String version;
	
	
	public SoftwareDTO(UUID identificador, String nombre, String version) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setVersion(version);
	}


	public SoftwareDTO() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setVersion(UtilText.getUtilText().getDefaultValue());
		}
	
	

	public static final SoftwareDTO create() {
		return new SoftwareDTO();
	}
	

	public final UUID getIdentidicador() {
		return identificador;
	}

	

	public final SoftwareDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}

	

	public final String getNombre() {
		return nombre;
	}

	

	public final SoftwareDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}


	
	public final String getVersion() {
		return version;
	}


	
	public final SoftwareDTO setVersion(final String version) {
		this.version = UtilText.getUtilText().applyTrim(version);
		return this;
	}
	

	
	
}
