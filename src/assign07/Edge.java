package assign07;

public class Edge {

	// destination of this directed edge
	private Vertex dst;
	
	public Edge(Vertex dst) {
		this.dst = dst;
	}
	
	public Vertex getOtherVertex() {
		return this.dst;
	}
}
