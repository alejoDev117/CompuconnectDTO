package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DetalleReservaDTO {

	private UUID identificador;
	private ReservaDTO reserva;
	private DiaSemanalDTO dia;
	private LocalTime horaInicio;
	private LocalTime horFin;
	
	
	public DetalleReservaDTO(final UUID identificador, final ReservaDTO reserva, final DiaSemanalDTO dia, LocalTime horaInicio, LocalTime horFin) {
		super();
		setIdentificador(identificador);
		setReserva(reserva);
		setDia(dia);
		setHoraInicio(horaInicio);
		setHorFin(horFin);
	}
	
	private DetalleReservaDTO() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setReserva(ReservaDTO.create());
		setDia(DiaSemanalDTO.create());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHorFin(UtilDateTime.getDefaultValueLocaltime());
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
	public DetalleReservaDTO setReserva(final ReservaDTO reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaDTO.create());
		return this;
	}
	
	public ReservaDTO getReserva() {
		return reserva;
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
	public LocalTime getHorFin() {
		return horFin;
	}
	public DetalleReservaDTO setHorFin(final LocalTime horFin) {
		this.horFin = UtilDateTime.getDefaultLocalTime(horFin);
		return this;
	}
	
	
	
}
