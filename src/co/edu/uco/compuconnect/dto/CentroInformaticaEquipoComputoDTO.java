package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class CentroInformaticaEquipoComputoDTO {
	
	private UUID identificador;
	private CentroInformaticaDTO centroInformatica;
	private EquipoComputoDTO equipoComputo;
	
	
	public CentroInformaticaEquipoComputoDTO(final UUID identificador,final CentroInformaticaDTO centroInformatica,final EquipoComputoDTO equipoComputo) {
		super();
		setIdentificador(identificador);
		setCentroInformatica(centroInformatica);
		setEquipoComputo(equipoComputo);
	
	}
	
	
	public CentroInformaticaEquipoComputoDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCentroInformatica(CentroInformaticaDTO.create());
		setEquipoComputo(EquipoComputoDTO.create());

	}
	
	public static final CentroInformaticaEquipoComputoDTO create() {
		return new CentroInformaticaEquipoComputoDTO();
	}
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	public CentroInformaticaEquipoComputoDTO setIdentificador(UUID identificador) {
		this.identificador = identificador;
		return this;
	}
		
	public CentroInformaticaDTO getCentroInformatica() {
		return centroInformatica;
	}
	
	
	public final CentroInformaticaEquipoComputoDTO setCentroInformatica(final CentroInformaticaDTO centroInformatica) {
		this.centroInformatica = UtilObject.getDefault(centroInformatica, CentroInformaticaDTO.create());
		return this;
	}
	
	
	public EquipoComputoDTO getEquipoComputo() {
		return equipoComputo;
	}
	
	public final CentroInformaticaEquipoComputoDTO setEquipoComputo(final EquipoComputoDTO equipoComputo) {
		this.equipoComputo = UtilObject.getDefault(equipoComputo, EquipoComputoDTO.create());
		return this;
	}
	
	

}
