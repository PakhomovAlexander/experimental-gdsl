package com.apakhomov.groovy.experimental

Integer.metaClass.getDaysFromNow = { ->
    Calendar today = Calendar.instance
    today.add(Calendar.DAY_OF_MONTH, delegate)
    today.time
}

println(5.daysFromNow)