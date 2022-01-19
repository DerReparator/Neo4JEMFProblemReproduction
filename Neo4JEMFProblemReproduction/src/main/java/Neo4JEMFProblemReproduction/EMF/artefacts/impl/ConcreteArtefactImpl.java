/**
 */
package Neo4JEMFProblemReproduction.EMF.artefacts.impl;

import Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsPackage;
import Neo4JEMFProblemReproduction.EMF.artefacts.ConcreteArtefact;

import org.eclipse.emf.ecore.EClass;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@NodeEntity("ConcreteArtefact")
public class ConcreteArtefactImpl extends ToolArtefactImpl implements ConcreteArtefact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactsPackage.Literals.CONCRETE_ARTEFACT;
	}

} //ConcreteArtefactImpl
