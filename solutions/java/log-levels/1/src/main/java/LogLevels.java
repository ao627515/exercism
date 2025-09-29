public class LogLevels {
    
    public static String message(String logLine) {
        int end = logLine.indexOf("]:");

        return end == -1
                ? logLine
                : logLine.substring(end + 2).trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');

        return (start != -1 && end != -1 && start < end)
                ? logLine.substring(start + 1, end).toLowerCase()
                : logLine;
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
