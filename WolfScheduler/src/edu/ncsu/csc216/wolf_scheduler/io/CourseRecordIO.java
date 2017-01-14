/**
 * 
 */
package edu.ncsu.csc216.wolf_scheduler.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.ncsu.csc216.wolf_scheduler.course.Course;

/**
 * Reads Course records from text files. Writes a set of CourseRecords to a
 * file.
 * 
 * @author Caitlyn
 */
public class CourseRecordIO {

	/**
	 * Reads course records from a file and generates a list of valid Courses.
	 * Any invalid Courses are ignored. If the file to read cannot be found or
	 * the permissions are incorrect a File NotFoundException is thrown.
	 * 
	 * @param fileName file to read course records from
	 * @return a list of valid courses
	 * @throws FileNotFoundException if file can't be found or read
	 */
	public static ArrayList<Course> readCourseRecords(String fileName) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File(fileName));
		ArrayList<Course> courses = new ArrayList<Course>();
		while (fileReader.hasNextLine()) {
			try {
				Course course = readCourse(fileReader.nextLine());
				boolean duplicate = false;
				for (int i = 0; i < courses.size(); i++) {
					Course c = courses.get(i);
					if (course.getName().equals(c.getName()) && course.getSection().equals(c.getSection())) {
						// it's a duplicate
						duplicate = true;
					}
				}
				if (!duplicate) {
					courses.add(course);
				}
			} catch (IllegalArgumentException e) {
				// skip the line
			}
		}
		fileReader.close();
		return courses;
	}

	private static Course readCourse(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Writes Courses to course record file specified
	 * 
	 * @param fileName name of file to write course records to
	 * @param courses list of courses
	 * @throws IOException
	 */
	public static void writeCourseRecords(String fileName, ArrayList<Course> courses) throws IOException {
		PrintStream fileWriter = new PrintStream(new File(fileName));
		for (int i = 0; i < courses.size(); i++) {
			fileWriter.println(courses.get(i).toString());
		}
		fileWriter.close();
	}

}
