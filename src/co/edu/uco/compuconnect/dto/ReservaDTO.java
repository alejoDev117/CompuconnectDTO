package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

public class ReservaDTO {
	
	private UUID identificador;
	private Date fechaIncio;
	private Date fechaFin;
	private FrecuenciaDTO frecuencia;
	private CentroInformaticaDTO centroInformatica;
<<<<<<< Updated upstream
=======
	

	public ReservaDTO(UUID identificador, UsuarioDTO autor, TipoReservaDTO tipoReserva, Date FechaInicio, Date FechaFin,FrecuenciaDTO frecuencia, CentroInformaticaDTO centroInformatica,String descripcion, Date horaCreacion) {
		setIdentificador(identificador);
		setAutor(autor);
		setTipoReserva(tipoReserva);
		setFechaInicio(FechaInicio);
		setFechaFin(FechaFin);
		setFrecuencia(frecuencia);
		setCentroInformatica(centroInformatica);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
	}
	
	public ReservaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioDTO.create());
		setTipoReserva(TipoReservaDTO.create());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setFrecuencia(FrecuenciaDTO.create());
		setCentroInformatica(CentroInformaticaDTO.create());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueDate());
	}
	
	public static final ReservaDTO create() {
		return new ReservaDTO();
	}
	

	public UUID getIdentificador() {
		return identificador;
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


	public Date getHoraCreacion() {
		return horaCreacion;
	}


	public ReservaDTO setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultDate(horaCreacion);
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

	public final CentroInformaticaDTO getCentroInformatica() {
		return centroInformatica;
	}

	public final ReservaDTO setCentroInformatica(CentroInformaticaDTO centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaDTO.create());
		return this;
	}
	
	//
>>>>>>> Stashed changes

}
