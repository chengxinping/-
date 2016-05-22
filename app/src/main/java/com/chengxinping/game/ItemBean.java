package com.chengxinping.game;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 平瓶平瓶子 on 2016/5/19.
 * 2016年5月19日 17:37:23
 */
public class ItemBean {

    // Item的Id
    private int mItemId;
    // bitmap的Id
    private int mBitmapId;
    // mBitmap
    private Bitmap mBitmap;

    public ItemBean() {
    }

    public ItemBean(int mItemId, int mBitmapId, Bitmap mBitmap) {
        this.mItemId = mItemId;
        this.mBitmapId = mBitmapId;
        this.mBitmap = mBitmap;
    }

    public int getItemId() {

        return mItemId;
    }

    public void setItemId(int mItemId) {

        this.mItemId = mItemId;
    }

    public int getBitmapId() {

        return mBitmapId;
    }

    public void setBitmapId(int mBitmapId) {

        this.mBitmapId = mBitmapId;
    }

    public Bitmap getBitmap() {

        return mBitmap;
    }

    public void setBitmap(Bitmap mBitmap) {

        this.mBitmap = mBitmap;
    }

}