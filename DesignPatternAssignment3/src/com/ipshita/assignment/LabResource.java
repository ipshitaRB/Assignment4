package com.ipshita.assignment;

import java.util.List;

public abstract class LabResource {
	
	List<LabResource> resources;
	
	protected String resourceId;
	protected String supervisor;
	protected double costOfMaintenancePerYear;
	
	
	/**
	 * @return the costOfMaintenancePerYear
	 */
	protected double getCostOfMaintenancePerYear() {
		return costOfMaintenancePerYear;
	}

	/**
	 * This method is only overridden by printers and workstations
	 * @return
	 */
	protected abstract boolean isOlderModel(int modelYear);
	
	/**
	 * This method is only overridden by computer cluster
	 * @param modelYear
	 */
	protected abstract void showOlderModel(int modelYear);
	
	/**
	 * overridden by all subclasses
	 */
	protected abstract void showIndividualDetails();

	protected void showResourceDetails(){
		showIndividualDetails();
		if (null != resources) {
			
			for (LabResource labResource : resources) {
				labResource.showResourceDetails();
			}
		}
	}

	/**
	 * overridden by leaves
	 */
	protected abstract void setInactive();
	
	/**
	 * only overridden by clusters
	 * @param resourceId
	 */
	protected abstract void setInactive(String resourceId);
	
	/**
	 * only overridden by clusters
	 * @param resource
	 */
	protected abstract void addResource(LabResource resource);
	
	
	/**
	 * only overridden by clusters and the resource with the resourceId is set to inactive
	 * @param resourceId
	 */
	protected abstract void removeResource(String resourceId);
	
	
	
	//resourceId, supervisor, compy, 
	// methods: isOlderModel(), showOlderModel(int), getCompy(), showResourceDetails()
	// ,setInactive(), setInactive(resourceId), addResource(Resource), removeResource(resourceId) 
	

}
