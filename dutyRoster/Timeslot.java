package dutyrostering.dutyrostering;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Timeslot implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.time.LocalDateTime startTime;
	private java.time.LocalDateTime endTime;

	public Timeslot() {
	}

	public java.time.LocalDateTime getStartTime() {
		return this.startTime;
	}

	public void setStartTime(java.time.LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public java.time.LocalDateTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(java.time.LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Timeslot(java.time.LocalDateTime startTime,
			java.time.LocalDateTime endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

}