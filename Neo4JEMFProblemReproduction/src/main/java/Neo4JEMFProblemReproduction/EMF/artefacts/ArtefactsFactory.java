/**
 */
package Neo4JEMFProblemReproduction.EMF.artefacts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsPackage
 * @generated
 */
public interface ArtefactsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtefactsFactory eINSTANCE = Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concrete Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Artefact</em>'.
	 * @generated
	 */
	ConcreteArtefact createConcreteArtefact();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArtefactsPackage getArtefactsPackage();

} //ArtefactsFactory
