package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SolicitudDTO extends ContenidoDTO {
	
	private TipoSolicitudDTO tipoSolicitud;
	private EstadoSolicitudDTO estadoSolicitud;
	
	public SolicitudDTO(UUID identificador, UsuarioDTO autor, TipoSolicitudDTO tipoSolicitud, String descripcion, Date horaCreacion, EstadoSolicitudDTO estadoSolicitud) {
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
		setHoraCreacion(UtilDateTime.getDefaultValueDate());
		setEstadoSolicitud(EstadoSolicitudDTO.create());
		
	}
	
	
	public static final SolicitudDTO create() {
		return new SolicitudDTO();
	}
	

	@Override
	public UUID getIdentificador() {
		return identificador;
	}

	@Override
	public ContenidoDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	@Override
	public UsuarioDTO getAutor() {
		return autor;
	}

	@Override
	public ContenidoDTO setAutor(UsuarioDTO autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioDTO.create());
		return this;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public ContenidoDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		return this;
	}

	@Override
	public Date getHoraCreacion() {
		return horaCreacion;
	}

	@Override
	public ContenidoDTO setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultDate(horaCreacion);
		return this;
	}

	public final TipoSolicitudDTO getTipoSolicitud() {
		return tipoSolicitud;
	}

	public final ContenidoDTO setTipoSolicitud(TipoSolicitudDTO tipoSolicitud) {
		this.tipoSolicitud = UtilObject.getDefault(tipoSolicitud, TipoSolicitudDTO.create());
		return this;
	}

	public final EstadoSolicitudDTO getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public final ContenidoDTO setEstadoSolicitud(EstadoSolicitudDTO estadoSolicitud) {
		this.estadoSolicitud = UtilObject.getDefault(estadoSolicitud, EstadoSolicitudDTO.create());
		return this;
	}


	
}
