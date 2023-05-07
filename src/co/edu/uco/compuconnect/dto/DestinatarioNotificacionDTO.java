package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class DestinatarioNotificacionDTO {
	
	private UUID identificador;
	private UsuarioDTO destinatario;
	private NotificacionDTO notificacion;
	private EstadoNotificacionDTO estado;
	
	
	public DestinatarioNotificacionDTO(UUID identificador, UsuarioDTO destinatario, NotificacionDTO notificacion, EstadoNotificacionDTO estado) {
		super();
		setIdentificador(identificador);
		setDestinatario(destinatario);
		setNotificacion(notificacion);
		setEstado(estado);
	}
	
	public DestinatarioNotificacionDTO() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setDestinatario(UsuarioDTO.create());
		setNotificacion(NotificacionDTO.create());
		setEstado(EstadoNotificacionDTO.create());
	}
	
	
	public static final DestinatarioNotificacionDTO create() {
		return new DestinatarioNotificacionDTO();
	}

	
	public final UUID getIdentificador() {
		return identificador;
	}

	
	public final DestinatarioNotificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	
	public final UsuarioDTO getDestinatario() {
		return destinatario;
	}

	
	public final DestinatarioNotificacionDTO setDestinatario(UsuarioDTO destinatario) {
		this.destinatario = UtilObject.getDefault(destinatario, UsuarioDTO.create());
		return this;
	}

	
	public final NotificacionDTO getNotificacion() {
		return notificacion;
	}

	
	public final DestinatarioNotificacionDTO setNotificacion(NotificacionDTO notificacion) {
		this.notificacion = UtilObject.getDefault(notificacion, NotificacionDTO.create());
		return this;
	}

	
	public final EstadoNotificacionDTO getEstado() {
		return estado;
	}

	
	public final DestinatarioNotificacionDTO setEstado(EstadoNotificacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoNotificacionDTO.create());
		return this;
	}
	
	
	
	

}
