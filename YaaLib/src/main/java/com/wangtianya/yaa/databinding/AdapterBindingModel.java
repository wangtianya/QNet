package com.wangtianya.yaa.databinding;

/**
 * Created by wangtianya on 2018/4/20.
 */

public abstract class AdapterBindingModel {
    public int layoutId;
    public int variableId;

    public void setResId(int layoutId, int variableId) {
        this.layoutId = layoutId;
        this.variableId = variableId;
    }
}
