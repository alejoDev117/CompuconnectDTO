package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SolicitudDTO {
	
	private UUID identificador;
	private UsuarioDTO autor;
	private String descripcion;
	private LocalTime horaCreacion;
	private TipoSolicitudDTO tipoSolicitud;
	private EstadoSolicitudDTO estadoSolicitud;
	
	public SolicitudDTO(UUID identificador, UsuarioDTO autor, TipoSolicitudDTO tipoSolicitud, String descripcion, LocalTime horaCreacion, EstadoSolicitudDTO estadoSolicitud) {
		setIdentificador(identificador);
		setAutor(autor);
		setTipoSolicitud(tipoSolicitud);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
		setEstadoSolicitud(estadoSolicitud);
		
	}
	
	
	public SolicitudDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioDTO.create());
		setTipoSolicitud(TipoSolicitudDTO.create());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueLocaltime());
		setEstadoSolicitud(EstadoSolicitudDTO.create());
		
	}
	
	
	public static final SolicitudDTO create() {
		return new SolicitudDTO();
	}
	


	public UUID getIdentificador() {
		return identificador;
	}

	
	public SolicitudDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public UsuarioDTO getAutor() {
		return autor;
	}


	public SolicitudDTO setAutor(UsuarioDTO autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioDTO.create());
		return this;
	}


	public String getDescripcion() {
		return descripcion;
	}

	
	public SolicitudDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		return this;
	}

	
	public LocalTime getHoraCreacion() {
		return horaCreacion;
	}

	
	public SolicitudDTO setHoraCreacion(LocalTime horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultLocalTime(horaCreacion);
		return this;
	}

	public final TipoSolicitudDTO getTipoSolicitud() {
		return tipoSolicitud;
	}

	public final SolicitudDTO setTipoSolicitud(TipoSolicitudDTO tipoSolicitud) {
		this.tipoSolicitud = UtilObject.getDefault(tipoSolicitud, TipoSolicitudDTO.create());
		return this;
	}

	public final EstadoSolicitudDTO getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public final SolicitudDTO setEstadoSolicitud(EstadoSolicitudDTO estadoSolicitud) {
		this.estadoSolicitud = UtilObject.getDefault(estadoSolicitud, EstadoSolicitudDTO.create());
		return this;
	}

//
	
}
