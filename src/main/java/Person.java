
public class Person implements Weight {
	
	private String name;
	private int age;
	private int id;
	private int numItems;
	private static int count = 1;
	
	public Person(String name, int age, int numItems) {
		this.name = name;
		this.setAge(age);
		this.setNumItems(numItems);
		this.id = count;
		count++;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}


	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}
	
	
}
