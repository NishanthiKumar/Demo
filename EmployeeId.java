package arrayList_coll1;
import java.util.ArrayList;


public class EmployeeId {
	public static void main(String[] args) {
		ArrayList<Integer>empId=new ArrayList<>();
		empId.add(5334);
		empId.add(5335);
		empId.add(5336);
		empId.add(5337);
		empId.add(5338);
		int max=0;
		for(Integer id:empId) {
			//System.out.println(id);
			/*if(id%2==0) {
				System.out.println(id);
			}*/
			if(id>max) {
				max=id;
			}
		
		}System.out.println(max);
		
		//empId.forEach(x -> System.out.println(x));
	}

}
