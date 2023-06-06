package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class PeriodoFuncionamientoDTO {

	private UUID identificador;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private DiaFestivoDTO diaFestivo;
	private EstadoPeriodoFuncionamientoDTO estado;
	
	
	
	public PeriodoFuncionamientoDTO(UUID identificador, String nombre, Date fechaInicio, Date fechaFin, DiaFestivoDTO diaFestivo, EstadoPeriodoFuncionamientoDTO estado) {
		setIdentificador(identificador);
		setNombre(nombre);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
		setDiaFestivo(diaFestivo);
		setEstado(estado);
	}


	public PeriodoFuncionamientoDTO() {	
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setFechaInicio(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
		setDiaFestivo(DiaFestivoDTO.create());
		setEstado(EstadoPeriodoFuncionamientoDTO.create());

		}
	
	public static final PeriodoFuncionamientoDTO create() {
		return new PeriodoFuncionamientoDTO();
	}
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	
	public final PeriodoFuncionamientoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public final PeriodoFuncionamientoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	
	public final PeriodoFuncionamientoDTO setFechaInicio(final Date fechaInicio) {
		this.fechaInicio = UtilDateTime.getDefaultDate(fechaInicio);
		return this;
	}
	
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public final PeriodoFuncionamientoDTO setFechaFin(final Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		return this;
	}
	
	
	public DiaFestivoDTO getDiaFestivo() {
		return diaFestivo;
	}
	
	
	public PeriodoFuncionamientoDTO setDiaFestivo(final DiaFestivoDTO diaFestivo) {
		this.diaFestivo = UtilObject.getDefault(diaFestivo, DiaFestivoDTO.create());
		return this;
		
	}
	
	
	public EstadoPeriodoFuncionamientoDTO getEstado() {
		return estado;
	}
	
	
	public PeriodoFuncionamientoDTO setEstado(EstadoPeriodoFuncionamientoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPeriodoFuncionamientoDTO.create());
		return this;
	}
	
	
}
