package lecture;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<>();
	static ArrayList<Lecture> lectureList = new ArrayList<>();

	void run() {
		readLectures();
		printLectures();
		readStudents();
		printStudents();
		search();
	}

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (IOException e)
		{
			System.out.println("파일 입력 오류");
			System.exit(0);
		}
		return filein;
	}
	void readStudents() {
		Scanner filein = openFile("student.txt");
		Student st = null;
		while (filein.hasNext()) {
			st = new Student();
			st.read(filein);
			studentList.add(st);
		}
		filein.close();
	}
	void readLectures() {
		Scanner filein = openFile("lecture.txt");
		Lecture lec = null;
		String code;
		while (filein.hasNext()) {
			lec = new Lecture();
			lec.read(filein);
			lectureList.add(lec);
		}		
		filein.close();
	}

	private void printLectures() {
		// TODO Auto-generated method stub
		for (Lecture lec: lectureList) {
			lec.print();
		}
	}

	void printStudents() {
		for (Student st : studentList) {
			st.print();
		}
	}

	void search() {
		String name = null;
		while (true) {
			System.out.print("키워드:");
			name = scan.next();
			if (name.equals("end"))
				break;
			for (Student st : studentList) {
				if (st.matches(name))
					st.print();
			}
		}
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}

	static public Lecture findLecture(String code) {
		// TODO Auto-generated method stub
		for (Lecture lec: lectureList) {
			if (lec.matches(code))
				return lec;
		}
		return null;
	}
}