/**
 */
package Neo4JEMFProblemReproduction.EMF.artefacts.impl;

import Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsPackage;
import Neo4JEMFProblemReproduction.EMF.artefacts.ToolArtefact;

import Neo4JEMFProblemReproduction.EMF.impl.BaseElementImpl;

import org.eclipse.emf.ecore.EClass;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@NodeEntity("ToolArtefact")
public abstract class ToolArtefactImpl extends BaseElementImpl implements ToolArtefact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactsPackage.Literals.TOOL_ARTEFACT;
	}

} //ToolArtefactImpl
