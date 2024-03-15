//Invoker
public class RemoteControl {

	private Command command;


	/**
	 * @param command the command to set
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
        command.execute();
    }
	
}
