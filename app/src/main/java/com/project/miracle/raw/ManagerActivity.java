package com.project.miracle.raw;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.prime.arab.ware.everythingutils.*;
import com.downloader.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sdsmdg.tastytoast.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.lang.reflect.*;

public class ManagerActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private HashMap<String, Object> response_data_map = new HashMap<>();
	private String package_name = "";
	private String VersionCodeYtm = "";
	private String Sha256Ytm = "";
	private String UserName = "";
	private String api = "";
	private String mg_package_name = "";
	private String MgVersion = "";
	private double update = 0;
	private String manager_package_name = "";
	private String ManagerVersionCode = "";
	private double set_theme = 0;
	private String DownloadYTMCustIcon = "";
	private String YtmFinalSaveName = "";
	private double isDownloading = 0;
	private String DownloadMG = "";
	private String packageName = "";
	private String mg_packageName = "";
	private String Sha256Rvm = "";
	private String VersionCodeRvm = "";
	private String rvm_package_name = "";
	private String DownloadRVM = "";
	private String RVM_Final_Save_Name = "";
	private String rvm_packageName = "";
	private boolean isVisible = false;
	private double YTM_Drop_Vis = 0;
	private double RVM_Drop_Vs = 0;
	private double Mg_Drop_Vis = 0;
	private double Dn_Box_Vis = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear35;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private LinearLayout linear4;
	private LinearLayout linear3;
	private LinearLayout linear7;
	private LinearLayout linear20;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private LinearLayout linear63;
	private LinearLayout linear67;
	private LinearLayout linear76;
	private LinearLayout linear99;
	private LinearLayout linear100;
	private LinearLayout linear107;
	private LinearLayout linear108;
	private LinearLayout linear60;
	private LinearLayout linear64;
	private ImageView imageview7;
	private LinearLayout linear57;
	private ImageView imageview9;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private ImageView imageview8;
	private TextView textview38;
	private LinearLayout linear62;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private LinearLayout linear97;
	private LinearLayout linear98;
	private LinearLayout linear101;
	private LinearLayout linear51;
	private LinearLayout linear102;
	private LinearLayout linear103;
	private TextView textview32;
	private TextView textview33;
	private LinearLayout linear104;
	private LinearLayout linear106;
	private TextView textview55;
	private LinearLayout linear53;
	private LinearLayout linear52;
	private EditText edittext1;
	private TextView textview37;
	private LinearLayout linear5;
	private LinearLayout linear9;
	private LinearLayout linear71;
	private ImageView imageview2;
	private LinearLayout linear12;
	private LinearLayout linear109;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear111;
	private ImageView imageview17;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private TextView textview7;
	private TextView textview6;
	private TextView textview5;
	private TextView textview35;
	private TextView textview8;
	private TextView textview9;
	private TextView textview12;
	private TextView textview36;
	private LinearLayout linear78;
	private LinearLayout linear77;
	private LinearLayout linear24;
	private ImageView imageview11;
	private TextView textview21;
	private LinearLayout linear81;
	private LinearLayout linear90;
	private LinearLayout linear89;
	private LinearLayout linear91;
	private LinearLayout linear83;
	private LinearLayout linear82;
	private LinearLayout linear84;
	private LinearLayout linear87;
	private LinearLayout linear93;
	private LinearLayout linear92;
	private ImageView imageview13;
	private LinearLayout linear85;
	private LinearLayout linear110;
	private TextView textview43;
	private TextView textview44;
	private LinearLayout linear113;
	private ImageView imageview18;
	private LinearLayout linear86;
	private LinearLayout linear88;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView textview51;
	private TextView textview52;
	private LinearLayout linear94;
	private LinearLayout linear95;
	private LinearLayout linear96;
	private ImageView imageview14;
	private TextView textview53;
	private LinearLayout linear8;
	private LinearLayout linear10;
	private LinearLayout linear73;
	private ImageView imageview3;
	private LinearLayout linear14;
	private LinearLayout linear112;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear115;
	private ImageView imageview19;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private TextView textview19;
	private TextView textview18;
	private TextView textview17;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private LinearLayout linear80;
	private LinearLayout linear79;
	private LinearLayout linear26;
	private ImageView imageview12;
	private TextView textview22;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear59;
	private LinearLayout linear58;
	private TextView textview25;
	private TextView textview26;
	private TextView textview39;
	private TextView textview40;
	private ProgressBar progressbar2;
	private LinearLayout linear48;
	private LinearLayout linear46;
	private LinearLayout linear44;
	private LinearLayout linear43;
	private LinearLayout linear42;
	private LinearLayout linear41;
	private LinearLayout linear40;
	private TextView textview31;
	private TextView textview27;
	private TextView textview29;
	private TextView textview28;
	private TextView textview41;
	private ImageView imageview10;
	private TextView textview42;
	private ImageView imageview15;
	private TextView textview54;
	private ImageView imageview16;
	private TextView textview56;
	
	private RequestNetwork HitRequest;
	private RequestNetwork.RequestListener _HitRequest_request_listener;
	private AlertDialog.Builder f;
	private AlertDialog.Builder updt;
	private Intent intent = new Intent();
	private SharedPreferences usr;
	private TimerTask tim;
	private Intent intent_dev = new Intent();
	private TimerTask hide_str_loc_tim;
	private AlertDialog.Builder Sure;
	private Intent refreshact = new Intent();
	private Intent miracle = new Intent();
	private Intent microg = new Intent();
	private Intent rvm = new Intent();
	private TimerTask Internet;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.manager);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear35 = findViewById(R.id.linear35);
		linear49 = findViewById(R.id.linear49);
		linear50 = findViewById(R.id.linear50);
		linear4 = findViewById(R.id.linear4);
		linear3 = findViewById(R.id.linear3);
		linear7 = findViewById(R.id.linear7);
		linear20 = findViewById(R.id.linear20);
		linear32 = findViewById(R.id.linear32);
		linear31 = findViewById(R.id.linear31);
		linear63 = findViewById(R.id.linear63);
		linear67 = findViewById(R.id.linear67);
		linear76 = findViewById(R.id.linear76);
		linear99 = findViewById(R.id.linear99);
		linear100 = findViewById(R.id.linear100);
		linear107 = findViewById(R.id.linear107);
		linear108 = findViewById(R.id.linear108);
		linear60 = findViewById(R.id.linear60);
		linear64 = findViewById(R.id.linear64);
		imageview7 = findViewById(R.id.imageview7);
		linear57 = findViewById(R.id.linear57);
		imageview9 = findViewById(R.id.imageview9);
		linear54 = findViewById(R.id.linear54);
		linear55 = findViewById(R.id.linear55);
		imageview8 = findViewById(R.id.imageview8);
		textview38 = findViewById(R.id.textview38);
		linear62 = findViewById(R.id.linear62);
		linear74 = findViewById(R.id.linear74);
		linear75 = findViewById(R.id.linear75);
		linear97 = findViewById(R.id.linear97);
		linear98 = findViewById(R.id.linear98);
		linear101 = findViewById(R.id.linear101);
		linear51 = findViewById(R.id.linear51);
		linear102 = findViewById(R.id.linear102);
		linear103 = findViewById(R.id.linear103);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		linear104 = findViewById(R.id.linear104);
		linear106 = findViewById(R.id.linear106);
		textview55 = findViewById(R.id.textview55);
		linear53 = findViewById(R.id.linear53);
		linear52 = findViewById(R.id.linear52);
		edittext1 = findViewById(R.id.edittext1);
		textview37 = findViewById(R.id.textview37);
		linear5 = findViewById(R.id.linear5);
		linear9 = findViewById(R.id.linear9);
		linear71 = findViewById(R.id.linear71);
		imageview2 = findViewById(R.id.imageview2);
		linear12 = findViewById(R.id.linear12);
		linear109 = findViewById(R.id.linear109);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		linear111 = findViewById(R.id.linear111);
		imageview17 = findViewById(R.id.imageview17);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		textview7 = findViewById(R.id.textview7);
		textview6 = findViewById(R.id.textview6);
		textview5 = findViewById(R.id.textview5);
		textview35 = findViewById(R.id.textview35);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview12 = findViewById(R.id.textview12);
		textview36 = findViewById(R.id.textview36);
		linear78 = findViewById(R.id.linear78);
		linear77 = findViewById(R.id.linear77);
		linear24 = findViewById(R.id.linear24);
		imageview11 = findViewById(R.id.imageview11);
		textview21 = findViewById(R.id.textview21);
		linear81 = findViewById(R.id.linear81);
		linear90 = findViewById(R.id.linear90);
		linear89 = findViewById(R.id.linear89);
		linear91 = findViewById(R.id.linear91);
		linear83 = findViewById(R.id.linear83);
		linear82 = findViewById(R.id.linear82);
		linear84 = findViewById(R.id.linear84);
		linear87 = findViewById(R.id.linear87);
		linear93 = findViewById(R.id.linear93);
		linear92 = findViewById(R.id.linear92);
		imageview13 = findViewById(R.id.imageview13);
		linear85 = findViewById(R.id.linear85);
		linear110 = findViewById(R.id.linear110);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		linear113 = findViewById(R.id.linear113);
		imageview18 = findViewById(R.id.imageview18);
		linear86 = findViewById(R.id.linear86);
		linear88 = findViewById(R.id.linear88);
		textview45 = findViewById(R.id.textview45);
		textview46 = findViewById(R.id.textview46);
		textview47 = findViewById(R.id.textview47);
		textview48 = findViewById(R.id.textview48);
		textview49 = findViewById(R.id.textview49);
		textview50 = findViewById(R.id.textview50);
		textview51 = findViewById(R.id.textview51);
		textview52 = findViewById(R.id.textview52);
		linear94 = findViewById(R.id.linear94);
		linear95 = findViewById(R.id.linear95);
		linear96 = findViewById(R.id.linear96);
		imageview14 = findViewById(R.id.imageview14);
		textview53 = findViewById(R.id.textview53);
		linear8 = findViewById(R.id.linear8);
		linear10 = findViewById(R.id.linear10);
		linear73 = findViewById(R.id.linear73);
		imageview3 = findViewById(R.id.imageview3);
		linear14 = findViewById(R.id.linear14);
		linear112 = findViewById(R.id.linear112);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		linear115 = findViewById(R.id.linear115);
		imageview19 = findViewById(R.id.imageview19);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		textview19 = findViewById(R.id.textview19);
		textview18 = findViewById(R.id.textview18);
		textview17 = findViewById(R.id.textview17);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		linear80 = findViewById(R.id.linear80);
		linear79 = findViewById(R.id.linear79);
		linear26 = findViewById(R.id.linear26);
		imageview12 = findViewById(R.id.imageview12);
		textview22 = findViewById(R.id.textview22);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		linear39 = findViewById(R.id.linear39);
		linear59 = findViewById(R.id.linear59);
		linear58 = findViewById(R.id.linear58);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview39 = findViewById(R.id.textview39);
		textview40 = findViewById(R.id.textview40);
		progressbar2 = findViewById(R.id.progressbar2);
		linear48 = findViewById(R.id.linear48);
		linear46 = findViewById(R.id.linear46);
		linear44 = findViewById(R.id.linear44);
		linear43 = findViewById(R.id.linear43);
		linear42 = findViewById(R.id.linear42);
		linear41 = findViewById(R.id.linear41);
		linear40 = findViewById(R.id.linear40);
		textview31 = findViewById(R.id.textview31);
		textview27 = findViewById(R.id.textview27);
		textview29 = findViewById(R.id.textview29);
		textview28 = findViewById(R.id.textview28);
		textview41 = findViewById(R.id.textview41);
		imageview10 = findViewById(R.id.imageview10);
		textview42 = findViewById(R.id.textview42);
		imageview15 = findViewById(R.id.imageview15);
		textview54 = findViewById(R.id.textview54);
		imageview16 = findViewById(R.id.imageview16);
		textview56 = findViewById(R.id.textview56);
		HitRequest = new RequestNetwork(this);
		f = new AlertDialog.Builder(this);
		updt = new AlertDialog.Builder(this);
		usr = getSharedPreferences("usr", Activity.MODE_PRIVATE);
		Sure = new AlertDialog.Builder(this);
		
		linear35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview33.setVisibility(View.GONE);
				linear51.setVisibility(View.VISIBLE);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent_dev.setClass(getApplicationContext(), MaintainerActivity.class);
				startActivity(intent_dev);
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setAction(Intent.ACTION_VIEW);
				intent.setClass(getApplicationContext(), UpdaterActivity.class);
				intent.putExtra("ManagerVersion", ManagerVersionCode);
				startActivity(intent);
			}
		});
		
		linear55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setAction(Intent.ACTION_VIEW);
				intent.setClass(getApplicationContext(), UpdaterActivity.class);
				intent.putExtra("ManagerVersion", ManagerVersionCode);
				startActivity(intent);
			}
		});
		
		textview33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview33.setVisibility(View.GONE);
				linear51.setVisibility(View.VISIBLE);
			}
		});
		
		linear106.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_RefreshData();
			}
		});
		
		linear52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview33.setVisibility(View.VISIBLE);
				linear51.setVisibility(View.GONE);
				usr.edit().putString("UserId", edittext1.getText().toString()).commit();
				textview33.setText(usr.getString("UserId", ""));
			}
		});
		
		linear111.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (YTM_Drop_Vis == 0) {
					YTM_Drop_Vis = 1;
					linear9.setVisibility(View.VISIBLE);
					if (Dn_Box_Vis == 1) {
						linear71.setVisibility(View.VISIBLE);
					}
					imageview17.setImageResource(R.drawable.ic_caret_up);
				}
				else {
					YTM_Drop_Vis = 0;
					linear9.setVisibility(View.GONE);
					linear71.setVisibility(View.GONE);
					imageview17.setImageResource(R.drawable.ic_caret_down);
				}
			}
		});
		
		imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (YTM_Drop_Vis == 0) {
					YTM_Drop_Vis = 1;
					linear9.setVisibility(View.VISIBLE);
					if (Dn_Box_Vis == 1) {
						linear71.setVisibility(View.VISIBLE);
					}
					imageview17.setImageResource(R.drawable.ic_caret_up);
				}
				else {
					YTM_Drop_Vis = 0;
					linear9.setVisibility(View.GONE);
					linear71.setVisibility(View.GONE);
					imageview17.setImageResource(R.drawable.ic_caret_down);
				}
			}
		});
		
		linear78.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				packageName = package_name;
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:" + packageName));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !!");
				}
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				packageName = package_name;
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:" + packageName));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !!");
				}
			}
		});
		
		linear113.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (RVM_Drop_Vs == 0) {
					RVM_Drop_Vs = 1;
					linear87.setVisibility(View.VISIBLE);
					if (Dn_Box_Vis == 1) {
						linear93.setVisibility(View.VISIBLE);
					}
					imageview18.setImageResource(R.drawable.ic_caret_up);
				}
				else {
					RVM_Drop_Vs = 0;
					linear87.setVisibility(View.GONE);
					linear93.setVisibility(View.GONE);
					imageview18.setImageResource(R.drawable.ic_caret_down);
				}
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (RVM_Drop_Vs == 0) {
					RVM_Drop_Vs = 1;
					linear87.setVisibility(View.VISIBLE);
					if (Dn_Box_Vis == 1) {
						linear93.setVisibility(View.VISIBLE);
					}
					imageview18.setImageResource(R.drawable.ic_caret_up);
				}
				else {
					RVM_Drop_Vs = 0;
					linear87.setVisibility(View.GONE);
					linear93.setVisibility(View.GONE);
					imageview18.setImageResource(R.drawable.ic_caret_down);
				}
			}
		});
		
		linear94.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				packageName = "app.rvx.android.apps.youtube.music";
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:" + packageName));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !!");
				}
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				packageName = "app.rvx.android.apps.youtube.music";
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:" + packageName));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !!");
				}
			}
		});
		
		linear115.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Mg_Drop_Vis == 0) {
					Mg_Drop_Vis = 1;
					linear10.setVisibility(View.VISIBLE);
					if (Dn_Box_Vis == 1) {
						linear73.setVisibility(View.VISIBLE);
					}
					imageview19.setImageResource(R.drawable.ic_caret_up);
				}
				else {
					Mg_Drop_Vis = 0;
					linear10.setVisibility(View.GONE);
					linear73.setVisibility(View.GONE);
					imageview19.setImageResource(R.drawable.ic_caret_down);
				}
			}
		});
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Mg_Drop_Vis == 0) {
					Mg_Drop_Vis = 1;
					linear10.setVisibility(View.VISIBLE);
					if (Dn_Box_Vis == 1) {
						linear73.setVisibility(View.VISIBLE);
					}
					imageview19.setImageResource(R.drawable.ic_caret_up);
				}
				else {
					Mg_Drop_Vis = 0;
					linear10.setVisibility(View.GONE);
					linear73.setVisibility(View.GONE);
					imageview19.setImageResource(R.drawable.ic_caret_down);
				}
			}
		});
		
		linear80.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mg_packageName = mg_package_name;
				try {
					    Intent microg = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    microg.setData(Uri.parse("package:" + mg_packageName));
					    startActivity(microg);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !!");
				}
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mg_packageName = mg_package_name;
				try {
					    Intent microg = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    microg.setData(Uri.parse("package:" + mg_packageName));
					    startActivity(microg);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !!");
				}
			}
		});
		
		linear44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PRDownloader.pause(downloadId);
			}
		});
		
		linear42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PRDownloader.resume(downloadId);
			}
		});
		
		linear40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear24.setVisibility(View.VISIBLE);
				linear26.setVisibility(View.VISIBLE);
				linear20.setVisibility(View.VISIBLE);
				linear96.setVisibility(View.VISIBLE);
				linear32.setVisibility(View.GONE);
				PRDownloader.cancel(downloadId);
			}
		});
		
		textview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PRDownloader.pause(downloadId);
			}
		});
		
		textview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PRDownloader.resume(downloadId);
			}
		});
		
		textview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear24.setVisibility(View.VISIBLE);
				linear26.setVisibility(View.VISIBLE);
				linear20.setVisibility(View.VISIBLE);
				linear96.setVisibility(View.VISIBLE);
				linear32.setVisibility(View.GONE);
				PRDownloader.cancel(downloadId);
			}
		});
		
		_HitRequest_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				linear108.setVisibility(View.GONE);
				_telegramLoaderDialog(false);
				try{
					response_data_map = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
				} catch (Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "Unable to load data from server !!");
				}
				_ResponseHandler();
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				_telegramLoaderDialog(false);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					TastyToast.makeText(getApplicationContext(), "Something Went Wrong", TastyToast.LENGTH_LONG, TastyToast.ERROR);
				}
				else {
					TastyToast.makeText(getApplicationContext(), "No Internet Connection...", TastyToast.LENGTH_LONG, TastyToast.ERROR);
					MaterialAlertDialogBuilder f = new MaterialAlertDialogBuilder(ManagerActivity.this);
					f.setTitle("No Internet Connection ");
					f.setIcon(R.drawable.ic_warn);
					f.setMessage("Please Enable Internet Connection ");
					f.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							HitRequest.startRequestNetwork(RequestNetworkController.GET, api, "a", _HitRequest_request_listener);
						}
					});
					f.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							finish();
						}
					});
					f.setCancelable(false);
					f.create().show();
					linear108.setVisibility(View.VISIBLE);
				}
			}
		};
	}
	
	private void initializeLogic() {
		_telegramLoaderDialog(true);
		_status_bar_color("#a1d1ff", "#a1d1ff");
		set_theme = 1;
		YTM_Drop_Vis = 1;
		RVM_Drop_Vs = 0;
		Mg_Drop_Vis = 0;
		_light_theme();
		api = "https://dl.dropboxusercontent.com/s/lfq51795uhlg5dq/manager.json";
		_SetVisibilty();
		_Apk_init();
		HitRequest.startRequestNetwork(RequestNetworkController.GET, api, "a", _HitRequest_request_listener);
		if (usr.getString("UserId", "").equals("")) {
			usr.edit().putString("UserId", "Unknown User").commit();
			textview33.setText(usr.getString("UserId", ""));
			edittext1.setText(usr.getString("UserId", ""));
		}
		else {
			edittext1.setText(usr.getString("UserId", ""));
			textview33.setText(usr.getString("UserId", ""));
		}
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		
		if(timeOfDay >= 0 && timeOfDay < 12){
			    textview32.setText("Good Morning,");
		}else if(timeOfDay >= 12 && timeOfDay < 16){
			    textview32.setText("Good Afternoon,");
		}else if(timeOfDay >= 16 && timeOfDay < 21){
			    textview32.setText("Good Evening,");
		}else if(timeOfDay >= 21 && timeOfDay < 24){
			    textview32.setText( "Good Night,");
		}
		UserName = usr.getString("UserId", "");
		TastyToast.makeText(getApplicationContext(), "Welcome "+UserName, TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
		_Download_Initialise();
	}
	
	@Override
	public void onBackPressed() {
		
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
	
	
	public void _function() {
	}
	private int getColor(String name){
		return getColor(getResources().getIdentifier(name,"color","android"));
	}
	
	{
	}
	
	
	public void _light_theme() {
		if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				 
		}
		else {
				 
		}
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		linear55.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)2, 0xFF000000, Color.TRANSPARENT));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =ManagerActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFA1D1FF);
		}
		vscroll1.setBackgroundColor(0xFFA1D1FF);
		linear1.setBackgroundColor(0xFFA1D1FF);
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear32.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear49.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear63.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		edittext1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFA1D1FF));
		linear76.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear82.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear100.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear108.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFF44336));
		_RippleEffect(linear24, 50, 00, "#0A58CA", true);
		_RippleEffect(linear26, 50, 00, "#0A58CA", true);
		_RippleEffect(linear40, 50, 00, "#0A58CA", true);
		_RippleEffect(linear42, 50, 00, "#0A58CA", true);
		_RippleEffect(linear44, 50, 00, "#0A58CA", true);
		_RippleEffect(linear52, 50, 00, "#0A58CA", true);
		_RippleEffect(linear48, 50, 00, "#0A58CA", false);
		_RippleEffect(linear78, 50, 00, "#0A58CA", true);
		_RippleEffect(linear80, 50, 00, "#0A58CA", true);
		_RippleEffect(linear96, 50, 00, "#0A58CA", true);
		_RippleEffect(linear94, 50, 00, "#0A58CA", true);
		_RippleEffect(linear106, 50, 00, "#0A58CA", true);
		_RippleEffect(linear111, 50, 00, "#0A58CA", true);
		_RippleEffect(linear113, 50, 00, "#0A58CA", true);
		_RippleEffect(linear115, 50, 00, "#0A58CA", true);
		progressbar2.setProgressTintList(ColorStateList.valueOf(Color.BLUE));
	}
	
	
	public void _lib1() {
		//this block and project made by suaib ahmed
	}
	
	public static class PRDownloader {
		    private PRDownloader() {
				    }
		    public static void initialize(Context context) {
				        initialize(context, PRDownloaderConfig.newBuilder().build());
				    }
		    public static void initialize(Context context, PRDownloaderConfig config) {
				        ComponentHolder.getInstance().init(context, config);
				        DownloadRequestQueue.initialize();
				    }
		    public static DownloadRequestBuilder download(String url, String dirPath, String fileName) {
				        return new DownloadRequestBuilder(url, dirPath, fileName);
				    }
		    public static void pause(int downloadId) {
				        DownloadRequestQueue.getInstance().pause(downloadId);
				    }
		    public static void resume(int downloadId) {
				        DownloadRequestQueue.getInstance().resume(downloadId);
				    }
		    public static void cancel(int downloadId) {
				        DownloadRequestQueue.getInstance().cancel(downloadId);
				    }
		    public static void cancel(Object tag) {
				        DownloadRequestQueue.getInstance().cancel(tag);
				    }
		    public static void cancelAll() {
				        DownloadRequestQueue.getInstance().cancelAll();
				    }
		    public static Status getStatus(int downloadId) {
				        return DownloadRequestQueue.getInstance().getStatus(downloadId);
				    }
		    public static void cleanUp(int days) {
				        Utils.deleteUnwantedModelsAndTempFiles(days);
				    }
		    public static void shutDown() {
				        Core.shutDown();
				    }
	}
	
	public static class Response {
		    private Error error;
		    private boolean isSuccessful;
		    private boolean isPaused;
		    private boolean isCancelled;
		    public Error getError() {
				        return error;
				    }
		    public void setError(Error error) {
				        this.error = error;
				    }
		    public boolean isSuccessful() {
				        return isSuccessful;
				    }
		    public void setSuccessful(boolean successful) {
				        isSuccessful = successful;
				    }
		    public boolean isPaused() {
				        return isPaused;
				    }
		    public void setPaused(boolean paused) {
				        isPaused = paused;
				    }
		    public boolean isCancelled() {
				        return isCancelled;
				    }
		    public void setCancelled(boolean cancelled) {
				        isCancelled = cancelled;
				    }
	}
	
	public static enum Status {
		    QUEUED,
		    RUNNING,
		    PAUSED,
		    COMPLETED,
		    CANCELLED,
		    UNKNOWN
	}
	
	public static class Progress implements java.io.Serializable {
		    public long currentBytes;
		    public long totalBytes;
		    public Progress(long currentBytes, long totalBytes) {
				        this.currentBytes = currentBytes;
				        this.totalBytes = totalBytes;
				    }
		    @Override
		    public String toString() {
				        return "Progress{" +
				                "currentBytes=" + currentBytes +
				                ", totalBytes=" + totalBytes +
				                '}';
				    }
	}
	
	public static enum Priority {
		    LOW,
		    MEDIUM,
		    HIGH,
		    IMMEDIATE
	}
	
	
	public static class PRDownloaderConfig {
		    private int readTimeout;
		    private int connectTimeout;
		    private String userAgent;
		    private HttpClient httpClient;
		    private boolean databaseEnabled;
		    private PRDownloaderConfig(Builder builder) {
				        this.readTimeout = builder.readTimeout;
				        this.connectTimeout = builder.connectTimeout;
				        this.userAgent = builder.userAgent;
				        this.httpClient = builder.httpClient;
				        this.databaseEnabled = builder.databaseEnabled;
				    }
		    public int getReadTimeout() {
				        return readTimeout;
				    }
		    public void setReadTimeout(int readTimeout) {
				        this.readTimeout = readTimeout;
				    }
		    public int getConnectTimeout() {
				        return connectTimeout;
				    }
		    public void setConnectTimeout(int connectTimeout) {
				        this.connectTimeout = connectTimeout;
				    }
		    public String getUserAgent() {
				        return userAgent;
				    }
		    public void setUserAgent(String userAgent) {
				        this.userAgent = userAgent;
				    }
		    public HttpClient getHttpClient() {
				        return httpClient;
				    }
		    public void setHttpClient(HttpClient httpClient) {
				        this.httpClient = httpClient;
				    }
		    public boolean isDatabaseEnabled() {
				        return databaseEnabled;
				    }
		    public void setDatabaseEnabled(boolean databaseEnabled) {
				        this.databaseEnabled = databaseEnabled;
				    }
		    public static Builder newBuilder() {
				        return new Builder();
				    }
		    public static class Builder {
				        int readTimeout = Constants.DEFAULT_READ_TIMEOUT_IN_MILLS;
				        int connectTimeout = Constants.DEFAULT_CONNECT_TIMEOUT_IN_MILLS;
				        String userAgent = Constants.DEFAULT_USER_AGENT;
				        HttpClient httpClient = new DefaultHttpClient();
				        boolean databaseEnabled = false;
				        public Builder setReadTimeout(int readTimeout) {
						            this.readTimeout = readTimeout;
						            return this;
						        }
				        public Builder setConnectTimeout(int connectTimeout) {
						            this.connectTimeout = connectTimeout;
						            return this;
						        }
				        public Builder setUserAgent(String userAgent) {
						            this.userAgent = userAgent;
						            return this;
						        }
				        public Builder setHttpClient(HttpClient httpClient) {
						            this.httpClient = httpClient;
						            return this;
						        }
				        public Builder setDatabaseEnabled(boolean databaseEnabled) {
						            this.databaseEnabled = databaseEnabled;
						            return this;
						        }
				        public PRDownloaderConfig build() {
						            return new PRDownloaderConfig(this);
						        }
				    }
	}
	
	
	public static final class Constants {
		    private Constants() {
				    }
		    public static final int UPDATE = 0x01;
		    public static final String RANGE = "Range";
		    public static final String ETAG = "ETag";
		    public static final String USER_AGENT = "User-Agent";
		    public static final String DEFAULT_USER_AGENT = "Gymkhana-Studio";
		    public static final int DEFAULT_READ_TIMEOUT_IN_MILLS = 20_000;
		    public static final int DEFAULT_CONNECT_TIMEOUT_IN_MILLS = 20_000;
		    public static final int HTTP_RANGE_NOT_SATISFIABLE = 416;
		    public static final int HTTP_TEMPORARY_REDIRECT = 307;
		    public static final int HTTP_PERMANENT_REDIRECT = 308;
	}
	
	public static class Error {
		    private boolean isServerError;
		    private boolean isConnectionError;
		    public boolean isServerError() {
				        return isServerError;
				    }
		    public void setServerError(boolean serverError) {
				        isServerError = serverError;
				    }
		    public boolean isConnectionError() {
				        return isConnectionError;
				    }
		    public void setConnectionError(boolean connectionError) {
				        isConnectionError = connectionError;
				    }
	}
	
	public static interface OnCancelListener {
		    void onCancel();
	}
	
	public static interface OnDownloadListener {
		    void onDownloadComplete();
		    void onError(Error error);
	}
	
	public static interface OnPauseListener {
		    void onPause();
	}
	
	public static interface OnProgressListener {
		    void onProgress(Progress progress);
	}
	
	public static interface OnStartOrResumeListener {
		    void onStartOrResume();
	}
	
	
	
	public static class ProgressHandler extends Handler {
		    private final OnProgressListener listener;
		    public ProgressHandler(OnProgressListener listener) {
				        super(Looper.getMainLooper());
				        this.listener = listener;
				    }
		    @Override
		    public void handleMessage(Message msg) {
				        switch (msg.what) {
						            case Constants.UPDATE:
						                if (listener != null) {
								                    final Progress progress = (Progress) msg.obj;
								                    listener.onProgress(progress);
								                }
						                break;
						            default:
						                super.handleMessage(msg);
						                break;
						        }
				    }
	}
	
	public static class DefaultHttpClient implements HttpClient {
		    private java.net.URLConnection connection;
		    public DefaultHttpClient() {
				    }
		    @SuppressWarnings("CloneDoesntCallSuperClone")
		    @Override
		    public HttpClient clone() {
				        return new DefaultHttpClient();
				    }
		    @Override
		    public void connect(DownloadRequest request) throws java.io.IOException {
				        connection = new java.net.URL(request.getUrl()).openConnection();
				        connection.setReadTimeout(request.getReadTimeout());
				        connection.setConnectTimeout(request.getConnectTimeout());
				        final String range = String.format(Locale.ENGLISH,
				                "bytes=d-", request.getDownloadedBytes());
				        connection.addRequestProperty(Constants.RANGE, range);
				        connection.addRequestProperty(Constants.USER_AGENT, request.getUserAgent());
				        addHeaders(request);
				        connection.connect();
				    }
		    @Override
		    public int getResponseCode() throws java.io.IOException {
				        int responseCode = 0;
				        if (connection instanceof java.net.HttpURLConnection) {
						            responseCode = ((java.net.HttpURLConnection) connection).getResponseCode();
						        }
				        return responseCode;
				    }
		    @Override
		    public java.io.InputStream getInputStream() throws java.io.IOException {
				        return connection.getInputStream();
				    }
		    @Override
		    public long getContentLength() {
				        String length = connection.getHeaderField("Content-Length");
				        try {
						            return Long.parseLong(length);
						        } catch (NumberFormatException e) {
						            return -1;
						        }
				    }
		    @Override
		    public String getResponseHeader(String name) {
				        return connection.getHeaderField(name);
				    }
		    @Override
		    public void close() {
				    }
		    private void addHeaders(DownloadRequest request) {
				        final HashMap<String, List<String>> headers = request.getHeaders();
				        if (headers != null) {
						            Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
						            for (Map.Entry<String, List<String>> entry : entries) {
								                String name = entry.getKey();
								                List<String> list = entry.getValue();
								                if (list != null) {
										                    for (String value : list) {
												                        connection.addRequestProperty(name, value);
												                    }
										                }
								            }
						        }
				    }
		
	}
	
	public static interface HttpClient extends Cloneable {
		    HttpClient clone();
		    void connect(DownloadRequest request) throws java.io.IOException;
		    int getResponseCode() throws java.io.IOException;
		    java.io.InputStream getInputStream() throws java.io.IOException;
		    long getContentLength();
		    String getResponseHeader(String name);
		    void close();
	}
	
	public static class DownloadRequest {
		    private Priority priority;
		    private Object tag;
		    private String url;
		    private String dirPath;
		    private String fileName;
		    private int sequenceNumber;
		    private java.util.concurrent.Future future;
		    private long downloadedBytes;
		    private long totalBytes;
		    private int readTimeout;
		    private int connectTimeout;
		    private String userAgent;
		    private OnProgressListener onProgressListener;
		    private OnDownloadListener onDownloadListener;
		    private OnStartOrResumeListener onStartOrResumeListener;
		    private OnPauseListener onPauseListener;
		    private OnCancelListener onCancelListener;
		    private int downloadId;
		    private HashMap<String, List<String>> headerMap;
		    private Status status;
		
		    DownloadRequest(DownloadRequestBuilder builder) {
				        this.url = builder.url;
				        this.dirPath = builder.dirPath;
				        this.fileName = builder.fileName;
				        this.headerMap = builder.headerMap;
				        this.priority = builder.priority;
				        this.tag = builder.tag;
				        this.readTimeout =
				                builder.readTimeout != 0 ?
				                        builder.readTimeout :
				                        getReadTimeoutFromConfig();
				        this.connectTimeout =
				                builder.connectTimeout != 0 ?
				                        builder.connectTimeout :
				                        getConnectTimeoutFromConfig();
				        this.userAgent = builder.userAgent;
				    }
		
		    public Priority getPriority() {
				        return priority;
				    }
		
		    public void setPriority(Priority priority) {
				        this.priority = priority;
				    }
		
		    public Object getTag() {
				        return tag;
				    }
		
		    public void setTag(Object tag) {
				        this.tag = tag;
				    }
		
		    public String getUrl() {
				        return url;
				    }
		
		    public void setUrl(String url) {
				        this.url = url;
				    }
		
		    public String getDirPath() {
				        return dirPath;
				    }
		
		    public void setDirPath(String dirPath) {
				        this.dirPath = dirPath;
				    }
		
		    public String getFileName() {
				        return fileName;
				    }
		
		    public void setFileName(String fileName) {
				        this.fileName = fileName;
				    }
		
		    public int getSequenceNumber() {
				        return sequenceNumber;
				    }
		
		    public void setSequenceNumber(int sequenceNumber) {
				        this.sequenceNumber = sequenceNumber;
				    }
		
		    public HashMap<String, List<String>> getHeaders() {
				        return headerMap;
				    }
		
		    public java.util.concurrent.Future getFuture() {
				        return future;
				    }
		
		    public void setFuture(java.util.concurrent.Future future) {
				        this.future = future;
				    }
		
		    public long getDownloadedBytes() {
				        return downloadedBytes;
				    }
		
		    public void setDownloadedBytes(long downloadedBytes) {
				        this.downloadedBytes = downloadedBytes;
				    }
		
		    public long getTotalBytes() {
				        return totalBytes;
				    }
		
		    public void setTotalBytes(long totalBytes) {
				        this.totalBytes = totalBytes;
				    }
		
		    public int getReadTimeout() {
				        return readTimeout;
				    }
		
		    public void setReadTimeout(int readTimeout) {
				        this.readTimeout = readTimeout;
				    }
		
		    public int getConnectTimeout() {
				        return connectTimeout;
				    }
		
		    public void setConnectTimeout(int connectTimeout) {
				        this.connectTimeout = connectTimeout;
				    }
		
		    public String getUserAgent() {
				        if (userAgent == null) {
						            userAgent = ComponentHolder.getInstance().getUserAgent();
						        }
				        return userAgent;
				    }
		
		    public void setUserAgent(String userAgent) {
				        this.userAgent = userAgent;
				    }
		
		    public int getDownloadId() {
				        return downloadId;
				    }
		
		    public void setDownloadId(int downloadId) {
				        this.downloadId = downloadId;
				    }
		
		    public Status getStatus() {
				        return status;
				    }
		
		    public void setStatus(Status status) {
				        this.status = status;
				    }
		
		    public OnProgressListener getOnProgressListener() {
				        return onProgressListener;
				    }
		
		    public DownloadRequest setOnStartOrResumeListener(OnStartOrResumeListener onStartOrResumeListener) {
				        this.onStartOrResumeListener = onStartOrResumeListener;
				        return this;
				    }
		
		    public DownloadRequest setOnProgressListener(OnProgressListener onProgressListener) {
				        this.onProgressListener = onProgressListener;
				        return this;
				    }
		
		    public DownloadRequest setOnPauseListener(OnPauseListener onPauseListener) {
				        this.onPauseListener = onPauseListener;
				        return this;
				    }
		
		    public DownloadRequest setOnCancelListener(OnCancelListener onCancelListener) {
				        this.onCancelListener = onCancelListener;
				        return this;
				    }
		
		    public int start(OnDownloadListener onDownloadListener) {
				        this.onDownloadListener = onDownloadListener;
				        downloadId = Utils.getUniqueId(url, dirPath, fileName);
				        DownloadRequestQueue.getInstance().addRequest(this);
				        return downloadId;
				    }
		
		    public Response executeSync() {
				        downloadId = Utils.getUniqueId(url, dirPath, fileName);
				        return new SynchronousCall(this).execute();
				    }
		
		    public void deliverError(final Error error) {
				        if (status != Status.CANCELLED) {
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onDownloadListener != null) {
												                                onDownloadListener.onError(error);
												                            }
										                            finish();
										                        }
								                    });
						        }
				    }
		
		    public void deliverSuccess() {
				        if (status != Status.CANCELLED) {
						            setStatus(Status.COMPLETED);
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onDownloadListener != null) {
												                                onDownloadListener.onDownloadComplete();
												                            }
										                            finish();
										                        }
								                    });
						        }
				    }
		
		    public void deliverStartEvent() {
				        if (status != Status.CANCELLED) {
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onStartOrResumeListener != null) {
												                                onStartOrResumeListener.onStartOrResume();
												                            }
										                        }
								                    });
						        }
				    }
		
		    public void deliverPauseEvent() {
				        if (status != Status.CANCELLED) {
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onPauseListener != null) {
												                                onPauseListener.onPause();
												                            }
										                        }
								                    });
						        }
				    }
		
		    private void deliverCancelEvent() {
				        Core.getInstance().getExecutorSupplier().forMainThreadTasks()
				                .execute(new Runnable() {
						                    public void run() {
								                        if (onCancelListener != null) {
										                            onCancelListener.onCancel();
										                        }
								                    }
						                });
				    }
		
		    public void cancel() {
				        status = Status.CANCELLED;
				        if (future != null) {
						            future.cancel(true);
						        }
				        deliverCancelEvent();
				        Utils.deleteTempFileAndDatabaseEntryInBackground(Utils.getTempPath(dirPath, fileName), downloadId);
				    }
		
		    private void finish() {
				        destroy();
				        DownloadRequestQueue.getInstance().finish(this);
				    }
		
		    private void destroy() {
				        this.onProgressListener = null;
				        this.onDownloadListener = null;
				        this.onStartOrResumeListener = null;
				        this.onPauseListener = null;
				        this.onCancelListener = null;
				    }
		
		    private int getReadTimeoutFromConfig() {
				        return ComponentHolder.getInstance().getReadTimeout();
				    }
		
		    private int getConnectTimeoutFromConfig() {
				        return ComponentHolder.getInstance().getConnectTimeout();
				    }
		
	}
	
	public static class DownloadRequestBuilder implements RequestBuilder {
		    String url;
		    String dirPath;
		    String fileName;
		    Priority priority = Priority.MEDIUM;
		    Object tag;
		    int readTimeout;
		    int connectTimeout;
		    String userAgent;
		    HashMap<String, List<String>> headerMap;
		    public DownloadRequestBuilder(String url, String dirPath, String fileName) {
				        this.url = url;
				        this.dirPath = dirPath;
				        this.fileName = fileName;
				    }
		    @Override
		    public DownloadRequestBuilder setHeader(String name, String value) {
				        if (headerMap == null) {
						            headerMap = new HashMap<>();
						        }
				        List<String> list = headerMap.get(name);
				        if (list == null) {
						            list = new ArrayList<>();
						            headerMap.put(name, list);
						        }
				        if (!list.contains(value)) {
						            list.add(value);
						        }
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setPriority(Priority priority) {
				        this.priority = priority;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setTag(Object tag) {
				        this.tag = tag;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setReadTimeout(int readTimeout) {
				        this.readTimeout = readTimeout;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setConnectTimeout(int connectTimeout) {
				        this.connectTimeout = connectTimeout;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setUserAgent(String userAgent) {
				        this.userAgent = userAgent;
				        return this;
				    }
		    public DownloadRequest build() {
				        return new DownloadRequest(this);
				    }
	}
	
	public static interface RequestBuilder {
		    RequestBuilder setHeader(String name, String value);
		    RequestBuilder setPriority(Priority priority);
		    RequestBuilder setTag(Object tag);
		    RequestBuilder setReadTimeout(int readTimeout);
		    RequestBuilder setConnectTimeout(int connectTimeout);
		    RequestBuilder setUserAgent(String userAgent);
	}
	
	public static final class Utils {
		    private final static int MAX_REDIRECTION = 10;
		    private Utils() {
				    }
		    public static String getPath(String dirPath, String fileName) {
				        return dirPath + java.io.File.separator + fileName;
				    }
		    public static String getTempPath(String dirPath, String fileName) {
				        return getPath(dirPath, fileName) + ".temp";
				    }
		    public static void renameFileName(String oldPath, String newPath) throws java.io.IOException {
				        final java.io.File oldFile = new java.io.File(oldPath);
				        try {
						            final java.io.File newFile = new java.io.File(newPath);
						            if (newFile.exists()) {
								                if (!newFile.delete()) {
										                    throw new java.io.IOException("Deletion Failed");
										                }
								            }
						            if (!oldFile.renameTo(newFile)) {
								                throw new java.io.IOException("Rename Failed");
								            }
						        } finally {
						            if (oldFile.exists()) {
								                oldFile.delete();
								            }
						        }
				    }
		
		    public static void deleteTempFileAndDatabaseEntryInBackground(final String path, final int downloadId) {
				        Core.getInstance().getExecutorSupplier().forBackgroundTasks()
				                .execute(new Runnable() {
						                    @Override
						                    public void run() {
								                        ComponentHolder.getInstance().getDbHelper().remove(downloadId);
								                        java.io.File file = new java.io.File(path);
								                        if (file.exists()) {
										                            //noinspection ResultOfMethodCallIgnored
										                            file.delete();
										                        }
								                    }
						                });
				    }
		
		    public static void deleteUnwantedModelsAndTempFiles(final int days) {
				        Core.getInstance().getExecutorSupplier().forBackgroundTasks()
				                .execute(new Runnable() {
						                    @Override
						                    public void run() {
								                        List<DownloadModel> models = ComponentHolder.getInstance()
								                                .getDbHelper()
								                                .getUnwantedModels(days);
								                        if (models != null) {
										                            for (DownloadModel model : models) {
												                                final String tempPath = getTempPath(model.getDirPath(), model.getFileName());
												                                ComponentHolder.getInstance().getDbHelper().remove(model.getId());
												                                java.io.File file = new java.io.File(tempPath);
												                                if (file.exists()) {
														                                    file.delete();
														                                }
												                            }
										                        }
								                    }
						                });
				    }
		
		    public static int getUniqueId(String url, String dirPath, String fileName) {
				        String string = url + java.io.File.separator + dirPath + java.io.File.separator + fileName;
				        byte[] hash;
				        try {
						            hash = java.security.MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
						        } catch (java.security.NoSuchAlgorithmException e) {
						            throw new RuntimeException("NoSuchAlgorithmException", e);
						        } catch (java.io.UnsupportedEncodingException e) {
						            throw new RuntimeException("UnsupportedEncodingException", e);
						        }
				        StringBuilder hex = new StringBuilder(hash.length * 2);
				
				        for (byte b : hash) {
						            if ((b & 0xFF) < 0x10) hex.append("0");
						            hex.append(Integer.toHexString(b & 0xFF));
						        }
				        return hex.toString().hashCode();
				
				    }
		    public static HttpClient getRedirectedConnectionIfAny(HttpClient httpClient,
		                                                          DownloadRequest request)
		            throws java.io.IOException, IllegalAccessException {
				        int redirectTimes = 0;
				        int code = httpClient.getResponseCode();
				        String location = httpClient.getResponseHeader("Location");
				        while (isRedirection(code)) {
						            if (location == null) {
								                throw new IllegalAccessException("Location is null");
								            }
						            httpClient.close();
						            request.setUrl(location);
						            httpClient = ComponentHolder.getInstance().getHttpClient();
						            httpClient.connect(request);
						            code = httpClient.getResponseCode();
						            location = httpClient.getResponseHeader("Location");
						            redirectTimes++;
						            if (redirectTimes >= MAX_REDIRECTION) {
								                throw new IllegalAccessException("Max redirection done");
								            }
						        }
				        return httpClient;
				    }
		    private static boolean isRedirection(int code) {
				        return code == java.net.HttpURLConnection.HTTP_MOVED_PERM
				                || code == java.net.HttpURLConnection.HTTP_MOVED_TEMP
				                || code == java.net.HttpURLConnection.HTTP_SEE_OTHER
				                || code == java.net.HttpURLConnection.HTTP_MULT_CHOICE
				                || code == Constants.HTTP_TEMPORARY_REDIRECT
				                || code == Constants.HTTP_PERMANENT_REDIRECT;
				    }
	}
	
	
	public static class Core {
		    private static Core instance = null;
		    private final ExecutorSupplier executorSupplier;
		    private Core() {
				        this.executorSupplier = new DefaultExecutorSupplier();
				    }
		    public static Core getInstance() {
				        if (instance == null) {
						            synchronized (Core.class) {
								                if (instance == null) {
										                    instance = new Core();
										                }
								            }
						        }
				        return instance;
				    }
		    public ExecutorSupplier getExecutorSupplier() {
				        return executorSupplier;
				    }
		    public static void shutDown() {
				        if (instance != null) {
						            instance = null;
						        }
				    }
	}
	
	
	public static class PriorityThreadFactory implements java.util.concurrent.ThreadFactory {
		    private final int mThreadPriority;
		    PriorityThreadFactory(int threadPriority) {
				        mThreadPriority = threadPriority;
				    }
		    @Override
		    public Thread newThread(final Runnable runnable) {
				        Runnable wrapperRunnable = new Runnable() {
						            @Override
						            public void run() {
								                try {
										                    android.os.Process.setThreadPriority(mThreadPriority);
										                } catch (Throwable ignored) {
										
										                }
								                runnable.run();
								            }
						        };
				        return new Thread(wrapperRunnable);
				    }
	}
	public static class MainThreadExecutor implements java.util.concurrent.Executor {
		    private final Handler handler = new Handler(Looper.getMainLooper());
		    @Override
		    public void execute(Runnable runnable) {
				        handler.post(runnable);
				    }
	}
	
	public static class DefaultExecutorSupplier implements ExecutorSupplier {
		    private static final int DEFAULT_MAX_NUM_THREADS = 2 * Runtime.getRuntime().availableProcessors() + 1;
		    private final DownloadExecutor networkExecutor;
		    private final java.util.concurrent.Executor backgroundExecutor;
		    private final java.util.concurrent.Executor mainThreadExecutor;
		    DefaultExecutorSupplier() {
				        java.util.concurrent.ThreadFactory backgroundPriorityThreadFactory = new PriorityThreadFactory(android.os.Process.THREAD_PRIORITY_BACKGROUND);
				        networkExecutor = new DownloadExecutor(DEFAULT_MAX_NUM_THREADS, backgroundPriorityThreadFactory);
				        backgroundExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
				        mainThreadExecutor = new MainThreadExecutor();
				    }
		    @Override
		    public DownloadExecutor forDownloadTasks() {
				        return networkExecutor;
				    }
		    @Override
		    public java.util.concurrent.Executor forBackgroundTasks() {
				        return backgroundExecutor;
				    }
		    @Override
		    public java.util.concurrent.Executor forMainThreadTasks() {
				        return mainThreadExecutor;
				    }
	}
	
	public static interface ExecutorSupplier {
		    DownloadExecutor forDownloadTasks();
		    java.util.concurrent.Executor forBackgroundTasks();
		    java.util.concurrent.Executor forMainThreadTasks();
	}
	
	
	public static class FileDownloadRandomAccessFile implements FileDownloadOutputStream {
		    private final java.io.BufferedOutputStream out;
		    private final java.io.FileDescriptor fd;
		    private final java.io.RandomAccessFile randomAccess;
		    private FileDownloadRandomAccessFile(java.io.File file) throws java.io.IOException {
				        randomAccess = new java.io.RandomAccessFile(file, "rw");
				        fd = randomAccess.getFD();
				        out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(randomAccess.getFD()));
				    }
		    @Override
		    public void write(byte[] b, int off, int len) throws java.io.IOException {
				        out.write(b, off, len);
				    }
		    @Override
		    public void flushAndSync() throws java.io.IOException {
				        out.flush();
				        fd.sync();
				    }
		    @Override
		    public void close() throws java.io.IOException {
				        out.close();
				        randomAccess.close();
				    }
		    @Override
		    public void seek(long offset) throws java.io.IOException {
				        randomAccess.seek(offset);
				    }
		    @Override
		    public void setLength(long totalBytes) throws java.io.IOException {
				        randomAccess.setLength(totalBytes);
				    }
		    public static FileDownloadOutputStream create(java.io.File file) throws java.io.IOException {
				        return new FileDownloadRandomAccessFile(file);
				    }
	}
	
	public static interface FileDownloadOutputStream {
		    void write(byte b[], int off, int len) throws java.io.IOException;
		    void flushAndSync() throws java.io.IOException;
		    void close() throws java.io.IOException;
		    void seek(long offset) throws java.io.IOException, IllegalAccessException;
		    void setLength(final long newLength) throws java.io.IOException, IllegalAccessException;
	}
	public static class DownloadRunnable implements Runnable {
		    public final Priority priority;
		    public final int sequence;
		    public final DownloadRequest request;
		    DownloadRunnable(DownloadRequest request) {
				        this.request = request;
				        this.priority = request.getPriority();
				        this.sequence = request.getSequenceNumber();
				    }
		    @Override
		    public void run() {
				        request.setStatus(Status.RUNNING);
				        DownloadTask downloadTask = DownloadTask.create(request);
				        Response response = downloadTask.run();
				        if (response.isSuccessful()) {
						            request.deliverSuccess();
						        } else if (response.isPaused()) {
						            request.deliverPauseEvent();
						        } else if (response.getError() != null) {
						            request.deliverError(response.getError());
						        } else if (!response.isCancelled()) {
						            request.deliverError(new Error());
						        }
				    }
	}
	
	
	public static class SynchronousCall {
		    public final DownloadRequest request;
		    public SynchronousCall(DownloadRequest request) {
				        this.request = request;
				    }
		    public Response execute() {
				        DownloadTask downloadTask = DownloadTask.create(request);
				        return downloadTask.run();
				    }
	}
	
	public static class ComponentHolder {
		    private final static ComponentHolder INSTANCE = new ComponentHolder();
		    private int readTimeout;
		    private int connectTimeout;
		    private String userAgent;
		    private HttpClient httpClient;
		    private DbHelper dbHelper;
		    public static ComponentHolder getInstance() {
				        return INSTANCE;
				    }
		    public void init(Context context, PRDownloaderConfig config) {
				        this.readTimeout = config.getReadTimeout();
				        this.connectTimeout = config.getConnectTimeout();
				        this.userAgent = config.getUserAgent();
				        this.httpClient = config.getHttpClient();
				        this.dbHelper = config.isDatabaseEnabled() ? new AppDbHelper(context) : new NoOpsDbHelper();
				        if (config.isDatabaseEnabled()) {
						            PRDownloader.cleanUp(30);
						        }
				    }
		    public int getReadTimeout() {
				        if (readTimeout == 0) {
						            synchronized (ComponentHolder.class) {
								                if (readTimeout == 0) {
										                    readTimeout = Constants.DEFAULT_READ_TIMEOUT_IN_MILLS;
										                }
								            }
						        }
				        return readTimeout;
				    }
		    public int getConnectTimeout() {
				        if (connectTimeout == 0) {
						            synchronized (ComponentHolder.class) {
								                if (connectTimeout == 0) {
										                    connectTimeout = Constants.DEFAULT_CONNECT_TIMEOUT_IN_MILLS;
										                }
								            }
						        }
				        return connectTimeout;
				    }
		    public String getUserAgent() {
				        if (userAgent == null) {
						            synchronized (ComponentHolder.class) {
								                if (userAgent == null) {
										                    userAgent = Constants.DEFAULT_USER_AGENT;
										                }
								            }
						        }
				        return userAgent;
				    }
		    public DbHelper getDbHelper() {
				        if (dbHelper == null) {
						            synchronized (ComponentHolder.class) {
								                if (dbHelper == null) {
										                    dbHelper = new NoOpsDbHelper();
										                }
								            }
						        }
				        return dbHelper;
				    }
		    public HttpClient getHttpClient() {
				        if (httpClient == null) {
						            synchronized (ComponentHolder.class) {
								                if (httpClient == null) {
										                    httpClient = new DefaultHttpClient();
										                }
								            }
						        }
				        return httpClient.clone();
				    }
	}
	
	
	public static class DownloadTask {
		    private static final int BUFFER_SIZE = 1024 * 4;
		    private static final long TIME_GAP_FOR_SYNC = 2000;
		    private static final long MIN_BYTES_FOR_SYNC = 65536;
		    private final DownloadRequest request;
		    private ProgressHandler progressHandler;
		    private long lastSyncTime;
		    private long lastSyncBytes;
		    private java.io.InputStream inputStream;
		    private FileDownloadOutputStream outputStream;
		    private HttpClient httpClient;
		    private long totalBytes;
		    private int responseCode;
		    private String eTag;
		    private boolean isResumeSupported;
		    private String tempPath;
		    private DownloadTask(DownloadRequest request) {
				        this.request = request;
				    }
		    static DownloadTask create(DownloadRequest request) {
				        return new DownloadTask(request);
				    }
		    Response run() {
				        Response response = new Response();
				        if (request.getStatus() == Status.CANCELLED) {
						            response.setCancelled(true);
						            return response;
						        } else if (request.getStatus() == Status.PAUSED) {
						            response.setPaused(true);
						            return response;
						        }
				        try {
						            if (request.getOnProgressListener() != null) {
								                progressHandler = new ProgressHandler(request.getOnProgressListener());
								            }
						            tempPath = Utils.getTempPath(request.getDirPath(), request.getFileName());
						            java.io.File file = new java.io.File(tempPath);
						            DownloadModel model = getDownloadModelIfAlreadyPresentInDatabase();
						            if (model != null) {
								                if (file.exists()) {
										                    request.setTotalBytes(model.getTotalBytes());
										                    request.setDownloadedBytes(model.getDownloadedBytes());
										                } else {
										                    removeNoMoreNeededModelFromDatabase();
										                    request.setDownloadedBytes(0);
										                    request.setTotalBytes(0);
										                    model = null;
										                }
								            }
						            httpClient = ComponentHolder.getInstance().getHttpClient();
						            httpClient.connect(request);
						            if (request.getStatus() == Status.CANCELLED) {
								                response.setCancelled(true);
								                return response;
								            } else if (request.getStatus() == Status.PAUSED) {
								                response.setPaused(true);
								                return response;
								            }
						            httpClient = Utils.getRedirectedConnectionIfAny(httpClient, request);
						            responseCode = httpClient.getResponseCode();
						            eTag = httpClient.getResponseHeader(Constants.ETAG);
						            if (checkIfFreshStartRequiredAndStart(model)) {
								                model = null;
								            }
						            if (!isSuccessful()) {
								                Error error = new Error();
								                error.setServerError(true);
								                response.setError(error);
								                return response;
								            }
						            setResumeSupportedOrNot();
						            totalBytes = request.getTotalBytes();
						            if (!isResumeSupported) {
								                deleteTempFile();
								            }
						            if (totalBytes == 0) {
								                totalBytes = httpClient.getContentLength();
								                request.setTotalBytes(totalBytes);
								            }
						            if (isResumeSupported && model == null) {
								                createAndInsertNewModel();
								            }
						            if (request.getStatus() == Status.CANCELLED) {
								                response.setCancelled(true);
								                return response;
								            } else if (request.getStatus() == Status.PAUSED) {
								                response.setPaused(true);
								                return response;
								            }
						            request.deliverStartEvent();
						            inputStream = httpClient.getInputStream();
						            byte[] buff = new byte[BUFFER_SIZE];
						            if (!file.exists()) {
								                if (file.getParentFile() != null && !file.getParentFile().exists()) {
										                    if (file.getParentFile().mkdirs()) {
												                        file.createNewFile();
												                    }
										                } else {
										                    file.createNewFile();
										                }
								            }
						            this.outputStream = FileDownloadRandomAccessFile.create(file);
						            if (isResumeSupported && request.getDownloadedBytes() != 0) {
								                outputStream.seek(request.getDownloadedBytes());
								            }
						            if (request.getStatus() == Status.CANCELLED) {
								                response.setCancelled(true);
								                return response;
								            } else if (request.getStatus() == Status.PAUSED) {
								                response.setPaused(true);
								                return response;
								            }
						            do {
								                final int byteCount = inputStream.read(buff, 0, BUFFER_SIZE);
								                if (byteCount == -1) {
										                    break;
										                }
								                outputStream.write(buff, 0, byteCount);
								                request.setDownloadedBytes(request.getDownloadedBytes() + byteCount);
								                sendProgress();
								                syncIfRequired(outputStream);
								                if (request.getStatus() == Status.CANCELLED) {
										                    response.setCancelled(true);
										                    return response;
										                } else if (request.getStatus() == Status.PAUSED) {
										                    sync(outputStream);
										                    response.setPaused(true);
										                    return response;
										                }
								            } while (true);
						            final String path = Utils.getPath(request.getDirPath(), request.getFileName());
						            Utils.renameFileName(tempPath, path);
						            response.setSuccessful(true);
						            if (isResumeSupported) {
								                removeNoMoreNeededModelFromDatabase();
								            }
						        } catch (java.io.IOException | IllegalAccessException e) {
						            if (!isResumeSupported) {
								                deleteTempFile();
								            }
						            Error error = new Error();
						            error.setConnectionError(true);
						            response.setError(error);
						        } finally {
						            closeAllSafely(outputStream);
						        }
				        return response;
				    }
		    private void deleteTempFile() {
				        java.io.File file = new java.io.File(tempPath);
				        if (file.exists()) {
						            file.delete();
						        }
				    }
		    private boolean isSuccessful() {
				        return responseCode >= java.net.HttpURLConnection.HTTP_OK
				                && responseCode < java.net.HttpURLConnection.HTTP_MULT_CHOICE;
				    }
		    private void setResumeSupportedOrNot() {
				        isResumeSupported = (responseCode == java.net.HttpURLConnection.HTTP_PARTIAL);
				    }
		    private boolean checkIfFreshStartRequiredAndStart(DownloadModel model) throws java.io.IOException,
		            IllegalAccessException {
				        if (responseCode == Constants.HTTP_RANGE_NOT_SATISFIABLE || isETagChanged(model)) {
						            if (model != null) {
								                removeNoMoreNeededModelFromDatabase();
								            }
						            deleteTempFile();
						            request.setDownloadedBytes(0);
						            request.setTotalBytes(0);
						            httpClient = ComponentHolder.getInstance().getHttpClient();
						            httpClient.connect(request);
						            httpClient = Utils.getRedirectedConnectionIfAny(httpClient, request);
						            responseCode = httpClient.getResponseCode();
						            return true;
						        }
				        return false;
				    }
		    private boolean isETagChanged(DownloadModel model) {
				        return !(eTag == null || model == null || model.getETag() == null)
				                && !model.getETag().equals(eTag);
				    }
		    private DownloadModel getDownloadModelIfAlreadyPresentInDatabase() {
				        return ComponentHolder.getInstance().getDbHelper().find(request.getDownloadId());
				    }
		    private void createAndInsertNewModel() {
				        DownloadModel model = new DownloadModel();
				        model.setId(request.getDownloadId());
				        model.setUrl(request.getUrl());
				        model.setETag(eTag);
				        model.setDirPath(request.getDirPath());
				        model.setFileName(request.getFileName());
				        model.setDownloadedBytes(request.getDownloadedBytes());
				        model.setTotalBytes(totalBytes);
				        model.setLastModifiedAt(System.currentTimeMillis());
				        ComponentHolder.getInstance().getDbHelper().insert(model);
				    }
		    private void removeNoMoreNeededModelFromDatabase() {
				        ComponentHolder.getInstance().getDbHelper().remove(request.getDownloadId());
				    }
		    private void sendProgress() {
				        if (request.getStatus() != Status.CANCELLED) {
						            if (progressHandler != null) {
								                progressHandler
								                        .obtainMessage(Constants.UPDATE,
								                                new Progress(request.getDownloadedBytes(),
								                                        totalBytes)).sendToTarget();
								            }
						        }
				    }
		    private void syncIfRequired(FileDownloadOutputStream outputStream) {
				        final long currentBytes = request.getDownloadedBytes();
				        final long currentTime = System.currentTimeMillis();
				        final long bytesDelta = currentBytes - lastSyncBytes;
				        final long timeDelta = currentTime - lastSyncTime;
				        if (bytesDelta > MIN_BYTES_FOR_SYNC && timeDelta > TIME_GAP_FOR_SYNC) {
						            sync(outputStream);
						            lastSyncBytes = currentBytes;
						            lastSyncTime = currentTime;
						        }
				    }
		    private void sync(FileDownloadOutputStream outputStream) {
				        boolean success;
				        try {
						            outputStream.flushAndSync();
						            success = true;
						        } catch (java.io.IOException e) {
						            success = false;
						            e.printStackTrace();
						        }
				        if (success && isResumeSupported) {
						            ComponentHolder.getInstance().getDbHelper()
						                    .updateProgress(request.getDownloadId(),
						                            request.getDownloadedBytes(),
						                            System.currentTimeMillis());
						        }
				    }
		    private void closeAllSafely(FileDownloadOutputStream outputStream) {
				        if (httpClient != null) {
						            try {
								                httpClient.close();
								            } catch (Exception e) {
								                e.printStackTrace();
								            }
						        }
				        if (inputStream != null) {
						            try {
								                inputStream.close();
								            } catch (java.io.IOException e) {
								                e.printStackTrace();
								            }
						        }
				        try {
						            if (outputStream != null) {
								                try {
										                    sync(outputStream);
										                } catch (Exception e) {
										                    e.printStackTrace();
										                }
								            }
						
						        } finally {
						            if (outputStream != null)
						                try {
								                    outputStream.close();
								                } catch (java.io.IOException e) {
								                    e.printStackTrace();
								                }
						        }
				    }
	}
	
	
	public static class DownloadRequestQueue {
		    private static DownloadRequestQueue instance;
		    private final Map<Integer, DownloadRequest> currentRequestMap;
		    private final java.util.concurrent.atomic.AtomicInteger sequenceGenerator;
		    private DownloadRequestQueue() {
				        currentRequestMap = new java.util.concurrent.ConcurrentHashMap<>();
				        sequenceGenerator = new java.util.concurrent.atomic.AtomicInteger();
				    }
		    public static void initialize() {
				        getInstance();
				    }
		    public static DownloadRequestQueue getInstance() {
				        if (instance == null) {
						            synchronized (DownloadRequestQueue.class) {
								                if (instance == null) {
										                    instance = new DownloadRequestQueue();
										                }
								            }
						        }
				        return instance;
				    }
		    private int getSequenceNumber() {
				        return sequenceGenerator.incrementAndGet();
				    }
		    public void pause(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        if (request != null) {
						            request.setStatus(Status.PAUSED);
						        }
				    }
		    public void resume(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        if (request != null) {
						            request.setStatus(Status.QUEUED);
						            request.setFuture(Core.getInstance()
						                    .getExecutorSupplier()
						                    .forDownloadTasks()
						                    .submit(new DownloadRunnable(request)));
						        }
				    }
		    private void cancelAndRemoveFromMap(DownloadRequest request) {
				        if (request != null) {
						            request.cancel();
						            currentRequestMap.remove(request.getDownloadId());
						        }
				    }
		    public void cancel(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        cancelAndRemoveFromMap(request);
				    }
		    public void cancel(Object tag) {
				        for (Map.Entry<Integer, DownloadRequest> currentRequestMapEntry : currentRequestMap.entrySet()) {
						            DownloadRequest request = currentRequestMapEntry.getValue();
						            if (request.getTag() instanceof String && tag instanceof String) {
								                final String tempRequestTag = (String) request.getTag();
								                final String tempTag = (String) tag;
								                if (tempRequestTag.equals(tempTag)) {
										                    cancelAndRemoveFromMap(request);
										                }
								            } else if (request.getTag().equals(tag)) {
								                cancelAndRemoveFromMap(request);
								            }
						        }
				    }
		    public void cancelAll() {
				        for (Map.Entry<Integer, DownloadRequest> currentRequestMapEntry : currentRequestMap.entrySet()) {
						            DownloadRequest request = currentRequestMapEntry.getValue();
						            cancelAndRemoveFromMap(request);
						        }
				    }
		    public Status getStatus(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        if (request != null) {
						            return request.getStatus();
						        }
				        return Status.UNKNOWN;
				    }
		    public void addRequest(DownloadRequest request) {
				        currentRequestMap.put(request.getDownloadId(), request);
				        request.setStatus(Status.QUEUED);
				        request.setSequenceNumber(getSequenceNumber());
				        request.setFuture(Core.getInstance()
				                .getExecutorSupplier()
				                .forDownloadTasks()
				                .submit(new DownloadRunnable(request)));
				    }
		    public void finish(DownloadRequest request) {
				        currentRequestMap.remove(request.getDownloadId());
				    }
	}
	
	
	public static class DownloadModel {
		    static final String ID = "id";
		    static final String URL = "url";
		    static final String ETAG = "etag";
		    static final String DIR_PATH = "dir_path";
		    static final String FILE_NAME = "file_name";
		    static final String TOTAL_BYTES = "total_bytes";
		    static final String DOWNLOADED_BYTES = "downloaded_bytes";
		    static final String LAST_MODIFIED_AT = "last_modified_at";
		    private int id;
		    private String url;
		    private String eTag;
		    private String dirPath;
		    private String fileName;
		    private long totalBytes;
		    private long downloadedBytes;
		    private long lastModifiedAt;
		    public int getId() {
				        return id;
				    }
		    public void setId(int id) {
				        this.id = id;
				    }
		    public String getUrl() {
				        return url;
				    }
		    public void setUrl(String url) {
				        this.url = url;
				    }
		    public String getETag() {
				        return eTag;
				    }
		    public void setETag(String eTag) {
				        this.eTag = eTag;
				    }
		    public String getDirPath() {
				        return dirPath;
				    }
		    public void setDirPath(String dirPath) {
				        this.dirPath = dirPath;
				    }
		    public String getFileName() {
				        return fileName;
				    }
		    public void setFileName(String fileName) {
				        this.fileName = fileName;
				    }
		    public long getTotalBytes() {
				        return totalBytes;
				    }
		    public void setTotalBytes(long totalBytes) {
				        this.totalBytes = totalBytes;
				    }
		    public long getDownloadedBytes() {
				        return downloadedBytes;
				    }
		    public void setDownloadedBytes(long downloadedBytes) {
				        this.downloadedBytes = downloadedBytes;
				    }
		    public long getLastModifiedAt() {
				        return lastModifiedAt;
				    }
		    public void setLastModifiedAt(long lastModifiedAt) {
				        this.lastModifiedAt = lastModifiedAt;
				    }
	}
	
	
	
	public static class AppDbHelper implements DbHelper {
		
		    public static final String TABLE_NAME = "prdownloader";
		    private final android.database.sqlite.SQLiteDatabase db;
		    public AppDbHelper(Context context) {
				        DatabaseOpenHelper databaseOpenHelper = new DatabaseOpenHelper(context);
				        db = databaseOpenHelper.getWritableDatabase();
				    }
		    @Override
		    public DownloadModel find(int id) {
				        android.database.Cursor cursor = null;
				        DownloadModel model = null;
				        try {
						            cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " +
						                    DownloadModel.ID + " = " + id, null);
						            if (cursor != null && cursor.moveToFirst()) {
								                model = new DownloadModel();
								                model.setId(id);
								                model.setUrl(cursor.getString(cursor.getColumnIndex(DownloadModel.URL)));
								                model.setETag(cursor.getString(cursor.getColumnIndex(DownloadModel.ETAG)));
								                model.setDirPath(cursor.getString(cursor.getColumnIndex(DownloadModel.DIR_PATH)));
								                model.setFileName(cursor.getString(cursor.getColumnIndex(DownloadModel.FILE_NAME)));
								                model.setTotalBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.TOTAL_BYTES)));
								                model.setDownloadedBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.DOWNLOADED_BYTES)));
								                model.setLastModifiedAt(cursor.getLong(cursor.getColumnIndex(DownloadModel.LAST_MODIFIED_AT)));
								            }
						        } catch (Exception e) {
						            e.printStackTrace();
						        } finally {
						            if (cursor != null) {
								                cursor.close();
								            }
						        }
				        return model;
				    }
		    @Override
		    public void insert(DownloadModel model) {
				        try {
						            ContentValues values = new ContentValues();
						            values.put(DownloadModel.ID, model.getId());
						            values.put(DownloadModel.URL, model.getUrl());
						            values.put(DownloadModel.ETAG, model.getETag());
						            values.put(DownloadModel.DIR_PATH, model.getDirPath());
						            values.put(DownloadModel.FILE_NAME, model.getFileName());
						            values.put(DownloadModel.TOTAL_BYTES, model.getTotalBytes());
						            values.put(DownloadModel.DOWNLOADED_BYTES, model.getDownloadedBytes());
						            values.put(DownloadModel.LAST_MODIFIED_AT, model.getLastModifiedAt());
						            db.insert(TABLE_NAME, null, values);
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public void update(DownloadModel model) {
				        try {
						            ContentValues values = new ContentValues();
						            values.put(DownloadModel.URL, model.getUrl());
						            values.put(DownloadModel.ETAG, model.getETag());
						            values.put(DownloadModel.DIR_PATH, model.getDirPath());
						            values.put(DownloadModel.FILE_NAME, model.getFileName());
						            values.put(DownloadModel.TOTAL_BYTES, model.getTotalBytes());
						            values.put(DownloadModel.DOWNLOADED_BYTES, model.getDownloadedBytes());
						            values.put(DownloadModel.LAST_MODIFIED_AT, model.getLastModifiedAt());
						            db.update(TABLE_NAME, values, DownloadModel.ID + " = ? ",
						                    new String[]{String.valueOf(model.getId())});
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public void updateProgress(int id, long downloadedBytes, long lastModifiedAt) {
				        try {
						            ContentValues values = new ContentValues();
						            values.put(DownloadModel.DOWNLOADED_BYTES, downloadedBytes);
						            values.put(DownloadModel.LAST_MODIFIED_AT, lastModifiedAt);
						            db.update(TABLE_NAME, values, DownloadModel.ID + " = ? ",
						                    new String[]{String.valueOf(id)});
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public void remove(int id) {
				        try {
						            db.execSQL("DELETE FROM " + TABLE_NAME + " WHERE " +
						                    DownloadModel.ID + " = " + id);
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public List<DownloadModel> getUnwantedModels(int days) {
				        List<DownloadModel> models = new ArrayList<>();
				        android.database.Cursor cursor = null;
				        try {
						            final long daysInMillis = days * 24 * 60 * 60 * 1000L;
						            final long beforeTimeInMillis = System.currentTimeMillis() - daysInMillis;
						            cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " +
						                    DownloadModel.LAST_MODIFIED_AT + " <= " + beforeTimeInMillis, null);
						            if (cursor != null && cursor.moveToFirst()) {
								                do {
										                    DownloadModel model = new DownloadModel();
										                    model.setId(cursor.getInt(cursor.getColumnIndex(DownloadModel.ID)));
										                    model.setUrl(cursor.getString(cursor.getColumnIndex(DownloadModel.URL)));
										                    model.setETag(cursor.getString(cursor.getColumnIndex(DownloadModel.ETAG)));
										                    model.setDirPath(cursor.getString(cursor.getColumnIndex(DownloadModel.DIR_PATH)));
										                    model.setFileName(cursor.getString(cursor.getColumnIndex(DownloadModel.FILE_NAME)));
										                    model.setTotalBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.TOTAL_BYTES)));
										                    model.setDownloadedBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.DOWNLOADED_BYTES)));
										                    model.setLastModifiedAt(cursor.getLong(cursor.getColumnIndex(DownloadModel.LAST_MODIFIED_AT)));
										                    models.add(model);
										                } while (cursor.moveToNext());
								            }
						        } catch (Exception e) {
						            e.printStackTrace();
						        } finally {
						            if (cursor != null) {
								                cursor.close();
								            }
						        }
				        return models;
				    }
		    @Override
		    public void clear() {
				        try {
						            db.delete(TABLE_NAME, null, null);
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
	}
	
	public static class DatabaseOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
		    private static final String DATABASE_NAME = "prdownloader.db";
		    private static final int DATABASE_VERSION = 1;
		    DatabaseOpenHelper(Context context) {
				        super(context, DATABASE_NAME, null, DATABASE_VERSION);
				    }
		    @Override
		    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
				        db.execSQL("CREATE TABLE IF NOT EXISTS " +
				                AppDbHelper.TABLE_NAME + "( " +
				                DownloadModel.ID + " INTEGER PRIMARY KEY, " +
				                DownloadModel.URL + " VARCHAR, " +
				                DownloadModel.ETAG + " VARCHAR, " +
				                DownloadModel.DIR_PATH + " VARCHAR, " +
				                DownloadModel.FILE_NAME + " VARCHAR, " +
				                DownloadModel.TOTAL_BYTES + " INTEGER, " +
				                DownloadModel.DOWNLOADED_BYTES + " INTEGER, " +
				                DownloadModel.LAST_MODIFIED_AT + " INTEGER " +
				                ")");
				    }
		    @Override
		    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int i, int i1) {
				    }
	}
	
	public static interface DbHelper {
		    DownloadModel find(int id);
		    void insert(DownloadModel model);
		    void update(DownloadModel model);
		    void updateProgress(int id, long downloadedBytes, long lastModifiedAt);
		    void remove(int id);
		    List<DownloadModel> getUnwantedModels(int days);
		    void clear();
	}
	
	
	public static class NoOpsDbHelper implements DbHelper {
		    public NoOpsDbHelper() {
				    }
		    @Override
		    public DownloadModel find(int id) {
				        return null;
				    }
		    @Override
		    public void insert(DownloadModel model) {
				    }
		    @Override
		    public void update(DownloadModel model) {
				    }
		    @Override
		    public void updateProgress(int id, long downloadedBytes, long lastModifiedAt) {
				    }
		    @Override
		    public void remove(int id) {
				    }
		    @Override
		    public List<DownloadModel> getUnwantedModels(int days) {
				        return null;
				    }
		    @Override
		    public void clear() {
				    }
	}
	
	public static class DownloadFutureTask extends java.util.concurrent.FutureTask<DownloadRunnable> implements Comparable<DownloadFutureTask> {
		    private final DownloadRunnable runnable;
		    DownloadFutureTask(DownloadRunnable downloadRunnable) {
				        super(downloadRunnable, null);
				        this.runnable = downloadRunnable;
				    }
		    @Override
		    public int compareTo(DownloadFutureTask other) {
				        Priority p1 = runnable.priority;
				        Priority p2 = other.runnable.priority;
				        return (p1 == p2 ? runnable.sequence - other.runnable.sequence : p2.ordinal() - p1.ordinal());
				    }
	}
	
	public static class DownloadExecutor extends java.util.concurrent.ThreadPoolExecutor {
		    DownloadExecutor(int maxNumThreads, java.util.concurrent.ThreadFactory threadFactory) {
				        super(maxNumThreads, maxNumThreads, 0, java.util.concurrent.TimeUnit.MILLISECONDS,
				                new java.util.concurrent.PriorityBlockingQueue<Runnable>(), threadFactory);
				    }
		    @Override
		    public java.util.concurrent.Future<?> submit(Runnable task) {
				        DownloadFutureTask futureTask = new DownloadFutureTask((DownloadRunnable) task);
				        execute(futureTask);
				        return futureTask;
				    }
	}
	{
	}
	
	
	public void _lib2() {
	}
	private int downloadId;
	private static String dirPath;
	public static final class Utilss {
		    private Utilss() {
			    }
		    public static String getRootDirPath(Context context) {
			        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
				           // java.io.File file = context.getExternalFilesDirs(context.getApplicationContext(), null)[0];
				           // return file.getAbsolutePath();
				            return context.getApplicationContext().getFilesDir().getAbsolutePath();
				        } else {
				            return context.getApplicationContext().getFilesDir().getAbsolutePath();
				        }
			    }
		    public static String getProgressDisplayLine(long currentBytes, long totalBytes) {
			        return getBytesToMBString(currentBytes) + "/" + getBytesToMBString(totalBytes);
			    }
		    private static String getBytesToMBString(long bytes){
			        return String.format(Locale.ENGLISH, "", bytes / (1024.00 * 1024.00));
			    }
	}
	{
	}
	
	
	public void _status_bar_color(final String _colour1, final String _colour2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
			   Window w = this.getWindow(); w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			   w.setStatusBarColor(Color.parseColor(_colour1)); w.setNavigationBarColor(Color.parseColor(_colour2));
		}
	}
	
	
	public void _Apk_init() {
		package_name = "app.rvx.android.youtube";
		mg_package_name = "com.mgoogle.android.gms";
		manager_package_name = "com.project.miracle.raw";
		rvm_package_name = "app.rvx.android.apps.youtube.music";
		
		ApkUtils apk = new ApkUtils(ManagerActivity.this);
		try{
			apk.setPackageName(package_name);
		}catch(Exception e){
			 
		}
		Sha256Ytm = apk.getSHA256();
		VersionCodeYtm = apk.getVersionName();
		if (VersionCodeYtm.equals("null")) {
			textview9.setText("YouTube Miracle Not Installed !!");
		}
		else {
			if (Sha256Ytm.equals("301a91e1fb5ec0d3462d6f6134b9f2d9b6dfed4d998c24ee04529c3dd7553c67".toUpperCase())) {
				textview9.setText(VersionCodeYtm);
				linear78.setVisibility(View.VISIBLE);
				imageview2.setImageDrawable(apk.getIcon());
			}
			else {
				textview9.setText("Official Application Not Found !!");
			}
		}
		ApkUtils qapk = new ApkUtils(ManagerActivity.this);
		try{
			qapk.setPackageName(rvm_package_name);
		}catch(Exception e){
			 
		}
		Sha256Rvm = qapk.getSHA256();
		VersionCodeRvm = qapk.getVersionName();
		if (VersionCodeRvm.equals("null")) {
			textview50.setText("Rvm Music Not Installed !!");
		}
		else {
			if (Sha256Rvm.equals("301a91e1fb5ec0d3462d6f6134b9f2d9b6dfed4d998c24ee04529c3dd7553c67".toUpperCase())) {
				textview50.setText(VersionCodeRvm);
				linear94.setVisibility(View.VISIBLE);
				imageview13.setImageDrawable(qapk.getIcon());
			}
			else {
				textview50.setText("Official Application Not Found !!");
			}
		}
		try{
			apk.setPackageName(mg_package_name);
		}catch(Exception e){
			 
		}
		MgVersion = apk.getVersionName();
		imageview3.setImageDrawable(apk.getIcon());
		if (MgVersion.equals("null")) {
			textview14.setText("Vanced MicroG Not Installed !!");
		}
		else {
			linear80.setVisibility(View.VISIBLE);
			textview14.setText(MgVersion);
		}
		try{
			apk.setPackageName(manager_package_name);
		}catch(Exception e){
			 
		}
		ManagerVersionCode = apk.getVersionCode();
	}
	
	
	public void _MaterialYou() {
		// Currently Useless
		_function();
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear32.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear49.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear63.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear32.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		edittext1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, getColor("system_accent1_700")));
		linear76.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, getColor("system_accent1_50")));
		linear24.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, getColor("system_accent1_700")));
		linear52.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, getColor("system_accent1_700")));
		linear26.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, getColor("system_accent1_700")));
		linear78.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, getColor("system_accent1_700")));
		linear80.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, getColor("system_accent1_700")));
		textview33.setTextColor(getColor("system_accent1_700"));
		textview8.setTextColor(getColor("system_accent1_700"));
		textview9.setTextColor(getColor("system_accent1_700"));
		textview12.setTextColor(getColor("system_accent1_700"));
		textview36.setTextColor(getColor("system_accent1_700"));
		textview13.setTextColor(getColor("system_accent1_700"));
		textview14.setTextColor(getColor("system_accent1_700"));
		textview15.setTextColor(getColor("system_accent1_700"));
		textview40.setTextColor(getColor("system_accent1_700"));
		linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, getColor("system_accent2_10")));
		vscroll1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, getColor("system_accent2_10")));
		linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, getColor("system_neutral2_10")));
			vscroll1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, getColor("system_neutral2_10")));
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =ManagerActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(getColor("system_neutral2_10"));
			}
		_function();
		Window w = this.getWindow(); w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(getColor("system_neutral2_10"));
	}
	
	
	public void _ResponseHandler() {
		if (!response_data_map.isEmpty()) {
			try{
				textview8.setText(response_data_map.get("YTM_Latest_Version").toString());
				textview12.setText(response_data_map.get("YTM_Latest_Release_Date").toString().concat(" , ".concat(response_data_map.get("YTM_Latest_Release_Time").toString())));
				textview36.setText(response_data_map.get("YTM_Latest_CodeName").toString());
				textview49.setText(response_data_map.get("RVM_Latest_Version").toString());
				textview51.setText(response_data_map.get("RVM_Latest_Release_Date").toString().concat(" , ".concat(response_data_map.get("RVM_Latest_Release_Time").toString())));
				textview52.setText(response_data_map.get("RVM_Latest_CodeName").toString());
				textview13.setText(response_data_map.get("MG_Latest_Version").toString());
				textview15.setText(response_data_map.get("MG_Latest_Release_Date").toString().concat(" , ".concat(response_data_map.get("MG_Latest_Release_Time").toString())));
				update = Double.parseDouble(response_data_map.get("Manager_Latest_Version_Code").toString());
				DownloadYTMCustIcon = response_data_map.get("YTM_Latest_Download_Link").toString();
				DownloadMG = response_data_map.get("MG_Latest_Download_Link").toString();
				DownloadRVM = response_data_map.get("RVM_Latest_Download_Link").toString();
				if (update > Double.parseDouble(ManagerVersionCode)) {
					linear55.setVisibility(View.VISIBLE);
					imageview9.setVisibility(View.GONE);
					MaterialAlertDialogBuilder updt = new MaterialAlertDialogBuilder(ManagerActivity.this);
					updt.setTitle("An update is available");
					updt.setMessage("A new version of Miracle Manager is published please update your application. 😉");
					updt.setIcon(R.drawable.ic_arrow_update);
					updt.setPositiveButton("Update", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							intent.setAction(Intent.ACTION_VIEW);
							intent.setClass(getApplicationContext(), UpdaterActivity.class);
							intent.putExtra("ManagerVersion", ManagerVersionCode);
							startActivity(intent);
						}
					});
					updt.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							finish();
						}
					});
					updt.setCancelable(false);
					updt.create().show();
				}
				if (response_data_map.get("Show_Download_Box").toString().equals("true")) {
					if (YTM_Drop_Vis == 1) {
						linear71.setVisibility(View.VISIBLE);
					}
					Dn_Box_Vis = 1;
				}
				if (response_data_map.get("Custom_Greeting_Message_Bool").toString().equals("true")) {
					textview32.setText(response_data_map.get("Custom_Greeting_Message").toString());
				}
				if (!(VersionCodeYtm.equals("null") && MgVersion.equals("null"))) {
					if (!VersionCodeYtm.equals(response_data_map.get("YTM_Latest_Version").toString()) && !MgVersion.equals(response_data_map.get("MG_Latest_Version").toString())) {
						linear67.setVisibility(View.VISIBLE);
						linear76.setVisibility(View.VISIBLE);
						textview42.setText("Please Update YouTube Miracle & Vanced MicroG !!");
						textview21.setText("Update YouTube Miracle");
						textview22.setText("Update Vanced MicroG");
					}
				}
				if (!VersionCodeYtm.equals("null")) {
					if (!VersionCodeYtm.equals(response_data_map.get("YTM_Latest_Version").toString())) {
						linear67.setVisibility(View.VISIBLE);
						linear76.setVisibility(View.VISIBLE);
						textview42.setText("Please Update YouTube Miracle !!");
						textview21.setText("Update YouTube Miracle");
						textview22.setText("Install Vanced MicroG");
					}
					if (!MgVersion.equals("null")) {
						if (!MgVersion.equals(response_data_map.get("MG_Latest_Version").toString())) {
							linear67.setVisibility(View.VISIBLE);
							linear76.setVisibility(View.VISIBLE);
							textview42.setText("Please Update Vanced MicroG !!");
							textview22.setText("Update Vanced MicroG");
							textview21.setText("Install YouTube Miracle");
						}
					}
				}
				if (!VersionCodeRvm.equals("null")) {
					if (!VersionCodeRvm.equals(response_data_map.get("RVM_Latest_Version").toString())) {
						linear99.setVisibility(View.VISIBLE);
						linear100.setVisibility(View.VISIBLE);
						textview54.setText("Please Update RVM Music !!");
					}
				}
			}catch(Exception e){
				SketchwareUtil.showMessage(getApplicationContext(), "Unable to load data from server !!");
			}
		}
	}
	
	
	public void _Download_Initialise() {
		FileUtil.writeFile("t", "t");
		if (!(isDownloading == 1)) {
			PRDownloaderConfig config = PRDownloaderConfig.newBuilder()
				.setDatabaseEnabled(true)
				.build();
			PRDownloader.initialize(ManagerActivity.this, config);
			linear24.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
						if (Status.RUNNING == PRDownloader.getStatus(downloadId)) {
								PRDownloader.pause(downloadId);
								return;
						}
						progressbar2.getIndeterminateDrawable().setColorFilter(Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
						if (Status.PAUSED == PRDownloader.getStatus(downloadId)) {
								PRDownloader.resume(downloadId);
								return;
						}
						downloadId = PRDownloader.download(DownloadYTMCustIcon
					, "/storage/emulated/0/TeamMiracle", "YouTube_Miracle_".concat(response_data_map.get("YTM_Latest_Version").toString()).concat(".apk"))
							.build()
							.setOnStartOrResumeListener(new OnStartOrResumeListener() {
									@Override
									public void onStartOrResume() {
									}
						})
						.setOnPauseListener(new OnPauseListener() {
								@Override
								public void onPause() {
								}
						})
						.setOnCancelListener(new OnCancelListener() {
								@Override
								public void onCancel() {
								}
						})
						.setOnProgressListener(new OnProgressListener() {
								@Override
								public void onProgress(Progress progress) {
							long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
							isDownloading = 1;
							YtmFinalSaveName = "YouTube_Miracle_".concat(response_data_map.get("YTM_Latest_Version").toString()).concat(".apk");
							progressbar2.setProgress((int)(int) progressPercent);
							textview31.setText(String.valueOf((long)((int) progressPercent)).concat(" ".concat("%")));
							textview40.setText(YtmFinalSaveName);
							linear32.setVisibility(View.VISIBLE);
							linear20.setVisibility(View.VISIBLE);
							linear26.setVisibility(View.GONE);
							linear96.setVisibility(View.GONE);
							linear24.setVisibility(View.GONE);
									
								}
						})
						.start(new OnDownloadListener() {
								@Override
								public void onDownloadComplete() {
							isDownloading = 0;
							linear20.setVisibility(View.GONE);
							linear32.setVisibility(View.GONE);
							linear31.setVisibility(View.VISIBLE);
							linear63.setVisibility(View.VISIBLE);
							FileUtil.writeFile("t", "t");
							try {
								if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
														Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
																ManagerActivity.this.getPackageName() + ".provider", new java.io.File("/storage/emulated/0/TeamMiracle/".concat(YtmFinalSaveName)));
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
														intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														intent.setDataAndType(uri, "application/vnd.android.package-archive");
														startActivity(intent);
									
												} else {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.setDataAndType(Uri.fromFile( new java.io.File("/storage/emulated/0/TeamMiracle/".concat(YtmFinalSaveName))),
																"application/vnd.android.package-archive");
														intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														startActivity(intent);
												}
								
							} catch (Exception rr) {
								showMessage (rr.toString());
							}
							TastyToast.makeText(getApplicationContext(), YtmFinalSaveName+" Downloaded Successfully And Saved To /storage/emulated/0/TeamMiracle", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
							hide_str_loc_tim = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											linear31.setVisibility(View.GONE);
											linear63.setVisibility(View.GONE);
										}
									});
								}
							};
							_timer.schedule(hide_str_loc_tim, (int)(15000));
							linear26.setVisibility(View.VISIBLE);
							linear96.setVisibility(View.VISIBLE);
							linear24.setVisibility(View.VISIBLE);
							linear26.setVisibility(View.VISIBLE);
								}
								@Override
								public void onError(Error error) {
								}
						});
				}
			});
			linear62.setOnClickListener(new View.OnClickListener() {
				@Override public void onClick(View view) {
					PRDownloader.cancel(downloadId);
				}
			});
		}
		else {
			TastyToast.makeText(getApplicationContext(), "A another file is already downloading. Please download new file after finish the downloa", TastyToast.LENGTH_LONG, TastyToast.WARNING);
		}
		if (!(isDownloading == 1)) {
			PRDownloaderConfig config = PRDownloaderConfig.newBuilder()
				.setDatabaseEnabled(true)
				.build();
			PRDownloader.initialize(ManagerActivity.this, config);
			linear26.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
						if (Status.RUNNING == PRDownloader.getStatus(downloadId)) {
								PRDownloader.pause(downloadId);
								return;
						}
						progressbar2.getIndeterminateDrawable().setColorFilter(Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
						if (Status.PAUSED == PRDownloader.getStatus(downloadId)) {
								PRDownloader.resume(downloadId);
								return;
						}
						downloadId = PRDownloader.download(DownloadMG
					, "/storage/emulated/0/TeamMiracle", "MicroG.apk")
							.build()
							.setOnStartOrResumeListener(new OnStartOrResumeListener() {
									@Override
									public void onStartOrResume() {
									}
						})
						.setOnPauseListener(new OnPauseListener() {
								@Override
								public void onPause() {
								}
						})
						.setOnCancelListener(new OnCancelListener() {
								@Override
								public void onCancel() {
								}
						})
						.setOnProgressListener(new OnProgressListener() {
								@Override
								public void onProgress(Progress progress) {
							long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
							isDownloading = 1;
							progressbar2.setProgress((int)(int) progressPercent);
							textview31.setText(String.valueOf((long)((int) progressPercent)).concat(" ".concat("%")));
							textview40.setText("MicroG.apk");
							linear32.setVisibility(View.VISIBLE);
							linear24.setVisibility(View.INVISIBLE);
							linear20.setVisibility(View.VISIBLE);
							linear26.setVisibility(View.GONE);
							linear96.setVisibility(View.GONE);
							linear24.setVisibility(View.GONE);
									
								}
						})
						.start(new OnDownloadListener() {
								@Override
								public void onDownloadComplete() {
							isDownloading = 0;
							linear32.setVisibility(View.GONE);
							linear63.setVisibility(View.VISIBLE);
							linear31.setVisibility(View.VISIBLE);
							FileUtil.writeFile("t", "t");
							try {
								if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
														Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
																ManagerActivity.this.getPackageName() + ".provider", new java.io.File("/storage/emulated/0/TeamMiracle/".concat("MicroG.apk")));
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
														intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														intent.setDataAndType(uri, "application/vnd.android.package-archive");
														startActivity(intent);
									
												} else {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.setDataAndType(Uri.fromFile( new java.io.File("/storage/emulated/0/TeamMiracle/".concat("MicroG.apk"))),
																"application/vnd.android.package-archive");
														intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														startActivity(intent);
												}
								
							} catch (Exception rr) {
								showMessage (rr.toString());
							}
							TastyToast.makeText(getApplicationContext(), "MicroG Downloaded Successfully And Saved To /storage/emulated/0/TeamMiracle", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
							hide_str_loc_tim = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											linear31.setVisibility(View.GONE);
											linear63.setVisibility(View.GONE);
										}
									});
								}
							};
							_timer.schedule(hide_str_loc_tim, (int)(15000));
							linear24.setVisibility(View.VISIBLE);
							linear20.setVisibility(View.GONE);
							linear26.setVisibility(View.VISIBLE);
							linear96.setVisibility(View.VISIBLE);
							linear24.setVisibility(View.VISIBLE);
								}
								@Override
								public void onError(Error error) {
								}
						});
				}
			});
			linear74.setOnClickListener(new View.OnClickListener() {
				@Override public void onClick(View view) {
					PRDownloader.cancel(downloadId);
				}
			});
		}
		else {
			TastyToast.makeText(getApplicationContext(), "A another file is already downloading. Please download new file after finish the downloa", TastyToast.LENGTH_LONG, TastyToast.WARNING);
		}
		if (!(isDownloading == 1)) {
			PRDownloaderConfig config = PRDownloaderConfig.newBuilder()
				.setDatabaseEnabled(true)
				.build();
			PRDownloader.initialize(ManagerActivity.this, config);
			linear96.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
						if (Status.RUNNING == PRDownloader.getStatus(downloadId)) {
								PRDownloader.pause(downloadId);
								return;
						}
						progressbar2.getIndeterminateDrawable().setColorFilter(Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
						if (Status.PAUSED == PRDownloader.getStatus(downloadId)) {
								PRDownloader.resume(downloadId);
								return;
						}
						downloadId = PRDownloader.download(DownloadRVM
					, "/storage/emulated/0/TeamMiracle", "ReVanced_Music_".concat(response_data_map.get("RVM_Latest_Version").toString()).concat(".apk"))
							.build()
							.setOnStartOrResumeListener(new OnStartOrResumeListener() {
									@Override
									public void onStartOrResume() {
									}
						})
						.setOnPauseListener(new OnPauseListener() {
								@Override
								public void onPause() {
								}
						})
						.setOnCancelListener(new OnCancelListener() {
								@Override
								public void onCancel() {
								}
						})
						.setOnProgressListener(new OnProgressListener() {
								@Override
								public void onProgress(Progress progress) {
							long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
							isDownloading = 1;
							RVM_Final_Save_Name = "ReVanced_Music_".concat(response_data_map.get("RVM_Latest_Version").toString()).concat(".apk");
							progressbar2.setProgress((int)(int) progressPercent);
							textview31.setText(String.valueOf((long)((int) progressPercent)).concat(" ".concat("%")));
							textview40.setText(RVM_Final_Save_Name);
							linear32.setVisibility(View.VISIBLE);
							linear24.setVisibility(View.INVISIBLE);
							linear20.setVisibility(View.VISIBLE);
							linear26.setVisibility(View.GONE);
							linear96.setVisibility(View.GONE);
							linear24.setVisibility(View.GONE);
									
								}
						})
						.start(new OnDownloadListener() {
								@Override
								public void onDownloadComplete() {
							isDownloading = 0;
							linear32.setVisibility(View.GONE);
							linear63.setVisibility(View.VISIBLE);
							linear31.setVisibility(View.VISIBLE);
							FileUtil.writeFile("t", "t");
							try {
								if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
														Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
																ManagerActivity.this.getPackageName() + ".provider", new java.io.File("/storage/emulated/0/TeamMiracle/".concat(RVM_Final_Save_Name)));
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
														intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														intent.setDataAndType(uri, "application/vnd.android.package-archive");
														startActivity(intent);
									
												} else {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.setDataAndType(Uri.fromFile( new java.io.File("/storage/emulated/0/TeamMiracle/".concat(RVM_Final_Save_Name))),
																"application/vnd.android.package-archive");
														intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														startActivity(intent);
												}
								
							} catch (Exception rr) {
								showMessage (rr.toString());
							}
							TastyToast.makeText(getApplicationContext(), RVM_Final_Save_Name + " Downloaded Successfully And Saved To /storage/emulated/0/TeamMiracle", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
							hide_str_loc_tim = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											linear31.setVisibility(View.GONE);
											linear63.setVisibility(View.GONE);
										}
									});
								}
							};
							_timer.schedule(hide_str_loc_tim, (int)(15000));
							linear24.setVisibility(View.VISIBLE);
							linear20.setVisibility(View.GONE);
							linear26.setVisibility(View.VISIBLE);
							linear96.setVisibility(View.VISIBLE);
							linear24.setVisibility(View.VISIBLE);
								}
								@Override
								public void onError(Error error) {
								}
						});
				}
			});
			linear75.setOnClickListener(new View.OnClickListener() {
				@Override public void onClick(View view) {
					PRDownloader.cancel(downloadId);
				}
			});
		}
		else {
			TastyToast.makeText(getApplicationContext(), "A another file is already downloading. Please download new file after finish the downloa", TastyToast.LENGTH_LONG, TastyToast.WARNING);
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
	
	
	public void _telegramLoaderDialog(final boolean _visibility) {
		if (_visibility) {
			isVisible = true;
			if (coreprog == null){
				coreprog = new ProgressDialog(this);
				coreprog.setCancelable(false);
				coreprog.setCanceledOnTouchOutside(false);
				
				coreprog.requestWindowFeature(Window.FEATURE_NO_TITLE);  coreprog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
				
			}
			coreprog.show();
			coreprog.setContentView(R.layout.loading);
			
			
			LinearLayout linear2 = (LinearLayout)coreprog.findViewById(R.id.linear2);
			
			LinearLayout background = (LinearLayout)coreprog.findViewById(R.id.background);
			
			LinearLayout layout_progress = (LinearLayout)coreprog.findViewById(R.id.layout_progress);
			
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); 
			gd.setColor(Color.parseColor("#E0E0E0")); /* color */
			gd.setCornerRadius(40); /* radius */
			gd.setStroke(0, Color.WHITE); /* stroke heigth and color */
			linear2.setBackground(gd);
			
			RadialProgressView progress = new RadialProgressView(this);
			layout_progress.addView(progress);
		}
		else {
			isVisible = false;
			if (coreprog != null){
				coreprog.dismiss();
			}
		}
	}
	private ProgressDialog coreprog;
	{
	}
	
	
	public void _RefreshData() {
		_Apk_init();
		HitRequest.startRequestNetwork(RequestNetworkController.GET, api, "a", _HitRequest_request_listener);
		_telegramLoaderDialog(true);
	}
	
	
	public void _SetVisibilty() {
		linear20.setVisibility(View.GONE);
		linear51.setVisibility(View.GONE);
		linear32.setVisibility(View.GONE);
		linear55.setVisibility(View.GONE);
		linear71.setVisibility(View.GONE);
		linear73.setVisibility(View.GONE);
		linear63.setVisibility(View.GONE);
		linear67.setVisibility(View.GONE);
		linear76.setVisibility(View.GONE);
		linear31.setVisibility(View.GONE);
		linear78.setVisibility(View.INVISIBLE);
		linear80.setVisibility(View.INVISIBLE);
		linear94.setVisibility(View.INVISIBLE);
		linear93.setVisibility(View.GONE);
		linear99.setVisibility(View.GONE);
		linear100.setVisibility(View.GONE);
		linear107.setVisibility(View.GONE);
		linear108.setVisibility(View.GONE);
		linear87.setVisibility(View.GONE);
		linear93.setVisibility(View.GONE);
		linear10.setVisibility(View.GONE);
		linear73.setVisibility(View.GONE);
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