package mainPack;

public class DecryptRot14 {

	public static void main(String[] args) {
		String adec = "xxxxxx@xxxx.xx"; // J'ai changé l'adresse mail pour privacy donc ainsi il sort que des j
		int cmpt = 0;
		char[] lett = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < adec.length(); i++) {
			char c = adec.charAt(i);
			if (c >= 'o' && c <= 'z') {
				c -= 14;
			} else if (c >= 'a' && c <= 'n') {
				for (int j = index(lett, c); j > 0; j--) {
					cmpt++;
					if (c >= 'a' && c <= 'n') {
						c -= j;
					}
				}
				if (cmpt < 14) {
					c = lett[lett.length - (14 - cmpt)];
				}
			}
			System.out.print(c);
			cmpt = 0;
		}
		System.out.println();
	}

	public static int index(char[] arr, char lett) {
		int i = 0;
		while (!(arr[i] == lett)) {
			i++;
		}
		return i;
	}
}