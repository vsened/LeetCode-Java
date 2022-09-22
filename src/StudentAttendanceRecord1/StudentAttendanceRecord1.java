package StudentAttendanceRecord1;

public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        return !s.contains("LLL") && s.length() - s.replace("A", "").length() < 2;
    }
}
