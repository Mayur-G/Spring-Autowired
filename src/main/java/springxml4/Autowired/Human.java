package springxml4.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	//autowired with qualifier annotation doesn't need setter method to do dependency injection 
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;
	
	public Human() {

	}
	
	//using Autowired Annotation
	//@Autowired
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constr getting called , autowired");
	}

//	public Human(Heart heart) {
//		this.heart = heart;
//	}

	public Heart getHeart() {
		return heart;
	}

	//autowire injection in setter happens by byType first , if it fails , it uses byName
	//@Autowired
	//@Qualifier("octopusHeart")
	//@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
	
	public void startPumping()
	{
		if(heart != null) {
			heart.pump();
		System.out.println("name of animal : "+heart.getNameOfAnimal() +",  no of heart : "+heart.getNoOfHeart());
		}else
			System.out.println("body dead");
	}
}
