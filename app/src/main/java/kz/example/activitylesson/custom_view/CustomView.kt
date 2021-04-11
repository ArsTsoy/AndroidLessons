package kz.example.activitylesson.custom_view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.View

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/5/21
 */


class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): View(context, attrs, defStyleAttr) {

    private val paint = Paint()
    private val rect = Rect()
    private val rectF = RectF()
    private val clipPath = Path()

    override fun onDraw(canvas: Canvas?) {
        Log.i("myCustomView", "onDraw")
        canvas?.drawColor(Color.BLUE)

//        paint.setColor(Color.GREEN)
//        paint.strokeWidth = 10f
//        paint.textSize = 30f
//        paint.textAlign = Paint.Align.CENTER

//        canvas?.drawText("adsfas", 200f, 150f, paint)


//        paint.setPathEffect(CornerPathEffect(120f))
        rectF.set(0f, 0f, width.toFloat(), height.toFloat())
//        rectF
//        rectF.inset((width/2).toFloat(), (height/2).toFloat())

//        canvas?.dr(rectF, 50f, 50f, paint)
        clipPath.addCircle(width/2f, height/2f, width.toFloat(), Path.Direction.CW)
        canvas?.clipPath(clipPath)
//        clipPath.addRoundRect(rectF, width.toFloat(), height.toFloat(), Path.Direction.CW)
        super.onDraw(canvas)

    }

    override fun onDrawForeground(canvas: Canvas?) {
        Log.i("myCustomView", "onDrawOver")
        super.onDrawForeground(canvas)


    }
}