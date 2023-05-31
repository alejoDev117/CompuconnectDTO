package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ReservaPerfilDTO {

	private UUID identificador;
	private ReservaDTO reserva;
	private PerfilDTO perfil;
	
	
	
	public ReservaPerfilDTO(final UUID identificador, final ReservaDTO reserva, final PerfilDTO perfil) {
		setIdentificador(identificador);
		setReserva(reserva);
		setPerfil(perfil);
		
	}
	
	public ReservaPerfilDTO() { 
		setIdentificador(UtilUUID.getDefaultUuid());
		setReserva(ReservaDTO.create());
		setPerfil(PerfilDTO.create());
		
	}
	
	public static final ReservaPerfilDTO create() {
		return new ReservaPerfilDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	
	public final ReservaPerfilDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final ReservaDTO getReserva() {
		return reserva;
	}
	public final ReservaPerfilDTO setReserva(ReservaDTO reserva) {
		this.reserva = UtilObject.getDefault(reserva, ReservaDTO.create());
		return this;
	}
	
	public final PerfilDTO getPerfil() {
		return perfil;
	}
	public final ReservaPerfilDTO setPerfil(PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}
	
	
	
}
