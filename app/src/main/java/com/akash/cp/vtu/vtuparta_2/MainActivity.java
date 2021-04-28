package com.akash.cp.vtu.vtuparta_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

@SuppressWarnings("all")
public class MainActivity extends AppCompatActivity implements Base {

    Button mButtonZero, mButtonOne, mButtonTwo, mButtonThree, mButtonFour, mButtonFive, mButtonSix,
            mButtonSeven, mButtonEight, mButtonNine, mButtonmAdd, mButtonSub, mButtonDivision,
            mButtonMul, mButtonOne0, mButtonClear, mButtonEqual, mButtonDot;
    EditText mEditText;

    float mValueOne, mValueTwo;

    boolean mAdd, mSub, mMul, mDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listener();

    }

    @Override
    public void init() {
        mButtonZero = (Button) findViewById(R.id.button0);
        mButtonOne = (Button) findViewById(R.id.button1);
        mButtonTwo = (Button) findViewById(R.id.button2);
        mButtonThree = (Button) findViewById(R.id.button3);
        mButtonFour = (Button) findViewById(R.id.button4);
        mButtonFive = (Button) findViewById(R.id.button5);
        mButtonSix = (Button) findViewById(R.id.button6);
        mButtonSeven = (Button) findViewById(R.id.button7);
        mButtonEight = (Button) findViewById(R.id.button8);
        mButtonNine = (Button) findViewById(R.id.button9);
        mButtonDot = (Button) findViewById(R.id.button10);
        mButtonmAdd = (Button) findViewById(R.id.buttonadd);
        mButtonSub = (Button) findViewById(R.id.buttonsub);
        mButtonMul = (Button) findViewById(R.id.buttonmul);
        mButtonDivision = (Button) findViewById(R.id.buttondiv);
        mButtonClear = (Button) findViewById(R.id.buttonC);
        mButtonEqual = (Button) findViewById(R.id.buttoneql);
        mEditText = (EditText) findViewById(R.id.edt1);

    }

    @Override
    public void listener() {
        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "1");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "2");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "3");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "4");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "5");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "6");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "7");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "8");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "9");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + "0");
                cursorPosition(mEditText.getText().toString());
            }
        });

        mButtonmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mEditText.getText() + "");
                    mAdd = true;
                    mEditText.setText(null);
                }
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mEditText.getText() + "");
                mSub = true;
                mEditText.setText(null);
            }
        });

        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mEditText.getText() + "");
                mMul = true;
                mEditText.setText(null);
            }
        });

        mButtonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mEditText.getText() + "");
                mDiv = true;
                mEditText.setText(null);
            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(mEditText.getText() + "");

                if (mAdd) {
                    mEditText.setText(String.format("%.2f", (mValueOne + mValueTwo)) + "");
                    mAdd = false;
                    cursorPosition(mEditText.getText().toString());
                }

                if (mSub) {
                    mEditText.setText(String.format("%.2f", (mValueOne - mValueTwo)) + "");
                    mSub = false;
                    cursorPosition(mEditText.getText().toString());
                }

                if (mMul) {
                    mEditText.setText(String.format("%.2f", (mValueOne * mValueTwo)) + "");
                    mMul = false;
                    cursorPosition(mEditText.getText().toString());
                }

                if (mDiv) {
                    mEditText.setText(String.format("%.2f", (mValueOne / mValueTwo)) + "");
                    mDiv = false;
                    cursorPosition(mEditText.getText().toString());
                }
            }
        });

        mButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText("");
            }
        });

        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText(mEditText.getText() + ".");
                cursorPosition(mEditText.getText().toString());
            }
        });

    }

    private void cursorPosition(String str) {
        mEditText.setSelection(str.length());
    }
}