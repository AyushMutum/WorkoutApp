package com.example.androidappdev.tutorial


interface ClickListener {
    fun onClick()
}

class MyButton {

    private var clickListener: ClickListener? = null

    fun setClickListener(clickListener: ClickListener) {
        this.clickListener = clickListener
    }

    fun click() {
        //when the view or in this case 'MyButton' is clicked notify the listener that this was clicked
        clickListener?.onClick()
    }
}

class HomeScreen : ClickListener {
    override fun onClick() {
        println("HomeScreen.ClickListener.onClick()")
    }
}

class YogaScreen : ClickListener {
    override fun onClick() {
        println("YogaScreen.ClickListener.onClick()")
    }
}

object AnonymousListener : ClickListener {
    override fun onClick() {
        println("AnonymousListener.ClickListener.onClick()")
    }
}

fun main() {

    val myButton = MyButton()

    val homeScreen = HomeScreen()
    val yogaScreen = YogaScreen()
    val anonymous = AnonymousListener

    myButton.setClickListener(anonymous)
    myButton.click()
}

/**
 *
 *  clickListener -
 *
 *  View -> click -> we want to notify all the classes that want to listener to view click
 *
 *     1.To acheive we have to keep track (keep reference of these classes)
 *     2.Then notify the classes when the view is clicked.
 *
 *  if we want to communicate between two classes then we need to use Interfaces.
 *
 *
 */

/**
 *
 * Anonymous class ama gi object semba yai
 */