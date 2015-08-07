/**
 * 
 */
package com.ipshita.assignment;

import java.util.ArrayList;

import com.ipshita.assignment.util.Constants;

/**
 * @author Ipshita
 *
 */
public class ComputerCluster extends LabResource {
	
	String clusterID;
	
	@Override
	protected double getCostOfMaintenancePerYear() {
		computeCostOfMaintenancePerYear();
		return super.getCostOfMaintenancePerYear();
	}
	
	private void computeCostOfMaintenancePerYear() {
		for (LabResource labResource : resources) {
			this.costOfMaintenancePerYear += labResource.getCostOfMaintenancePerYear();
		}
	}

	/**
	 * 
	 */
	public ComputerCluster(String clusterId, String resourceId) {
		this.clusterID = clusterId;
		this.resourceId = resourceId;
		resources = new ArrayList<LabResource>();
		System.out.println(ComputerCluster.class.getSimpleName() + Constants.COLON + resourceId + Constants.CREATED);
	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#isOlderModel(int)
	 */
	@Override
	protected boolean isOlderModel(int modelYear) {
		
		return false;
	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#showOlderModel(int)
	 */
	@Override
	protected void showOlderModel(int modelYear) {
		for (LabResource labResource : resources) {
			labResource.showOlderModel(modelYear);
		}

	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#showIndividualDetails()
	 */
	@Override
	protected void showIndividualDetails() {
		System.out.println(ComputerCluster.class.getSimpleName() + Constants.COLON + Constants.NEXTLINE
				+ Constants.RESOURCE_ID + Constants.COLON + this.resourceId + Constants.NEXTLINE
				+ Constants.CLUSTER_ID + Constants.COLON + this.clusterID + Constants.NEXTLINE
				+ Constants.SUPERVISOR + Constants.COLON + this.supervisor + Constants.NEXTLINE
				);
	

	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#setInactive()
	 */
	@Override
	protected void setInactive() {
		

	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#setInactive(java.lang.String)
	 */
	@Override
	protected void setInactive(String resourceId) {
		for (LabResource labResource : resources) {
			labResource.setInactive(resourceId);
		}

	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#addResource(com.ipshita.assignment.LabResource)
	 */
	@Override
	protected void addResource(LabResource resource) {
		this.supervisor = resource.supervisor;
		resources.add(resource);

	}

	/* (non-Javadoc)
	 * @see com.ipshita.assignment.LabResource#removeResource(java.lang.String)
	 */
	@Override
	protected void removeResource(String resourceId) {
		for (LabResource labResource : resources) {
			labResource.removeResource(resourceId);
		}

	}

}
