package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class BuzonSolicitudDTO {
	
	private UUID identificador;
	private SolicitudDTO solicitud;
	private RespuestaDTO respuesta;
	
	
	public BuzonSolicitudDTO(UUID identificador, SolicitudDTO solicitud, RespuestaDTO respuesta) {
		setIdentificador(identificador);
		setSolicitud(solicitud);
		setRespuesta(respuesta);
	}
	
	public BuzonSolicitudDTO() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setSolicitud(SolicitudDTO.create());
		setRespuesta(RespuestaDTO.create());
	}
	
	public static final BuzonSolicitudDTO create() {
		return new BuzonSolicitudDTO();
	}
	


	public final UUID getIdentificador() {
		return identificador;
	}


	public final BuzonSolicitudDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final SolicitudDTO getSolicitud() {
		return solicitud;
	}


	public final BuzonSolicitudDTO setSolicitud(final SolicitudDTO solicitud) {
		this.solicitud = UtilObject.getDefault(solicitud, SolicitudDTO.create());
		return this;
	}


	public final RespuestaDTO getRespuesta() {
		return respuesta;
	}


	public final BuzonSolicitudDTO setRespuesta(final RespuestaDTO respuesta) {
		this.respuesta = UtilObject.getDefault(respuesta, RespuestaDTO.create());
		return this;
	}
	
	
	
	

}
