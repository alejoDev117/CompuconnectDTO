package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class PerfilDTO {
	
	private UUID identificador;
	private UsuarioDTO usuario;
	
	
	public PerfilDTO(final UUID identificador, UsuarioDTO usuario) {
		super();
		setIdentificador(identificador);
		setUsuario(usuario);
	}
	
	public PerfilDTO() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setUsuario(UsuarioDTO.create());
	}
	
	public static final PerfilDTO create() {
		return new PerfilDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PerfilDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final UsuarioDTO getUsuario() {
		return usuario;
	}
	public final PerfilDTO setUsuario(final UsuarioDTO usuario) {
		this.usuario = UtilObject.getDefault(usuario, UsuarioDTO.create());
		return this;
	}
	
//
}
