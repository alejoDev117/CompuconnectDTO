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




	public final DestinatarioDTO setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
		this.tipoUsuario = UtilObject.getDefault(tipoUsuario, TipoUsuarioDTO.create());
		return this;
	}




	@Override
	protected UUID getIdentificador() {
		return identificador;
	}

	@Override
	public DestinatarioDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	@Override
	protected String getCorreoInstitucional() {
		return correoInstitucional;
	}

	@Override
	protected DestinatarioDTO setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = UtilText.applyTrim(correoInstitucional);
		return this;
	}

	@Override
	protected String getIdentificacion() {
		
		return identificacion;
	}

	@Override
	protected DestinatarioDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilText.applyTrim(identificacion);
		return this;
	}

	@Override
	protected TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	@Override
	protected DestinatarioDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}

	@Override
	protected String getNombre() {
		return nombre;
	}

	@Override
	protected DestinatarioDTO setNombre(String nombre) {
		this.nombre = UtilText.applyTrim(nombre);
		return this;
	}

	
}
