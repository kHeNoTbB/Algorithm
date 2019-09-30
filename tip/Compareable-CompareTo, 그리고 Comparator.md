# Compareable-CompareTo, 그리고 Comparator
## Comparable-CompareTo
    package examples;

    import java.util.Arrays;
    import java.util.Comparator;

    public class test {
	    static class Node implements Comparable<Node>{
		    int id;
		    int weight;
		    Node(int id, int weight){
			    this.id = id;
			    this.weight = weight;
		    }

	    	@Override
	    	public int compareTo(Node o) {
		    	// TODO Auto-generated method stub
		    	System.out.println(Integer.compare(this.weight, o.weight));
			    return Integer.compare(this.weight, o.weight);
	    	}
		
	    }

	    public static void main(String[] args) {
		    Node[] nodes = new Node[3];
		    nodes[0] = new Node(1,10);
		    nodes[1] = new Node(2,5);
		    nodes[2] = new Node(3,13);
		
		    Arrays.sort(nodes);
		
		    for(int i = 0; i < nodes.length; i++)
			    System.out.println(nodes[i]);
	    }
    }

## Comparator
    package examples;

    import java.util.Arrays;
    import java.util.Comparator;

    public class test {
	    static class Node implements Comparable<Node>{
	    	int id;
		    int weight;
		    Node(int id, int weight){
		    	this.id = id;
			    this.weight = weight;
		    }
	    	@Override
		    public String toString() {
			    return "Node [id=" + id + ", weight=" + weight + "]";
		    }
		
	    }

	    public static void main(String[] args) {
	    	Node[] nodes = new Node[3];
	    	nodes[0] = new Node(1,10);
	    	nodes[1] = new Node(2,5);
	    	nodes[2] = new Node(3,13);
		
	
		    Arrays.sort(nodes, new Comparator<Node>() {

		    	@Override
			    public int compare(Node o1, Node o2) {
				
			    	return o1.weight-o2.weight; //바뀜
			    	//return Integer.compare(o1.weight, o2.weight);
			    }
		    });
		
		    for(int i = 0; i < nodes.length; i++)
			    System.out.println(nodes[i]);
	    }
    }




