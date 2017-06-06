package com.example.moryta.demonavigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.moryta.demonavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment implements View.OnClickListener {

    private EditText etValue1;
    private EditText etValue2;
    private TextView tvResult;

    private Button btAdd;
    private Button btSubtract;
    private Button btTimes;
    private Button btDivide;

    private int result;

    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);

        etValue1 = (EditText) itemView.findViewById(R.id.etValue1);
        etValue2 = (EditText) itemView.findViewById(R.id.etValue2);
        tvResult = (TextView) itemView.findViewById(R.id.tvResult);
        btAdd = (Button) itemView.findViewById(R.id.btAdd);
        btSubtract = (Button) itemView.findViewById(R.id.btSubtract);
        btTimes = (Button) itemView.findViewById(R.id.btTimes);
        btDivide = (Button) itemView.findViewById(R.id.btDivide);

        btAdd.setOnClickListener(this);
        btSubtract.setOnClickListener(this);
        btTimes.setOnClickListener(this);
        btDivide.setOnClickListener(this);

        return itemView;
    }

    public void add(View view) {
        result = Integer.valueOf(etValue1.getText().toString())
                + Integer.valueOf(etValue2.toString().toString());
        tvResult.setText(result);
    }

    public void subtract(View view) {
        result = Integer.valueOf(etValue1.getText().toString())
                - Integer.valueOf(etValue2.toString().toString());
        tvResult.setText(result);
    }

    public void times(View view) {
        result = Integer.valueOf(etValue1.getText().toString())
                * Integer.valueOf(etValue2.toString().toString());
        tvResult.setText(result);
    }

    public void divide(View view) {
        result = Integer.valueOf(etValue1.getText().toString())
                / Integer.valueOf(etValue2.toString().toString());
        tvResult.setText(result);
    }

    @Override
    public void onClick(View v) {
        int value1 = Integer.valueOf(etValue1.getText().toString());
        int value2 = Integer.valueOf(etValue2.getText().toString());
        int result = 0;

        switch (v.getId()) {
            case R.id.btAdd:
                result = value1 + value2;
                break;
            case R.id.btSubtract:
                result = value1 - value2;
                break;
            case R.id.btTimes:
                result = value1 * value2;
                break;
            case R.id.btDivide:
                result = value1 / value2;
                break;
        }

        tvResult.setText(String.valueOf(result));
    }
}
