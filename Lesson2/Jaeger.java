public class Jaeger {	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName,
				  String mark,
				  String origin,
				  float height,
				  float weight,
				  int speed,
				  int strenght,
				  int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getModelName() {
		return this.modelName;
	}

	public String getMark() {
		return this.mark;
	}

	public String getOrigin() {
		return this.origin;
	}

	public float getHeight() {
		return this.height;
	}

	public float getWeight() {
		return this.weight;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getStrength() {
		return this.strength;
	}

	public int getArmor() {
		return this.armor;
	}

	boolean drift() {
		return true;
	}

	void move() {

	}

	String scanKaiju() {
		return "scanKaiju";
	}

	void useVortexCannon() {

	}
}
