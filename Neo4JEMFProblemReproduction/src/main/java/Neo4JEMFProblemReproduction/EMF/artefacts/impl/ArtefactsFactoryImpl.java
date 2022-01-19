/**
 */
package Neo4JEMFProblemReproduction.EMF.artefacts.impl;

import Neo4JEMFProblemReproduction.EMF.artefacts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtefactsFactoryImpl extends EFactoryImpl implements ArtefactsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtefactsFactory init() {
		try {
			ArtefactsFactory theArtefactsFactory = (ArtefactsFactory)EPackage.Registry.INSTANCE.getEFactory(ArtefactsPackage.eNS_URI);
			if (theArtefactsFactory != null) {
				return theArtefactsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArtefactsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArtefactsPackage.CONCRETE_ARTEFACT: return createConcreteArtefact();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteArtefact createConcreteArtefact() {
		ConcreteArtefactImpl concreteArtefact = new ConcreteArtefactImpl();
		return concreteArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactsPackage getArtefactsPackage() {
		return (ArtefactsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArtefactsPackage getPackage() {
		return ArtefactsPackage.eINSTANCE;
	}

} //ArtefactsFactoryImpl
