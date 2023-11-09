package Interface;

public class Person {
	private String name;
	private int age;
	//private String hobby;
	public Person(String name, int age) {
		// TODO Auto-generated constructor 
		if (age < 1 || age > 150) {
			throw new IllegalArgumentException ("Age needs to be from the range [1, 150].");
		}
	
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
    public String toString() {
        return name + "(" + age + ")";
    }

   
	
	}

