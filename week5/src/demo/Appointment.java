package demo;

public class Appointment {
    private int day;
    private int month;
    private int year;

}



















































//    private boolean isValidDate(int day, int month, int year) {
//        // Validate year (we assume four-digit year)
//        if (year < 1000 || year > 9999) {
//            return false;
//        }
//
//        // Validate month
//        if (month < 1 || month > 12) {
//            return false;
//        }
//
//        // Validate day
//        if (day < 1) {
//            return false;
//        }
//        if (month == 1 || month == 3 || month == 5 ||
//                month == 7 || month == 8 || month == 10 ||
//                month == 12 ) {
//            // Months having 31 days
//            if (day > 31) {
//                return false;
//            }
//        } else if (month == 4 || month == 6 || month == 9 ||
//                month == 11 ) {
//            // Months having 30 days
//            if (day > 30) {
//                return false;
//            }
//        } else {
//            // February
//            if (isLeapYear(year)) {
//                if (day > 29) {
//                    return false;
//                }
//            } else {
//                if (day > 28) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//
//    // Check if a given year is a leap year
//    private boolean isLeapYear(int year) {
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//    }