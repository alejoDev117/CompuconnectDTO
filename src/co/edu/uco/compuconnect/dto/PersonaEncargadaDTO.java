package co.edu.uco.compuconnect.dto;


import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class PersonaEncargadaDTO {
    private UUID identificador;
    private String nombre;
    private String correoInstitucional;
    private String numeroCelular;

    public PersonaEncargadaDTO(UUID identificador, String nombre, String correoInstitucional, String numeroCelular) {
        setIdentificador(identificador);
        setNombre(nombre);
        setCorreoInstitucional(correoInstitucional);
        setNumeroCelular(numeroCelular);
    }

    public PersonaEncargadaDTO() {
        setIdentificador(UtilUUID.getDefaultUuid());
        setNombre(UtilText.getUtilText().getDefaultValue());
        setCorreoInstitucional(UtilText.getUtilText().getDefaultValue());
        setNumeroCelular(UtilText.getUtilText().getDefaultValue());
    }

    public static PersonaEncargadaDTO create() {
        return new PersonaEncargadaDTO();
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEncargadaDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public PersonaEncargadaDTO setNombre(String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
        return this;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public PersonaEncargadaDTO setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = UtilText.getUtilText().applyTrim(correoInstitucional);
        return this;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public PersonaEncargadaDTO setNumeroCelular(String numeroCelular) {
        this.numeroCelular = UtilText.getUtilText().applyTrim(numeroCelular);
        return this;
    }
}
