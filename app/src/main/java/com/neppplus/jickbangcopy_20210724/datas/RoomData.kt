package com.neppplus.jickbangcopy_20210724.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) : Serializable {

    // 기능 1. 내가 가진 가격에 따라 (1억 넘냐 아니냐) -> 다른 형태의 가격으로 가공 해주는 기능.

    fun getFormattedPrice() : String {

        // 1억 이상인가? 아닌가?

        if (this.price >= 10000) {

            // ?억 5,500 두가지 가공 필요.
//            1. 억단위가 몇억인지. => 24500 => 2억

            val uk = this.price / 10000

//            2. 천 단위의 , 처리.
            val thousand = this.price % 10000 // 4500 => 4,500 변환 필요.
            val commaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(thousand)

            // 두개의 구해진 데이터 (억, 컴마천단위) 를 조합해서 결과 String으로 만들자.

            val resultStr = "${uk}억 ${commaStr}"

            return resultStr
        }
        else {

            // 1억 미만. => 천단위 컴마처리만 해서 결과로.
            val commaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return commaStr

        }

    }

//    기능 2. 층수에 따라 지하 / 반지하 등으로 가공해주는 기능.

    fun getFormattedFloor() : String {

        // 1층 이상 , 0층, -층수

        if (this.floor >= 1) {

            return "${this.floor}층"

        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {

            // -1, -2 => 지하 1층
            return "지하 ${-this.floor}층"
        }

    }


}












