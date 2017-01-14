/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.ncsu.csc216.wolf_scheduler.course.Course;

/**
 * Reads Course records from text files.  Writes a set of CourseRecords to a file.
 * 
 * @author Caitlyn
 */
public class CourseRecordIO {

	/**
	 * Reads course records from a file and generates a list of valid Courses.  Any invalid
     * Courses are ignored.  If the file to read cannot be found or the permissions are incorrect
     * a File NotFoundException is thrown.
	 * @param fileName file to read course records from
	 * @return a list of valid courses
	 * @throws FileNotFoundException if file can't be found or read
	 */
	public static ArrayList<Course> readCourseRecords(String fileName) throws FileNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Writes the given list of Courses to 
     * @param fileName name of file to write course records to
     * @param courses list of courses
     * @throws IOException
     */
	public static void writeCourseRecords(String fileName, ArrayList<Course> courses) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
