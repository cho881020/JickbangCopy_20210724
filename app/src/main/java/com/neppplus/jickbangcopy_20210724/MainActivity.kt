package com.neppplus.jickbangcopy_20210724

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210724.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(  RoomData(5500, "서울시 동대문구", 5, "1번째 방 입니다.")  )
        mRoomList.add(  RoomData(24000, "서울시 서대문구", 12, "2번째 방 입니다.")  )
        mRoomList.add(  RoomData(7600, "서울시 은평구", -1, "3번째 방 입니다.")  )
        mRoomList.add(  RoomData(12500, "서울시 동작구", 0, "4번째 방 입니다.")  )
        mRoomList.add(  RoomData(8800, "서울시 금천구", -2, "5번째 방 입니다.")  )
        mRoomList.add(  RoomData(34500, "서울시 구로구", 4, "6번째 방 입니다.")  )
        mRoomList.add(  RoomData(62400, "서울시 마포구", 8, "7번째 방 입니다.")  )
        mRoomList.add(  RoomData(4500, "서울시 성북구", -2, "8번째 방 입니다.")  )
        mRoomList.add(  RoomData(1800, "서울시 강동구", 0, "9번째 방 입니다.")  )
        mRoomList.add(  RoomData(9700, "서울시 송파구", 5, "10번째 방 입니다.")  )
        mRoomList.add(  RoomData(254000, "서울시 강남구", 12, "11번째 방 입니다.")  )

    }
}