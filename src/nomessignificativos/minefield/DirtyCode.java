package nomessignificativos.minefield;

import java.util.ArrayList;
import java.util.List;

public class DirtyCode {

	// codigo pouco intuitivo
	/*
	 * H� muitas perguntas sem respostas, como: Que tipo de informa��o est� contida
	 * em theList? Qual a import�ncia de um item na posi��o 0 na theList? Qual a
	 * import�ncia do valor 4? qual a finalidade da lista retornada?
	 */

	List<int[]> theList = new ArrayList<>();

	public List<int[]> getThem() {
		List<int[]> list1 = new ArrayList<>();
		for (int[] x : theList) {
			if (x[0] == 4) {
				list1.add(x);
			}
		}
		return list1;
	}
}
