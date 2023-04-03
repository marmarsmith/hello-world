package main;

public class Main {

	public static void main(String[] args) {

//		int x = -5;
//
//		x += 2; // -3
//		x -= 2; // -5
//		x /= 2; // -2
//		x *= 2; // -4
//		x %= 2; // 0
//
//		String hello = "Hello World";
//
//		System.out.println(x);
//		System.out.println(hello);

//		System.out.println(5 % 2);

// 		System.out.println(x++);

//		System.out.println(x);	

//		System.out.println(++x);

//		int totalSugarInGlass = 0;
//
//		int sugar = 2;
//
//		int maxSugar = 10;

//		if (sugar < maxSugar) {
//			totalSugarInGlass += sugar;
//			System.out.println(totalSugarInGlass);
//		} else if (sugar == maxSugar) {
//			totalSugarInGlass += sugar;
//			System.out.println(totalSugarInGlass);
//		}else if (totalSugarInGlass == maxSugar) {
//			System.out.println("Maximum sugar already reached.");
//		}else {
//			System.out.println("We only allow 10 tsp. of sugar per glass");
//		}
//		
//		System.out.println("I run no matter what!");

//		while (totalSugarInGlass < maxSugar) {
//			totalSugarInGlass += sugar;
//			System.out.println("Total sugar in glass: " + totalSugarInGlass);
//		}

//		do {
//			totalSugarInGlass += sugar;
//			System.out.println("Total sugar in glass: " + totalSugarInGlass);
//		}while (totalSugarInGlass < maxSugar);
//		

//		for (; totalSugarInGlass < maxSugar; totalSugarInGlass += sugar) {
//			System.out.println("Total sugar in glass: " + totalSugarInGlass);
//		}
		
//		System.out.println("I don't run until loop finishes");
		
		int [] numbers = new int[] {1, 2, 3, 4, 5};
		int max = (int) (Math.random() * 10) + 1;
		
		int currentNumber = 6;
		for (int i = 0; i < max; i++, currentNumber++) {
			int temp[] = new int[numbers.length + 1];
			for (int j = 0; j < numbers.length; j++) {
				temp[j] = numbers[j];
			}
			temp[temp.length - 1] = currentNumber;
			numbers = temp;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
