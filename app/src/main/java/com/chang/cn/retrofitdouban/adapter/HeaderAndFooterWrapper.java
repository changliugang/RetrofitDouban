package com.chang.cn.retrofitdouban.adapter;

import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * 带有Header和Footer的Adapter
 * Created by chang on 2016/7/12.
 */
public class HeaderAndFooterWrapper extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int BASE_ITEM_TYPE_HEADER = 100000;// 这里设置的值大一点，万一你们真有100k条数据呢
    private static final int BASE_ITEM_TYPE_FOOTER = 200000;

    private SparseArrayCompat<View> mHeaderViews = new SparseArrayCompat<>();
    private SparseArrayCompat<View> mFootViews = new SparseArrayCompat<>();

    private RecyclerView.Adapter mInnerAdapter;

    public HeaderAndFooterWrapper(RecyclerView.Adapter adapter) {
        mInnerAdapter = adapter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mHeaderViews.get(viewType) != null)
            return new BaseViewHolder(mHeaderViews.get(viewType));
        if (mFootViews.get(viewType) != null) {
            return new BaseViewHolder(mFootViews.get(viewType));
        }
        return mInnerAdapter.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // 在Adapter中我们不对HeaderView或者FooterView做任何操作，仅控制其展示位置，相应的事件应在
        // 加入RecyclerView对于事件应该是在addHeaderView等方法前设置。
        if (isHeaderViewPos(position) || isFooterViewPos(position))
            return;
        mInnerAdapter.onBindViewHolder(holder, position - getHeadersCount());
    }

    @Override
    public int getItemViewType(int position) {
        if (isHeaderViewPos(position))
            return mHeaderViews.keyAt(position);
        if (isFooterViewPos(position))
            return mFootViews.keyAt(position - getHeadersCount() - getRealItemCount());
        return mInnerAdapter.getItemViewType(position - getHeadersCount());
    }

    @Override
    public int getItemCount() {
        return getHeadersCount() + getRealItemCount() + getFootersCount();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        WrapperUtils.onAttachedToRecyclerView(mInnerAdapter, recyclerView, new WrapperUtils.SpanSizeCallback() {
            @Override
            public int getSpanSize(GridLayoutManager layoutManager, GridLayoutManager.SpanSizeLookup oldLookup, int position) {
                // span size表示一个item的跨度，跨度了多少个span。在这里改变Header和Footer的跨度为列数使其占满整个宽度
                int viewType = getItemViewType(position);
                if (mHeaderViews.get(viewType) != null || mFootViews.get(viewType) != null)
                    return layoutManager.getSpanCount();//getSpanCount()spanCount即列数
                if (oldLookup != null)//SpanSizeLookup可以自定义item跨度规则
                    return oldLookup.getSpanSize(position);
                return 1;
            }
        });
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        mInnerAdapter.onViewAttachedToWindow(holder);
        int position = holder.getLayoutPosition();
        if (isHeaderViewPos(position) || isFooterViewPos(position))
            WrapperUtils.setFullSpan(holder);
    }

    private boolean isHeaderViewPos(int position) {
        return position < getHeadersCount();
    }

    private boolean isFooterViewPos(int position) {
        return position >= getHeadersCount() + getRealItemCount();
    }

    private int getRealItemCount() {
        return mInnerAdapter.getItemCount();
    }

    public int getHeadersCount() {
        return mHeaderViews.size();
    }

    public int getFootersCount() {
        return mFootViews.size();
    }

    public void addHeaderView(View view) {
        // 这里设置的的key作为itemType的值
        mHeaderViews.put(mHeaderViews.size() + BASE_ITEM_TYPE_HEADER, view);
    }

    public void addFootView(View view) {  // 这里设置的的key作为itemType的值
        mFootViews.put(mFootViews.size() + BASE_ITEM_TYPE_FOOTER, view);
    }


}
