package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilBoolean;
import co.edu.uco.compuconnect.crosscutting.utils.UtilNumeric;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class CentroInformaticaDTO {
	
	private UUID identificador;
	private String nombre;
	private String ubicacion;
	private boolean poseeVideoBeam;

	
	
	
	
	
	public CentroInformaticaDTO(UUID identificador, String nombre, String ubicacion, boolean poseeVideoBeam) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setUbicacion(ubicacion);
		setPoseeVideoBeam(poseeVideoBeam);
		
	
	}




	public CentroInformaticaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setUbicacion(UtilText.getUtilText().getDefaultValue());
		setPoseeVideoBeam(UtilBoolean.getDefaultValue());
		
	}
	
	
	public static final CentroInformaticaDTO create() {
		return new CentroInformaticaDTO();
	}
	
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final CentroInformaticaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final  CentroInformaticaDTO  setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	
	public final String getUbicacion() {
		return ubicacion;
	}
	public final  CentroInformaticaDTO  setUbicacion(final String ubicacion) {
		this.ubicacion = UtilText.getUtilText().applyTrim(ubicacion);
		return this;
	}
	
	
	public final boolean isPoseeVideoBeam() {
		return poseeVideoBeam;
	}
	
	
	public final  CentroInformaticaDTO  setPoseeVideoBeam(boolean poseeVideoBeam) {
		this.poseeVideoBeam = UtilBoolean.getDefault(poseeVideoBeam);
		return this;
		
		
	}
	



}
