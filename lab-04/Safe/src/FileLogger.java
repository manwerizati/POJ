public class FileLogger implements Logger {
    @Override
    public void log(Severity severity, EventSource source, String message) {
        System.out.println("File: " + severity + ", " + source + ", " + message);
    }
}