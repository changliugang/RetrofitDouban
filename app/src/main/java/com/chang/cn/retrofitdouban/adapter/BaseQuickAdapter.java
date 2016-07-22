package com.chang.cn.retrofitdouban.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 *  Base QuickAdapter
 * Created by chang on 2016/2/26.
 */
public abstract class BaseQuickAdapter<T, H extends BaseViewHolder>
        extends RecyclerView.Adapter<BaseViewHolder> {

    protected static final int HEADER_VIEW = 0x00000001;// 写成这样只是觉得看起来专业
    protected static final int LOADING_VIEW = 0x00000002;
    protected static final int FOOTER_VIEW = 0x00000003;
    protected static final int EMPTY_VIEW = 0x00000004;

//    protected Context context;// 上下文对象

    protected int layoutResId;// item资源id

    protected List<T> data;// 数据集合

    protected Context mContext;// 全局上下文，由RecyclerView获取

    protected View mContentView;// item布局View

    protected LayoutInflater mLayoutInflater;


    private OnItemClickListener mOnItemClickListener;

    private OnItemLongClickListener mOnItemLongClickListener;

    /**
     * RecyclerView的item点击事件
     */
    public interface OnItemClickListener {
        /**
         * item点击事件回调
         * @param view 点击的item View
         * @param position item View集合中的位置
         */
        void OnItemClick(View view, int position);
    }

    /**
     * RecyclerView的item长按事件
     */
    public interface OnItemLongClickListener{
        /**
         * item长按事件回调
         * @param view 长按的item View
         * @param position item View集合中的位置
         */
        boolean OnItemLongClick(View view, int position);
    }



    public BaseQuickAdapter(Context context, int layoutResId) {
        this(context, layoutResId, null);
    }

    public BaseQuickAdapter(Context context, int layoutResId, List<T> data) {
        this.mContext = context;
        this.layoutResId = layoutResId;
        this.data = data == null ? new ArrayList<T>() : data;
    }

    public BaseQuickAdapter(List<T> data){
        this(0,data);
    }

    public BaseQuickAdapter(int layoutResId, List<T> data){
        if (layoutResId != 0) {
            this.layoutResId = layoutResId;
        }
        this.data = data == null ? new ArrayList<T>() : data;
    }

    public BaseQuickAdapter(View contentView, List<T> data){
        this(0,data);
        this.mContentView = contentView;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public T getItem(int position) {
        if (position >= data.size()) {
            return null;
        }
        return data.get(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        mContext = parent.getContext();// 赋值Context
        mLayoutInflater = LayoutInflater.from(mContext);

        // 在这里创建不同布局的item
//        switch (viewType){
//            case HEADER_VIEW:
//
//                break;
//            default:
//
//        }
        View view = mLayoutInflater.inflate(layoutResId, parent, false);
        BaseViewHolder bah = new BaseViewHolder(view);
        initItemClickListener(bah);
        return bah;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.itemView.setTag(position);
        T item = getItem(position);
        convert((H) holder, item);
    }

    protected abstract void convert(H helper, T item);

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener){
        this.mOnItemLongClickListener = listener;
    }

    public void add(T item) {
        data.add(item);
        notifyDataSetChanged();
    }

    public void addAll(List<T> lists) {
        int startIndex = data.size();
        data.addAll(startIndex, lists);
        notifyItemRangeInserted(startIndex, lists.size());
    }

    public void replaceAll(List<T> lists) {
        data.clear();
        addAll(lists);
    }

    public void set(int index, T item) {
        data.set(index, item);
        notifyDataSetChanged();
    }

    public void set(T oldItem, T newItem) {
        set(data.indexOf(oldItem), newItem);
    }

    public void remove(int index) {
        data.remove(index);
        notifyDataSetChanged();
    }

    public void remove(T item) {
        data.remove(item);
        notifyDataSetChanged();
    }

    public boolean contains(T item) {
        return data.contains(item);
    }

    public void clear() {
        data.clear();
        notifyDataSetChanged();
    }

    private View mHeadView;// header view

    // 2016/6/23 添加函数

    /**
     * 获取Header的数量，没Header返回0，有Header返回1
     * 计算item position需要
     * @return Header的数量
     */
    public int getHeadViewCount(){
        return mHeadView == null ? 0 : 1;
    }

    public void addHeaderView(View headerView){
        mHeadView = headerView;
        notifyDataSetChanged();
    }

    // 创建默认的一般item视图
    protected BaseViewHolder createDefHelper(ViewGroup parent, int layoutResId){
        if (mContentView == null){
            return new BaseViewHolder(getItemView(parent,layoutResId));
        }
        return new BaseViewHolder(mContentView);
    }

    // 获取item的视图
    protected View getItemView(ViewGroup parent,int layoutResId){
        return mLayoutInflater.inflate(layoutResId,parent,false);
        //mLayoutInflater.inflate(layoutResId,null)

        //mLayoutInflater.inflate(layoutResId,parent,false)
    }

    private void initItemClickListener(final BaseViewHolder helper){
        if (mOnItemClickListener != null) {
            helper.itemView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.OnItemClick(v, helper.getLayoutPosition()-getHeadViewCount());
                }
            });
        }

        if (mOnItemLongClickListener != null){
            helper.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    return mOnItemLongClickListener.OnItemLongClick(v,helper.getLayoutPosition()-getHeadViewCount());
                }
            });
        }

    }

}
