package me.bakumon.gank.module.bigimg;

import android.app.Activity;

import me.bakumon.gank.base.BasePresenter;
import me.bakumon.gank.base.BaseView;

/**
 * BigimgContract
 * Created by bakumon on 16-12-20.
 */

public interface BigimgContract {

    interface View extends BaseView {

        Activity getBigimgContext();

        void setMeiziTitle(String title);

        void loadMeizuImg(String url);

        void setToolbarBackgroundColor(int color);

        void setViewColorAccent(int color);

        void showSaveFab();

        void showMsgSaveSuccess(String msg);

        void showMsgSaveFail(String msg);

        void showPermissionsTip(String msg);

        void startFabSavingAnim();

        void stopFabSavingAnim();

        void setFabEnable(boolean isEnable);
    }

    interface Presenter extends BasePresenter {
        void saveImg();
    }
}
