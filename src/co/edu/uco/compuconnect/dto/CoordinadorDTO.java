package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CoordinadorDTO extends UsuarioDTO {

	private String numeroCelular;
	
	public CoordinadorDTO(UUID identificador, String nombre, TipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion, String correoInstitucional, String numeroCelular, TipoUsuarioDTO tipoUsuario) {
		setIdentificador(identificador);
		setNombre(nombre);
		setTipoUsuario(tipoUsuario);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		setNumeroCelular(numeroCelular);
		
	}
	
	
	public CoordinadorDTO() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setTipoUsuario(TipoUsuarioDTO.create());
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setIdentificacion(UtilText.getUtilText().getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		setNumeroCelular(UtilText.getUtilText().getDefaultValue());
		
	}
	
	public static final CoordinadorDTO create() {
		return new CoordinadorDTO();
	}
	


	public UUID getIdentificador() {
		return identificador;
	}


	public CoordinadorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	public CoordinadorDTO setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
		return this;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public CoordinadorDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.getUtilText().applyTrim(identificacion);
		return this;
	}


	public TipoIdentificacionDTO getTipoIdentificacion() {

		return tipoIdentificacion;
	}

	
	public CoordinadorDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion,TipoIdentificacionDTO.create());
		return this;
	}


	public String getNombre() {
		return nombre;
	}


	public CoordinadorDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}


	
	public String getNumeroCelular() {
		return numeroCelular;
	}


	
	public CoordinadorDTO setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilText.getUtilText().applyTrim(numeroCelular);
		return this;
	}
	
	public TipoUsuarioDTO getTipoUsuario() {
		return tipoUsuario;
	}

	public CoordinadorDTO setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioDTO.create());
		return this;
	}

}
