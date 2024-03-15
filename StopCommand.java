//Concrete Command
public class StopCommand implements Command {

	private Vehicle vehicle;
	
	public StopCommand(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.brake();
		
	}
 
	
	

}
