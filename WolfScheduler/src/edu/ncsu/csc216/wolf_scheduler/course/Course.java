/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.course;

/**
 * @author Caitlyn
 *
 */
public class Course {
	/** Course's name. */
	private String name;
	/** Course's title. */
	private String title;
	/** Course's section. */
	private String section;
	/** Course's credit hours */
	private int credits;
	/** Course's instructor */
	private String instructorId;
	/** Course's meeting days */
	private String meetingDays;
	/** Course's starting time */
	private int startTime;
	/** Course's ending time */
	private int endTime;
	/**
	 * @param name - the name of the course
	 * @param title -  the title of the course
	 * @param section -  the course section
	 * @param credits - credit hours for the course
	 * @param instructorId - instructor's unity id
	 * @param meetingDays - days the course meets
	 * @param startTime - time course starts
	 * @param endTime - time course ends
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays,
			int startTime, int endTime) {
		this.name = name;
		this.title = title;
		this.section = section;
		this.credits = credits;
		this.instructorId = instructorId;
		this.meetingDays = meetingDays;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	/**
	 * @param name - the name of the course
	 * @param title -  the title of the course
	 * @param section -  the course section
	 * @param credits - credit hours for the course
	 * @param instructorId - instructor's unity id
	 * @param meetingDays - days the course meets
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays) {
		this.name = name;
		this.title = title;
		this.section = section;
		this.credits = credits;
		this.instructorId = instructorId;
		this.meetingDays = meetingDays;
	}
	/**
	 * Returns the Course's name
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the Course's name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Returns Course's title
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Sets Course's title
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Returns Course's section
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * Sets Course's section
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * Returns Course's credits
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * Sets Course's credits
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * Returns the instructor's id
	 * @return the instructorId
	 */
	public String getInstructorId() {
		return instructorId;
	}
	/**
	 * Gets the instructor's id
	 * @param instructorId the instructorId to set
	 */
	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	/**
	 * Returns the meeting days
	 * @return the meetingDays
	 */
	public String getMeetingDays() {
		return meetingDays;
	}
	/**
	 * Sets the meeting days
	 * @param meetingDays the meetingDays to set
	 */
	public void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
	}
	/**
	 * Returns the start time
	 * @return the startTime
	 */
	public int getStartTime() {
		return startTime;
	}
	/**
	 * Sets the start time
	 * @param startTime the startTime to set
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	/**
	 * Returns the end time
	 * @return the endTime
	 */
	public int getEndTime() {
		return endTime;
	}
	/**
	 * Sets the end time
	 * @param endTime the endTime to set
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
