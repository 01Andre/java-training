public class ObjectTraining {

private String name;

private int age;

private boolean wilder;

    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes

public ObjectTraining (String name, int age)
{
	this.name = name;
	this.age = age;
}
   public String whoAmI()
   {
	   return "My name is " + this.name + " and I'm " + this.age;
   }

    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values


    // Do not remove this empty constructor !
    public ObjectTraining() {
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the wilder
	 */
	public boolean isWilder() {
		return wilder;
	}

	/**
	 * @param wilder the wilder to set
	 */
	public void setWilder(boolean wilder) {
		this.wilder = wilder;
	}
}
