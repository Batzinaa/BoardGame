package event;

public class MoveEvent extends Event{
	
	int position;
	
	public MoveEvent(Object source, String message,int position) {
		super(source, message);
		this.position = position;
	}
	
	@Override
	public String getMessage() {
		return "New position is " + position;
	}
}

