import java.io.*;

public class Chatmessage implements Serializable {
    protected static final long serialVersionUID = 1112122200L;
	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
	private final int type;
	private final String message;
	
	// constructor
	Chatmessage(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	// getters
	int getType() {
		return type;
	}
	String getMessage() {
		return message;
	}
    
}

