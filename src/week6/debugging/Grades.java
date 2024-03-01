package week6.debugging;

public class Grades {

    /**
     * Return the appropriate letter grades for the given score for this grading chart
     * 97-100 A+
     * 93-96  A
     * 90-92  A-
     * 87-89  B+
     * 83-86  B
     * 80-82  B-
     * 77-79  C+
     * 73-76  C
     * 70-72  C-
     * 67-69  D+
     * 63-66  D
     * 60-62  D-
     * 0-59   F
     * >100   Invalid Grade
     * <0     Invalid Grade
     */
    public static String computeGrade(int score) {
        return letter(score) + plusMinus(score);
    }

    public static String letter(int score) {
        String letterGrade = "Invalid Grade";
        int tens = score / 10;
        if (score <= 100 && score >= 0) {
            if (tens >= 9) {
                letterGrade = "A";
            } else if (tens >= 8) {
                letterGrade = "B";
            } else if (tens >= 7) {
                letterGrade = "C";
            } else if (tens >= 6) {
                letterGrade = "D";
            } else if (tens >= 0) {
                letterGrade = "F";
            }
        }
        return letterGrade;
    }

    public static String plusMinus(int score) {
        String modifier = "";
        if (score < 100 && score >= 60) {
            int ones = score % 10;
            if (ones >= 7) {
                modifier = "+";
            } else if (ones < 3) {
                modifier = "-";
            }
        }
        if (score==100){
            modifier = "+";
        }
        return modifier;
    }

}