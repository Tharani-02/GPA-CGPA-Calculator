# GPA-CGPA-Calculator
Overview:
This is a Java-based GPA & CGPA Calculator that allows users to enter subject-wise grades and credits for multiple semesters to compute both Semester GPA and Cumulative CGPA. It provides an interactive console-based approach to accurately calculate academic performance.

Features:
1. Calculate GPA per semester based on grades and credit hours.
2. Compute CGPA by accumulating all semester GPA scores.
3. User-friendly interactive console input.
4. Input validation for incorrect grades.
5. Formatted output using DecimalFormat for precise GPA/CGPA values.
6. Supports multiple semesters for accurate cumulative calculations.

How it works:
1. The user inputs subject-wise credit hours and grades for a semester.
2. The program calculates the Semester GPA using the formula:
        GPA= ∑(Credit×Grade Point)/∑Credits
3. The user can input multiple semesters.
4. The Cumulative CGPA is calculated as:​
        CGPA= ∑Total Grade Points Across Semester / ∑Total Credits Across Semesters
5. The final CGPA is displayed at the end.

Grade Point Mapping:
Grade	 :   Grade Point
  O    -      10
  A+   -      9
  A    -      8
  B+   -      7
  B    -      6
  C    -      5


