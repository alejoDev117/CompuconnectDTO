package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class NotificacionDTO {
	
	private UUID identificador;
	private ContenidoDTO contenido;
	private Date fecha;
	private TipoNotificacionDTO tiponotificacion;
	
	
	public NotificacionDTO(UUID identificador, ContenidoDTO contenido, Date fecha, TipoNotificacionDTO tiponotificacion) {
		setIdentificador(identificador);
		setContenido(contenido);
		setFecha(fecha);
		setTiponotificacion(tiponotificacion);
	}
	
	public NotificacionDTO(){
		setIdentificador(UtilUUID.getDefaultUuid());
		setContenido(ContenidoDTO.create());
		setFecha(UtilDateTime.getDefaultValueDate());
		setTiponotificacion(TipoNotificacionDTO.create());
	}
	
	public static final NotificacionDTO create() {
		return new NotificacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final NotificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final ContenidoDTO getContenido() {
		return contenido;
	}

	public final NotificacionDTO setContenido(final ContenidoDTO contenido) {
		this.contenido = UtilObject.getDefault(contenido, ContenidoDTO.create());
		return this;
	}

	public final Date getFecha() {
		return fecha;
	}

	public final NotificacionDTO setFecha(final Date fecha) {
		this.fecha = UtilDateTime.getDefaultDate(fecha);
		return this;
	}

	public final TipoNotificacionDTO getTiponotificacion() {
		return tiponotificacion;
	}

	public final NotificacionDTO setTiponotificacion(final TipoNotificacionDTO tiponotificacion) {
		this.tiponotificacion = UtilObject.getDefault(tiponotificacion, TipoNotificacionDTO.create());
		return this;
	}
	
	
	
	

}
