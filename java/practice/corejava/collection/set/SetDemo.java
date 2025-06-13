
package practice.corejava.collection.set;

/**
 * This is the parent class of all demo classes
 * 
 * @author Vivek Ranjan Sahu
 */
public class SetDemo {

	private final Integer number;

	public Integer getNumber() {
		return number;
	}

	public SetDemo(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetDemo other = (SetDemo) obj;
        return number.equals(other.number);
    }

	@Override
	public String toString() {
		return number + "";
	}

}
