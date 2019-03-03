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
	
	public void addEdge(E element1, E element2) {
		
		Vertex vertex1;
		if(vertices.containsKey(element1)) {
			vertex1 = vertices.get(element1);
		}
		else {
			vertex1 = new Vertex(element1);
			vertices.put(element1, vertex1);
		}
		
		Vertex vertex2;
		if(vertices.containsKey(element2)) {
			vertex2 = vertices.get(element2);
		}
		else {
			vertex2 = new Vertex(element2);
			vertices.put(element2, vertex2);
		}
		vertex1.addEdge(vertex2);
	}
	
	@Override
	public int compare(E o1, E o2) { 
		// TODO Auto-generated method stub
		return 0;
	}
}
