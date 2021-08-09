package junitbasics;

public class MessageUtil
{
	private String message;

	public MessageUtil(String message)
	{
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String printMessage()
	{
		System.out.println(message);
		return message;
	}

	public String salutationMessage()
	{
		return "Hi!" + message;
	}

}
