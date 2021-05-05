// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ContactUsActivity_ViewBinding implements Unbinder {
  private ContactUsActivity target;

  @UiThread
  public ContactUsActivity_ViewBinding(ContactUsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ContactUsActivity_ViewBinding(ContactUsActivity target, View source) {
    this.target = target;

    target.txttitle = Utils.findRequiredViewAsType(source, R.id.txttitle, "field 'txttitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ContactUsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txttitle = null;
  }
}
