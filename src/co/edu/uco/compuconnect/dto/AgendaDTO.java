package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class AgendaDTO {
	
	private UUID identificador;
	private PeriodoFuncionamientoDTO periodoFuncionamiento;
	private CentroInformaticaDTO centroInformatica;
	private String nombre;
	
	
	public AgendaDTO(UUID identificador, String nombre, Date fechaInicio, Date fechaFin, DiaFestivoDTO diaFestivo, EstadoPeriodoFuncionamientoDTO estado) {
		super();
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setCentroInformatica(centroInformatica);
		setNombre(nombre);
		
	}


	public AgendaDTO() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoDTO.create());
		setCentroInformatica(CentroInformaticaDTO.create());
		setNombre(UtilText.getDefaultValue());
		
		
	}
	
	public static final AgendaDTO create() {
		return new AgendaDTO();
	}
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	
	public final AgendaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}
	
	
	public PeriodoFuncionamientoDTO getPeriodoFuncionamiento() {
		return periodoFuncionamiento;
	}
	
	public final AgendaDTO setPeriodoFuncionamiento(final PeriodoFuncionamientoDTO centroInformatica) {
		this.periodoFuncionamiento = UtilObject.getDefault(periodoFuncionamiento, PeriodoFuncionamientoDTO.create());
		return this;
	}
	
	
	public CentroInformaticaDTO getCentroInformatica() {
		return centroInformatica;
	}
	
	public final AgendaDTO setCentroInformatica(final CentroInformaticaDTO centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaDTO.create());
		return this;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public final AgendaDTO setNombre(final String nombre) {
		this.nombre = UtilText.applyTrim(nombre) ;
		return this;
	}
	
	
	

}
