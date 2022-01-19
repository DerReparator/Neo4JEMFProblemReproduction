/**
 */
package Neo4JEMFProblemReproduction.EMF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Neo4JEMFProblemReproduction.EMF.modelPackage
 * @generated
 */
public interface modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modelFactory eINSTANCE = Neo4JEMFProblemReproduction.EMF.impl.modelFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	modelPackage getmodelPackage();

} //modelFactory
