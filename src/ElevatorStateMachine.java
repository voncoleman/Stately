public class ElevatorStateMachine {
    
    public enum ElevatorState{
        IDLE,
        MOVING_UP,
        MOVING_DOWN,
        DOORS_OPEN,
        DOORS_CLOSING, ElevatorState
    }
    private ElevatorState currentState;

    public ElevatorStateMachine(){
        currentState = ElevatorState.IDLE;
    }

    public void callElevator(){
        switch( currentState){
            case IDLE:
            System.out.println("Elevator called. Moving to floor");
            currentState = ElevatorState.MOVING_UP; //Just assuming. For DEMO purposes only
            break;
        default:
        System.out.println("The elevator is busy");
        }
    }

    public void arriveAtFloor(){
        switch(currentState){
            case MOVING_UP:
            case MOVING_DOWN:
                System.out.println("Elevator Arrived. Opening doors.");
                currentState = ElevatorState.DOORS_OPEN;
                break;
            default:
                System.out.println("Cannot arrive at floor in the current state.");
        }
    }
    public void timer(){
        switch(currentState){
            case DOORS_OPEN:
                System.out.println("Doors have been open long enough. Closing Doors.");
                currentState = ElevatorState.DOORS_CLOSING;
            break;
        default:
            System.out.println("Timer not applicable in the current state.");
        }


    }
    public void doorsShut(){
        switch(currentState){
            case DOORS_CLOSING:
                System.out.println("Doors are fully closed. Going back to idle.");
                currentState = ElevatorState.IDLE;
                break;
            default:
                System.out.println("Doors cannot shut in the current state.");

        }
    }

    /**
     * Standard getter function
     * @return
     */
    public ElevatorState getCurrentState(){
        return currentState;
    }
}

