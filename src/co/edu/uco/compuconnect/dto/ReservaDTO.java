package co.edu.uco.compuconnect.dto;



import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class ReservaDTO extends ContenidoDTO{
	
	private TipoReservaDTO tipoReserva;
	private Date fechaInicio;
	private Date fechaFin;
	private  FrecuenciaDTO frecuencia;
	private CentroInformaticaDTO centroInformatica;
	

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

	
	
	public final TipoReservaDTO getTipoReserva() {
		return tipoReserva;
	}

	public final ContenidoDTO setTipoReserva(TipoReservaDTO tipoReserva) {
		this.tipoReserva = UtilObject.getDefault(tipoReserva, TipoReservaDTO.create());
		return this;
	}

	public final Date getFechaInicio() {
		return fechaInicio;
	}

	public final ContenidoDTO setFechaInicio(Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		return this;
	}

	public final Date getFechaFin() {
		return fechaFin;
	}

	public final ContenidoDTO setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
	}

	public final FrecuenciaDTO getFrecuencia() {
		return frecuencia;
	}

	public final ContenidoDTO setFrecuencia(FrecuenciaDTO frecuencia) {
		this.frecuencia = UtilObject.getDefault(frecuencia, FrecuenciaDTO.create());
		return this;
	}

	public final CentroInformaticaDTO getCentroInformatica() {
		return centroInformatica;
	}

	public final ContenidoDTO setCentroInformatica(CentroInformaticaDTO centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaDTO.create());
		return this;
	}
	
	

}
