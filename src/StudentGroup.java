import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	Student[] stud;
	//
	int n;
	int i
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		//
		 int n=students.length;
		 if(n==0){
			 throw new IllegalArgumentException();
			 
		 }
		 for(i=0;i<n;i++){
			 this.students[i]=students[i];
		 }
	}

	@Override
	public Student getStudent(int index) {
		// 
		int n=this.students.length;
		if(index<0 || index>=n){
			throw new IllegalArgumentException();
		}
		return this.student[index]; 
		
		
	}
	ArrayList<Student> ar=new ArrayList<Student>(this.students);

	@Override
	public void setStudent(Student student, int index) {
		// 
		if(student==null || index<0 || index>=n ){
			throw new IllegalArgumentException();
		}
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// 
		if(student==null){
			throw new IllegalArgumentException();
		}
		
		ar.add(0,student);
	}

	@Override
	public void addLast(Student student) {
		// 
		 n=this.student.length;
		if(student==null){
			throw new IllegalArgumentException();
		}
		
		ar.add(n-1,student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// 
		if(student==null || index<0 || index>=n ){
			throw new IllegalArgumentException();
		}
		ar.remove(index);
		
		
	}

	@Override
	public void remove(Student student) {
		// 
		boolean b=ar.remove(student);
		if(!b){
			throw new IllegalArgumentException("student does not exist");
		}
		
	}

	@Override
	public void removeFromIndex(int index) {
		//
		if(index<0 || index>=n){
			throw new IllegalArgumentException();
		}
		ar.removeRange(index+1,this.students.length-1);
		ar.remove(this.students.length-1);
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null){
			throw new IllegalArgumentException();
		}
		int i=ar.indexOf(student);
		removeRange(i-1,this.students.length-1);
		remove(this.students.length-1);
	}

	@Override
	public void removeToIndex(int index) {
		// 
		if(index<0 || index>=this.students.length){
			throw new IllegalArgumentException();
		}
		removeRange(0,index-1);
	}

	@Override
	public void removeToElement(Student student) {
		
		// 
		if(student==null){
			throw new IllegalArgumentException();
		}
		removeRange(0,ar.indexOf(student)-1);
	}

	@Override
	public void bubbleSort() {
		
		for (int i = 1; i < ar.size(); i++) {
	        if (ar.get(i - 1) > ar.get(i)) {
	            Collections.swap(list, i - 1, i);
	        }
	    }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		//
		if(date==null){
			throw new IllegalArgumentException();
		}
		for(int i=0)
		
		return 
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
