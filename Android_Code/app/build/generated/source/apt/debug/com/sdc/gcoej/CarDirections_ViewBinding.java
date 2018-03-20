// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CarDirections_ViewBinding implements Unbinder {
  private CarDirections target;

  private View view2131296410;

  @UiThread
  public CarDirections_ViewBinding(CarDirections target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CarDirections_ViewBinding(final CarDirections target, View source) {
    this.target = target;

    View view;
    target.coste1 = Utils.findRequiredViewAsType(source, R.id.travelcost1, "field 'coste1'", TextView.class);
    target.coste2 = Utils.findRequiredViewAsType(source, R.id.travelcost2, "field 'coste2'", TextView.class);
    target.coste3 = Utils.findRequiredViewAsType(source, R.id.travelcost3, "field 'coste3'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fab, "method 'onClickFab'");
    view2131296410 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFab();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CarDirections target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.coste1 = null;
    target.coste2 = null;
    target.coste3 = null;

    view2131296410.setOnClickListener(null);
    view2131296410 = null;
  }
}
