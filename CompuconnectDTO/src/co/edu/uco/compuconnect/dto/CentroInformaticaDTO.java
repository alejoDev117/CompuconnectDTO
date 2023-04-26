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
	private int equiposComputoActivos;
	
	
	
	
	
	public CentroInformaticaDTO(UUID identificador, String nombre, String ubicacion, boolean poseeVideoBeam,
			int equiposComputoActivos) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setUbicacion(ubicacion);
		setPoseeVideoBeam(poseeVideoBeam);
		setEquiposComputoActivos(equiposComputoActivos);
	
	}




	public CentroInformaticaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
		setUbicacion(UtilText.getDefaultValue());
		setPoseeVideoBeam(UtilBoolean.getDefaultValue());
		setEquiposComputoActivos(UtilNumeric.getDefaultIntValue());
	}
	
	
	public static CentroInformaticaDTO create() {
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
		this.nombre = UtilText.applyTrim(nombre);
		return this;
	}
	
	public final String getUbicacion() {
		return ubicacion;
	}
	public final  CentroInformaticaDTO  setUbicacion(final String ubicacion) {
		this.ubicacion = UtilText.applyTrim(ubicacion);
		return this;
	}
	
	
	public final boolean isPoseeVideoBeam() {
		return poseeVideoBeam;
	}
	
	
	public final  CentroInformaticaDTO  setPoseeVideoBeam(boolean poseeVideoBeam) {
		this.poseeVideoBeam = UtilBoolean.getDefault(poseeVideoBeam);
		return this;
		
		
	}
	public final int getEquiposComputoActivos() {
		return equiposComputoActivos;
	}
	
	
	public final  CentroInformaticaDTO  setEquiposComputoActivos(int equiposComputoActivos) {
		this.equiposComputoActivos = UtilNumeric.getDefaultValueInt(equiposComputoActivos);
		return this;
	}
	




}
