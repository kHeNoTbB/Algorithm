
    import java.util.Arrays;

    public class student implements Comparable<student> {
    	String name;
	    int id;

	    student(String name, int id) {
		    this.name = name;
		    this.id = id;
	    }

	    @Override
	    public int compareTo(student o) {
		    //내림차순
		    //return o.id - this.id;
		
		    //오름차순
		    return this.id - o.id;
	    }

	    public String toString() {
	    	return name + " " +id;
	    }

	    public static void main(String[] args) {
		    student st[] = new student[5];
		    st[0] = new student("1", 32);
		    st[1] = new student("2", 22);
		    st[2] = new student("3", 12);
		    st[3] = new student("4", 52);
		    st[4] = new student("5", 42);

		    Arrays.sort(st);
		    for (int i = 0; i < 5; i++)
			    System.out.println(st[i]);
	    }
    }
