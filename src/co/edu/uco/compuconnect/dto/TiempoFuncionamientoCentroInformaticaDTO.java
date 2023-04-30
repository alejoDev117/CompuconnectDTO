package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class TiempoFuncionamientoCentroInformaticaDTO {
	
	private UUID identificador;
	private PeriodoFuncionamientoDTO periodoFuncionamiento;
	private CentroInformaticaDTO centroInformatica;
	private DiaSemanalDTO dia;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	
	public TiempoFuncionamientoCentroInformaticaDTO(UUID identificador, PeriodoFuncionamientoDTO periodoFuncionamiento,CentroInformaticaDTO centroInformatica, DiaSemanalDTO dia,LocalTime horaInicio, LocalTime horaFin) {
		super();
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setCentroInformatica(centroInformatica);
		setDia(dia);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
		
		
	}


	public TiempoFuncionamientoCentroInformaticaDTO() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoDTO.create());
		setCentroInformatica(CentroInformaticaDTO.create());
		setDia(DiaSemanalDTO.create());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
		
		}
	
	
	public static final TiempoFuncionamientoCentroInformaticaDTO create() {
		return new TiempoFuncionamientoCentroInformaticaDTO();
	}
	
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	
	public final TiempoFuncionamientoCentroInformaticaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public PeriodoFuncionamientoDTO getPeriodoFuncionamiento() {
		return periodoFuncionamiento;
	}
	
	
	public final TiempoFuncionamientoCentroInformaticaDTO setPeriodoFuncionamiento(final PeriodoFuncionamientoDTO centroInformatica) {
		this.periodoFuncionamiento = UtilObject.getDefault(periodoFuncionamiento, PeriodoFuncionamientoDTO.create());
		return this;
	}
	
	
	public CentroInformaticaDTO getCentroInfomatica() {
		return centroInformatica;
		
	}
	
	
	public final TiempoFuncionamientoCentroInformaticaDTO setCentroInformatica(final CentroInformaticaDTO centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaDTO.create());
		return this;
	}
	
	
	public DiaSemanalDTO getDia() {
		return dia;
	}
	
	
	public TiempoFuncionamientoCentroInformaticaDTO setDia(final DiaSemanalDTO dia) {
		this.dia = UtilObject.getDefault(dia, DiaSemanalDTO.create());
		return this;
	}
	
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	
	public TiempoFuncionamientoCentroInformaticaDTO setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
		return this;
	}

	
	
	public LocalTime getHoraFin() {
		return horaFin;
	}
	
	public TiempoFuncionamientoCentroInformaticaDTO setHoraFin(LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
		return this;
	}
	
	
	
	
}
