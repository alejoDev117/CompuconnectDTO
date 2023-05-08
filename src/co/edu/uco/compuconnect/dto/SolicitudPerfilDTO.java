package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class SolicitudPerfilDTO {
	
	private UUID identificador;
	private SolicitudDTO solicitud;
	private PerfilDTO perfil;
	
	
	public SolicitudPerfilDTO(final UUID identificador, final SolicitudDTO solicitud, final PerfilDTO perfil) {
		super();
		setIdentificador(identificador);
		setSolicitud(solicitud);
		setPerfil(perfil);
	}
	
	public SolicitudPerfilDTO() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setSolicitud(SolicitudDTO.create());
		setPerfil(PerfilDTO.create());
	}
	
	public static final SolicitudPerfilDTO create() {
		return new SolicitudPerfilDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final SolicitudPerfilDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final SolicitudDTO getSolicitud() {
		return solicitud;
	}
	public final SolicitudPerfilDTO setSolicitud(SolicitudDTO solicitud) {
		this.solicitud = UtilObject.getDefault(solicitud, SolicitudDTO.create());
		return this;
		
	}
	public final PerfilDTO getPerfil() {
		return perfil;
	}
	public final SolicitudPerfilDTO setPerfil(PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}
	
	

}
