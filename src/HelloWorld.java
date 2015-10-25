import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	private String name;
	private int age;

	public static void main(String[] args) throws InterruptedException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Calendar calendar =  Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(2015, 1, 1, 2, 0, 0);
		calendar.set(Calendar.HOUR,8);
		StringBuilder sb = new StringBuilder();
		sb.append(calendar.getTime().toString()+"\n");
	//	calendar.add(field, amount);
		System.out.println(sb.toString());
		
		if (calendar instanceof GregorianCalendar)
			System.out.println("It is an instance of GregorianCalendar");
		
		Date now = new Date();
		Date date1 = new Date(2015, 10, 1);
		System.out.println(now.after(date1));
		
		String s=new String();
		 
		System.out.println(s);
 
		InetSocketAddress intaddr = new InetSocketAddress(8088);
		System.out.println(intaddr.getHostName());
		Map<String,Object> map =new HelloWorld().toMap();
		
		byte[] bs=new byte[]{0x30,0x00,0x00,0x00};
		String status = TestExecuteStatus.valueOf(bs[0]).toByte();
		
	 
		
	}
	
	public Map<String,Object> toMap() throws IllegalArgumentException, IllegalAccessException
	{
		Map<String,Object> map =new HashMap<String,Object>();
		Field[] fs = this.getClass().getDeclaredFields();
		for(Field f : fs)
		{
			map.put(f.getName(), f.get(this));
			System.out.println(f.getName());
		}
		return map;
	}

}
