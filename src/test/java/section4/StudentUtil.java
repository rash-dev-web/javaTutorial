package section4;

public class StudentUtil {

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double[] gpa;
		int count = 0;
		for (char[] studentGrades : studentsGrades) {
			System.out.println(studentGrades);
			float totalMarks = 0;
			for (char grade : studentGrades) {
//				System.out.println(grade);
				if (grade == 'A') {
					totalMarks += 4;
				} else if (grade == 'B') {
					totalMarks += 3;
				} else if (grade == 'C') {
					totalMarks += 2;
				}
			}
			System.out.println(totalMarks / studentGrades.length);
			return gpa[]{totalMarks/studentGrades.length};
			count++;
		}

		return null;
		// your code
	}

	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {

		if (lower == 0 || higher == 0 || studentIdList == null || studentsGrades == null) {
			return null;
		}
		return studentIdList;
		// perform parameter validation. Return null if passed parameters are not valid

		// invoke calculateGPA

		// construct the result array and return it. You would need an extra for loop to
		// compute the size of the resulting array
	}

	public static void main(String[] args) {
		int[] studentIdList = { 1001, 1002, 1003 };
		char[][] studentsGrades = { { 'A', 'A', 'A', 'B' }, { 'A', 'A', 'B' }, { 'A', 'A', 'A', 'B' } };
		calculateGPA(studentIdList, studentsGrades);

	}

}
