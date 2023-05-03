package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilMail;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class UsuarioDTO extends DestinatarioDTO {
	
	private TipoUsuarioDTO tipoUsuario;
	

	public UsuarioDTO(UUID identificador, TipoUsuarioDTO tipoUsuario, String nombre, TipoIdentificacionDTO tipoIdentificacion, String numeroIdentificacion, String correoInstitucional ) {
		setIdentificador(identificador);
		setTipoUsuario(tipoUsuario);
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(numeroIdentificacion);
		setCorreoInstitucional(correoInstitucional);
		
	}
	
	public UsuarioDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoUsuario(TipoUsuarioDTO.create());
		setNombre(UtilText.getDefaultValue());
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setIdentificacion(UtilText.getDefaultValue());
		setCorreoInstitucional(UtilMail.getDefaultValueMail());
		
	}
	
	public static final UsuarioDTO create() {
		return new UsuarioDTO();
	}
	
	
	public final TipoUsuarioDTO getTipoUsuario() {
		return tipoUsuario;
	}




	public final UsuarioDTO setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
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
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		return this;
	}


	public String getIdentificacion() {
		
		return identificacion;
	}


	public UsuarioDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
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
		this.nombre = UtilText.applyTrim(nombre);
		return this;
	}

	
}
