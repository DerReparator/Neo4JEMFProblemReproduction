/**
 */
package Neo4JEMFProblemReproduction.EMF.impl;

import Neo4JEMFProblemReproduction.EMF.BaseElement;

import Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsPackage;

import Neo4JEMFProblemReproduction.EMF.artefacts.impl.ArtefactsPackageImpl;

import Neo4JEMFProblemReproduction.EMF.modelFactory;
import Neo4JEMFProblemReproduction.EMF.modelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class modelPackageImpl extends EPackageImpl implements modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Neo4JEMFProblemReproduction.EMF.modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private modelPackageImpl() {
		super(eNS_URI, modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static modelPackage init() {
		if (isInited) return (modelPackage)EPackage.Registry.INSTANCE.getEPackage(modelPackage.eNS_URI);

		// Obtain or create and register package
		modelPackageImpl themodelPackage = (modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new modelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtefactsPackageImpl theArtefactsPackage = (ArtefactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtefactsPackage.eNS_URI) instanceof ArtefactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtefactsPackage.eNS_URI) : ArtefactsPackage.eINSTANCE);

		// Create package meta-data objects
		themodelPackage.createPackageContents();
		theArtefactsPackage.createPackageContents();

		// Initialize created meta-data
		themodelPackage.initializePackageContents();
		theArtefactsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(modelPackage.eNS_URI, themodelPackage);
		return themodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseElement() {
		return baseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseElement_Uuid() {
		return (EAttribute)baseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseElement_ProjectName() {
		return (EAttribute)baseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelFactory getmodelFactory() {
		return (modelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		baseElementEClass = createEClass(BASE_ELEMENT);
		createEAttribute(baseElementEClass, BASE_ELEMENT__UUID);
		createEAttribute(baseElementEClass, BASE_ELEMENT__PROJECT_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArtefactsPackage theArtefactsPackage = (ArtefactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtefactsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theArtefactsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(baseElementEClass, BaseElement.class, "BaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseElement_Uuid(), ecorePackage.getEString(), "uuid", "notSet", 1, 1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseElement_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, BaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //modelPackageImpl
