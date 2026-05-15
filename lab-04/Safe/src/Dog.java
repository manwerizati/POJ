public class Dog implements Alarm {
    private Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void react() {
        System.out.println("Pies");
        if (logger != null) {
            logger.log(Severity.WARNING, EventSource.Alarm, "Wpisano niepoprawny pin");
        }
    }
}