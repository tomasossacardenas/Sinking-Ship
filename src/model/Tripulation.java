package model;


public class Tripulation {
	public Member[] shipMembers;

	public Tripulation(int tripulationNumber) {
		shipMembers=new Member[tripulationNumber];
	}

	public void addMember(String name, Conditions condition) {
		Member member=new Member(name, condition);
		
		for(int i=0;i<shipMembers.length;i++) {
			if (shipMembers[i]==null) {
				shipMembers[i]= member;
			}
		}
		
	}
	
	
}
