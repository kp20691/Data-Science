// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import com.libizo.CustomEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddComplaintActivity_ViewBinding implements Unbinder {
  private AddComplaintActivity target;

  @UiThread
  public AddComplaintActivity_ViewBinding(AddComplaintActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddComplaintActivity_ViewBinding(AddComplaintActivity target, View source) {
    this.target = target;

    target.txttitle = Utils.findRequiredViewAsType(source, R.id.txttitle, "field 'txttitle'", TextView.class);
    target.btnupload = Utils.findRequiredViewAsType(source, R.id.btnupload, "field 'btnupload'", Button.class);
    target.imageItemLinear = Utils.findRequiredViewAsType(source, R.id.imageItemLinear, "field 'imageItemLinear'", LinearLayout.class);
    target.imgItem = Utils.findRequiredViewAsType(source, R.id.imgItem, "field 'imgItem'", ImageView.class);
    target.edtDate = Utils.findRequiredViewAsType(source, R.id.edtDate, "field 'edtDate'", EditText.class);
    target.edtTime = Utils.findRequiredViewAsType(source, R.id.edtTime, "field 'edtTime'", EditText.class);
    target.edtAddress = Utils.findRequiredViewAsType(source, R.id.edtAddress, "field 'edtAddress'", CustomEditText.class);
    target.btnLocation = Utils.findRequiredViewAsType(source, R.id.btnLocation, "field 'btnLocation'", CardView.class);
    target.txtlocation = Utils.findRequiredViewAsType(source, R.id.txtlocation, "field 'txtlocation'", TextView.class);
    target.edtComplaint = Utils.findRequiredViewAsType(source, R.id.edtComplaint, "field 'edtComplaint'", CustomEditText.class);
    target.btnSubmit = Utils.findRequiredViewAsType(source, R.id.btnSubmit, "field 'btnSubmit'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddComplaintActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txttitle = null;
    target.btnupload = null;
    target.imageItemLinear = null;
    target.imgItem = null;
    target.edtDate = null;
    target.edtTime = null;
    target.edtAddress = null;
    target.btnLocation = null;
    target.txtlocation = null;
    target.edtComplaint = null;
    target.btnSubmit = null;
  }
}
