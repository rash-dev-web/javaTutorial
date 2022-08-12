package section4;

public class StudentUtil {

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double[] gpa = new double[studentIdList.length];
		System.out.println("Student count: " + gpa.length);
		int count = 0;
		for (int x = 0; x < studentsGrades.length; x++) {
			float totalMarks = 0;
//			System.out.println(studentsGrades[x]);
			for (int y = 0; y < studentsGrades[x].length; y++) {
//				System.out.println(studentsGrades[x][y]);
				if (studentsGrades[x][y] == 'A') {
					totalMarks += 4;
				} else if (studentsGrades[x][y] == 'B') {
					totalMarks += 3;
				} else if (studentsGrades[x][y] == 'C') {
					totalMarks += 2;
				}
				gpa[x] = (totalMarks / studentsGrades[y].length);
			}
//			System.out.println(totalMarks / studentsGrades[x].length);
//			gpa[x] = (totalMarks / studentsGrades[x].length);
//			System.out.println(gpa[x]);
		}
//			for (char[] studentGrades : studentsGrades?) {
//				System.out.println(studentGrades);
//				float totalMarks = 0;
//				for (char grade : studentGrades) {
////				System.out.println(grade);
//					if (grade == 'A') {
//						totalMarks += 4;
//					} else if (grade == 'B') {
//						totalMarks += 3;
//					} else if (grade == 'C') {
//						totalMarks += 2;
//					}
//				}
//				System.out.println(totalMarks / studentGrades.length);
//
//			}

		return gpa;
		// your code
	}

	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {

		if (lower == 0 || higher == 0 || studentIdList == null || studentsGrades == null) {
			return null;
		}
		// return studentIdList;
		// perform parameter validation. Return null if passed parameters are not valid

		// invoke calculateGPA
		double[] gpaList = calculateGPA(studentIdList, studentsGrades);
		// construct the result array and return it. You would need an extra for loop to
		// compute the size of the resulting array
		return studentIdList;
	}

	public static void main(String[] args) {
		int[] studentIdList = { 1001, 1002, 1003 };
		char[][] studentsGrades = { { 'A', 'A', 'A', 'B' }, { 'A', 'A', 'B' }, { 'A', 'A', 'A', 'B' }, { 'A', 'C' } };
		double[] gpaList = calculateGPA(studentIdList, studentsGrades);
		for (double gpa : gpaList) {
			System.out.println(gpa);
		}
	}

}
