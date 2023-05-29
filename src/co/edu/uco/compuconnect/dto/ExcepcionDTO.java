package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ExcepcionDTO {
	
	private UUID identificador;
	private Date fechaInicio;
	private Date fechaFin;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private FrecuenciaDTO frecuencia;
	private String motivo;
	
	public ExcepcionDTO(UUID identificador, Date fechaInicio, Date fechaFin, LocalTime horaInicio, LocalTime horaFin, FrecuenciaDTO frecuencia, String motivo) {
		super();
		setIdentificador(identificador);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
		setFrecuencia(frecuencia);
		setMotivo(motivo);
		
	}


	public ExcepcionDTO() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
		setFrecuencia(FrecuenciaDTO.create());
		setMotivo(UtilText.getUtilText().getDefaultValue());
		
		}
	
	public static final ExcepcionDTO create() {
		return new ExcepcionDTO();
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	public final ExcepcionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public final ExcepcionDTO setFechaInicio(final Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		return this;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	
	public final ExcepcionDTO setFechaFin(final Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
	}
	
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	public ExcepcionDTO setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
		return this;
	}
	
	public LocalTime getHoraFin() {
		return horaFin;
	}
	
	public ExcepcionDTO setHoraFin(LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
		return this;
	}
	
	public FrecuenciaDTO getFrecuencia() {
		return frecuencia;
	}
	
	public ExcepcionDTO setFrecuencia(FrecuenciaDTO frecuencia) {
		this.frecuencia = UtilObject.getDefault(frecuencia, FrecuenciaDTO.create());
		return this;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public final ExcepcionDTO setMotivo(final String motivo) {
		this.motivo = UtilText.getUtilText().applyTrim(motivo);
		return this;
	}
	
	
	
	

}
