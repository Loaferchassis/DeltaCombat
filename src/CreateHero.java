public class CreateHero {
	public static void hodyat(Hero person) {
		System.out.println("������ �����" + person.name);
		System.out.println("� ��� ���� �����:");
		System.out.println("1.�����");
		System.out.println("2.������");
		System.out.println("3.������");
		System.out.println("4.�������");
	}

	public static void atack(Hero person1, Hero person2) {
		person2.hp -= person1.ad ;
		System.out.println(person2.hp);
	}

	public static void battle(Hero person1, Hero person2) {
		double a = Math.random();
		while (person1.hp >= 0 || person2.hp >= 0) {
			if (a % 2 == 0) {

				hodyat(person1);
				atack(person1, person2);

			} else {
				hodyat(person2);
				atack(person2, person1);
			}
		}
	}

	public static void main(String[] args) {
		Hero person1 = new Hero();
		person1.whoAreU();
		Hero person2 = new Hero();
		person2.whoAreU();
		battle(person1, person2);
	}

}
