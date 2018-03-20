// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import adapters.NestedListView;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dd.processbutton.FlatButton;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.lucasr.twowayview.TwoWayView;

public class MyTripInfo_ViewBinding implements Unbinder {
  private MyTripInfo target;

  private View view2131296519;

  private View view2131296421;

  private TextWatcher view2131296421TextWatcher;

  @UiThread
  public MyTripInfo_ViewBinding(MyTripInfo target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyTripInfo_ViewBinding(final MyTripInfo target, View source) {
    this.target = target;

    View view;
    target.iv = Utils.findRequiredViewAsType(source, R.id.image, "field 'iv'", ImageView.class);
    target.tite = Utils.findRequiredViewAsType(source, R.id.head, "field 'tite'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.time, "field 'date'", TextView.class);
    view = Utils.findRequiredView(source, R.id.newfrriend, "field 'add' and method 'onClick'");
    target.add = Utils.castView(view, R.id.newfrriend, "field 'add'", FlatButton.class);
    view2131296519 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.twoway = Utils.findRequiredViewAsType(source, R.id.lv, "field 'twoway'", TwoWayView.class);
    target.lv = Utils.findRequiredViewAsType(source, R.id.friendlist, "field 'lv'", NestedListView.class);
    view = Utils.findRequiredView(source, R.id.fname, "field 'frendname' and method 'onTextChanged'");
    target.frendname = Utils.castView(view, R.id.fname, "field 'frendname'", AutoCompleteTextView.class);
    view2131296421 = view;
    view2131296421TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onTextChanged();
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296421TextWatcher);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyTripInfo target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.iv = null;
    target.tite = null;
    target.date = null;
    target.add = null;
    target.twoway = null;
    target.lv = null;
    target.frendname = null;

    view2131296519.setOnClickListener(null);
    view2131296519 = null;
    ((TextView) view2131296421).removeTextChangedListener(view2131296421TextWatcher);
    view2131296421TextWatcher = null;
    view2131296421 = null;
  }
}
