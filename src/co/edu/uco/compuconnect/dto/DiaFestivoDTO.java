package co.edu.uco.compuconnect.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DiaFestivoDTO {
	
	private UUID identificador;
	private String nombre;
	private Date fecha;
	
	
	public DiaFestivoDTO(UUID identificador, String nombre, Date fecha) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setFecha(fecha);
	}
	
	public DiaFestivoDTO() { 
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setFecha(UtilDateTime.getDefaultValueDate());
	}
	
	public static final DiaFestivoDTO create() {
		return new DiaFestivoDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final DiaFestivoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final DiaFestivoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre) ;
		return this;
	}
	
	public final Date getFecha() {
		return fecha;
	}
	
	public final DiaFestivoDTO setFecha(final Date fecha) {
		this.fecha = UtilDateTime.getDefaultDate(fecha);
		return this;
	}
		
}

