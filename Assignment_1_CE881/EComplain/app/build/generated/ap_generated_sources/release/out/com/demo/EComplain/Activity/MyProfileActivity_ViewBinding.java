// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProfileActivity_ViewBinding implements Unbinder {
  private MyProfileActivity target;

  @UiThread
  public MyProfileActivity_ViewBinding(MyProfileActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyProfileActivity_ViewBinding(MyProfileActivity target, View source) {
    this.target = target;

    target.txttitle = Utils.findRequiredViewAsType(source, R.id.txttitle, "field 'txttitle'", TextView.class);
    target.edtname = Utils.findRequiredViewAsType(source, R.id.edtname, "field 'edtname'", EditText.class);
    target.edtmobileno = Utils.findRequiredViewAsType(source, R.id.edtmobileno, "field 'edtmobileno'", EditText.class);
    target.edtemailid = Utils.findRequiredViewAsType(source, R.id.edtemailid, "field 'edtemailid'", EditText.class);
    target.btnsave = Utils.findRequiredViewAsType(source, R.id.btnsave, "field 'btnsave'", CardView.class);
    target.imageview = Utils.findRequiredViewAsType(source, R.id.imageview, "field 'imageview'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyProfileActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txttitle = null;
    target.edtname = null;
    target.edtmobileno = null;
    target.edtemailid = null;
    target.btnsave = null;
    target.imageview = null;
  }
}
