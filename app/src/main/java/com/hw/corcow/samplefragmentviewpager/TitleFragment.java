package com.hw.corcow.samplefragmentviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TitleFragment extends Fragment {

    public static final String ARGS_TITLE = "title";

    public static TitleFragment newInstance(String title) {
        TitleFragment f = new TitleFragment();
        Bundle b = new Bundle();
        b.putString(ARGS_TITLE, title);
        f.setArguments(b);
        return f;
    }

    public TitleFragment() {
        // Required empty public constructor

    }

    String mTitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arg = getArguments();
        if (arg != null) {
            mTitle = arg.getString(ARGS_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_title, container, false);
        TextView tv = (TextView)view.findViewById(R.id.text_title);
        tv.setText(mTitle);

        return view;
    }


}
