/**
 */
package Neo4JEMFProblemReproduction.EMF.artefacts;

import Neo4JEMFProblemReproduction.EMF.modelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsFactory
 * @model kind="package"
 * @generated
 */
public interface ArtefactsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "artefacts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "foo.bar.emf.artefacts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "foobarArtefacts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtefactsPackage eINSTANCE = Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Neo4JEMFProblemReproduction.EMF.artefacts.impl.ToolArtefactImpl <em>Tool Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ToolArtefactImpl
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsPackageImpl#getToolArtefact()
	 * @generated
	 */
	int TOOL_ARTEFACT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ARTEFACT__UUID = modelPackage.BASE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ARTEFACT__PROJECT_NAME = modelPackage.BASE_ELEMENT__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Tool Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ARTEFACT_FEATURE_COUNT = modelPackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tool Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ARTEFACT_OPERATION_COUNT = modelPackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Neo4JEMFProblemReproduction.EMF.artefacts.impl.ConcreteArtefactImpl <em>Concrete Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ConcreteArtefactImpl
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsPackageImpl#getConcreteArtefact()
	 * @generated
	 */
	int CONCRETE_ARTEFACT = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARTEFACT__UUID = TOOL_ARTEFACT__UUID;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARTEFACT__PROJECT_NAME = TOOL_ARTEFACT__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Concrete Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARTEFACT_FEATURE_COUNT = TOOL_ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concrete Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_ARTEFACT_OPERATION_COUNT = TOOL_ARTEFACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Neo4JEMFProblemReproduction.EMF.artefacts.ToolArtefact <em>Tool Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Artefact</em>'.
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.ToolArtefact
	 * @generated
	 */
	EClass getToolArtefact();

	/**
	 * Returns the meta object for class '{@link Neo4JEMFProblemReproduction.EMF.artefacts.ConcreteArtefact <em>Concrete Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Artefact</em>'.
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.ConcreteArtefact
	 * @generated
	 */
	EClass getConcreteArtefact();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArtefactsFactory getArtefactsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Neo4JEMFProblemReproduction.EMF.artefacts.impl.ToolArtefactImpl <em>Tool Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ToolArtefactImpl
		 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsPackageImpl#getToolArtefact()
		 * @generated
		 */
		EClass TOOL_ARTEFACT = eINSTANCE.getToolArtefact();

		/**
		 * The meta object literal for the '{@link Neo4JEMFProblemReproduction.EMF.artefacts.impl.ConcreteArtefactImpl <em>Concrete Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ConcreteArtefactImpl
		 * @see Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsPackageImpl#getConcreteArtefact()
		 * @generated
		 */
		EClass CONCRETE_ARTEFACT = eINSTANCE.getConcreteArtefact();

	}

} //ArtefactsPackage
