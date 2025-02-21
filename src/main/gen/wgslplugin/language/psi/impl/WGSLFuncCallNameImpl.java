// This is a generated file. Not intended for manual editing.
package wgslplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static wgslplugin.language.psi.WGSLTypes.*;
import wgslplugin.language.psi.*;

public class WGSLFuncCallNameImpl extends WGSLFunctionCallElementImpl implements WGSLFuncCallName {

  public WGSLFuncCallNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WGSLVisitor visitor) {
    visitor.visitFuncCallName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WGSLVisitor) accept((WGSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getName() {
    return WGSLPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return WGSLPsiImplUtil.setName(this, newName);
  }

}
