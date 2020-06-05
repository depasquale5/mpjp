package m2ex;

public class Prova {

	public static void main(String[] args) {
		char[] lettere = {'a', 'b', 'c', 'c', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		for(int i = 0; i < lettere.length; i++) {
			System.out.println(Character.getNumericValue(lettere[i]));
		}
		
//		System.out.println(Character.getNumericValue('A') - 10);
		
		/**  A  B  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
		 *   10 11 12 13 14 15 16 17 18 19 20 21 22 23 25 25 26 26 28 29 30 31 32 33 34 35
		 *    0  1  2  3  4  5  6  7  8       9  10 11 12 13 14 15 16 17 18 19          20
		 */
 
	}

}
