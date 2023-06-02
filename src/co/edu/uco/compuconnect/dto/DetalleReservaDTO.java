package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DetalleReservaDTO {

	private UUID identificador;
	private DiaSemanalDTO dia;
	private LocalTime horaInicio;
	private LocalTime horFin;
	
	
	public DetalleReservaDTO(final UUID identificador, final DiaSemanalDTO dia, LocalTime horaInicio, LocalTime horFin) {
		setIdentificador(identificador);
		setDia(dia);
		setHoraInicio(horaInicio);
		setHorFin(horFin);
	}
	
	public DetalleReservaDTO() { 
		setIdentificador(UtilUUID.getDefaultUuid());
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
