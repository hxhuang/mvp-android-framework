package com.mvp.framework.module.test.view.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mvp.framework.R;
import com.mvp.framework.module.base.view.activity.BaseActivity;

/**
 * @ClassName: NuomiShopInfoFragmentActivity
 * @author create by Tang
 * @date date 16/10/28 下午2:19
 * @Description: TODO
 */

public class NuomiShopInfoFragmentActivity extends BaseActivity{
    @Override
    public View setContentView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.activity_nuomi_shop_info_fragment,container,false);
        return view;
    }
}