package com.whosmyqueen.demo.fragments

import android.util.Log
import android.view.View
import com.whosmyqueen.demo.R
import com.whosmyqueen.widget.OnRangeChangedListener
import com.whosmyqueen.widget.RangeSeekBar
import kotlinx.android.synthetic.main.fragment_step.*

/**
//                       _ooOoo_
//                      o8888888o
//                      88" . "88
//                      (| -_- |)
//                       O\ = /O
//                   ____/`---'\____
//                 .   ' \\| |// `.
//                  / \\||| : |||// \
//                / _||||| -:- |||||- \
//                  | | \\\ - /// | |
//                | \_| ''\---/'' | |
//                 \ .-\__ `-` ___/-. /
//              ______`. .' /--.--\ `. . __
//           ."" '< `.___\_<|>_/___.' >'"".
//          | | : `- \`.;`\ _ /`;.`/ - ` : | |
//            \ \ `-. \_ __\ /__ _/ .-` / /
//    ======`-.____`-.___\_____/___.-`____.-'======
//                       `=---='
//
//    .............................................
//             佛祖保佑             永无BUG
 * =====================================================
 * 作    者：JayGoo
 * 创建日期：2019-06-14
 * 描    述:
 * =====================================================
 */
class StepsSeekBarFragment : BaseFragment() {
    val TAG: String = "StepsSeekBarFragment"
    override fun getLayoutId(): Int {
        return R.layout.fragment_step
    }

    override fun initView(view: View) {
        val stepsDrawables = ArrayList<Int>()
        stepsDrawables.add(R.drawable.step_1)
        stepsDrawables.add(R.drawable.step_2)
        stepsDrawables.add(R.drawable.step_3)
        stepsDrawables.add(R.drawable.step_4)
        sb_steps_1?.setStepsDrawable(stepsDrawables)
        sb_steps_2?.setStepsDrawable(stepsDrawables)
        sb_steps_7?.setOnRangeChangedListener(object : OnRangeChangedListener {
            override fun onRangeChanged(view: RangeSeekBar?, leftValue: Float, rightValue: Float, isFromUser: Boolean) {
                Log.e(TAG,"onRangeChanged : $leftValue")
            }

            override fun onStartTrackingTouch(view: RangeSeekBar?, isLeft: Boolean) {
				Log.e(TAG,"onStartTrackingTouch : ${view?.rangeSeekBarState?.get(0)?.value}")
            }

            override fun onStopTrackingTouch(view: RangeSeekBar?, isLeft: Boolean) {
				Log.e(TAG,"onStopTrackingTouch : ${view?.rangeSeekBarState?.get(0)?.value}")
            }
        })
    }


}