package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;


public class TipoDTO {
	
	private UUID identificador;
	private String nombre;
	//private tipo TipoNombre;
	
	
	public TipoDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		//setTipoNombre("");
	}
	
	public TipoDTO(UUID identificador, String nombre) {  //tipo tipoNombre
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getDefaultValue());
	//	setTipoNombre(tiponombre);
	}
	
	public static final TipoDTO create() {
		return new TipoDTO();
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoDTO setNombre(final String nombre) {
		this.nombre = UtilText.applyTrim(nombre) ;
		return this;
	}
	/*public final TipoDTO getTipoNombre() {
		return TipoNombre;
	}
	public final TipoDTO setTipoNombre(final TipoDTO tipoNombre) {
		TipoNombre = tipoNombre;
	}*/
	
	

}
