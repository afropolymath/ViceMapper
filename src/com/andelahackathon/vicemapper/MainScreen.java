package com.andelahackathon.vicemapper;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.andelahackathon.vicemapper.adapter.PlacesAutoCompleteAdapter;

public class MainScreen extends Activity {
	private String fromLocation;
	private String toLocation;
	private Button searchRoutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        
        AutoCompleteTextView fromRoute = (AutoCompleteTextView) findViewById(R.id.fromRoute);
        AutoCompleteTextView toRoute = (AutoCompleteTextView) findViewById(R.id.toRoute);
        
        fromRoute.setAdapter(new PlacesAutoCompleteAdapter(this, R.layout.autocomplete_list_item));
        fromRoute.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
				// TODO Auto-generated method stub
				setFromLocation((String) adapterView.getItemAtPosition(position));
		        //Toast.makeText(adapterView.getContext(), str, Toast.LENGTH_SHORT).show();
			}
        	
		});
        
        toRoute.setAdapter(new PlacesAutoCompleteAdapter(this, R.layout.autocomplete_list_item));
        toRoute.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
				// TODO Auto-generated method stub
				setToLocation((String) adapterView.getItemAtPosition(position));
		        //Toast.makeText(adapterView.getContext(), str, Toast.LENGTH_SHORT).show();
			}
        	
		});
        
        searchRoutes = (Button) findViewById(R.id.searchRoutes);
        searchRoutes.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Post fromLocation and toLocation to direction search API
			}
		});
    }

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
}
