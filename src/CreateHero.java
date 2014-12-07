import java.io.PrintStream;
import java.util.Scanner;

public class CreateHero {
	public static void hodyat(Hero person, Hero person2) {
		System.out.println("Ходит " + person.name);
		System.out.println("У вас есть выбор:");
		System.out.println("1.Атака");
		System.out.println("2.Защита");
		System.out.println("3.Отойти");
		System.out.println("4.Подойти");
		int choose = in.nextInt();
		switch (choose) {
		case (1):
			person.atack(person2);
		}
	}

	public static Scanner in = new Scanner(System.in);
	public static PrintStream out = System.out;

	public static void battle(Hero person1, Hero person2) {
		while (person1.hp >= 0 && person2.hp >= 0) {
			int a = (int) Math.floor(Math.random() * 100);
			if (a % 2 == 0) {

				hodyat(person1, person2);

			} else {
				hodyat(person2, person1);

			}
		}
		System.out.println((person1.hp > person2.hp?person1.name:person2.name )+ " WINS");
	}

	public static void main(String[] args) {
		Hero person1 = new Hero();
		person1.whoAreU();
		Hero person2 = new Hero();
		person2.whoAreU();
		battle(person1, person2);
	}

}