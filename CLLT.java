
public class CLLT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CDL<String> cdl = new CDL<>();
	cdl.insertAfter(null, "��");
	cdl.insertAfter("��", "��");
	cdl.insertAfter("��", "��");
	cdl.insertPrevious("��", "��");
	

	
	cdl.printAll();
	cdl.removeAfter("��");
	cdl.printAll();
	cdl.removePrevious("��");
	cdl.printAll();
	
	System.out.println(cdl.search("��"));
	}
}
