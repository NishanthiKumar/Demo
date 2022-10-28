package arrayList_coll1;

public class Student {
	private String name;
	private int rollNumber;
	private int age;
	private boolean isMale;
	private int overallMark;
	private float fees;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setOverallMark(int overallMark) {
		this.overallMark=overallMark;
	}
	public int getOverallMark() {
		return overallMark;
	}
	public void setFees(float fees) {
		this.fees=fees;
	}
	public float getFees() {
		return fees;
	}
	
	public Student(String name,int rollNumber,int age,boolean isMale,int overallMark,float fees) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.age=age;
		this.isMale=isMale;
		this.overallMark=overallMark;
		this.fees=fees;
	}
	
	public String toString() {
		return name+" "+rollNumber+" "+age+" "+isMale+" "+overallMark+" "+fees;
	}

}
