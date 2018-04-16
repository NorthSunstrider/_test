package com.northsunstrider.sort;

// 为了实现对存储对象的数组进行排序而创建的类
// 既ArrayList中存储该SortUser对象，然后程序根据SortUser的年龄，对List进行排序
public class SortUser implements Comparable<SortUser> {
	private int age;
	private String name;

	public SortUser() {
		super();
	}

	public SortUser(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(SortUser o) {
		if (o.age > this.age)
			return -1;
		if (o.age < this.age)
			return 1;
		return 0;
	}

}
