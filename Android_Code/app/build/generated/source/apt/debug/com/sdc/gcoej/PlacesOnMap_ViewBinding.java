// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.lucasr.twowayview.TwoWayView;

public class PlacesOnMap_ViewBinding implements Unbinder {
  private PlacesOnMap target;

  @UiThread
  public PlacesOnMap_ViewBinding(PlacesOnMap target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlacesOnMap_ViewBinding(PlacesOnMap target, View source) {
    this.target = target;

    target.lv = Utils.findRequiredViewAsType(source, R.id.lv, "field 'lv'", TwoWayView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlacesOnMap target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lv = null;
  }
}
