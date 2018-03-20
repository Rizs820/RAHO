// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShareContact_ViewBinding implements Unbinder {
  private ShareContact target;

  @UiThread
  public ShareContact_ViewBinding(ShareContact target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ShareContact_ViewBinding(ShareContact target, View source) {
    this.target = target;

    target.create = Utils.findRequiredViewAsType(source, R.id.create, "field 'create'", Button.class);
    target.scan = Utils.findRequiredViewAsType(source, R.id.scan, "field 'scan'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShareContact target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.create = null;
    target.scan = null;
  }
}
