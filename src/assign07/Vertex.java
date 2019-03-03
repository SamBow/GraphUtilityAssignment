package assign07;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


public class Vertex<E> implements Comparator<Vertex>{

	private E element;
	
	private boolean visited;
	private Vertex previous;
	private int distanceFromStart;
	//TODO private int indegree;
	
	// adjacency list
	private LinkedList<Edge> adj;
	
	public Vertex(E element) {
		this.element = element;
		this.adj = new LinkedList<Edge>();
	}
	
	public E getElement() {
		return element;
	}
	
	public void addEdge(Vertex otherVertex) {
		adj.add(new Edge(otherVertex));
	}
	
	public Iterator<Edge> edges() {
		return adj.iterator();
	}
	
	public void setDistanceFromStart(int d) {
		distanceFromStart = d;
	}
	
	public int getDistanceFromStart() {
		return distanceFromStart;
	}
	
	public LinkedList<Edge> getEdges() {
		return adj;
	}
	
	public boolean getVisited() {
		return visited;
	}
	
	public void setPrevious(Vertex x) {
		previous = x;
	}
	
	public Vertex getPrevious() {
		return previous;
	}
	
	@Override
	public int compare(Vertex o1, Vertex o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
