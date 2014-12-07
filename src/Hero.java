import java.util.Scanner;

public class Hero {
	String name;
	String cLass;
	String rassa;
	int hp;
	int mp;
	int xp = 0;
	int ad;
	int armor;
	int speed;
	int distance;
	public static Scanner in = new Scanner(System.in);

	public void whoAreU() { // Вызывать при начале , когда узнаем персонажа.
		System.out.println("Who are you?");
		this.name = in.nextLine();
		System.out.println("Choose your class!");
		viborClassa();
		cLass = in.nextLine();
		switch (cLass) {
		case "Лучник":
			this.hp = 100;
			this.mp = 0;
			this.ad = 30;
			this.armor = 20;
			this.speed = 40;
			this.distance = 100;
			break;
		case "Воин":
			this.hp = 200;
			this.mp = 0;
			this.ad = 35;
			this.armor = 40;
			this.speed = 20;
			this.distance = 20;
			break;
		case "Маг":
			this.hp = 75;
			this.mp = 150;
			break;
		}
	}

	public void viborClassa() {
		System.out.println("Если хочешь играть 1.Лучником");
		System.out.println("2.Воином");
		System.out.println("3.Магом");
		System.out.println("Напиши название класса полностью");
	}

	public void atack(Hero person2) {
		person2.hp -= this.ad;
		System.out.println(person2.name+" HP "+ person2.hp);
	}

}
