package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CoordinadorDTO{
	
	private String numeroCelular;
	private UUID identificador;
	private String correoInstitucional;
	private String identificacion;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String nombre;

	
	public CoordinadorDTO(UUID identificador, String nombre, TipoIdentificacionDTO tipoIdentificacion, String identificacion, String correoInstitucional, String numeroCelular) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
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
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		return this;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public CoordinadorDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
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
		this.nombre = UtilText.applyTrim(nombre);
		return this;
	}


	
	public String getNumeroCelular() {
		return numeroCelular;
	}


	
	public CoordinadorDTO setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilText.applyTrim(numeroCelular);
		return this;
	}
	


}
