package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class DestinatarioDTO {
    private UUID identificador;
    private String nombre;
    private String correo;

    public DestinatarioDTO(UUID identificador, String nombre, String correo) {
        setIdentificador(identificador);
        setNombre(nombre);
        setCorreo(correo);
    }

    public DestinatarioDTO() {
        setIdentificador(UtilUUID.getDefaultUuid());
        setNombre(UtilText.getDefaultValue());
        setCorreo(UtilText.getDefaultValue());
    }

    public static DestinatarioDTO create() {
        return new DestinatarioDTO();
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public DestinatarioDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public DestinatarioDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public String getCorreo() {
        return correo;
    }

    public DestinatarioDTO setCorreo(String correo) {
        this.correo = UtilText.applyTrim(correo);
        return this;
    }
}
