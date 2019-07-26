package com.gcoders.schoolinfo.schoolsfindersystem.utils

object SchoolUtils {

    fun isThisInteger(strInput: String): Boolean {
        try {
            Integer.parseInt(strInput)
            return true
        } catch (ex: NumberFormatException) {
            return false
        }

    }
}
