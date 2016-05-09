package org.stockmaketprediction.model;

public class AnalysisStock {

	String companyName;
	String avgStockSold;
	String percentOfUpDays;
	String percentOfDownDays;

	String firstQuarterUp;
	String secondQuarterUp;
	String thirdQuarterUp;
	String fourthQuarterUp;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAvgStockSold() {
		return avgStockSold;
	}

	public void setAvgStockSold(String avgStockSold) {
		this.avgStockSold = avgStockSold;
	}

	public String getNoOfUpDays() {
		return percentOfUpDays;
	}

	public void setNoOfUpDays(String noOfUpDays) {
		this.percentOfUpDays = noOfUpDays;
	}

	public String getNoOfDownDays() {
		return percentOfDownDays;
	}

	public void setNoOfDownDays(String noOfDownDays) {
		this.percentOfDownDays = noOfDownDays;
	}

	public String getFirstQuarterUp() {
		return firstQuarterUp;
	}

	public void setFirstQuarterUp(String firstQuarterUp) {
		this.firstQuarterUp = firstQuarterUp;
	}

	public String getSecondQuarterUp() {
		return secondQuarterUp;
	}

	public void setSecondQuarterUp(String secondQuarterUp) {
		this.secondQuarterUp = secondQuarterUp;
	}

	public String getThirdQuarterUp() {
		return thirdQuarterUp;
	}

	public void setThirdQuarterUp(String thirdQuarterUp) {
		this.thirdQuarterUp = thirdQuarterUp;
	}

	public String getFourthQuarterUp() {
		return fourthQuarterUp;
	}

	public void setFourthQuarterUp(String fourthQuarterUp) {
		this.fourthQuarterUp = fourthQuarterUp;
	}
}
