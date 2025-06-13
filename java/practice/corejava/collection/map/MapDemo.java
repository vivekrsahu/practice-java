
package practice.corejava.collection.map;

import java.util.Objects;

/**
 * This is the parent class of all map demo classes
 * 
 * @author Vivek Ranjan Sahu
 */
public class MapDemo {

	private final Integer number;

	public Integer getNumber() {
		return number;
	}

	public MapDemo(int number) {
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
		MapDemo other = (MapDemo) obj;
        return Objects.equals(number, other.number);
    }

	@Override
	public String toString() {
		return number + "";
	}

}
