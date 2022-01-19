package Neo4JEMFProblemReproduction;

import java.util.UUID;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

import Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsFactory;
import Neo4JEMFProblemReproduction.EMF.artefacts.ConcreteArtefact;

/**
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration configuration = new Configuration.Builder()
				.uri("bolt://localhost:7687")
				.credentials("neo4j", "test")
				.build();
		
		SessionFactory factory = new SessionFactory(configuration, Application.class.getPackage().getName());
	
		try {
			storeEMFElement(factory);
		} catch (Exception e) {
			System.err.println("Exception occured when storing EMF Element:");
			e.printStackTrace(System.err);
		}

		try {
			storeNonEMFElement(factory);
		} catch (Exception e) {
			System.err.println("Exception occured when storing non-EMF Element:");
			e.printStackTrace(System.err);
		}
	}

	private static void storeEMFElement(SessionFactory factory) {
		Session session = factory.openSession();
		
		ConcreteArtefact thing = ArtefactsFactory.eINSTANCE.createConcreteArtefact();
		thing.setUuid(UUID.randomUUID().toString());
		thing.setProjectName("FOO BAR Project");
		
		session.save(thing);
	}
	
	private static void storeNonEMFElement(SessionFactory factory) {
		Session session = factory.openSession();
		
		Thing thing = new Thing("red");
		thing.name = "A red thing" + UUID.randomUUID().toString();
		
		session.save(thing);
	}
	
}
