package co.edu.uco.compuconnect.dto;



import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class ReservaDTO{
	
	private UUID identificador;
	private AgendaDTO agenda;
	private String descripcion;
	private TipoReservaDTO tipoReserva;
	private Date fechaInicio;
	private Date fechaFin;
	private  FrecuenciaDTO frecuencia;
	private Date horaCreacion;
	private UsuarioDTO autor;
	

	public ReservaDTO(UUID identificador,AgendaDTO agenda, UsuarioDTO autor, TipoReservaDTO tipoReserva, Date FechaInicio, Date FechaFin,FrecuenciaDTO frecuencia,String descripcion, Date horaCreacion) {
		setIdentificador(identificador);
		setAgenda(agenda);
		setAutor(autor);
		setTipoReserva(tipoReserva);
		setFechaInicio(FechaInicio);
		setFechaFin(FechaFin);
		setFrecuencia(frecuencia);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
	}
	
	public ReservaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAgenda(AgendaDTO.create());
		setAutor(UsuarioDTO.create());
		setTipoReserva(TipoReservaDTO.create());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setFrecuencia(FrecuenciaDTO.create());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueDate());
	}
	
	public static final ReservaDTO create() {
		return new ReservaDTO();
	}
	

	public UUID getIdentificador() {
		return identificador;
	}


	public final Date getHoraCreacion() {
		return horaCreacion;
	}

	public final ReservaDTO setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultDate(horaCreacion);
		return this;
	}

	public ReservaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	

	
	public UsuarioDTO getAutor() {
		return autor;
	}

	public ReservaDTO setAutor(UsuarioDTO autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioDTO.create());
		return this;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public ReservaDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		return this;
	}
	
	
	public final TipoReservaDTO getTipoReserva() {
		return tipoReserva;
	}

	public final ReservaDTO setTipoReserva(TipoReservaDTO tipoReserva) {
		this.tipoReserva = UtilObject.getDefault(tipoReserva, TipoReservaDTO.create());
		return this;
	}

	public final Date getFechaInicio() {
		return fechaInicio;
	}

	public final ReservaDTO setFechaInicio(Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		return this;
	}

	public final Date getFechaFin() {
		return fechaFin;
	}

	public final ReservaDTO setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
	}

	public final FrecuenciaDTO getFrecuencia() {
		return frecuencia;
	}

	public final ReservaDTO setFrecuencia(FrecuenciaDTO frecuencia) {
		this.frecuencia = UtilObject.getDefault(frecuencia, FrecuenciaDTO.create());
		return this;
	}


	public final ReservaDTO setAgenda(AgendaDTO agenda) {
		this.agenda = UtilObject.getDefault(agenda, AgendaDTO.create());
		return this;
	}
	
	public final ReservaDTO getAgenda() {
		return agenda;
	}

}
