/**
 */
package Neo4JEMFProblemReproduction.EMF;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see Neo4JEMFProblemReproduction.EMF.modelFactory
 * @model kind="package"
 * @generated
 */
public interface modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EMF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "foo.bar.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "foorbarEMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	modelPackage eINSTANCE = Neo4JEMFProblemReproduction.EMF.impl.modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Neo4JEMFProblemReproduction.EMF.impl.BaseElementImpl <em>Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Neo4JEMFProblemReproduction.EMF.impl.BaseElementImpl
	 * @see Neo4JEMFProblemReproduction.EMF.impl.modelPackageImpl#getBaseElement()
	 * @generated
	 */
	int BASE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__UUID = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__PROJECT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Neo4JEMFProblemReproduction.EMF.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Element</em>'.
	 * @see Neo4JEMFProblemReproduction.EMF.BaseElement
	 * @generated
	 */
	EClass getBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link Neo4JEMFProblemReproduction.EMF.BaseElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see Neo4JEMFProblemReproduction.EMF.BaseElement#getUuid()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link Neo4JEMFProblemReproduction.EMF.BaseElement#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see Neo4JEMFProblemReproduction.EMF.BaseElement#getProjectName()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_ProjectName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	modelFactory getmodelFactory();

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
		 * The meta object literal for the '{@link Neo4JEMFProblemReproduction.EMF.impl.BaseElementImpl <em>Base Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Neo4JEMFProblemReproduction.EMF.impl.BaseElementImpl
		 * @see Neo4JEMFProblemReproduction.EMF.impl.modelPackageImpl#getBaseElement()
		 * @generated
		 */
		EClass BASE_ELEMENT = eINSTANCE.getBaseElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ELEMENT__UUID = eINSTANCE.getBaseElement_Uuid();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ELEMENT__PROJECT_NAME = eINSTANCE.getBaseElement_ProjectName();

	}

} //modelPackage
