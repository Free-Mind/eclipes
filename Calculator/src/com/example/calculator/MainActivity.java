package com.example.calculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
	public Button bt_1;
	public Button bt_2;
	public Button bt_3;
	public Button bt_4;
	public Button bt_5;
	public Button bt_6;
	public Button bt_7;
	public Button bt_8;
	public Button bt_9;
	public Button bt_0;
	public Button bt_add;
	public Button bt_sub;
	public Button bt_multiply;
	public Button bt_divide;
	public Button bt_back;
	public Button bt_equal;
	public Button bt_point;
	public Button bt_clear;
	public EditText et_play;
	
	public String str_oper="+";
	public StringBuffer str_display=new StringBuffer();
	public String str_result;
	public double num1;
	public double num2;
	public boolean flag =true;
	
	public boolean b_sub,b_mul,b_div;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt_0 = (Button) findViewById(R.id.bt_0);
		bt_1 = (Button) findViewById(R.id.bt_1);
		bt_2 = (Button) findViewById(R.id.bt_2);
		bt_3 = (Button) findViewById(R.id.bt_3);
		bt_4 = (Button) findViewById(R.id.bt_4);
		bt_5 = (Button) findViewById(R.id.bt_5);
		bt_6 = (Button) findViewById(R.id.bt_6);
		bt_7 = (Button) findViewById(R.id.bt_7);
		bt_8 = (Button) findViewById(R.id.bt_8);
		bt_9 = (Button) findViewById(R.id.bt_9);
		bt_add = (Button) findViewById(R.id.bt_add);
		bt_sub = (Button) findViewById(R.id.bt_sub);
		bt_multiply = (Button) findViewById(R.id.bt_multiply);
		bt_divide = (Button) findViewById(R.id.bt_divide);
		bt_back = (Button) findViewById(R.id.bt_back);
		bt_point = (Button) findViewById(R.id.bt_point);
		bt_clear = (Button) findViewById(R.id.bt_clear);
		et_play = (EditText) findViewById(R.id.et);
		bt_equal = (Button) findViewById(R.id.bt_equal);
		et_play.setText("0.0");
		
		bt_0.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("0");
				et_play.setText(str_display.toString());
			}
		});
		bt_1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("1");
				et_play.setText(str_display.toString());
			}
		});
		bt_2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("2");
				et_play.setText(str_display.toString());
			}
		});
		bt_3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("3");
				et_play.setText(str_display.toString());
			}
		});
		bt_4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("4");
				et_play.setText(str_display.toString());
			}
		});
		bt_5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("5");
				et_play.setText(str_display.toString());
			}
		});
		bt_6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("6");
				et_play.setText(str_display.toString());
			}
		});
		bt_7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("7");
				et_play.setText(str_display.toString());
			}
		});
		bt_8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("8");
				et_play.setText(str_display.toString());
			}
		});
		bt_9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_display.append("9");
				et_play.setText(str_display.toString());
			}
		});
		bt_point.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(flag){
						str_display.append(".");
						flag=false;
				}
			}
		});
		bt_back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(str_display.length() !=0){
					str_display.deleteCharAt(str_display.length() - 1);
					et_play.setText(str_display.toString());
				}
			}
		});
		bt_add.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_oper="+";
				if(!(str_display.toString() == "")){
					num1 += Double.parseDouble(str_display.toString());
					str_display = new StringBuffer("");
				}
				if(!(str_result == null)){
					num1 = Double.parseDouble(str_result);
					str_result = null;
				}
				et_play.setText(String.valueOf(num1));
				flag = true;
			}
		});
		bt_sub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_oper = "-";
				if(!b_sub && !(str_display.toString()=="")){
					num1 = Double.parseDouble(str_display.toString());
					et_play.setText(String.valueOf(num1));
					str_display=new StringBuffer("");
					b_sub=true;
				}else{
					if(!(str_display.toString() == "")){
						num1 -= Double.parseDouble(str_display.toString());
						str_display = new StringBuffer("");
					}
					if(!(str_result==null)){
						num1 = Double.parseDouble(str_result);
						str_result = null;
					}
					et_play.setText(String.valueOf(num1));
				}
				flag = true;
			}
		});
		bt_multiply.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_oper="*";
				if(!b_mul && !(str_display.toString()=="")){
					num1 = Double.parseDouble(str_display.toString());
					et_play.setText(String.valueOf(num1));
					str_display = new StringBuffer("");
					b_mul = true;
				}else{
					if(!(str_display.toString()=="")){
						num1 *=Double.parseDouble(str_display.toString());
						str_display = new StringBuffer();
					}
					if(!(str_result==null)){
						num1 = Double.parseDouble(str_result);
						str_result = null;
					}
					et_play.setText(String.valueOf(num1));
				}
				flag = true;
			}
		});
		bt_divide.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_oper = "/";
				if(!b_div && !(str_display.toString() == "")){
					num1 = Double.parseDouble(str_display.toString());
					et_play.setText(String.valueOf(num1));
					str_display = new StringBuffer("");
					b_div = true;
				}else{
					if(!(str_display.toString()=="")){
						if(Double.parseDouble(str_display.toString())==0){
							System.out.println("除数不能为零!");
						}
						else{
							num1 /=Double.parseDouble(str_display.toString());
							str_display=new StringBuffer("");
						}
					}
					if(!(str_result==null)){
						num1 = Double.parseDouble(str_result);
						str_result=null;
					}
					et_play.setText(String.valueOf(num1));
				}
				flag = true;
			}
		} );
		bt_clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str_oper = "+";
				str_display=new StringBuffer("");
				str_result=null;
				num1=0;
				num2=0;
				flag=true;
				b_sub=false;
				b_mul=false;
				b_div=false;
				et_play.setText("0.0");
			}
		});
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
