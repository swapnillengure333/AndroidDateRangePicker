package com.swapnillengure.daterangepickerlibrary;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderRange {
    public static void CalenderInit(Activity activity,DateSelectListener dateSelectListener){
        final View loc = activity.getLayoutInflater().inflate(R.layout.dialog_calender, null);
        final Dialog dialog = new Dialog(activity,R.style.AlertDialog);
        dialog.setContentView(loc);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        if (!activity.isFinishing()) {
            dialog.show();
        }
        final Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 10);
        final Calendar lastYear = Calendar.getInstance();
        lastYear.add(Calendar.YEAR, - 10);
        CalendarPickerView calendar  = dialog.findViewById(R.id.calendar_view);;
        calendar.init(lastYear.getTime(), nextYear.getTime(), new SimpleDateFormat("MMMM, YYYY", Locale.getDefault())) //
                .inMode(CalendarPickerView.SelectionMode.RANGE);
        calendar.scrollToDate(new Date());
        CardView get_selected_dates = dialog.findViewById(R.id.get_selected_dates);
        get_selected_dates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                dateSelectListener.onItemClick(calendar.getSelectedDates());
            }
        });
    }
}
