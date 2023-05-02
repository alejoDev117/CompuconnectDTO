package co.edu.uco.compuconnect.dto;

public abstract class PersonaEncargadaDTO extends DestinatarioDTO {
	
	protected String numeroCelular;

	protected abstract String getNumeroCelular();

	protected abstract DestinatarioDTO setNumeroCelular(String numeroCelular);
	
	
}
