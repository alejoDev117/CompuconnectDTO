package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class EquipoComputoDTO {
	
	private UUID identificador;
	private String nombre;
	private EstadoEquipoComputoDTO estado;
	
	public EquipoComputoDTO(final UUID identificador,final String nombre,final EstadoEquipoComputoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setEstado(estado);
	
	}
	
	
	public EquipoComputoDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoEquipoComputoDTO.create());

	}
	
	
	public static EquipoComputoDTO create() {
		return new EquipoComputoDTO();
	}
	
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	public final EquipoComputoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public final EquipoComputoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	}
	
	
	public EstadoEquipoComputoDTO getEstado() {
		return estado;
	}
	
	
	public final EquipoComputoDTO setEstado(final EstadoEquipoComputoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEquipoComputoDTO.create());
		return this;
	}
	
	

}
