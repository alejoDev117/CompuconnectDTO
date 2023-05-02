package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CoordinadorDTO extends PersonaEncargadaDTO {

	
	
	public CoordinadorDTO(UUID identificador, String nombre, TipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion, String correoInstitucional, String numeroCelular) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		setNumeroCelular(numeroCelular);
		
	}
	
	
	public CoordinadorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setIdentificacion(UtilText.getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setNumeroCelular(UtilText.getDefaultValue());
		
	}
	
	public static final CoordinadorDTO create() {
		return new CoordinadorDTO();
	}
	

	@Override
	public UUID getIdentificador() {
		return identificador;
	}

	@Override
	public DestinatarioDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	@Override
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	@Override
	public DestinatarioDTO setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		return this;
	}

	@Override
	public String getIdentificacion() {
		return identificacion;
	}

	@Override
	public DestinatarioDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
		return this;
	}

	@Override
	public TipoIdentificacionDTO getTipoIdentificacion() {

		return tipoIdentificacion;
	}

	@Override
	public DestinatarioDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion,TipoIdentificacionDTO.create());
		return this;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public DestinatarioDTO setNombre(String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
		return this;
	}


	@Override
	public String getNumeroCelular() {
		return numeroCelular;
	}


	@Override
	public DestinatarioDTO setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilText.applyTrim(numeroCelular);
		return this;
	}
	


}
