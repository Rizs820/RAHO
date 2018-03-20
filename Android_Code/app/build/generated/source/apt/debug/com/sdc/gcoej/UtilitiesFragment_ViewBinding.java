// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UtilitiesFragment_ViewBinding implements Unbinder {
  private UtilitiesFragment target;

  @UiThread
  public UtilitiesFragment_ViewBinding(UtilitiesFragment target, View source) {
    this.target = target;

    target.sharecontact = Utils.findRequiredViewAsType(source, R.id.sharecontact, "field 'sharecontact'", LinearLayout.class);
    target.checklist = Utils.findRequiredViewAsType(source, R.id.checklist, "field 'checklist'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UtilitiesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sharecontact = null;
    target.checklist = null;
  }
}
