/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package argumentation.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import argumentation.diagram.providers.ArgumentationElementTypes;

/**
 * @generated
 */
public class AssertionMetaClaimItemSemanticEditPolicy extends ArgumentationBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AssertionMetaClaimItemSemanticEditPolicy() {
		super(ArgumentationElementTypes.AssertionMetaClaim_4201);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
