package designpatterns.creational.builder;

public class UserBuilder {
	String firstName;
	String lastName;
	int age;
	String phone;
	String address;

	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}
	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}
	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}
	//Return the finally consrcuted User object
	public User build() {
		User user =  new User(this);
		validateUserObject(user);
		return user;
	}
	private void validateUserObject(User user) {
		//Do some basic validations to check
		//if user object does not break any assumption of system
	}
}





