package Neo4JEMFProblemReproduction;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Thing extends MyNodeWithAssignedId {
	
	public String property;
	
	public Thing(String property) {
		this.property = property;
	}

}
