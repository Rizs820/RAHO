// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej.destinations.funfacts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.sdc.gcoej.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FunfactFragment_ViewBinding implements Unbinder {
  private FunfactFragment target;

  private View view2131296410;

  @UiThread
  public FunfactFragment_ViewBinding(final FunfactFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.fab, "method 'onClick'");
    view2131296410 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131296410.setOnClickListener(null);
    view2131296410 = null;
  }
}
