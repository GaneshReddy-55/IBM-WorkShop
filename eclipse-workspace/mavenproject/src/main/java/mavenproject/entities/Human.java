package mavenproject.entities;

import mavenproject.entities.organs.HumanEye;

public class Human extends Mammals {
	public HumanEye leftEye;
	public HumanEye rightEye;
	
	public Human() {
		leftEye = new HumanEye();
		rightEye = new HumanEye();
	}
	

}
