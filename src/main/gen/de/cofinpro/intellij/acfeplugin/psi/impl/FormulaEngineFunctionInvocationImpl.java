// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.*;

public class FormulaEngineFunctionInvocationImpl extends ASTWrapperPsiElement implements FormulaEngineFunctionInvocation {

  public FormulaEngineFunctionInvocationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitFunctionInvocation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineBuiltInFunctionName getBuiltInFunctionName() {
    return findChildByClass(FormulaEngineBuiltInFunctionName.class);
  }

  @Override
  @Nullable
  public FormulaEngineCustomFunctionName getCustomFunctionName() {
    return findChildByClass(FormulaEngineCustomFunctionName.class);
  }

  @Override
  @Nullable
  public FormulaEngineFunctionArguments getFunctionArguments() {
    return findChildByClass(FormulaEngineFunctionArguments.class);
  }

}
