package com.nicprowse.previewviewbug

import android.content.Context
import android.opengl.GLSurfaceView
import android.util.AttributeSet

class GraphicsView(context: Context, attributeSet: AttributeSet) : GLSurfaceView(context, attributeSet) {
    init {
        setEGLContextClientVersion(2)
        setRenderer(GraphicsRenderer())
    }
}