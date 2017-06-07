package day_5_24;

import java.io.Serializable;

public class PhoneInfo implements Comparable<PhoneInfo>, Serializable{
	private String name;
	transient private String phoneNumber;

	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneInfo other = (PhoneInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	// comparable 가능하게 함
	@Override
	public int compareTo(PhoneInfo o) {
		// return name.compareTo(o.getName());
		return phoneNumber.compareTo(o.phoneNumber);
	}

}