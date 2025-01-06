public class InsuranceInfo
{
	public static void main(String[] args) 
	{
		String[] contractors = 
			{
				"契約者名:中村、保険料:5000円、遅延利息金:2000円",
		        "契約者名:田島、保険料:3000円",
		        "契約者名:小澤、保険料:4500円",
		        "契約者名:大西、保険料:6000円、遅延利息金:3500円"
			};
		
		int later = 0;
		
		for(String contractor : contractors) {
			System.out.println(contractor);
			if(contractor.contains("遅延利息金")) {
				later++;
			}
		}
		System.out.println("遅延利息金が発生しているのは" + later + "人です");
	}
}