/**
 */
package org.xtext.plantuml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.plantuml.Arrow#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.plantuml.PlantumlPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends Instruction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.xtext.plantuml.PlantumlPackage#getArrow_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // Arrow
