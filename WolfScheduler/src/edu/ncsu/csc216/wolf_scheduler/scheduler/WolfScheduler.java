/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.scheduler;

import java.util.ArrayList;

import edu.ncsu.csc216.wolf_scheduler.course.Course;

/**
 * @author Caitlyn
 *
 */
public class WolfScheduler {

	public ArrayList<Course> courseCatalog;
	public ArrayList<Course> schedule;
	public String scheduleTitle;
	
	/**
	 * 
	 * @param fileName
	 */
	public WolfScheduler(String fileName) {
		courseCatalog = new ArrayList<Course>();
		schedule = new ArrayList<Course>();
		scheduleTitle = "My Schedule";
		
	}

	/**
	 * 
	 * @return
	 */
	public Object getCourseCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFullScheduledCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getScheduledCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void exportSchedule(String string) {
		// TODO Auto-generated method stub
		
	}

	public boolean removeCourse(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addCourse(String name, String section) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getCourseFromCatalog(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void resetSchedule() {
		// TODO Auto-generated method stub
		
	}

}
