package com.pzm.pizzera.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.pzm.pizzera.BaseFragment;
import com.pzm.pizzera.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment {

	public HomeFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_home, container, false);
	}
}
