package com.example.arrayex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// 3칸 짜리 int형 배열 arrInt생성후 0~2까지의 값에 5를 곱한 값을 배열에 저장



		var arr2 = intArrayOf(1, 2, 3)

		for(idx in 0 until arr2.size){
			arr2[idx] = arr2[idx] * 5
			Log.d("Arrays", "${arr2[idx]}")
		}

		var star = "*"

		for(i in 0..5) {
			Log.d("Arrays", "${star}")
			star += "**"

		}

		var arr1 = IntArray(3)

		arr1[0] = 111
		arr1.set(1, 222)
		for(id in 0 until arr1.size){
			Log.d("Arrays", "${arr1[id]}")
		}

		// 정수 1, 3, 5, 7, 9의 값을 가지는 arrInt2배열 생성 후 출력(get())
		var arrInt2 = IntArray(5)

		for(i in 1..9 step 2){
			arrInt2[i - 1] = i
			Log.d("Arrays", "${arrInt2.get(i-1)}")
		}

		var arrStr = arrayOf("홍길동", "전우치", "임꺽정")
	}
}