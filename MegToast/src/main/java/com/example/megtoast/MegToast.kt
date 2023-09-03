package com.example.megtoast

import android.content.Context
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.widget.Toast
import com.example.megtoast.databinding.MegSpecificToastBinding

class MegToast {
    companion object {
        fun makeToast(
            context: Context ,
            style: MegToastTypes ,
            title: String? ,
            message: String ,
            durationInSeconds: Int
        ) {
            val inflater = LayoutInflater.from(context)
            val binding = MegSpecificToastBinding.inflate(inflater)

            val layout = binding.root
            when (style) {
                MegToastTypes.SUCCESS -> {

                    binding.customToastContainer.setBackgroundResource(R.drawable.background_success)
                    binding.customToastImage.setImageResource(R.drawable.icon_success)
                    binding.toastTitle.text = title ?: MegToastTypes.SUCCESS.getName()
                    binding.toastMessage.text = message


                }
                MegToastTypes.ERROR -> {

                    binding.customToastContainer.setBackgroundResource(R.drawable.background_error)
                    binding.customToastImage.setImageResource(R.drawable.icon_error)
                    binding.toastTitle.text = title ?: MegToastTypes.ERROR.getName()
                    binding.toastMessage.text = message
                }
            }
            val megToast = Toast(context)
            megToast.duration = Toast.LENGTH_LONG


            megToast.view = layout
            setTimer(durationInSeconds , megToast)

            megToast.show()
        }

        private fun setTimer(duration: Int , toast: Toast) {
            val timer = object : CountDownTimer((duration * 1000).toLong() , 1000) {
                override fun onTick(p0: Long) {

                }


                override fun onFinish() {
                    toast.cancel()
                }


            }
            timer.start()

        }
    }


}
