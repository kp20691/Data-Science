// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.txtmaintitle = Utils.findRequiredViewAsType(source, R.id.txtmaintitle, "field 'txtmaintitle'", TextView.class);
    target.floating_action_button = Utils.findRequiredViewAsType(source, R.id.floating_action_button, "field 'floating_action_button'", FloatingActionButton.class);
    target.recyclerviewComplaintList = Utils.findRequiredViewAsType(source, R.id.recyclerviewComplaintList, "field 'recyclerviewComplaintList'", RecyclerView.class);
    target.txterror = Utils.findRequiredViewAsType(source, R.id.txterror, "field 'txterror'", TextView.class);
    target.cardView = Utils.findRequiredViewAsType(source, R.id.cardView, "field 'cardView'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtmaintitle = null;
    target.floating_action_button = null;
    target.recyclerviewComplaintList = null;
    target.txterror = null;
    target.cardView = null;
  }
}
