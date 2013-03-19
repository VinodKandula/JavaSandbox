import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeightedGradeAverage {
	private static class Class {
		float averageGrade;
		float studentCount;
	}
	
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new File("input2"));
			String classGradesStr[];
			ArrayList<Class> classes = new ArrayList<Class>();
			
			int studentCount = 0;
			float weightedAverage = 0;
			
			// Parse the data
			while (s.hasNext()) {
				Class c = new Class();
				classGradesStr = s.next().split("\\s+");
				
				c.studentCount = classGradesStr.length;
				for (int i = 0; i < classGradesStr.length; i++) {
					c.averageGrade += Float.parseFloat(classGradesStr[i]);
				}
					
				classes.add(c);
			}
			
			// Calculate weighted average
			for (Class c : classes) {
				weightedAverage += c.studentCount * c.averageGrade;
				studentCount += c.studentCount;
			}
			weightedAverage /= studentCount;
			
			System.out.println(String.format("Weighted average is %.2f", weightedAverage));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found");
		}
	}
}