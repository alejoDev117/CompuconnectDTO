package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class UsuarioDTO {
	
	protected UUID identificador;
	protected TipoUsuarioDTO tipoUsuario;
	protected String nombre;
	protected TipoIdentificacionDTO tipoIdentificacion;
	protected String identificacion;
	protected String correoInstitucional;
	

	public UsuarioDTO(UUID identificador, TipoUsuarioDTO tipoUsuario, String nombre, TipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion, String correoInstitucional ) {
		setIdentificador(identificador);
		setTipoUsuario(tipoUsuario);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		
	}
	
	public UsuarioDTO() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoUsuario(TipoUsuarioDTO.create());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setIdentificacion(UtilText.getUtilText().getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		
	}
	
	public static UsuarioDTO create() {
		return new UsuarioDTO();
	}
	
	
	public  TipoUsuarioDTO getTipoUsuario() {
		return tipoUsuario;
	}




	public  UsuarioDTO setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioDTO.create());
		return this;
	}




	
	public UUID getIdentificador() {
		return identificador;
	}


	public UsuarioDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	public UsuarioDTO setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
		return this;
	}


	public String getIdentificacion() {
		
		return identificacion;
	}


	public UsuarioDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.getUtilText().applyTrim(identificacion);
		return this;
	}


	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	
	public UsuarioDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}

	
	public String getNombre() {
		return nombre;
	}


	public UsuarioDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	
}
