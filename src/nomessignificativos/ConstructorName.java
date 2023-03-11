package nomessignificativos;

public class ConstructorName {
	/*
	 * Evitando usar os construtores reais, e ao inves disso, met�dos de f�brica
	 * est�ticos
	 */

	private Integer number;

	private ConstructorName(double number) {
		this.number = (int) Math.round(number);
	}

	public static ConstructorName toInteger(Double number) {
		return new ConstructorName(number);
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
