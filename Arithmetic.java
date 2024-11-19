public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the numbers");
		Scanner scanner = new Scanner(System.in);
		short num1 = scanner.nextShort();
		short num2 = scanner.nextShort();
		System.out.print("Enter the operator");
		char symbol = scanner.next().charAt(0);
		switch (symbol) {
		case '+':
			System.out.print("Addition:"+(num1+num2));
			break;
		case '*':
			System.out.println("Multipication" +(num1*num2));
			break;
		default:
			System.out.println("not found");
			break;
		}
	}
}
			