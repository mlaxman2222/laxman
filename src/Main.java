import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup a=new StudentGroup(5);

	Date d=new Date(1996,9,22);
	Student s1=new Student(70,"laxman",d,90.0);
	Student s2=new Student(71,"lucky",d,80.0);

                a.addFirst(s1);
                a.addfirst(s2);

              System.out.println(a.getStudent(0).getId());






	}

}
