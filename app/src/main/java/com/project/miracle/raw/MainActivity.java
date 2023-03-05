package com.project.miracle.raw;

import android.animation.*;
import android.animation.ObjectAnimator;
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
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.prime.arab.ware.everythingutils.*;
import com.downloader.*;
import com.sdsmdg.tastytoast.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String backgroundColor = "";
	private String a = "";
	private String b = "";
	private String c = "";
	private String d = "";
	private String PermissionString = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ImageView imageview1;
	
	private Intent intent = new Intent();
	private TimerTask redirect;
	private TimerTask timer;
	private Intent xintent = new Intent();
	private ObjectAnimator bd = new ObjectAnimator();
	private ObjectAnimator ab = new ObjectAnimator();
	private ObjectAnimator bc = new ObjectAnimator();
	private ObjectAnimator cd = new ObjectAnimator();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		imageview1 = findViewById(R.id.imageview1);
	}
	
	private void initializeLogic() {
		_rippleRoundStroke(linear2, "#FFFFFF", "#FFFFFF", 555, 0, "#FFFFFF");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF0A58CA);
		}
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			            Window w = getWindow(); // in Activity's onCreate() for instance
			            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
			        }
		a = "com";
		b = ".project";
		c = ".miracle";
		d = ".raw";
		if (Build.VERSION.SDK_INT >= 23) {
						if (checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) == android.content.pm.PackageManager.PERMISSION_DENIED) {
								SketchwareUtil.showMessage(getApplicationContext(), "Please Allow Storage Permission To Continue !!");
				requestPermissions(new String[] {android.Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
						}
						else {
				bd.setTarget(linear2);
				bd.setPropertyName("alpha");
				bd.setFloatValues((float)(0), (float)(1));
				bd.setDuration((int)(500));
				bd.start();
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bd.setTarget(linear2);
								bd.setPropertyName("scaleX");
								bd.setFloatValues((float)(1), (float)(30));
								bd.setDuration((int)(1200));
								bd.start();
								_imageScale();
								_lscaleY();
							}
						});
					}
				};
				_timer.schedule(timer, (int)(1000));
				_Elevation(linear2, 20);
						}
				}
				else {
			bd.setTarget(linear2);
			bd.setPropertyName("alpha");
			bd.setFloatValues((float)(0), (float)(1));
			bd.setDuration((int)(500));
			bd.start();
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							bd.setTarget(linear2);
							bd.setPropertyName("scaleX");
							bd.setFloatValues((float)(1), (float)(30));
							bd.setDuration((int)(1200));
							bd.start();
							_imageScale();
							_lscaleY();
						}
					});
				}
			};
			_timer.schedule(timer, (int)(1000));
			_Elevation(linear2, 20);
				}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (Build.VERSION.SDK_INT >= 23) {
						if (checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) == android.content.pm.PackageManager.PERMISSION_DENIED) {
								SketchwareUtil.showMessage(getApplicationContext(), "Please Allow Storage Permission To Continue !!");
				requestPermissions(new String[] {android.Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
						}
						else {
				bd.setTarget(linear2);
				bd.setPropertyName("alpha");
				bd.setFloatValues((float)(0), (float)(1));
				bd.setDuration((int)(500));
				bd.start();
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bd.setTarget(linear2);
								bd.setPropertyName("scaleX");
								bd.setFloatValues((float)(1), (float)(30));
								bd.setDuration((int)(1200));
								bd.start();
								_imageScale();
								_lscaleY();
							}
						});
					}
				};
				_timer.schedule(timer, (int)(1000));
				_Elevation(linear2, 20);
						}
				}
				else {
			bd.setTarget(linear2);
			bd.setPropertyName("alpha");
			bd.setFloatValues((float)(0), (float)(1));
			bd.setDuration((int)(500));
			bd.start();
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							bd.setTarget(linear2);
							bd.setPropertyName("scaleX");
							bd.setFloatValues((float)(1), (float)(30));
							bd.setDuration((int)(1200));
							bd.start();
							_imageScale();
							_lscaleY();
						}
					});
				}
			};
			_timer.schedule(timer, (int)(1000));
			_Elevation(linear2, 20);
				}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT >= 23) {
						if (checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) == android.content.pm.PackageManager.PERMISSION_DENIED) {
								SketchwareUtil.showMessage(getApplicationContext(), "Please Allow Storage Permission To Continue !!");
				requestPermissions(new String[] {android.Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
						}
						else {
				bd.setTarget(linear2);
				bd.setPropertyName("alpha");
				bd.setFloatValues((float)(0), (float)(1));
				bd.setDuration((int)(500));
				bd.start();
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bd.setTarget(linear2);
								bd.setPropertyName("scaleX");
								bd.setFloatValues((float)(1), (float)(30));
								bd.setDuration((int)(1200));
								bd.start();
								_imageScale();
								_lscaleY();
							}
						});
					}
				};
				_timer.schedule(timer, (int)(1000));
				_Elevation(linear2, 20);
						}
				}
				else {
			bd.setTarget(linear2);
			bd.setPropertyName("alpha");
			bd.setFloatValues((float)(0), (float)(1));
			bd.setDuration((int)(500));
			bd.start();
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							bd.setTarget(linear2);
							bd.setPropertyName("scaleX");
							bd.setFloatValues((float)(1), (float)(30));
							bd.setDuration((int)(1200));
							bd.start();
							_imageScale();
							_lscaleY();
						}
					});
				}
			};
			_timer.schedule(timer, (int)(1000));
			_Elevation(linear2, 20);
				}
	}
	public void _RippleEffect(final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#A1D1FF")});
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
	
	
	public void _lscaleY() {
		ab.setTarget(linear2);
		ab.setPropertyName("scaleY");
		ab.setFloatValues((float)(1), (float)(30));
		ab.setDuration((int)(1200));
		ab.start();
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						xintent.setClass(getApplicationContext(), ManagerActivity.class);
						startActivity(xintent);
					}
				});
			}
		};
		_timer.schedule(timer, (int)(350));
	}
	
	
	public void _imageScale() {
		bc.setTarget(imageview1);
		bc.setPropertyName("scaleX");
		bc.setFloatValues((float)(1), (float)(0));
		bc.setDuration((int)(300));
		bc.start();
		if (true) {
			cd.setTarget(imageview1);
			cd.setPropertyName("scaleY");
			cd.setFloatValues((float)(1), (float)(0));
			cd.setDuration((int)(300));
			cd.start();
		}
	}
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _Elevation(final View _view, final double _number) {
		
		_view.setElevation((int)_number);
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