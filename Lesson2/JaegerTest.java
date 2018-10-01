public class JaegerTest {	
	public static void main(String[] args) {
		Jaeger robot1 = new Jaeger("Bracer Phoenix",
					   				"Mark-5",
								   	"USA",
								   	70.7f,
								   	2.1f,
								   	3,
								   	8,
								   	9);
//		robot1.setModelName("Bracer Phoenix");
//		robot1.setMark("Mark-5");
//		robot1.setOrigin("USA");
//		robot1.setHeight(70.7f);
//		robot1.setWeight(2.1f);
//		robot1.setSpeed(3);
//		robot1.setStrength(8);
//		robot1.setArmor(9);

		Jaeger robot2 = new Jaeger("Gipsy Danger",
									"Mark-3",
									"USA",
									79.25f,
									1.98f,
									7,
									8,
									6);
//		robot2.setModelName("Gipsy Danger");
//		robot2.setMark("Mark-3");
//		robot2.setOrigin("USA");
//		robot2.setHeight(79.25f);
//		robot2.setWeight(1.98f);
//		robot2.setSpeed(7);
//		robot2.setStrength(8);
//		robot2.setArmor(6);


		System.out.println(robot1.getModelName());
		System.out.println(robot1.getMark());
		System.out.println(robot1.getOrigin());
		System.out.println(robot1.getHeight());
		System.out.println(robot1.getWeight());
		System.out.println(robot1.getSpeed());
		System.out.println(robot1.getStrength());
		System.out.println(robot1.getArmor());

		System.out.println(robot2.getModelName());
		System.out.println(robot2.getMark());
		System.out.println(robot2.getOrigin());
		System.out.println(robot2.getHeight());
		System.out.println(robot2.getWeight());
		System.out.println(robot2.getSpeed());
		System.out.println(robot2.getStrength());
		System.out.println(robot2.getArmor());
	}
}
