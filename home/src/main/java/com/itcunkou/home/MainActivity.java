package com.itcunkou.home;


import com.blankj.utilcode.util.ToastUtils;
import com.itcunkou.lib.base.common.BaseActivity;
import com.itcunkou.lib.base.common.BaseContract;
import com.itcunkou.lib.base.common.BasePresenter;
import com.itcunkou.lib.base.widget.FrameLayout4Loading;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * @author wys
 */
public class MainActivity extends BaseActivity {
    @BindView(R2.id.loading)
    FrameLayout4Loading loading;

    @Override
    protected void initView() {

    }

    @Override
    protected BaseContract.BasePresenter initPresenter() {
        return new BasePresenter();
    }

    @Override
    protected int getActivityLayoutID() {
        return R.layout.activity_main;
    }


    @OnClick(R2.id.btn_go)
    public void onViewClicked() {

        loading.showLoadingView();
        ToastUtils.showLong("GO");
    }


}
