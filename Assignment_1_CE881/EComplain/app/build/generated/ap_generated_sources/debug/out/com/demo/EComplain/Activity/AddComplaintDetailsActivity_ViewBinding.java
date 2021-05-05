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

public class AddComplaintDetailsActivity_ViewBinding implements Unbinder {
  private AddComplaintDetailsActivity target;

  @UiThread
  public AddComplaintDetailsActivity_ViewBinding(AddComplaintDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddComplaintDetailsActivity_ViewBinding(AddComplaintDetailsActivity target, View source) {
    this.target = target;

    target.txttitle = Utils.findRequiredViewAsType(source, R.id.txttitle, "field 'txttitle'", TextView.class);
    target.txtStatus = Utils.findRequiredViewAsType(source, R.id.txtStatus, "field 'txtStatus'", TextView.class);
    target.txtDate = Utils.findRequiredViewAsType(source, R.id.txtDate, "field 'txtDate'", TextView.class);
    target.txtTime = Utils.findRequiredViewAsType(source, R.id.txtTime, "field 'txtTime'", TextView.class);
    target.txtAddress = Utils.findRequiredViewAsType(source, R.id.txtAddress, "field 'txtAddress'", TextView.class);
    target.txtComplaint = Utils.findRequiredViewAsType(source, R.id.txtComplaint, "field 'txtComplaint'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddComplaintDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txttitle = null;
    target.txtStatus = null;
    target.txtDate = null;
    target.txtTime = null;
    target.txtAddress = null;
    target.txtComplaint = null;
  }
}
