// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShoppingCurrentCity_ViewBinding implements Unbinder {
  private ShoppingCurrentCity target;

  private View view2131296427;

  @UiThread
  public ShoppingCurrentCity_ViewBinding(ShoppingCurrentCity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ShoppingCurrentCity_ViewBinding(final ShoppingCurrentCity target, View source) {
    this.target = target;

    View view;
    target.pb = Utils.findRequiredViewAsType(source, R.id.pb, "field 'pb'", ProgressBar.class);
    target.lv = Utils.findRequiredViewAsType(source, R.id.music_list, "field 'lv'", ListView.class);
    target.q = Utils.findRequiredViewAsType(source, R.id.query, "field 'q'", EditText.class);
    view = Utils.findRequiredView(source, R.id.go, "field 'ok' and method 'onClick'");
    target.ok = Utils.castView(view, R.id.go, "field 'ok'", Button.class);
    view2131296427 = view;
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
    ShoppingCurrentCity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pb = null;
    target.lv = null;
    target.q = null;
    target.ok = null;

    view2131296427.setOnClickListener(null);
    view2131296427 = null;
  }
}
