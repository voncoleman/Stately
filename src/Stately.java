public class Stately {

    TrafficLight trafficLight = new TrafficLight();

    public void run() {
        for (int i = 0; i < 6; i++) {
            trafficLight.changeState();
            //When you're not sure if your code will run as intended (Try/Catch)
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace(); //Prints current stack
            }
        }
    }
}
