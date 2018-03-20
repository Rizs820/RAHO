// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej.destinations.funfacts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sdc.gcoej.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FunFacts_ViewBinding implements Unbinder {
  private FunFacts target;

  @UiThread
  public FunFacts_ViewBinding(FunFacts target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FunFacts_ViewBinding(FunFacts target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.vp, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FunFacts target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
  }
}
