package assign07;

public class Edge {

	// destination of this directed edge
	private Vertex dst;
	
	public Edge(Vertex dst) {
		if(dst == null) {
			throw new NullPointerException();
		}
		this.dst = dst;
		dst.incIndegree();
	}
	
	public Vertex getOtherVertex() {
		return this.dst;
	}
}
