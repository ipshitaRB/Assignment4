/**
 * 
 */
package com.ipshita.assignment;

import com.ipshita.assignment.util.Constants;
import com.ipshita.assignment.util.Status;

/**
 * @author Ipshita
 *
 */
public class Printer extends LabResource {

	Status status;
	int modelYear;

	/**
	 * 
	 */
	public Printer(Status status, int modelYear, String resourceId,
			String supervisor, double costOfMaintenancePerYear) {
		this.status = status;
		this.modelYear = modelYear;
		this.resourceId = resourceId;
		this.supervisor = supervisor;
		this.costOfMaintenancePerYear = costOfMaintenancePerYear;

		System.out.println(Printer.class.getSimpleName() + Constants.COLON + resourceId + Constants.CREATED);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ipshita.assignment.LabResource#isOlderModel(int)
	 */
	@Override
	protected boolean isOlderModel(int modelYear) {

		return this.modelYear < modelYear;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ipshita.assignment.LabResource#showIndividualDetails()
	 */
	@Override
	protected void showIndividualDetails() {
		System.out.println(Printer.class.getSimpleName() + Constants.COLON + Constants.NEXTLINE
				+ Constants.RESOURCE_ID + Constants.COLON + this.resourceId + Constants.NEXTLINE
				+ Constants.STATUS + Constants.COLON + this.status + Constants.NEXTLINE
				+ Constants.MODEL_YEAR + Constants.COLON + this.modelYear + Constants.NEXTLINE
				+ Constants.SUPERVISOR + Constants.COLON + this.supervisor + Constants.NEXTLINE
				);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ipshita.assignment.LabResource#setInactive()
	 */
	@Override
	protected void setInactive() {
		status = Status.INACTIVE;

	}

	@Override
	protected void showOlderModel(int modelYear) {
		if (isOlderModel(modelYear)) {
			System.out.println(resourceId);
		}

	}

	@Override
	protected void setInactive(String resourceId) {
		if (this.resourceId == resourceId) {
			setInactive();
		}

	}

	@Override
	protected void addResource(LabResource resource) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void removeResource(String resourceId) {
		if (this.resourceId == resourceId) {
			setInactive();
		}

	}

}
