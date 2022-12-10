package com.example.roaddectect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.lifecycle.ViewModelProvider
import com.example.roaddectect.databinding.ActivityMainBinding
import com.google.common.util.concurrent.ListenableFuture

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val model by lazy { ViewModelProvider(this)[MainViewModel::class.java] }

    //判断是否全屏
    var IS_FULL_SCREEN : Boolean = false

    lateinit var cameraPreviewMatch : PreviewView
    lateinit var cameraPreviewWrap : PreviewView
    lateinit var boxLabelCanvas : ImageView
    lateinit var modelSpinner: Spinner
    lateinit var immerse : Switch
    lateinit var inferenceTimeTextView:TextView
    lateinit var frameSizeTextView : TextView
    lateinit var cameraProviderFuture : ListenableFuture<ProcessCameraProvider>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}