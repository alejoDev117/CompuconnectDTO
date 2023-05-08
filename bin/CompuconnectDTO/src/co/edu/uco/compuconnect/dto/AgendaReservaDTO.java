package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class AgendaReservaDTO {
	
	private UUID identificador;
	private AgendaDTO agenda;
	private ReservaDTO reserva;
	
	
	public AgendaReservaDTO(final UUID identificador, AgendaDTO agenda, ReservaDTO reserva) {
		super();
		setIdentificador(identificador);
		setAgenda(agenda);
		setReserva(reserva);
		
	}
	
	public AgendaReservaDTO() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAgenda(AgendaDTO.create());
		setReserva(ReservaDTO.create());
		
	}
	
	public static final AgendaReservaDTO create() {
		return new AgendaReservaDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final AgendaReservaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final AgendaDTO getAgenda() {
		return agenda;
	}
	public final AgendaReservaDTO setAgenda(AgendaDTO agenda) {
		this.agenda = UtilObject.getDefault(agenda, AgendaDTO.create());
		return this;
		
	}
	public final ReservaDTO getReserva() {
		return reserva;
	}
	public final AgendaReservaDTO setReserva(ReservaDTO reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaDTO.create());
		return this;
	}
	
	

}
