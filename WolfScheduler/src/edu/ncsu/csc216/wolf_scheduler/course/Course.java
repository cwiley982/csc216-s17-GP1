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
	 * Creates a course with all fields
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
		setName(name);
		setTitle(title);
		setSection(section);
		setCredits(credits);
		setInstructorId(instructorId);
		setMeetingDays(meetingDays);
		setStartTime(startTime);
		setEndTime(endTime);
	}
	/**
	 * Creates a course with the name, title, section, credits, instructor's id, and meeting days of the course
	 * @param name - the name of the course
	 * @param title -  the title of the course
	 * @param section -  the course section
	 * @param credits - credit hours for the course
	 * @param instructorId - instructor's unity id
	 * @param meetingDays - days the course meets
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays) {
		this(name, title, section, credits, instructorId, meetingDays, 0, 0);
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
	private void setName(String name) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	/**
	 * Sets the hash code for the Course object
	 * @return result - the hash code generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + credits;
		result = prime * result + endTime;
		result = prime * result + ((instructorId == null) ? 0 : instructorId.hashCode());
		result = prime * result + ((meetingDays == null) ? 0 : meetingDays.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + startTime;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (credits != other.credits)
			return false;
		if (endTime != other.endTime)
			return false;
		if (instructorId == null) {
			if (other.instructorId != null)
				return false;
		} else if (!instructorId.equals(other.instructorId))
			return false;
		if (meetingDays == null) {
			if (other.meetingDays != null)
				return false;
		} else if (!meetingDays.equals(other.meetingDays))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (startTime != other.startTime)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * Returns a comma separated value String of all Course fields.
	 * @return String representation of Course
	 */
	@Override
	public String toString() {
		if (meetingDays.equals("A")) {
	        return name + "," + title + "," + section + "," + credits + "," + instructorId + "," + meetingDays;
	    }
	    return name + "," + title + "," + section + "," + credits + "," + instructorId + "," + meetingDays + "," + startTime + "," + endTime; 
	}	
}
