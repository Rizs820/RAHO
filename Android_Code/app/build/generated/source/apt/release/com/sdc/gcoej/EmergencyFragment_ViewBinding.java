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

public class EmergencyFragment_ViewBinding implements Unbinder {
  private EmergencyFragment target;

  @UiThread
  public EmergencyFragment_ViewBinding(EmergencyFragment target, View source) {
    this.target = target;

    target.police = Utils.findRequiredViewAsType(source, R.id.police, "field 'police'", Button.class);
    target.fire = Utils.findRequiredViewAsType(source, R.id.fire, "field 'fire'", Button.class);
    target.ambulance = Utils.findRequiredViewAsType(source, R.id.ambulance, "field 'ambulance'", Button.class);
    target.blood_bank = Utils.findRequiredViewAsType(source, R.id.blood_bank, "field 'blood_bank'", Button.class);
    target.bomb = Utils.findRequiredViewAsType(source, R.id.bomb, "field 'bomb'", Button.class);
    target.railways = Utils.findRequiredViewAsType(source, R.id.railways, "field 'railways'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EmergencyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.police = null;
    target.fire = null;
    target.ambulance = null;
    target.blood_bank = null;
    target.bomb = null;
    target.railways = null;
  }
}
