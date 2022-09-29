package by.home.maxzzzit;

public class PrerivanieVCikle {

	public static void main(String[] args) {
		int z=9, x=0, sum=0, i=0;
		
		while (z>i) {
			if (i==2) {
				continue;// когда i=2 возврат цикла в начало и повтор ...
			}
			i++;
			sum+=i;
			System.out.println("Сумма чисел до прерывания = "+sum);
		}
	}
}
