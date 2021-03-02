package ui;

import model.Conditions;
import model.Tripulation;

public class Main {
	private Tripulation tripulation;
	private int tripulationNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Main() {
		tripulation = new Tripulation(tripulationNumber);
	}
	
	public void createMembers(String name, Conditions condition) {
		tripulation.addMember(name, condition);
	}

}
