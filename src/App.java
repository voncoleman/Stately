public class App {
    public static void main(String[] args) throws Exception {

        // new Stately().run();

        //runElevator();

        new Stacky().run();
    }

    private static void runElevator() {
        ElevatorStateMachine elevator = new ElevatorStateMachine();
        System.out.println("Initial state:" + elevator.getCurrentState());

        elevator.callElevator();
        System.out.println("Current state: " + elevator.getCurrentState());

        elevator.arriveAtFloor();
        System.out.println("Current state: " + elevator.getCurrentState());

        elevator.timer();
        System.out.println("Current state: " + elevator.getCurrentState());

        elevator.doorsShut();
        System.out.println("Current state: " + elevator.getCurrentState());
    }
}
