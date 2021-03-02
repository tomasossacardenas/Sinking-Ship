package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import model.Conditions;
import model.Tripulation;

public class Main {
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	
	private Tripulation tripulation;
	private static int tripulationNumber;
	private static String[] parts;
    private static String[] namesArray;
    private  static String[] conditionsArray;
	
	public static void main(String[] args) throws IOException {
		tripulationNumber=Integer.parseInt(br.readLine());
		namesArray=new String[tripulationNumber];
		conditionsArray=new String[tripulationNumber];
		//Go to the nextLine where the cases start
		String data=br.readLine();
		
		for (int i=0;i<tripulationNumber;i++) {
			
			parts=convertStringToArray(data);//Assigns array value in format [Name, Condition]
            boolean salir=false;
            //System.out.println(Arrays.toString(parts));
            
			for(int j=0;j<namesArray.length && salir==false;j++) {
				if(namesArray[j]==null && conditionsArray[j]==null) {
					namesArray[j]=parts[0]; //Add to the array of names The name in the position j
					conditionsArray[j]=parts[1];//Add to the array of conditions The condition in the position j
					salir=true;
				}

			}
			
            
            if(i!=tripulationNumber-1) {
            data = br.readLine();
            }
        }
		
		//System.out.println("n"+Arrays.toString(namesArray));
		//System.out.println("c"+Arrays.toString(conditionsArray));
		
		bw.close();
		br.close();

	}
	public Main() {
		tripulation = new Tripulation(tripulationNumber);
	}
	
	public void createMembers(String name, Conditions condition) {
		tripulation.addMember(name, condition);
	}
	
	public static String[] convertStringToArray(String data) throws IOException {
		String[] parts = data.split(" ");
		return parts;
		
	}

}
