package aula08.Ex2;

public enum DiaSemana {
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int code;
	
	private DiaSemana(int code) {
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public static DiaSemana rand() {
		DiaSemana dia_random = null;
		int random = (int)(Math.random() * 8);
		switch(random) {
		case 1:
			dia_random = DiaSemana.SEGUNDA; break;
		case 2:
			dia_random = DiaSemana.TERCA; break;
		case 3:
			dia_random = DiaSemana.QUARTA; break;
		case 4:
			dia_random = DiaSemana.QUINTA; break;
		case 5:
			dia_random = DiaSemana.SEXTA; break;
		case 6:
			dia_random = DiaSemana.SABADO; break;
		case 7:
			dia_random = DiaSemana.DOMINGO; break;
		}
		
		return dia_random;
	}
	
}
