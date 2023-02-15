 class SwitchExerciseRunner {

     static boolean isWeekday(int dayNumber) {
        switch (dayNumber) {
            case 0, 6: //merge cases that are false
                return false;
            case 1, 2, 3, 4, 5://merge cases that are true
                return true;
        }
        return false;
    }



     static String determineNameOfDay(int dayNumber) {

        switch (dayNumber) {
            case 0:
                return "Sunday";

            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

        }
        return "Invalid Day";
    }


}






