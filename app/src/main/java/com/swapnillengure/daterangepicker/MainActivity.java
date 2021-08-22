package com.swapnillengure.daterangepicker;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

import com.swapnillengure.daterangepickerlibrary.CalendarPickerView;
import com.swapnillengure.daterangepickerlibrary.CalenderRange;
import com.swapnillengure.daterangepickerlibrary.DateSelectListener;
import com.swapnillengure.daterangepickerlibrary.SubTitle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.get_selected_dates).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalenderRange.CalenderInit(MainActivity.this, new DateSelectListener() {
                    @Override
                    public void onItemClick(List<Date> dateList) {
                        Toast.makeText(MainActivity.this, "list " + dateList.toString(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
