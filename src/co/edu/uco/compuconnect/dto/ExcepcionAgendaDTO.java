package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ExcepcionAgendaDTO {
	
	private UUID identificador;
	private ExcepcionDTO excepcion;
	private AgendaDTO agenda;
	
	
	public ExcepcionAgendaDTO(UUID identificador, ExcepcionDTO excepcion, AgendaDTO agenda) {
		super();
		setIdentificador(identificador);
		setExcepcion(excepcion);
		setAgenda(agenda);
		
	}


	public ExcepcionAgendaDTO() {
		super();	
		setIdentificador(UtilUUID.getDefaultUuid());
		setExcepcion(ExcepcionDTO.create());
		setAgenda(AgendaDTO.create());
		
		
		
		
		}
	
	public static final ExcepcionAgendaDTO create() {
		return new ExcepcionAgendaDTO();
	}
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	public final ExcepcionAgendaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public ExcepcionDTO getExcepcion() {
		return excepcion;
	}
	
	public ExcepcionAgendaDTO setExcepcion(final ExcepcionDTO excepcion) {
		this.excepcion = UtilObject.getDefault(excepcion, ExcepcionDTO.create());
		return this;
		
	}
	
	public AgendaDTO getAgenda() {
		return agenda;
	}
	
	public ExcepcionAgendaDTO setAgenda(final AgendaDTO agenda) {
		this.agenda = UtilObject.getDefault(agenda, AgendaDTO.create());
		return this;
	}
	
	

}
