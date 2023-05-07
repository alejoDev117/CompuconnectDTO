package co.edu.uco.compuconnect.dto;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilUUID;

public final class PeriodoFuncionamientoDiaFestivoDTO {

	private UUID identificador;
	private PeriodoFuncionamientoDTO periodoFuncionamiento;
	private DiaFestivoDTO diaFestivo;
	
	
	public PeriodoFuncionamientoDiaFestivoDTO(UUID identificador, PeriodoFuncionamientoDTO periodoFuncionamiento,
			DiaFestivoDTO diaFestivo) {
		super();
		setIdentificador(identificador);
		setPeriodoFuncionamiento(periodoFuncionamiento);
		setDiaFestivo(diaFestivo);
	}


	public PeriodoFuncionamientoDiaFestivoDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPeriodoFuncionamiento(PeriodoFuncionamientoDTO.create());
		setDiaFestivo(DiaFestivoDTO.create());
	}
	
	public static final PeriodoFuncionamientoDiaFestivoDTO create() {
		return new PeriodoFuncionamientoDiaFestivoDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}


	public final PeriodoFuncionamientoDiaFestivoDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final PeriodoFuncionamientoDTO getPeriodoFuncionamiento() {
		return periodoFuncionamiento;
	}


	public final PeriodoFuncionamientoDiaFestivoDTO setPeriodoFuncionamiento(PeriodoFuncionamientoDTO periodoFuncionamiento) {
		this.periodoFuncionamiento = UtilObject.getDefault(periodoFuncionamiento, PeriodoFuncionamientoDTO.create());
		return this;
	}


	public final DiaFestivoDTO getDiaFestivo() {
		return diaFestivo;
	}


	public final PeriodoFuncionamientoDiaFestivoDTO setDiaFestivo(DiaFestivoDTO diaFestivo) {
		this.diaFestivo = UtilObject.getDefault(diaFestivo, DiaFestivoDTO.create());
		return this;
	}


	
	
	
	
}
