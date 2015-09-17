package jdebu.github.io.viewpagerexample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SlideElement extends Fragment {

    public static final String NUM_ELEMENT = "page";
    int numElemet;
    public SlideElement() {
        // Required empty public constructor
    }
    public SlideElement(int numElemet){
        Bundle args= new Bundle();
        args.putInt(NUM_ELEMENT,numElemet);
        this.setArguments(args);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numElemet= getArguments().getInt(NUM_ELEMENT);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_slide_element, container, false);
        ((TextView)rootView.findViewById(android.R.id.text1))
                .setText(getString(R.string.title_template_step, numElemet + 1));
        return rootView;
    }



    public int getNumElemet() {
        return numElemet;
    }
}
