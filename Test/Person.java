package Test;

/**
 * equals and hasCode
 * @author raarcot
 *
 */
public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		if(o == null || o.getClass() != this.getClass()){
			return false;
		}
		Person p = (Person) o;
		return  p.id == this.id && 
				(this.firstName !=null && p.firstName.equals(this.firstName))
				&& 	(this.lastName !=null && p.lastName.equals(this.lastName));				
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
		result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
		return result;
	}

}
