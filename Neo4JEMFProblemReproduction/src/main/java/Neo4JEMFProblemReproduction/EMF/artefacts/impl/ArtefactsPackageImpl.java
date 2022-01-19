/**
 */
package Neo4JEMFProblemReproduction.EMF.artefacts.impl;

import Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsFactory;
import Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsPackage;
import Neo4JEMFProblemReproduction.EMF.artefacts.ConcreteArtefact;
import Neo4JEMFProblemReproduction.EMF.artefacts.ToolArtefact;

import Neo4JEMFProblemReproduction.EMF.impl.modelPackageImpl;

import Neo4JEMFProblemReproduction.EMF.modelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtefactsPackageImpl extends EPackageImpl implements ArtefactsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolArtefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteArtefactEClass = null;

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
	 * @see Neo4JEMFProblemReproduction.EMF.artefacts.ArtefactsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArtefactsPackageImpl() {
		super(eNS_URI, ArtefactsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArtefactsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArtefactsPackage init() {
		if (isInited) return (ArtefactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtefactsPackage.eNS_URI);

		// Obtain or create and register package
		ArtefactsPackageImpl theArtefactsPackage = (ArtefactsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArtefactsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArtefactsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		modelPackageImpl themodelPackage = (modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(modelPackage.eNS_URI) instanceof modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(modelPackage.eNS_URI) : modelPackage.eINSTANCE);

		// Create package meta-data objects
		theArtefactsPackage.createPackageContents();
		themodelPackage.createPackageContents();

		// Initialize created meta-data
		theArtefactsPackage.initializePackageContents();
		themodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArtefactsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArtefactsPackage.eNS_URI, theArtefactsPackage);
		return theArtefactsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolArtefact() {
		return toolArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteArtefact() {
		return concreteArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactsFactory getArtefactsFactory() {
		return (ArtefactsFactory)getEFactoryInstance();
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
		toolArtefactEClass = createEClass(TOOL_ARTEFACT);

		concreteArtefactEClass = createEClass(CONCRETE_ARTEFACT);
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
		modelPackage themodelPackage = (modelPackage)EPackage.Registry.INSTANCE.getEPackage(modelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toolArtefactEClass.getESuperTypes().add(themodelPackage.getBaseElement());
		concreteArtefactEClass.getESuperTypes().add(this.getToolArtefact());

		// Initialize classes, features, and operations; add parameters
		initEClass(toolArtefactEClass, ToolArtefact.class, "ToolArtefact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteArtefactEClass, ConcreteArtefact.class, "ConcreteArtefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ArtefactsPackageImpl
