package practice_7_jcf.task4.user_monitor;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");
        userMonitor.addNewSession("134");

        userMonitor.printSessions();
    }
}
