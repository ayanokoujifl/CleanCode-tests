package nomessignificativos.minefield;

import java.util.ArrayList;
import java.util.List;

public class DirtyCode {

	// codigo pouco intuitivo
	/*
	 * Há muitas perguntas sem respostas, como: Que tipo de informação está contida
	 * em theList? Qual a importância de um item na posição 0 na theList? Qual a
	 * importância do valor 4? qual a finalidade da lista retornada?
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
