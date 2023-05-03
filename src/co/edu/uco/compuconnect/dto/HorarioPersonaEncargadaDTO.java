package co.edu.uco.compuconnect.dto;

import java.time.LocalTime;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class HorarioPersonaEncargadaDTO {
	
	private UUID identificador;
	private TiempoFuncionamientoCentroInformaticaDTO tiempoFuncionamiento;
	private PersonaEncargadaDTO personaEncargada;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	
	public HorarioPersonaEncargadaDTO(final UUID identificador, TiempoFuncionamientoCentroInformaticaDTO tiempoFuncionamiento, PersonaEncargadaDTO personaEncargada, LocalTime horaInicio, LocalTime horaFin) {
		super();
		setIdentificador(identificador);
		setTiempoFuncionamiento(tiempoFuncionamiento);
		setPersonaEncargada(personaEncargada);
		setHoraInicio(horaInicio);
		setHoraFin(horaFin);
	}
	
	public HorarioPersonaEncargadaDTO() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTiempoFuncionamiento(TiempoFuncionamientoCentroInformaticaDTO.create());
		setPersonaEncargada(CoordinadorDTO.create());
		setHoraInicio(UtilDateTime.getDefaultValueLocaltime());
		setHoraFin(UtilDateTime.getDefaultValueLocaltime());
	}
	
	public static final HorarioPersonaEncargadaDTO create() {
		return new HorarioPersonaEncargadaDTO();
	}
	
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final HorarioPersonaEncargadaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final TiempoFuncionamientoCentroInformaticaDTO getTiempoFuncionamiento() {
		return tiempoFuncionamiento;
	}
	public final HorarioPersonaEncargadaDTO setTiempoFuncionamiento(TiempoFuncionamientoCentroInformaticaDTO tiempoFuncionamiento) {
		this.tiempoFuncionamiento = UtilObject.getDefault(tiempoFuncionamiento, TiempoFuncionamientoCentroInformaticaDTO.create());
		return this;
	}
	
	public final PersonaEncargadaDTO getPersonaEncargada() {
		return personaEncargada;
	}
	public final HorarioPersonaEncargadaDTO setPersonaEncargada(PersonaEncargadaDTO personaEncargada) {
		this.personaEncargada = UtilObject.getDefault(personaEncargada, CoordinadorDTO.create());
		return this;
	}
	public final LocalTime getHoraInicio() {
		return horaInicio;
	}
	public final HorarioPersonaEncargadaDTO setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = UtilDateTime.getDefaultLocalTime(horaInicio);
		return this;
	}
	public final LocalTime getHoraFin() {
		return horaFin;
	}
	public final HorarioPersonaEncargadaDTO setHoraFin(LocalTime horaFin) {
		this.horaFin = UtilDateTime.getDefaultLocalTime(horaFin);
		return this;
	}
	
	

}
