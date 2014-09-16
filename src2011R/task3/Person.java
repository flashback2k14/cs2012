package task3;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	private String name = null;
	private String sex = null;
	private transient float weight = 0.0F;
	private Date createTime = null;
	private static final long serialVersionUID = 1L;
	
	public Person(String name, String sex, float weight) {
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.createTime = new Date();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result	+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		Person other = (Person) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", weight=" + weight
				+ ", createTime=" + createTime + "]";
	}
}