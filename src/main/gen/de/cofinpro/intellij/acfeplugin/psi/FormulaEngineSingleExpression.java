// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineSingleExpression extends PsiElement {

  @Nullable
  FormulaEngineArrayAccess getArrayAccess();

  @Nullable
  FormulaEngineConstant getConstant();

  @Nullable
  FormulaEngineFunctionInvocation getFunctionInvocation();

  @Nullable
  FormulaEngineIdentifierPostfix getIdentifierPostfix();

  @Nullable
  FormulaEngineNegatedExpression getNegatedExpression();

  @Nullable
  PsiElement getIdentifier();

}