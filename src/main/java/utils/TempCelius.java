package utils;

public class TempCelius 
{
	
	public String tempCelius = "";
	float t_to_tc = 0;
	
	public TempCelius(String tc)
	{
		this.tempCelius = tc;
		System.out.println(tc);
		tempCelius = changeTempToCelius();
		System.out.println("tempCelius   "+tempCelius);
	}

	public String changeTempToCelius()
	{
		t_to_tc = Float.valueOf(tempCelius);
		t_to_tc = (t_to_tc - 32) * 5/9 ;
		
		tempCelius = String.valueOf(t_to_tc);
		return tempCelius;
	}

}
