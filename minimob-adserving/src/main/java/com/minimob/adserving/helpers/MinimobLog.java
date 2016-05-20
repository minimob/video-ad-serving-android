package com.minimob.adserving.helpers;

import android.util.Log;

public class MinimobLog
{
    private static final String TAG = MinimobLog.class.getSimpleName();

    public enum LOG_LEVEL
    {
        debug(0),
        info(1),
        warning(2),
        error(3),
        none(4);

        private int value;

        LOG_LEVEL(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }
    }

    private static LOG_LEVEL LEVEL = LOG_LEVEL.debug;
    public static void setLoggingLevel(LOG_LEVEL logLevel)
    {
        Log.i(TAG, "Changing logging level from :" + LEVEL + ". To:" + logLevel);
        LEVEL = logLevel;
    }

    public static LOG_LEVEL getLoggingLevel()
    {
        return LEVEL;
    }

    public static void d(String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue())
        {
            Log.d(TAG, msg);
        }
    }

    public static void i(String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue())
        {
            Log.i(TAG, msg);
        }
    }

    public static void w(String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue())
        {
            Log.w(TAG, msg);
        }
    }

    public static void e(String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue())
        {
            Log.e(TAG, msg);
        }
    }

    public static void d(String subTag, String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue())
        {
            String tag = TAG + ":" + subTag;
            Log.d(tag, msg);
        }
    }

    public static void i(String subTag, String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue())
        {
            String tag = TAG  + ":" + subTag;
            Log.i(tag, msg);
        }
    }

    public static void w(String subTag, String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue())
        {
            String tag = TAG + ":" + subTag;
            Log.w(tag, msg);
        }
    }

    public static void e(String subTag, String msg)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue())
        {
            String tag = TAG + ":" + subTag;
            Log.e(tag, msg);
        }
    }

    public static void d(String subTag, String msg, Throwable ex)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.debug.getValue())
        {
            String tag = TAG + ":" + subTag;
            Log.d(tag, msg, ex);
        }
    }

    public static void i(String subTag, String msg, Throwable ex)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.info.getValue())
        {
            String tag = TAG  + ":" + subTag;
            Log.i(tag, msg, ex);
        }
    }

    public static void w(String subTag, String msg, Throwable ex)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.warning.getValue())
        {
            String tag = TAG + ":" + subTag;
            Log.w(tag, msg, ex);
        }
    }

    public static void e(String subTag, String msg, Throwable ex)
    {
        if (LEVEL.getValue() <= LOG_LEVEL.error.getValue())
        {
            String tag = TAG + ":" + subTag;
            Log.e(tag, msg, ex);
        }
    }
}
