package com.example.customviewassignment.views.component

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes

import android.graphics.Paint
import androidx.core.graphics.plus
import com.example.customviewassignment.R


class RoundedImageView @JvmOverloads constructor(
    context: Context,attrs:AttributeSet?= null,defStyleAttr:Int = 0
):AppCompatImageView(context,attrs,defStyleAttr) {
    private var cornerRadius = 0F

    private val path = Path()

    private lateinit var drawPaint: Paint

    init {
        context.withStyledAttributes(attrs, R.styleable.RoudedCornerImageView){
            cornerRadius = getDimension(R.styleable.RoudedCornerImageView_cornerRadius,0F)
        }
    }


    override fun onDraw(canvas: Canvas?) {
        val rectangle = RectF(0F,0F,width.toFloat(),height.toFloat())
        path.addRoundRect(rectangle, cornerRadius,cornerRadius,Path.Direction.CCW)
        canvas?.clipPath(path)
        super.onDraw(canvas)
    }


}