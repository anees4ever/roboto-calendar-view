package com.marcohc.robotocalendar;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.SparseIntArray;

import java.util.Calendar;

public class CustomDateColor {
    public static final int COLOR_THEME_DARK= 0;
    public static final int COLOR_THEME_LIGHT= 1;

    public static int[] RES_DAY_OF_MONTH_FONT= {R.color.roboto_calendar_day_of_the_month_font_dark, R.color.roboto_calendar_day_of_the_month_font_light};
    public static int[] RES_SELECTED_DAY= {R.color.roboto_calendar_selected_day_font_dark, R.color.roboto_calendar_selected_day_font_light};

    public static int[] RES_MONTH_LAYOUT= {R.layout.roboto_calendar_view_layout_dark, R.layout.roboto_calendar_view_layout_light};
    public static int[] RES_DAY_OF_MONTH_LAYOUT= {R.layout.roboto_calendar_day_of_the_month_layout_dark, R.layout.roboto_calendar_day_of_the_month_layout_light};

    public static int[] RES_CIRCLE= {R.drawable.circle_dark, R.drawable.circle_light};
    public static int[] RES_RING= {R.drawable.ring_dark, R.drawable.ring_light};


    private SparseIntArray weekDateColors;
    private SparseIntArray monthDateColors;
    private DateDrawCallback mCustomCallback= null;
    private int defaultColor= 0, mColorTheme= COLOR_THEME_DARK;
    public CustomDateColor(Context context, int colorTheme) {
        mColorTheme= colorTheme;
        weekDateColors= new SparseIntArray(7);
        monthDateColors= new SparseIntArray(31);
        defaultColor= ContextCompat.getColor(context, RES_DAY_OF_MONTH_FONT[mColorTheme]);
        reset();
    }

    public CustomDateColor setCustomCallback(DateDrawCallback customCallback) {
        mCustomCallback= customCallback;
        return this;
    }

    public CustomDateColor reset() {
        monthDateColors.clear();
        weekDateColors.put(Calendar.SUNDAY, defaultColor);
        weekDateColors.put(Calendar.MONDAY, defaultColor);
        weekDateColors.put(Calendar.TUESDAY, defaultColor);
        weekDateColors.put(Calendar.WEDNESDAY, defaultColor);
        weekDateColors.put(Calendar.THURSDAY, defaultColor);
        weekDateColors.put(Calendar.FRIDAY, defaultColor);
        weekDateColors.put(Calendar.SATURDAY, defaultColor);
        return this;
    }

    public CustomDateColor setWeek(int week, int color) {
        weekDateColors.put(week, color);
        return this;
    }

    public CustomDateColor setDate(int date, int color) {
        monthDateColors.put(date, color);
        return this;
    }

    public int get(int day, int week, int month, int year) {
        try {
            int color= 0;
            if(mCustomCallback != null) {
                color= mCustomCallback.getDateColor(day, week, month, year);
            }
            color= color == 0 ? monthDateColors.get(day, weekDateColors.get(week)) : color;
            return color == 0 ? defaultColor: color;
        } catch (Exception e) {
            e.printStackTrace();
            return defaultColor;
        }
    }
}