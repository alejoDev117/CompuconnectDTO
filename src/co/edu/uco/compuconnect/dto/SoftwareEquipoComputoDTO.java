package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class SoftwareEquipoComputoDTO {
	
	private UUID identificador;
	private SoftwareDTO software;
	private EquipoComputoDTO equipoComputo;
	
	
	
	
	public SoftwareEquipoComputoDTO(UUID identificador, SoftwareDTO software, EquipoComputoDTO equipoComputo) {
		setIdentificador(identificador);
		setSoftware(software);
		setEquipoComputo(equipoComputo);
	}




	public SoftwareEquipoComputoDTO() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setSoftware(SoftwareDTO.create());
		setEquipoComputo(EquipoComputoDTO.create());
	}

	
	public static final SoftwareEquipoComputoDTO create() {
		return new  SoftwareEquipoComputoDTO();
	}



	public final UUID getIdentificador() {
		return identificador;
	}




	public final SoftwareEquipoComputoDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}




	public final SoftwareDTO getSoftware() {
		return software;
	}




	public final SoftwareEquipoComputoDTO setSoftware(SoftwareDTO software) {
		this.software = UtilObject.getDefault(software, SoftwareDTO.create());
		return this;
	}




	public final EquipoComputoDTO getEquipoComputo() {
		return equipoComputo;
	}




	public final SoftwareEquipoComputoDTO setEquipoComputo(EquipoComputoDTO equipoComputo) {
		this.equipoComputo = UtilObject.getDefault(equipoComputo, EquipoComputoDTO.create());
		return this;
	}



	
	

}
