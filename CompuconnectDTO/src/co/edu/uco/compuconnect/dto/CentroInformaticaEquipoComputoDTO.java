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
	
	
	


	public static EquipoComputoDTO create1() {
		return new EquipoComputoDTO();
	}
	
	
	public static CentroInformaticaDTO create() {
		return new CentroInformaticaDTO();
	}
	
	
	
	public UUID getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
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
		this.equipoComputo = 
		return this;
	}
	
	

}
