public class JaegerTest {	
	public static void main(String[] args) {
		Jaeger robot1 = new Jaeger();
		robot1.setModelName("Bracer Phoenix");
		robot1.setMark("Mark-5");
		robot1.setOrigin("USA");
		robot1.setHeight(70.7f);
		robot1.setWeight(2.1f);
		robot1.setSpeed(3);
		robot1.setStrength(8);
		robot1.setArmor(9);

		Jaeger robot2 = new Jaeger();
		robot2.setModelName("Gipsy Danger");
		robot2.setMark("Mark-3");
		robot2.setOrigin("USA");
		robot2.setHeight(79.25f);
		robot2.setWeight(1.98f);
		robot2.setSpeed(7);
		robot2.setStrength(8);
		robot2.setArmor(6);

		
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