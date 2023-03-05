package com.project.miracle.raw;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.*;
import com.android.prime.arab.ware.everythingutils.*;
import com.downloader.*;
import com.sdsmdg.tastytoast.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MaintainerActivity extends AppCompatActivity {
	
	private String backgroundColor = "";
	
	private LinearLayout linear2;
	private LinearLayout linear11;
	private LinearLayout linear10;
	private LinearLayout linear3;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private ImageView imageview3;
	private LinearLayout linear4;
	private LinearLayout linear17;
	private LinearLayout linear5;
	private LottieAnimationView lottie1;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear7;
	private LinearLayout linear15;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear6;
	private ImageView imageview2;
	private TextView textview6;
	private ImageView imageview1;
	private TextView textview5;
	private LinearLayout linear16;
	private ImageView imageview4;
	private TextView textview8;
	private TextView textview7;
	
	private Intent Telegram = new Intent();
	private Intent BMAC = new Intent();
	private Intent UPI = new Intent();
	private Intent Home = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.maintainer);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear2 = findViewById(R.id.linear2);
		linear11 = findViewById(R.id.linear11);
		linear10 = findViewById(R.id.linear10);
		linear3 = findViewById(R.id.linear3);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		imageview3 = findViewById(R.id.imageview3);
		linear4 = findViewById(R.id.linear4);
		linear17 = findViewById(R.id.linear17);
		linear5 = findViewById(R.id.linear5);
		lottie1 = findViewById(R.id.lottie1);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		linear7 = findViewById(R.id.linear7);
		linear15 = findViewById(R.id.linear15);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear6 = findViewById(R.id.linear6);
		imageview2 = findViewById(R.id.imageview2);
		textview6 = findViewById(R.id.textview6);
		imageview1 = findViewById(R.id.imageview1);
		textview5 = findViewById(R.id.textview5);
		linear16 = findViewById(R.id.linear16);
		imageview4 = findViewById(R.id.imageview4);
		textview8 = findViewById(R.id.textview8);
		textview7 = findViewById(R.id.textview7);
		
		linear2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Home.setClass(getApplicationContext(), ManagerActivity.class);
				startActivity(Home);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				BMAC.setAction(Intent.ACTION_VIEW);
				BMAC.setData(Uri.parse("https://www.buymeacoffee.com/DudeCool26"));
				startActivity(BMAC);
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Telegram.setAction(Intent.ACTION_VIEW);
				Telegram.setData(Uri.parse("https://t.me/youtubemiracle"));
				startActivity(Telegram);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Coming Soon ...");
			}
		});
	}
	
	private void initializeLogic() {
		_status_bar_color("#a1d1ff", "#a1d1ff");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MaintainerActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFA1D1FF);
		}
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		lottie1.setAnimation("maintainence-plan.json");
		_RippleEffect(linear6, 50, 00, "#2962ff", true);
		_RippleEffect(linear8, 50, 00, "#2962ff", true);
		_RippleEffect(linear16, 50, 00, "#2962ff", true);
	}
	
	public void _RippleEffect(final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#a1d1ff")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
	}
	
	
	public void _status_bar_color(final String _colour1, final String _colour2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
			   Window w = this.getWindow(); w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			   w.setStatusBarColor(Color.parseColor(_colour1)); w.setNavigationBarColor(Color.parseColor(_colour2));
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}