package com.ipshita.assignment;

import com.ipshita.assignment.util.Constants;
import com.ipshita.assignment.util.Status;

public class Client {

	public static void main(String[] args) {
		LabResource printerA1 = new Printer(Status.ACTIVE, 1989, "pa1", "Mona Lisa", 30.0);
		LabResource workstationA1 = new WorkStation(Status.ACTIVE, 2004, "wa1", "Audrey Tatou", 45.0);
		LabResource workstationA2 = new WorkStation(Status.ACTIVE, 1994, "wa2", "Diana Spencer", 45.0);

		LabResource clusterA = new ComputerCluster("ca", "ca");

		LabResource printerB = new Printer(Status.ACTIVE, 1986, "pb", "Leonardo Da Vinci", 50.5);
		LabResource clusterB = new ComputerCluster("cb", "cb");

		

		clusterA.addResource(printerA1);
		clusterA.addResource(workstationA1);
		clusterA.addResource(workstationA2);
		clusterB.addResource(clusterA);
		clusterB.addResource(printerB);
		clusterB.removeResource(printerB.resourceId);
		
		System.out.println("\nCost of maintenance of cluster B : " + clusterB.getCostOfMaintenancePerYear());
		System.out.println("\nIs printer B older than 2000 : " + printerB.isOlderModel(2000));
		System.out.println("Is workstation A1 older than 2000 : " + workstationA1.isOlderModel(2000));
		System.out.println("\nModels older than 1990 : ");
		clusterB.showOlderModel(1990);
		
		clusterB.setInactive("pa1");
		workstationA1.setInactive();
		
		System.out.println("\nCluster B resource Details after setting printer and workstation inactive: ");
		clusterB.showResourceDetails();
		
		
		
	}

}
