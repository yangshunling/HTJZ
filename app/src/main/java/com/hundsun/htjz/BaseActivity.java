package com.hundsun.htjz;

import android.os.Bundle;

import com.gyf.immersionbar.ImmersionBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @Description: BaseActivity
 * @Author: Anonymous
 * @Time: 2020/9/17 0:02
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTotalImmersion();
    }

    /**
     * 普通沉浸式
     */
    public void setNomalImmersion() {
        ImmersionBar.with(this)
                .barColor(R.color.white)
                .statusBarDarkFont(true)
                .fitsSystemWindows(true)
                .init();
    }

    /**
     * 完全沉浸式
     */
    public void setTotalImmersion() {
        ImmersionBar.with(this)
                .barColor(R.color.white)
                .transparentStatusBar()
                .statusBarDarkFont(false)
                .init();
    }
}
