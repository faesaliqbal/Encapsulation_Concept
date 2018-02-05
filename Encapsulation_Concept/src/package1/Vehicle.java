package package1;

public class Vehicle {
	
	/*
	 * The idea behind encapsulation is to ensure that implementation details are not visible to users.
	 * The variables of one class will be hidden from the other classes, accessible only through the methods of the current class.
	 * This is called data hiding.
	 * 
	 * To achieve encapsulation in Java, declare the class variable as private and provide public setter and getter methods to modify and view the variables' values.
	 */
	
	/*
	 * Encapsulation provides following benefits:
	 * control of the way data is accessed or modified
	 * more flexible and easily changed code
	 * ability to change one part of the code without affecting other parts
	 */
	private String color;
	
	/*
	 * Setters and Getters are used to effectively protect your data, particularly when creating classes.
	 * For each variable, the get method returns its value, while the set method sets its value.
	 * Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.
	 * Setters start with set, followed by the variable name, with the first letter of the variable name capitalized.
	 * Setters and Getters are fundamental building blocks for encapsulation.
	 */
		
	//Getter
	public String getColor(){
		return color;
	}
		
	//Setter
	public void setColor(String c){
		this.color = c;
	}
}
