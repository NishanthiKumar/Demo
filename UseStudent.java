package arrayList_coll1;
import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student st1=new Student("Nisha",123,20,false,90,80000.00f);
		Student st2=new Student("Sasi",124,22,true,80,500000.00f);
		Student st3=new Student("Karthi",125,19,true,78,60000.00f);
		Student st4=new Student("Kamesh",126,23,true,90,70000.00f);
		Student st5=new Student("Sathish",127,26,true,80,80000.00f);
		
		ArrayList<Student>studentList=new ArrayList<>();
		studentList.add(st1);studentList.add(st2);studentList.add(st3);
		studentList.add(st4);studentList.add(st5);studentList.add(st1);
		
		/*for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}*/
		
		/*for(Student st:studentList) {
			System.out.println(st);
		}*/
		
		//studentList.forEach(x -> System.out.println(x));
		
		
		
		/*ArrayList<Student> femaleStudentList=new ArrayList<>();
		for(Student st:studentList) {
			if(st.getIsMale()==false) {
				femaleStudentList.add(st);	
			}
		}
		femaleStudentList.forEach(x -> System.out.println(x));*/
		
		
		
		float totalFees=0;
		for(Student st:studentList) { 
			totalFees=totalFees+st.getFees();
		}
		for(Student st:studentList) {
			float fees=st.getFees();
			float per=fees/totalFees*100;
			System.out.println(st+",Fees paying percentage: "+per+"%");
		}
		
		System.err.println("***********");
		
		
	}

}
