public class Encryptor
{
	private String encmsg;
	private String decmsg;
	
	public Encryptor()
	{
		encmsg = "";
		decmsg = "";
	}
	public String encode(String msg, String key)
	{
		for(int i = 0; i < msg.length(); i++)
			encmsg = encmsg + (char)(msg.charAt(i) ^ (((int)key)*i));
		return encmsg;
		
	}
	public String decode(String msg, String key)
	{
		for(int i = 0; i < msg.length(); i++)
			decmsg = decmsg + (char)(encmsg.charAt(i) ^ ((int)key*i));
		return decmsg;
	}
}