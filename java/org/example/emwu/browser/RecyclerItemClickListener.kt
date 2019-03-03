package org.example.emwu.browser

import android.view.View

class RecyclerItemClickListener {
    private val TAG = "RecyclerItemClickListen"

    interface OnRecyclerClickListener {
        fun onItemClick(view: View, position: Int)
        fun onItemLongClick(view: View, position: Int)
    }
}