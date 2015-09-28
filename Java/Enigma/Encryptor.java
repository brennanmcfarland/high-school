public class Encryptor
{
	private String encmsg;
	private String decmsg;
	
	public Encryptor()
	{
		encmsg = "";
		decmsg = "";
	}
	public String encode(String msg, int key)
	{
		for(int i = 0; i < msg.length(); i++)
			encmsg = encmsg + (char)(msg.charAt(i) ^ key);
		return encmsg;
		
	}
	public String decode(String msg, int key)
	{
		for(int i = 0; i < msg.length(); i++)
			decmsg = decmsg + (char)(eb     ncmsg.charAt(i) ^ key);
		return decmsg;
	}
}