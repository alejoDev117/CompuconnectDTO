package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class DestinatarioDTO {
	
	private UUID identificador;
	private String correoInstitucional;
	private String identificacion;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String nombre;
	
	public DestinatarioDTO(UUID identificador, String correoInstitucional, String identificacion, TipoIdentificacionDTO tipoIdentificacion, String nombre) {
		super();
		setIdentificador(identificador);
		setCorreoInstitucional(correoInstitucional);
		setIdentificacion(identificacion);
		setTipoIdentificacion(tipoIdentificacion);
		setNombre(nombre);
	}
	
	public DestinatarioDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setIdentificacion(UtilText.getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setNombre(UtilText.getDefaultValue());
	}
	
	public static final DestinatarioDTO create() {
		return new DestinatarioDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final DestinatarioDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final String getCorreoInstitucional() {
		return correoInstitucional;
	}

	public final DestinatarioDTO setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		return this;
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	public final DestinatarioDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
		return this;
	}

	public final TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public final DestinatarioDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final DestinatarioDTO setNombre(String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
		return this;
	}
	
}
