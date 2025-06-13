package practice.corejava.collection.list;

public class ListDemo {

	private Integer number;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public ListDemo(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		ListDemo other = (ListDemo) obj;
		if (number == null) {
            return other.number == null;
		} else return number.equals(other.number);
    }

	@Override
	public String toString() {
		return number + "";
	}

}
