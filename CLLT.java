
public class CLLT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CDL<String> cdl = new CDL<>();
	cdl.insertAfter(null, "월");
	cdl.insertAfter("월", "수");
	cdl.insertAfter("수", "금");
	cdl.insertPrevious("수", "목");
	

	
	cdl.printAll();
	cdl.removeAfter("금");
	cdl.printAll();
	cdl.removePrevious("수");
	cdl.printAll();
	
	System.out.println(cdl.search("월"));
	}
}
