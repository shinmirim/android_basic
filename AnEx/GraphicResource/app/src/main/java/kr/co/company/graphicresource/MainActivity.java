package kr.co.company.graphicresource;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mLinearLayout;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // 리니어 레이아웃을 생성한다
        mLinearLayout = new LinearLayout(this);

        // ImageView 객체를 생성한다
        ImageView i = new ImageView(this);
        i.setImageDrawable(getResources().getDrawable(R.drawable.oval));
        i.setMinimumHeight(500);
        i.setMinimumWidth(500);

        // ImageView를 레이아웃에 추가한다
        mLinearLayout.addView(i);
        setContentView(mLinearLayout);
    }

}