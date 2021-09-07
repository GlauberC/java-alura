
public class TestaSomatorio {
	public static void main(String[] args) {
		int count = 0;
		int somatorio = 0;
		while(count <= 10) {
			somatorio += count;
			count++;
		}
		System.out.println("O somatório é: " + somatorio);
	}
}
