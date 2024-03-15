
public class CommandApp {

	public static void main(String[] args) {
		
		//receiver
		Vehicle bicycle = new Bicycle();
		Vehicle boat = new Boat();
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		
		//command
		Command startBicycle = new StartCommand(bicycle);
		Command startBoat = new StartCommand(boat);
		Command startCar = new StartCommand(car);
		Command startPlane = new StartCommand(plane);
		
		Command accelerateBicycle = new AccelerateCommand(bicycle);
		Command accelerateBoat = new AccelerateCommand(boat);
		Command accelerateCar = new AccelerateCommand(car);
		Command acceleratePlane = new AccelerateCommand(plane);
		
		Command stopBicycle = new StopCommand(bicycle); 
		Command stopBoat = new StopCommand(boat);
		Command stopCar = new StopCommand(car);
		Command stopPlane = new StopCommand(plane);
		
		//invoker
		RemoteControl remoteControl = new RemoteControl();
//		remoteControl.setCommand(startCar);
//		remoteControl.pressButton();
//		//remoteControl.setCommand(startCar);
//		remoteControl.pressButton();
//		remoteControl.setCommand(accelerateCar);
//		remoteControl.pressButton();
//		remoteControl.setCommand(stopCar);
		
		remoteControl.setCommand(startBicycle);
		remoteControl.pressButton();
		remoteControl.setCommand(stopCar);
		remoteControl.pressButton();
		remoteControl.setCommand(accelerateBicycle);
		remoteControl.pressButton();
		remoteControl.setCommand(acceleratePlane);
		remoteControl.pressButton();
		remoteControl.setCommand(startBoat);
	}

}
