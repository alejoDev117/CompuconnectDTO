package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DetalleReservaDTO {

	private UUID identificador;
	private ReservaDTO reserva;
	private DiaSemanalDTO dia;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	
	public DetalleReservaDTO(final UUID identificador,ReservaDTO reserva, final DiaSemanalDTO dia, LocalTime horaInicio, LocalTime horaFin) {
		setIdentificador(identificador);
		setReserva(reserva);
		setDia(dia);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
	}
	
	public DetalleReservaDTO() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setReserva(reserva);
		setDia(DiaSemanalDTO.create());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
	}
	
	public static final DetalleReservaDTO create() {
		return new DetalleReservaDTO();
	}
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	public DetalleReservaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
		
	}

	public DiaSemanalDTO getDia() {
		return dia;
	}
	public DetalleReservaDTO setDia(final DiaSemanalDTO dia) {
		this.dia = UtilObject.getDefault(dia, DiaSemanalDTO.create());
		return this;
	}
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public DetalleReservaDTO setHoraInicio(final LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
		return this;
	}
	public LocalTime getHoraFin() {
		return horaFin;
	}
	public DetalleReservaDTO setHoraFin(final LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
		return this;
	}

	public final ReservaDTO getReserva() {
		return reserva;
	}

	public final DetalleReservaDTO setReserva(ReservaDTO reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaDTO.create());
		return this;
	}
	
	
	
	
}
