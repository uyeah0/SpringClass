package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	
	String name;
	int age;
	String food;
	
	public void eat() {
		System.out.println( name + " " + age + " " + food + "À»(¸¦) ¸Ô´Ù");
	}
	
	public Person() {
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	
}
