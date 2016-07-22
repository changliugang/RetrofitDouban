package com.chang.cn.retrofitdouban.adapter;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * BaseViewHolder
 * Created by chang on 2016/2/26.
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> views;

    public BaseViewHolder(View itemView) {
        super(itemView);
        views = new SparseArray<>();
    }

    /**
     * retrieveView
     *
     * @param viewId the View id
     * @param <T>    the View
     * @return the View
     */
    protected <T extends View> T retrieveView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    /**
     * retrieveView package function , defined yourself
     *
     * @param viewId the View id
     * @param <T>    the View
     * @return the View
     */
    public <T extends View> T getView(int viewId) {
        return retrieveView(viewId);
    }

    /**
     * View setup BackgroundColor
     *
     * @param viewId the View id
     * @param color  color
     * @return BaseViewHolder
     */
    public BaseViewHolder setBackgroundColor(int viewId, int color) {
        View view = retrieveView(viewId);
        view.setBackgroundColor(color);
        return this;
    }

    /**
     * View setup Background Resource
     *
     * @param viewId the View id
     * @param resId  image resource id
     * @return BaseViewHolder
     */
    public BaseViewHolder setBackgroundRes(int viewId, int resId) {
        View view = retrieveView(viewId);
        view.setBackgroundResource(resId);
        return this;
    }

    /**
     * TextView setup Text
     *
     * @param viewId TextView id
     * @param text   Text
     * @return BaseViewHolder
     */
    public BaseViewHolder setText(int viewId, String text) {
        TextView textView = retrieveView(viewId);
        textView.setText(text);
        return this;
    }

    /**
     * TextView setup Text color
     *
     * @param viewId the View id
     * @param color color value
     * @return BaseViewHolder
     */
    public BaseViewHolder setTextColor(int viewId, int color) {
        TextView view = retrieveView(viewId);
        view.setTextColor(color);
        return this;
    }


    /**
     * TextView setup Text color
     *
     * @param viewId TextViewid
     * @param color   color Resource Id
     * @return BaseViewHolder
     */
    public BaseViewHolder setTextColorRes(int viewId, int color) {
        TextView view = retrieveView(viewId);
        view.setTextColor(view.getResources().getColor(color));
        return this;
    }


    /**
     * ImageView setup image Resource
     *
     * @param viewId ImageView id
     * @param resId  image Resource id
     * @return BaseViewHolder
     */
    public BaseViewHolder setImageResource(int viewId, int resId) {
        ImageView imageView = retrieveView(viewId);
        imageView.setImageResource(resId);
        return this;
    }

    /**
     * ImageView setup Drawable
     *
     * @param viewId   ImageView id
     * @param drawable Drawable
     * @return BaseViewHolder
     */
    public BaseViewHolder setImageDrawable(int viewId, Drawable drawable) {
        ImageView imageView = retrieveView(viewId);
        imageView.setImageDrawable(drawable);
        return this;
    }

    /**
     * ImageView setup Bitmap
     *
     * @param viewId ImageView id
     * @param bitmap Bitmap
     * @return BaseViewHolder
     */
    public BaseViewHolder setImageBitmap(int viewId, Bitmap bitmap) {
        ImageView imageView = retrieveView(viewId);
        imageView.setImageBitmap(bitmap);
        return this;
    }

    /**
     * setup alpha
     *
     * @param viewId the View id
     * @param value  alpha 0-1
     * @return BaseViewHolder
     */
    public BaseViewHolder setAlpha(int viewId, float value) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            retrieveView(viewId).setAlpha(value);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(value, value);
            alphaAnimation.setDuration(0);
            alphaAnimation.setFillAfter(true);
            retrieveView(viewId).startAnimation(alphaAnimation);
        }
        return this;
    }

    /**
     * setup Visible
     *
     * @param viewId  the View id
     * @param visible  true VISIBLE , false GONE
     * @return BaseViewHolder
     */
    public BaseViewHolder setVisible(int viewId, boolean visible) {
        View view = retrieveView(viewId);
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
        return this;
    }

    /**
     * setup Text link
     *
     * @param viewId TextView id
     * @return BaseViewHolder
     */
    public BaseViewHolder linkify(int viewId) {
        TextView textView = retrieveView(viewId);
        Linkify.addLinks(textView, Linkify.ALL);
        return this;
    }

    /**
     * setup typeface
     *
     * @param viewId   TextView id
     * @param typeface typeface
     * @return BaseViewHolder
     */
    public BaseViewHolder setTypeface(int viewId, Typeface typeface) {
        TextView textView = retrieveView(viewId);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        return this;
    }

    /**
     * setup all TextView with same typeface
     *
     * @param typeface typeface
     * @param viewIds all TextView id
     * @return BaseViewHolder
     */
    public BaseViewHolder setTypeface(Typeface typeface, int... viewIds) {
        for (int viewId : viewIds) {
            setTypeface(viewId, typeface);
        }
        return this;
    }


    /**
     * setup ProgressBar progress value
     *
     * @param viewId   ProgressBarid
     * @param progress progress value
     * @return BaseViewHolder
     */
    public BaseViewHolder setProgress(int viewId, int progress) {
        ProgressBar progressBar = retrieveView(viewId);
        progressBar.setProgress(progress);
        return this;
    }

    /**
     * setup ProgressBar progress value
     *
     * @param viewId   ProgressBarid
     * @param progress progress value
     * @param max      max value
     * @return BaseViewHolder
     */
    public BaseViewHolder setProgress(int viewId, int progress, int max) {
        ProgressBar progressBar = retrieveView(viewId);
        progressBar.setMax(max);
        progressBar.setProgress(progress);
        return this;
    }

    /**
     * setup click listener
     *
     * @param viewId   the View id
     * @param listener click listener
     * @return BaseViewHolder
     */
    public BaseViewHolder setOnClickListener(int viewId, View.OnClickListener listener) {
        View view = retrieveView(viewId);
        view.setOnClickListener(listener);
        return this;
    }

    /**
     * setup long click listener
     *
     * @param viewId   the View id
     * @param listener  long click listener
     * @return BaseViewHolder
     */
    public BaseViewHolder setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        View view = retrieveView(viewId);
        view.setOnLongClickListener(listener);
        return this;
    }

    /**
     * setup tag
     *
     * @param viewId the View id
     * @param obj    tag
     * @return BaseViewHolder
     */
    public BaseViewHolder setTag(int viewId, Object obj) {
        View view = retrieveView(viewId);
        view.setTag(obj);
        return this;
    }

    /**
     * setup check state
     * @param viewId the View id
     * @param checkable check state
     * @return BaseViewHolder
     */
    public BaseViewHolder setChecked(int viewId, boolean checkable){
        Checkable view = retrieveView(viewId);
        view.setChecked(checkable);
        return this;
    }

    /**
     * setup adapter
     * @param viewId the View id
     * @param adapter adapter
     * @return BaseViewHolder
     */
    public BaseViewHolder setAdapter(int viewId, Adapter adapter){
        AdapterView view = retrieveView(viewId);
        view.setAdapter(adapter);
        return this;
    }

    /**
     * get ConvertView
     *
     * @return ConvertView
     */
    public View getConvertView() {
        return itemView;
    }

    public TextView getTextView(int viewId){
        return retrieveView(viewId);
    }

    public ImageView getImageView(int viewId){
        return retrieveView(viewId);
    }

    public Button getButton(int viewId){
        return retrieveView(viewId);
    }

}
