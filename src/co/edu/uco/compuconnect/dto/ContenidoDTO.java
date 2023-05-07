package co.edu.uco.compuconnect.dto;


import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilDateTime;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public  class ContenidoDTO {

	private UUID identificador;
	private UsuarioDTO autor;
	private String descripcion;
	private LocalTime horaCreacion;
	
	
	public ContenidoDTO(UUID identificador, UsuarioDTO usuario, String descripcion, LocalTime horaCreacion) {
		super();
		setIdentificador(identificador);
		setAutor(usuario);
		setDescripcion(descripcion);
		setHoraCreacion(horaCreacion);
	}
	
	public ContenidoDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setAutor(UsuarioDTO.create());
		setDescripcion(UtilText.getDefaultValue());
		setHoraCreacion(UtilDateTime.getDefaultValueLocaltime());
	}
	
	
	public static final ContenidoDTO create() {
		return new ContenidoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final ContenidoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final UsuarioDTO getAutor() {
		return autor;
	}
	
	public final ContenidoDTO setAutor(final UsuarioDTO autor) {
		this.autor = UtilObject.getDefault(autor, UsuarioDTO.create());
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	public final ContenidoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		return this;
	}
	
	public final LocalTime getHoraCreacion() {
		return horaCreacion;
	}
	
	public final ContenidoDTO setHoraCreacion(final LocalTime horaCreacion) {
		this.horaCreacion = UtilDateTime.getDefaultLocalTime(horaCreacion);
		return this;
	}
	
	
	
	
	
	
}
