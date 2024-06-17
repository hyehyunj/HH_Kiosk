package com.example.hh_kiosk

fun main(){
    //카페 키오스크 : 음료, 디저트, 상품을 판매합니다.
    //부모 클래스
    open class CafeMenu(name:String, price:Int) {
        open var name = name
        open var price = price
        open fun information(){
            println("${name} : ${price}원")
        }
    }
    //자식 클래스_음료
    open class Drink(name:String, price:Int, temperature:String) : CafeMenu(name,price) {
        override var name = name
        override var price = price
        open var temperature = temperature
        override fun information() {
            println("${name}(${temperature}) : ${price}원")
        }
    }
    //자식 클래스_디저트
    open class Dessert(name:String, price:Int) : CafeMenu(name,price) {
        override var name = name
        override var price = price
        open fun gift() {
            print("예쁘게 포장된 ")
        }
        override fun information() {
            println("${name} : ${price}원")
        }
    }
    //자식 클래스_상품
    class Product(name:String, price:Int) : CafeMenu(name,price) {
        override var name = name
        override var price = price
        fun present(){
            print("(+에그 타르트 증정)")
        }
        override fun information() {
            println("${name} : ${price}원")
        }
    }
    //변수선언
    var userChoice : Int = 0
    var userChoiceDrink : Int = 0
    var userChoiceDessert : Int = 0
    var order : Int = 0
    var option : Int = 0
    val nameList = listOf(
        listOf("아메리카노", "카페라떼", "카페모카", "카라멜 마키아또"),
        listOf("말차라떼", "밀크티", "망고스무디", "자몽티"),
        listOf("에그타르트", "피칸타르트", "애플시나몬타르트", "딸기타르트"),
        listOf("티라미수", "치즈케이크", "갸또쇼콜라", "얼그레이케이크"),
        listOf("머그컵", "텀블러"),
    )

    //인스턴스,리스트
    var menuDrink = Drink("", 0, "")
    val menuDrinkArrayList = ArrayList<Drink>()
    var menuDessert = Dessert("",0)
    val menuDessertArrayList = ArrayList<Dessert>()
    var menuProduct = Product("",0)
    val menuProductArrayList = ArrayList<Product>()

    while(true){
        menuDrinkArrayList.clear()
        menuDessertArrayList.clear()
        menuProductArrayList.clear()

        //시작
        println("어서오세요-! 원하시는 번호를 입력해주세요.")
        println("1. 음료 2. 디저트 3. 상품 0. 종료")
        userChoice = readLine()!!.toInt()

        //메뉴
        when (userChoice) {
            1 -> {//음료
                println("어떤 음료를 원하실까요? 번호를 입력해주세요.")
                println("1. 커피 2. 커피가 아닌 음료 9. 처음으로 0. 종료")
                userChoiceDrink = readLine()!!.toInt()
                when (userChoiceDrink) {
                    1 -> {//커피
                        println("어떤 커피를 원하실까요? 번호를 입력해주세요.")
                        for(i in nameList[0].indices) {
                                val drinkPrice = 100 + 100 * i
                                menuDrink = Drink(nameList[0][i], drinkPrice, "ice/hot")
                                menuDrinkArrayList.add(menuDrink)
                                print("${i + 1}. ")
                                menuDrinkArrayList[i].information()
                        }
                        println("9. 처음으로 0. 종료")
                        order = readLine()!!.toInt()
                        //옵션
                        if (order != 9 && order != 0) {
                            println("ice를 원하시면 1을, hot을 원하시면 2를 입력해주세요.")
                            option = readLine()!!.toInt()
                            if (option == 1) menuDrinkArrayList[order - 1].temperature = "아이스"
                            else menuDrinkArrayList[order - 1].temperature = "핫"
                        }
                        else if(order == 9){}
                        else if(order == 0){
                            println("감사합니다. 또 오세요-!")
                            break
                        }
                        if (order != 9) println("${menuDrinkArrayList[order - 1].temperature} ${menuDrinkArrayList[order - 1].name}로 준비해드리겠습니다. 감사합니다-!")
                    }
                    2 -> {//커피가 아닌 음료
                        println("어떤 음료를 원하실까요? 번호를 입력해주세요.")
                        for(i in nameList[1].indices) {
                            val drinkPrice = 200 + 100 * i
                            when(nameList[1][i]) {
                                "망고스무디" -> menuDrink = Drink(nameList[1][i], drinkPrice, "only ice")
                                "자몽티" -> menuDrink = Drink(nameList[1][i], drinkPrice, "only hot")
                                else -> menuDrink = Drink(nameList[1][i], drinkPrice, "ice/hot")}
                            menuDrinkArrayList.add(menuDrink)
                            print("${i + 1}. ")
                            menuDrinkArrayList[i].information()
                        }
                        println("9. 처음으로 0. 종료")
                        order = readLine()!!.toInt()
                        //옵션
                        when (order) {
                            1,2 -> {println("ice를 원하시면 1을, hot을 원하시면 2를 입력해주세요.")
                                option = readLine()!!.toInt()
                                if (option == 1) menuDrinkArrayList[order - 1].temperature = "아이스"
                                    else menuDrinkArrayList[order - 1].temperature = "핫"
                                }
                            3 -> menuDrinkArrayList[2].temperature = "아이스"
                            4 -> menuDrinkArrayList[3].temperature = "핫"
                            0 -> {println("감사합니다. 또 오세요-!")
                                break}
                        }
                        if (order != 9) println("${menuDrinkArrayList[order - 1].temperature} ${menuDrinkArrayList[order - 1].name}로 준비해드리겠습니다. 감사합니다-!")
                    }
                    9 -> {}
                    0 -> {println("감사합니다. 또 오세요-!")
                        break
                    }
                }
            }
            2 -> {//디저트
                println("어떤 디저트를 원하실까요? 번호를 입력해주세요.")
                println("1. 타르트 2. 케이크 9. 뒤로가기 0. 종료")
                userChoiceDessert = readLine()!!.toInt()
                when (userChoiceDessert) {
                    1 -> {//타르트
                        println("어떤 타르트를 원하실까요? 번호를 입력해주세요.")
                        for(i in nameList[2].indices) {
                            val dessertPrice = 300 + 100 * i
                            menuDessert = Dessert(nameList[2][i], dessertPrice)
                            menuDessertArrayList.add(menuDessert)
                            print("${i + 1}. ")
                            menuDessertArrayList[i].information()
                        }
                        println("9. 처음으로 0. 종료")
                        order = readLine()!!.toInt()
                        //옵션
                        if (order != 9 && order != 0) {
                            println("선물포장을 원하시면 1을, 원치 않으시면 2를 입력해주세요.")
                            option = readLine()!!.toInt()
                                if(option == 1) menuDessert.gift()
                        }
                        else if(order == 0){
                            println("감사합니다. 또 오세요-!")
                            break
                        }
                        if (order != 9) println("${menuDessertArrayList[order - 1].name}로 준비해드리겠습니다. 감사합니다-!")
                    }
                    2 -> {//케이크
                        println("어떤 케이크를 원하실까요? 번호를 입력해주세요.")
                        for(i in nameList[3].indices) {
                            val dessertPrice = 500 + 100 * i
                            menuDessert = Dessert(nameList[3][i], dessertPrice)
                            menuDessertArrayList.add(menuDessert)
                            print("${i + 1}. ")
                            menuDessertArrayList[i].information()
                        }
                        println("9. 처음으로 0. 종료")
                        order = readLine()!!.toInt()
                        //옵션
                        if (order != 9 && order != 0) {
                            println("선물포장을 원하시면 1을, 원치 않으시면 2를 입력해주세요.")
                            option = readLine()!!.toInt()
                            if(option == 1) menuDessert.gift()
                        }
                        else if(order == 0){
                            println("감사합니다. 또 오세요-!")
                            break
                        }
                        if (order != 9) println("${menuDessertArrayList[order - 1].name}로 준비해드리겠습니다. 감사합니다-!")
                    }
                    9 -> {}
                    0 -> {println("감사합니다. 또 오세요-!")
                        break
                    }
                }
            }
            3 -> {//상품
                println("어떤 상품을 원하실까요? 번호를 입력해주세요.")
                for(i in nameList[4].indices) {
                    val productPrice = 900 + 100 * i
                    menuProduct = Product(nameList[4][i], productPrice)
                    menuProductArrayList.add(menuProduct)
                    print("${i + 1}. ")
                    menuProductArrayList[i].information()
                }
                println("9. 처음으로 0. 종료")
                order = readLine()!!.toInt()
                when(order) {
                    1,2 -> {
                        print("${menuProductArrayList[order -1].name} 준비해드리겠습니다.")
                        menuProductArrayList[order -1].present()
                        println(" 감사합니다-!")
                        }
                    0 -> {
                    println("감사합니다. 또 오세요-!")
                    break
                    }
                }
            }
            9 -> {}
            0 -> {
                println("감사합니다. 또 오세요-!")
                break
                }
            }
    println("-----------------------------------")
    }
}