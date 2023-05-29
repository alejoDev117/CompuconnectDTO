package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public class ContenidoDTO {
    protected UUID identificador;
    protected String descripcion;

    public ContenidoDTO(UUID identificador, String descripcion) {
        setIdentificador(identificador);
        setDescripcion(descripcion);
    }

    public ContenidoDTO() {
        setIdentificador(UtilUUID.getDefaultUuid());
        setDescripcion(UtilText.getUtilText().getDefaultValue());
    }

    public static ContenidoDTO create() {
        return new ContenidoDTO();
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ContenidoDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ContenidoDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
        return this;
    }
}

