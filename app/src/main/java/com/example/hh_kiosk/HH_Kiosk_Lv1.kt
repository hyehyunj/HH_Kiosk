//package com.example.hh_kiosk
//
//fun main(){
//    var userChoice : Int = 0
//    var drink : Int = 0
//    var dessert : Int = 0
//    var order : Int = 0
//
//    while(true){
//        //시작
//        println("어서오세요-! 원하시는 번호를 입력해주세요.")
//        println("1. 음료 2. 디저트 3. 상품 0. 종료")
//        userChoice = readLine()!!.toInt()
//
//            //메뉴
//            when (userChoice) {
//                1 -> {
//                    println("어떤 음료를 원하실까요? 번호를 입력해주세요.")
//                    println("1. 커피 2. 커피가 아닌 음료 9. 뒤로가기 0. 종료")
//                    drink = readLine()!!.toInt()
//                    when (drink) {
//                        1 -> {
//                            println("어떤 커피를 원하실까요? 번호를 입력해주세요.")
//                            println("1. 아메리카노 2. 카페라떼 3. 카페모카 4. 카라멜 마키아또 9. 처음으로 0. 종료")
//                            order = readLine()!!.toInt()
//                            when(order) {
//                                1 -> println("아메리카노로 준비해드리겠습니다. 감사합니다-!")
//                                2 -> println("카페라떼로 준비해드리겠습니다. 감사합니다-!")
//                                3 -> println("카페모카로 준비해드리겠습니다. 감사합니다-!")
//                                4 -> println("카라멜 마키아또로 준비해드리겠습니다. 감사합니다-!")
//                            }
//                        }
//                        2 -> {
//                            println("어떤 음료를 원하실까요? 번호를 입력해주세요.")
//                            println("1. 말차라떼 2. 밀크티 3. 망고스무디 4. 자몽에이드 9. 처음으로 0. 종료")
//                            order = readLine()!!.toInt()
//                            when(order) {
//                                1 -> println("말차라떼로 준비해드리겠습니다. 감사합니다-!")
//                                2 -> println("밀크티로 준비해드리겠습니다. 감사합니다-!")
//                                3 -> println("망고스무디로 준비해드리겠습니다. 감사합니다-!")
//                                4 -> println("자몽에이드로 준비해드리겠습니다. 감사합니다-!")
//                            }
//                        }
//                        9 -> {}
//                        0 -> {
//                            println("감사합니다. 또 오세요-!")
//                            break
//                            }
//                        }
//                    }
//                2 -> {
//                    println("어떤 디저트를 원하실까요? 번호를 입력해주세요.")
//                    println("1. 타르트 2. 케이크 9. 뒤로가기 0. 종료")
//                    dessert = readLine()!!.toInt()
//                    when (dessert) {
//                        1 -> {
//                        println("어떤 타르트를 원하실까요? 번호를 입력해주세요.")
//                        println("1. 에그타르트 2. 피칸타르트 3. 애플시나몬타르트 4. 딸기타르트 9. 처음으로 0. 종료")
//                        order = readLine()!!.toInt()
//                            when(order) {
//                                1 -> println("에그타르트로 준비해드리겠습니다. 감사합니다-!")
//                                2 -> println("피칸타르트로 준비해드리겠습니다. 감사합니다-!")
//                                3 -> println("애플시나몬타르트로 준비해드리겠습니다. 감사합니다-!")
//                                4 -> println("딸기타르트로 준비해드리겠습니다. 감사합니다-!")
//                            }
//                        }
//                        2 -> {
//                        println("어떤 케이크를 원하실까요? 번호를 입력해주세요.")
//                        println("1. 티라미수 2. 치즈케이크 3. 갸또쇼콜라 4. 얼그레이케이크 9. 처음으로 0. 종료")
//                        order = readLine()!!.toInt()
//                            when(order) {
//                                1 -> println("티라미수로 준비해드리겠습니다. 감사합니다-!")
//                                2 -> println("치즈케이크로 준비해드리겠습니다. 감사합니다-!")
//                                3 -> println("갸또쇼콜라로 준비해드리겠습니다. 감사합니다-!")
//                                4 -> println("얼그레이케이크로 준비해드리겠습니다. 감사합니다-!")
//                            }
//                        }
//                        0 -> {
//                        println("감사합니다. 또 오세요-!")
//                        break
//                            }
//                        }
//                    }
//                3 -> {
//                    println("어떤 상품을 원하실까요? 번호를 입력해주세요.")
//                    println("1. 머그컵 2. 텀블러 9. 처음으로 0. 종료")
//                    order = readLine()!!.toInt()
//                        if (order == 1) {
//                        println("머그컵 준비해드리겠습니다. 감사합니다-!")}
//                        else println("텀블러 준비해드리겠습니다. 감사합니다-!")
//                    }
//                9 -> {}
//                0 -> {
//                    println("감사합니다. 또 오세요-!")
//                    break
//                    }
//                }
//    //while
//    }
//
//    //2단계
//    class CafeMenu {
//        var name : String = "카페메뉴"
//        var price : Int = 0
//        fun information(a:String) {
//            println("메뉴 정보입니다.")}
//    }
//    class Drink {
//        var name : String = "음료"
//        var price : Int = 0
//        var temperature : String = "ice"
//        fun information(a:String) {
//            println("음료 정보입니다.")}
//    }
//    class Coffee {
//        var name : String = "커피"
//        var price : Int = 100
//        var temperature : String = "hot"
//        fun information(a:String) {
//            println("커피 정보입니다.")}
//    }
//    class NonCoffee {
//        var name : String = "주스"
//        var price : Int = 200
//        var temperature : String = "ice"
//        fun information(a:String) {
//            println("커피가 아닌 음료 정보입니다.")}
//    }
//    class Dessert {
//        var name : String = "디저트"
//        var price : Int = 0
//        fun gift(a:String) {
//            println("선물포장 가능합니다.")}
//        fun information(a:String) {
//            println("디저트 정보입니다.")}
//    }
//    class Tart {
//        var name : String = "타르트"
//        var price : Int = 300
//        fun gift(a:String) {
//            println("선물포장 가능합니다.")}
//        fun information(a:String) {
//            println("타르트 정보입니다.")}
//    }
//    class Cake {
//        var name : String = "케이크"
//        var price : Int = 500
//        fun gift(a:String) {
//            println("선물포장 가능합니다.")}
//        fun information(a:String) {
//            println("케이크 정보입니다.")}
//    }
//    class Product {
//        var name : String = "상품"
//        var price : Int = 0
//        fun gift(a:String) {
//            println("선물포장 가능합니다.")}
//        fun information(a:String) {
//            println("상품 정보입니다.")}
//    }
//
//
//
//
////main
//}