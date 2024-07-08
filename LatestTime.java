public class LatestTime {
    static String maximumTime(String time) {
        char[] timeArray = time.toCharArray();
        if (timeArray[0] == '?') {
            if (Character.getNumericValue(timeArray[1])>3) {
                timeArray[0] = '1';
            }
            else{
                timeArray[0] = '2';
            }
        }
        if (timeArray[1] == '?') {
            if (Character.getNumericValue(timeArray[0]) == 2) {
                timeArray[1] = '3';
            } 
            else{
                timeArray[1] = '9';
            }
        }
        if (timeArray[3] == '?') {
            timeArray[3] = '5';
        }
        if (timeArray[4] == '?') {
            timeArray[4] = '9';
        }
        return new String(timeArray);
    }

    public static void main(String[] args) {
        String time = "0?:3?";
        System.out.println(maximumTime(time));  // Expected output: "23:50"
    }
}
