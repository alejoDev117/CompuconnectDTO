package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class RespuestaDTO {
	
	private UUID identificador;
	private CoordinadorDTO autor;
	private String observacion;
	private Date fecha;
	
	public RespuestaDTO(UUID identificador, CoordinadorDTO autor, String observacion, Date fecha) {
		setIdentificador(identificador);
		setAutor(autor);
		setObservacion(observacion);
		setFecha(fecha);
	}
	
	public RespuestaDTO() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(CoordinadorDTO.create());
		setObservacion(UtilText.getUtilText().getDefaultValue());
		setFecha(UtilDateTime.getDefaultValueDate());
	}
	
	public static final RespuestaDTO create() {
		return new RespuestaDTO();
	}

	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	
	public final RespuestaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	
	public final CoordinadorDTO getAutor() {
		return autor;
	}

	
	public final RespuestaDTO setAutor(final CoordinadorDTO autor) {
		this.autor = UtilObject.getDefault(autor, CoordinadorDTO.create());
		return this;
	}

	
	public final String getObservacion() {
		return observacion;
	}

	
	public final RespuestaDTO setObservacion(final String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
		return this;
	}

	
	public final Date getFecha() {
		return fecha;
	}

	
	public final RespuestaDTO setFecha(final Date fecha) {
		this.fecha = UtilDateTime.getDefaultDate(fecha);
		return this;
	}
	
	
	
	
	
	

}
