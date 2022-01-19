package Neo4JEMFProblemReproduction;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public abstract class MyNodeWithAssignedId {

	@Id
	public String name;
	
}
