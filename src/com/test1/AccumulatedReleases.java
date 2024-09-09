package com.test1;

public class AccumulatedReleases {
	private Integer accumulatedReleaseIndicator;
	private String targetItamName;
	private String targetItamType;
	private String targetItamOwner;
	private String techContact;
	private String targetItamPO;
	private long deploymentIndicator;
	private String targetItamBA;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AccumulatedReleases() {

	}

	public AccumulatedReleases(Integer accumulatedReleaseIndicator, String targetItamName, String targetItamType,
			String targetItamOwner, String techContact, String targetItamPO, long deploymentIndicator,
			String targetItamBA, String creationDate, String modifiedDate, String entityState) {
		super();
		this.accumulatedReleaseIndicator = accumulatedReleaseIndicator;
		this.targetItamName = targetItamName;
		this.targetItamType = targetItamType;
		this.targetItamOwner = targetItamOwner;
		this.techContact = techContact;
		this.targetItamPO = targetItamPO;
		this.deploymentIndicator = deploymentIndicator;
		this.targetItamBA = targetItamBA;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getAccumulatedReleaseIndicator() {
		return accumulatedReleaseIndicator;
	}

	public void setAccumulatedReleaseIndicator(Integer accumulatedReleaseIndicator) {
		this.accumulatedReleaseIndicator = accumulatedReleaseIndicator;
	}

	public String getTargetItamName() {
		return targetItamName;
	}

	public void setTargetItamName(String targetItamName) {
		this.targetItamName = targetItamName;
	}

	public String getTargetItamType() {
		return targetItamType;
	}

	public void setTargetItamType(String targetItamType) {
		this.targetItamType = targetItamType;
	}

	public String getTargetItamOwner() {
		return targetItamOwner;
	}

	public void setTargetItamOwner(String targetItamOwner) {
		this.targetItamOwner = targetItamOwner;
	}

	public String getTechContact() {
		return techContact;
	}

	public void setTechContact(String techContact) {
		this.techContact = techContact;
	}

	public String getTargetItamPO() {
		return targetItamPO;
	}

	public void setTargetItamPO(String targetItamPO) {
		this.targetItamPO = targetItamPO;
	}

	public long getDeploymentIndicator() {
		return deploymentIndicator;
	}

	public void setDeploymentIndicator(long deploymentIndicator) {
		this.deploymentIndicator = deploymentIndicator;
	}

	public String getTargetItamBA() {
		return targetItamBA;
	}

	public void setTargetItamBA(String targetItamBA) {
		this.targetItamBA = targetItamBA;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
