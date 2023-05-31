package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class AgendaDTO {
	
	private UUID identificador;
	private PeriodoFuncionamientoDTO periodoFuncionamiento;
	private CentroInformaticaDTO centroInformatica;
	private String nombre;
	
	
	


	public AgendaDTO(UUID identificador, PeriodoFuncionamientoDTO periodoFuncionamiento,
			CentroInformaticaDTO centroInformatica, String nombre) {
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setCentroInformatica(centroInformatica);
		setNombre(nombre);
	}

	public AgendaDTO() {	
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoDTO.create());
		setCentroInformatica(CentroInformaticaDTO.create());
		setNombre(UtilText.getUtilText().getDefaultValue());
		
		
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
	
	public final AgendaDTO setPeriodoFuncionamiento(final PeriodoFuncionamientoDTO periodoFuncionamiento) {
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
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	}



}
