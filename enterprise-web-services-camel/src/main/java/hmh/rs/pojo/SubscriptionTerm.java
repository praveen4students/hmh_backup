package hmh.rs.pojo;

import javax.xml.datatype.XMLGregorianCalendar;

public class SubscriptionTerm {

    protected Long duration;
    protected String unit;
    protected XMLGregorianCalendar startDate;
    
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}
	public void setStartDate(XMLGregorianCalendar startDate) {
		this.startDate = startDate;
	}

}
