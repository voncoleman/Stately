//import java.util.Currency;

public class TrafficLight {
    //field for state
    private TrafficLightState currentState; //RED, YELLOW, GREEN
    //Constructor
    public TrafficLight(){
        currentState = TrafficLightState.RED;
    }

    public void changeState(){

        switch (currentState){
            case RED:
                currentState = TrafficLightState.GREEN;
                break;

            case GREEN:
                currentState = TrafficLightState.YELLOW;
                break;
            
            case YELLOW:
                currentState = TrafficLightState.RED;
                break;

        }
        System.out.println("The light is now " + currentState);
    }
}
