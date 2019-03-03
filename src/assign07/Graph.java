package assign07;

import java.util.Comparator;
import java.util.HashMap;

/**
 * Represents a directed graph that contains a set of vertices and a set of edges.
 * The graph is generic.
 * @author Jesse Jordan and Dallen Burwell
 * @version March 2, 2019
 *
 */
public class Graph<E> implements Comparator<E>{
	
	//Graph - a set of vertices 
	HashMap<E, Vertex> vertices;
	
	/**
	 * Constructs an empty graph
	 */
	public Graph() {
		vertices = new HashMap<E, Vertex>();
	}
	
	
	@Override
	public int compare(E o1, E o2) { 
		// TODO Auto-generated method stub
		return 0;
	}
}
